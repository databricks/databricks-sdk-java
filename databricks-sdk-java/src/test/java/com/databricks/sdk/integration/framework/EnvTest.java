package com.databricks.sdk.integration.framework;

import static java.lang.String.format;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.ConfigResolving;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.UserAgent;
import com.databricks.sdk.core.utils.GitHubUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.extension.*;
import org.junit.platform.commons.util.Preconditions;

public class EnvTest
    implements Extension, ParameterResolver, ExecutionCondition, ConfigResolving, GitHubUtils {

  private static final String ENV_STORE_KEY = "env";

  private static final Map<String, Function<Map<String, String>, ConditionEvaluationResult>> TEST_EXECUTION_RULES_BY_ENV;

  private static final ObjectMapper MAPPER;

  static {
    UserAgent.withProduct("integration-tests", "0.0.1");
    TEST_EXECUTION_RULES_BY_ENV = new HashMap<>();
    TEST_EXECUTION_RULES_BY_ENV.put("workspace", (env) -> {
      if (env.containsKey("DATABRICKS_ACCOUNT_ID")) {
        return disabled("Skipping workspace-level test in account environment");
      }
      return enabled("okay to run");
    });
    TEST_EXECUTION_RULES_BY_ENV.put("ucws", (env) -> {
      if (env.containsKey("DATABRICKS_ACCOUNT_ID")) {
        return disabled("Skipping workspace-level test in account environment");
      } else if (!env.containsKey("TEST_METASTORE_ID")) {
        return disabled("Skipping Unity Catalog workspace-level test in non-Unity Catalog environment");
      }
      return enabled("okay to run");
    });
    TEST_EXECUTION_RULES_BY_ENV.put("account", (env) -> {
      if (!env.containsKey("DATABRICKS_ACCOUNT_ID")) {
        return disabled("Skipping account-level test in workspace environment");
      }
      return enabled("okay to run");
    });
    TEST_EXECUTION_RULES_BY_ENV.put("ucacct", (env) -> {
      if (!env.containsKey("DATABRICKS_ACCOUNT_ID")) {
        return disabled("Skipping account-level test in workspace environment");
      } else if (!env.containsKey("TEST_METASTORE_ID")) {
        return disabled("Skipping Unity Catalog account-level test in non-Unity Catalog environment");
      }
      return enabled("okay to run");
    });
    MAPPER = makeObjectMapper();
  }

  @Override
  public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
    Optional<EnvGetter> envGetter = makeEnvResolver(context);
    if (!envGetter.isPresent()) {
      return ConditionEvaluationResult.disabled("No EnvContext");
    }
    Map<String, String> env = envGetter.get().get();
    if (!env.containsKey("CLOUD_ENV")) {
      return ConditionEvaluationResult.disabled("No CLOUD_ENV");
    }

    // Ensure that the test is only run if the environment (either the process environment or the environment loaded
    // from debug-env.json) matches the environment specified in the @EnvContext annotation.
    Optional<String> contextOpt = getEnvContext(context);
    if (!contextOpt.isPresent()) {
      return ConditionEvaluationResult.disabled("Context must be specified for integration tests");
    }
    String contextStr = contextOpt.get();
    if (!TEST_EXECUTION_RULES_BY_ENV.containsKey(contextStr)) {
      return ConditionEvaluationResult.disabled("Unknown context: " + contextStr);
    }
    ConditionEvaluationResult envBasedResult = TEST_EXECUTION_RULES_BY_ENV.get(contextStr).apply(env);
    if (envBasedResult.isDisabled()) {
      return envBasedResult;
    }

    // If a test uses a WorkspaceClient or AccountClient, ensure that the test is only run in the appropriate
    // environment. If a test depends on an environment variable, ensure that the test is only run if the environment
    // variable is set.
    Optional<List<Parameter>> methodParams =
        context
            .getElement()
            .filter(x -> x instanceof Method)
            .map(x -> ((Method) x))
            .map(Executable::getParameters)
            .map(Arrays::asList);
    if (methodParams.isPresent()) {
      for (Parameter parameter : methodParams.get()) {
        Class<?> type = parameter.getType();
        boolean hasAccount = env.containsKey("DATABRICKS_ACCOUNT_ID");
        if (type == WorkspaceClient.class && hasAccount) {
          return ConditionEvaluationResult.disabled("Can't use workspace client in account env");
        } else if (type == AccountClient.class && !hasAccount) {
          return ConditionEvaluationResult.disabled("Can't use account client in workspace env");
        } else if (type == String.class) {
          EnvOrSkip envOrSkip = parameter.getAnnotation(EnvOrSkip.class);
          if (envOrSkip == null) {
            continue;
          }
          boolean hasEnv = env.containsKey(envOrSkip.value());
          if (!hasEnv) {
            return ConditionEvaluationResult.disabled("No env", envOrSkip.value());
          }
        }
      }
    }
    ConditionEvaluationResult envVariableCondition = isDisabledByEnvironmentVariable(context, env);
    if (envVariableCondition.isDisabled()) {
      return envVariableCondition;
    }
    return ConditionEvaluationResult.enabled("okay to run");
  }

  @Override
  public boolean supportsParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    Parameter parameter = parameterContext.getParameter();
    return parameter.getType() == WorkspaceClient.class
        || parameter.getType() == AccountClient.class
        || parameter.isAnnotationPresent(EnvOrSkip.class);
  }

  @Override
  public Object resolveParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    Parameter parameter = parameterContext.getParameter();
    Optional<EnvGetter> envGetter = makeEnvResolver(extensionContext);
    if (!envGetter.isPresent()) {
      throw new ParameterResolutionException("Cannot resolve DatabricksConfig");
    }
    Map<String, String> env = envGetter.get().get();
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, () -> env);
    if (parameter.getType() == WorkspaceClient.class) {
      return new WorkspaceClient(config);
    } else if (parameter.getType() == AccountClient.class) {
      return new AccountClient(config);
    } else if (parameter.getType() == String.class) {
      EnvOrSkip envOrSkip = parameter.getAnnotation(EnvOrSkip.class);
      boolean envValue = env.containsKey(envOrSkip.value());
      if (!envValue) {
        throw new ParameterResolutionException("No env: " + envOrSkip.value());
      }
      return env.get(envOrSkip.value());
    }
    throw new ParameterResolutionException("Cannot resolve " + parameter.getName());
  }

  /**
   * Retrieves the value of the EnvContext annotation on the given context or its parent contexts. For
   * ClassExtensionContexts, the annotation is retrieved from the class. For MethodExtensionContexts, the
   * annotation is retrieved from the method, falling back to the class.
   *
   * @param context the context to search
   * @return the value of the EnvContext annotation on the given context or its parent contexts
   */
  private Optional<String> getEnvContext(ExtensionContext context) {
    if (context == null) {
      return Optional.empty();
    }
    Optional<String> res = context
        .getElement()
        .map(it -> it.getAnnotation(EnvContext.class))
        .map(EnvContext::value);
    if (res.isPresent()) {
      return res;
    } else {
      return getEnvContext(context.getParent().orElse(null));
    }
  }

  private Optional<EnvGetter> makeEnvResolver(ExtensionContext context) {
    ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.GLOBAL);
    EnvGetter env = store.get(ENV_STORE_KEY, EnvGetter.class);
    if (env != null) {
      // Environment is already present in the parent context store
      return Optional.of(env);
    }
    return getEnvContext(context).map(
        contextName ->
            store.getOrComputeIfAbsent(
                ENV_STORE_KEY, x -> makeEnvResolver(contextName), EnvGetter.class));
  }

  private EnvGetter makeEnvResolver(String contextName) {
    if (checkIfRunningOnGithub()) {
      return System::getenv;
    }
    String debugEnvFile =
        String.format("%s/.databricks/debug-env.json", System.getProperty("user.home"));
    try (InputStream in = Files.newInputStream(Paths.get(debugEnvFile))) {
      Map<String, Map<String, String>> all = MAPPER.readValue(in, new DebugEnv());
      Map<String, String> found = all.get(contextName);
      if (found == null) {
        return System::getenv;
      }
      found.put("HOME", "/tmp");
      return () -> found;
    } catch (IOException e) {
      return System::getenv;
    }
  }

  private static class DebugEnv extends TypeReference<Map<String, Map<String, String>>> {}

  private interface EnvGetter extends Supplier<Map<String, String>> {}

  /**
   * Check whether the test should be disabled due to an environment variable.
   *
   * <p>Ideally, we would be able to override the DisabledIfEnvironmentVariableCondition class to
   * use the environment supplier from this class, but that class is not public. For now, I've
   * inlined the evaluate method here.
   *
   * @param context A {@code ClassExtensionContext} for the test class.
   * @param env The environment used for the test run.
   * @return A {@code ConditionEvaluationResult} indicating whether the test should be disabled.
   */
  private ConditionEvaluationResult isDisabledByEnvironmentVariable(
      ExtensionContext context, Map<String, String> env) {
    Optional<DisabledIfEnvironmentVariable> singleAnnotation =
        context.getElement().map(x -> x.getAnnotation(DisabledIfEnvironmentVariable.class));
    Optional<DisabledIfEnvironmentVariables> repeatedAnnotation =
        context.getElement().map(x -> x.getAnnotation(DisabledIfEnvironmentVariables.class));
    if (singleAnnotation.isPresent()) {
      return evaluate(singleAnnotation.get(), env);
    }
    if (repeatedAnnotation.isPresent()) {
      for (DisabledIfEnvironmentVariable annotation : repeatedAnnotation.get().value()) {
        ConditionEvaluationResult res = evaluate(annotation, env);
        if (res.isDisabled()) {
          return res;
        }
      }
      return ConditionEvaluationResult.enabled("no DisableIfEnvironmentVariable matched");
    }

    return ConditionEvaluationResult.enabled("no DisableIfEnvironmentVariable present");
  }

  private ConditionEvaluationResult evaluate(
      DisabledIfEnvironmentVariable annotation, Map<String, String> env) {
    // Below is taken from DisabledIfEnvironmentVariableCondition.evaluate, aside from env lookup.
    String name = annotation.named().trim();
    String regex = annotation.matches();
    Preconditions.notBlank(name, () -> "The 'named' attribute must not be blank in " + annotation);
    Preconditions.notBlank(
        regex, () -> "The 'matches' attribute must not be blank in " + annotation);
    String actual = env.get(name);

    // Nothing to match against?
    if (actual == null) {
      return enabled(format("Environment variable [%s] does not exist", name));
    }

    if (actual.matches(regex)) {
      return disabled(
          format(
              "Environment variable [%s] with value [%s] matches regular expression [%s]",
              name, actual, regex),
          annotation.disabledReason());
    }
    // else
    return enabled(
        format(
            "Environment variable [%s] with value [%s] does not match regular expression [%s]",
            name, actual, regex));
  }

  private static ObjectMapper makeObjectMapper() {
    ObjectMapper mapper = new ObjectMapper();
    mapper
        .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
        .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)
        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
        .configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true)
        .configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_AS_NULL, true)
        .setSerializationInclusion(JsonInclude.Include.NON_NULL);
    return mapper;
  }
}

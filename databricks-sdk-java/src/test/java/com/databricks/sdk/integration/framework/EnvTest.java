package com.databricks.sdk.integration.framework;

import static org.junit.jupiter.api.Assertions.fail;

import com.databricks.sdk.DatabricksAccount;
import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.client.ConfigResolving;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.UserAgent;
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
import java.util.function.Supplier;
import org.junit.jupiter.api.extension.*;

public class EnvTest implements Extension, ParameterResolver, ExecutionCondition, ConfigResolving {
  static {
    UserAgent.withProduct("integration-tests", "0.0.1");
  }

  private static final String ENV_STORE_KEY = "env";

  @Override
  public boolean supportsParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    Parameter parameter = parameterContext.getParameter();
    return parameter.getType() == DatabricksWorkspace.class
        || parameter.getType() == DatabricksAccount.class
        || parameter.isAnnotationPresent(EnvOrSkip.class);
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
    ConditionEvaluationResult enabled = ConditionEvaluationResult.enabled("okay to run");
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
        if (type == DatabricksWorkspace.class && hasAccount) {
          return ConditionEvaluationResult.disabled("Can't use workspace client in account env");
        } else if (type == DatabricksAccount.class && !hasAccount) {
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
    return enabled;
  }

  @Override
  public Object resolveParameter(
      ParameterContext parameterContext, ExtensionContext extensionContext)
      throws ParameterResolutionException {
    Parameter parameter = parameterContext.getParameter();
    Optional<EnvGetter> envGetter = makeEnvResolver(extensionContext);
    if (!envGetter.isPresent()) {
      return fail("Cannot resolve DatabricksConfig");
    }
    Map<String, String> env = envGetter.get().get();
    DatabricksConfig config = new DatabricksConfig();
    resolveConfig(config, () -> env);
    if (parameter.getType() == DatabricksWorkspace.class) {
      return new DatabricksWorkspace(config);
    } else if (parameter.getType() == DatabricksAccount.class) {
      return new DatabricksAccount(config);
    } else if (parameter.getType() == String.class) {
      EnvOrSkip envOrSkip = parameter.getAnnotation(EnvOrSkip.class);
      boolean envValue = env.containsKey(envOrSkip.value());
      if (!envValue) {
        return fail("No env: " + envOrSkip.value());
      }
      return env.get(envOrSkip.value());
    }
    return fail("Cannot resolve " + parameter.getName());
  }

  private Optional<EnvGetter> makeEnvResolver(ExtensionContext context) {
    ExtensionContext.Store store = context.getStore(ExtensionContext.Namespace.GLOBAL);
    EnvGetter env = store.get(ENV_STORE_KEY, EnvGetter.class);
    if (env != null) {
      // Environment is already present in the parent context store
      return Optional.of(env);
    }
    return context
        .getElement()
        .map(it -> it.getAnnotation(EnvContext.class))
        .map(EnvContext::value)
        .map(
            contextName ->
                store.getOrComputeIfAbsent(
                    ENV_STORE_KEY, x -> makeEnvResolver(contextName), EnvGetter.class));
  }

  private EnvGetter makeEnvResolver(String contextName) {
    String debugEnvFile =
        String.format("%s/.databricks/debug-env.json", System.getProperty("user.home"));
    try (InputStream in = Files.newInputStream(Paths.get(debugEnvFile))) {
      ObjectMapper objectMapper = makeObjectMapper();
      Map<String, Map<String, String>> all = objectMapper.readValue(in, new DebugEnv());
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

  private ObjectMapper makeObjectMapper() {
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

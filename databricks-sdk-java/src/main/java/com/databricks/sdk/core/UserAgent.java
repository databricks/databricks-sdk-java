package com.databricks.sdk.core;

import com.databricks.sdk.core.utils.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class UserAgent {
  private static String product = "unknown";
  private static String productVersion = "0.0.0";

  private static class Info {
    private String key;
    private String value;

    public Info(String key, String value) {
      this.key = key;
      this.value = value;
    }

    public String getKey() {
      return key;
    }

    public String getValue() {
      return value;
    }
  }

  private static final ArrayList<Info> otherInfo = new ArrayList<>();

  // TODO: check if reading from
  // /META-INF/maven/com.databricks/databrics-sdk-java/pom.properties
  // or getClass().getPackage().getImplementationVersion() is enough.
  private static final String version = "0.129.0";

  public static void withProduct(String product, String productVersion) {
    UserAgent.product = product;
    UserAgent.productVersion = productVersion;
  }

  // Regular expression copied from https://semver.org/.
  private static final String semVerCore = "(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)";
  private static final String semVerPrerelease =
      "(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?";
  private static final String semVerBuildmetadata = "(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?";
  private static final Pattern regexpSemVer =
      Pattern.compile("^" + semVerCore + semVerPrerelease + semVerBuildmetadata + "$");

  private static final Pattern regexpAlphanum = Pattern.compile("^[0-9A-Za-z_\\.\\+-]+$");
  private static final Pattern regexpAlphanumInverse = Pattern.compile("[^0-9A-Za-z_\\.\\+-]");

  /**
   * Replaces all non-alphanumeric characters with a hyphen. Use this to ensure that the user agent
   * value is valid. This is useful when the value is not ensured to be valid at compile time.
   *
   * <p>Note: Semver strings are comprised of alphanumeric characters, hyphens, periods and plus
   * signs. This function will not remove these characters.
   *
   * @param s The string to sanitize.
   * @return The sanitized string.
   */
  public static String sanitize(String s) {
    return regexpAlphanumInverse.matcher(s).replaceAll("-");
  }

  public static boolean matchSemVer(String s) throws IllegalArgumentException {
    if (regexpSemVer.matcher(s).matches()) {
      return true;
    }
    throw new IllegalArgumentException("Invalid semver string: " + s);
  }

  public static boolean matchAlphanum(String s) throws IllegalArgumentException {
    if (regexpAlphanum.matcher(s).matches()) {
      return true;
    }
    throw new IllegalArgumentException("Invalid alphanumeric string: " + s);
  }

  public static boolean matchAlphanumOrSemVer(String s) throws IllegalArgumentException {
    if (regexpAlphanum.matcher(s).matches() || regexpSemVer.matcher(s).matches()) {
      return true;
    }
    throw new IllegalArgumentException("Invalid alphanumeric or semver string: " + s);
  }

  public static void withPartner(String partner) {
    withOtherInfo("partner", partner);
  }

  public static void withOtherInfo(String key, String value) {
    matchAlphanum(key);
    matchAlphanumOrSemVer(value);
    synchronized (otherInfo) {
      otherInfo.add(new Info(key, value));
    }
  }

  private static String osName() {
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      return "darwin";
    } else if (osName.contains("linux")) {
      return "linux";
    } else if (osName.contains("win")) {
      return "windows";
    }
    return "unknown";
  }

  private static String jvmVersion() {
    String jvmVersion = System.getProperty("java.version");
    String[] split = jvmVersion.split("_");
    return split[0];
  }

  public static String asString() {
    List<String> segments = new ArrayList<>();
    segments.add(String.format("%s/%s", product, productVersion));
    segments.add(String.format("databricks-sdk-java/%s", version));
    segments.add(String.format("jvm/%s", jvmVersion()));
    segments.add(String.format("os/%s", osName()));
    String cicdProvider = cicdProvider();
    if (!cicdProvider.isEmpty()) {
      segments.add(String.format("cicd/%s", cicdProvider));
    }
    String agent = agentProvider();
    if (!agent.isEmpty()) {
      segments.add(String.format("agent/%s", agent));
    }
    String metaHarness = metaHarnessProvider();
    if (!metaHarness.isEmpty()) {
      segments.add(String.format("meta-harness/%s", metaHarness));
    }
    // Concurrent iteration over ArrayList must be guarded with synchronized.
    synchronized (otherInfo) {
      segments.addAll(
          otherInfo.stream()
              .map(e -> String.format("%s/%s", e.getKey(), e.getValue()))
              .collect(Collectors.toSet()));
    }
    return segments.stream().collect(Collectors.joining(" "));
  }

  // List of CI/CD providers and their environment variables for detection
  private static List<CicdProvider> listCiCdProviders() {
    return Arrays.asList(
        new CicdProvider("github", Collections.singletonList(new EnvVar("GITHUB_ACTIONS", "true"))),
        new CicdProvider("gitlab", Collections.singletonList(new EnvVar("GITLAB_CI", "true"))),
        new CicdProvider("jenkins", Collections.singletonList(new EnvVar("JENKINS_URL", ""))),
        new CicdProvider("azure-devops", Collections.singletonList(new EnvVar("TF_BUILD", "True"))),
        new CicdProvider("circle", Collections.singletonList(new EnvVar("CIRCLECI", "true"))),
        new CicdProvider("travis", Collections.singletonList(new EnvVar("TRAVIS", "true"))),
        new CicdProvider(
            "bitbucket", Collections.singletonList(new EnvVar("BITBUCKET_BUILD_NUMBER", ""))),
        new CicdProvider(
            "google-cloud-build",
            Arrays.asList(
                new EnvVar("PROJECT_ID", ""),
                new EnvVar("BUILD_ID", ""),
                new EnvVar("PROJECT_NUMBER", ""),
                new EnvVar("LOCATION", ""))),
        new CicdProvider(
            "aws-code-build", Collections.singletonList(new EnvVar("CODEBUILD_BUILD_ARN", ""))),
        new CicdProvider("tf-cloud", Collections.singletonList(new EnvVar("TFC_RUN_ID", ""))));
  }

  // Volatile field to ensure thread-safe lazy initialization
  // The 'volatile' keyword ensures that changes to these variables
  // are immediately visible to all threads. It prevents instruction
  // reordering by the compiler.
  protected static volatile String cicdProvider = null;

  protected static volatile String agentProvider = null;

  protected static volatile String metaHarnessProvider = null;

  protected static Environment env = null;

  // Represents an environment variable with its name and expected value
  private static class EnvVar {
    private final String name;
    private final String expectedValue;

    public EnvVar(String name, String expectedValue) {
      this.name = name;
      this.expectedValue = expectedValue;
    }
  }

  // Represents a CI/CD provider with its name and associated environment variables
  private static class CicdProvider {
    private final String name;
    private final List<EnvVar> envVars;

    public CicdProvider(String name, List<EnvVar> envVars) {
      this.name = name;
      this.envVars = envVars;
    }

    public boolean detect(Environment env) {
      for (EnvVar envVar : envVars) {
        String value = env.get(envVar.name);
        if (value == null) {
          return false;
        }
        if (!envVar.expectedValue.isEmpty() && !value.equals(envVar.expectedValue)) {
          return false;
        }
      }
      return true;
    }
  }

  // Looks up the active CI/CD provider based on environment variables
  private static String lookupCiCdProvider(Environment env) {
    for (CicdProvider provider : listCiCdProviders()) {
      if (provider.detect(env)) {
        return provider.name;
      }
    }
    return "";
  }

  // Thread-safe lazy initialization of CI/CD provider detection
  private static String cicdProvider() {
    // First check (not synchronized) to avoid unnecessary synchronization
    if (cicdProvider == null) {
      // Synchronize only if cicdProvider is null
      synchronized (UserAgent.class) {
        // Second check (synchronized) to ensure only one thread initializes
        // This is necessary because multiple threads might have passed the first check
        if (cicdProvider == null) {
          cicdProvider = lookupCiCdProvider(env());
        }
      }
    }
    return cicdProvider;
  }

  // Describes a single AI coding agent: the env var that identifies it and the
  // product name reported in the user agent.
  private static class KnownAgent {
    private final String envVar;
    private final String product;

    KnownAgent(String envVar, String product) {
      this.envVar = envVar;
      this.product = product;
    }
  }

  // The agents.md standard env var. Consulted first when no explicit matcher
  // fires.
  private static final String AGENT_ENV_VAR = "AGENT";

  // The Vercel @vercel/detect-agent convention env var. Consulted only as a
  // secondary fallback when AGENT is unset or empty.
  private static final String AI_AGENT_ENV_VAR = "AI_AGENT";

  // Maximum length of a passed-through fallback agent value. Longer values are
  // truncated to keep the user agent header bounded.
  private static final int MAX_AGENT_FALLBACK_LEN = 64;

  // Canonical list of known AI coding agents.
  // Keep this list, and the AGENT/AI_AGENT fallback handling in
  // agentEnvFallback, in sync with databricks-sdk-go and databricks-sdk-py.
  // Agents are listed alphabetically by product name.
  private static List<KnownAgent> listKnownAgents() {
    return Arrays.asList(
        new KnownAgent(
            "AMP_CURRENT_THREAD_ID",
            "amp"), // https://ampcode.com/ (also sets AGENT=amp, handled centrally)
        new KnownAgent("ANTIGRAVITY_AGENT", "antigravity"), // Closed source (Google)
        new KnownAgent("AUGMENT_AGENT", "augment"), // https://www.augmentcode.com/
        new KnownAgent("CLAUDECODE", "claude-code"), // https://github.com/anthropics/claude-code
        new KnownAgent("CLINE_ACTIVE", "cline"), // https://github.com/cline/cline (v3.24.0+)
        new KnownAgent("CODEX_CI", "codex"), // https://github.com/openai/codex
        new KnownAgent("COPILOT_CLI", "copilot-cli"), // https://github.com/features/copilot
        new KnownAgent("CURSOR_AGENT", "cursor"), // Closed source
        new KnownAgent("GEMINI_CLI", "gemini-cli"), // https://google-gemini.github.io/gemini-cli
        new KnownAgent(
            "GOOSE_TERMINAL",
            "goose"), // https://block.github.io/goose/ (also sets AGENT=goose, handled centrally)
        new KnownAgent("KIRO", "kiro"), // https://kiro.dev/ (Amazon)
        new KnownAgent("OPENCLAW_SHELL", "openclaw"), // https://github.com/anthropics/openclaw
        new KnownAgent("OPENCODE", "opencode"), // https://github.com/opencode-ai/opencode
        // Set by VS Code 1.121+ for agent-initiated terminal commands
        // (https://code.visualstudio.com/updates/v1_121).
        new KnownAgent("VSCODE_AGENT", "vscode-agent"),
        new KnownAgent("WINDSURF_AGENT", "windsurf")); // https://codeium.com/windsurf (Codeium)
  }

  // Looks up the active agent provider based on environment variables.
  //
  // Explicit env var matchers (e.g. CLAUDECODE, GOOSE_TERMINAL) always take
  // precedence over the generic AGENT=<name> signal. The AGENT env var is
  // treated purely as a fallback for agents that have no explicit matcher, or
  // for agents we do not yet specifically recognize.
  //
  // The function counts how many distinct agents matched via explicit env vars:
  //   - Exactly one agent matched: return its product name.
  //   - More than one agent matched: return "multiple". Agent env vars can be
  //     stacked when one agent invokes another as a subagent (e.g. Claude Code
  //     spawning a Cursor CLI subprocess), so the child process inherits env
  //     vars from multiple layers.
  //   - Zero agents matched: fall back to the generic AGENT / AI_AGENT env
  //     vars (see agentEnvFallback).
  //
  // Because explicit matchers win over AGENT, e.g. AGENT=cursor + CLAUDECODE=1
  // yields "claude-code", and AGENT=goose + CLAUDECODE=1 also yields
  // "claude-code".
  private static String lookupAgentProvider(Environment env) {
    List<KnownAgent> agents = listKnownAgents();

    List<String> matches = new ArrayList<>();
    for (KnownAgent a : agents) {
      if (env.get(a.envVar) != null) {
        matches.add(a.product);
      }
    }

    if (matches.size() == 1) {
      return matches.get(0);
    }
    if (matches.size() > 1) {
      return "multiple";
    }
    return agentEnvFallback(env);
  }

  // agentEnvFallback honors the agents.md AGENT=<name> standard, with the
  // Vercel @vercel/detect-agent AI_AGENT convention as a secondary fallback.
  // AGENT takes precedence when both are non-empty.
  //
  // The raw value is passed through (no coercion to "unknown"), but sanitized
  // to satisfy the user agent allowlist and capped at MAX_AGENT_FALLBACK_LEN
  // characters. Returns "" when both AGENT and AI_AGENT are unset or empty.
  private static String agentEnvFallback(Environment env) {
    String v = env.get(AGENT_ENV_VAR);
    if (v == null || v.isEmpty()) {
      v = env.get(AI_AGENT_ENV_VAR);
    }
    if (v == null || v.isEmpty()) {
      return "";
    }
    v = sanitize(v);
    if (v.length() > MAX_AGENT_FALLBACK_LEN) {
      v = v.substring(0, MAX_AGENT_FALLBACK_LEN);
    }
    return v;
  }

  // Thread-safe lazy initialization of agent provider detection
  private static String agentProvider() {
    if (agentProvider == null) {
      synchronized (UserAgent.class) {
        if (agentProvider == null) {
          agentProvider = lookupAgentProvider(env());
        }
      }
    }
    return agentProvider;
  }

  // Describes a single meta-harness: the env var that identifies it and the
  // product name reported in the user agent.
  private static class KnownMetaHarness {
    private final String envVar;
    private final String product;

    KnownMetaHarness(String envVar, String product) {
      this.envVar = envVar;
      this.product = product;
    }
  }

  // Canonical list of known meta-harnesses, detected by presence.
  // Keep in sync with databricks-sdk-go and databricks-sdk-py.
  // OMNIGENT is set by the omnigent meta-harness (https://github.com/omnigent-ai/omnigent).
  private static List<KnownMetaHarness> listKnownMetaHarnesses() {
    return Arrays.asList(new KnownMetaHarness("OMNIGENT", "omnigent"));
  }

  // Looks up the active meta-harness by env var presence, independent of the agent.
  private static String lookupMetaHarnessProvider(Environment env) {
    for (KnownMetaHarness h : listKnownMetaHarnesses()) {
      if (env.get(h.envVar) != null) {
        return h.product;
      }
    }
    return "";
  }

  // Thread-safe lazy initialization of meta-harness detection
  private static String metaHarnessProvider() {
    if (metaHarnessProvider == null) {
      synchronized (UserAgent.class) {
        if (metaHarnessProvider == null) {
          metaHarnessProvider = lookupMetaHarnessProvider(env());
        }
      }
    }
    return metaHarnessProvider;
  }

  private static Environment env() {
    if (env == null) {
      env =
          new Environment(
              System.getenv(),
              System.getenv("PATH").split(File.pathSeparator),
              System.getProperty("os.name"));
    }
    return env;
  }
}

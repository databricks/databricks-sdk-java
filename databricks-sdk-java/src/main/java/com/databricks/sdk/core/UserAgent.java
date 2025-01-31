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
  private static final String version = "0.35.0";

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
  private static volatile String cicdProvider = null;

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

package com.databricks.sdk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserAgent {
  private static final Logger log = LoggerFactory.getLogger(UserAgent.class);
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
    String ciProvider = cicdProvider();
    if (!ciProvider.isEmpty()) {
      segments.add(String.format("ci/%s", ciProvider));
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

  // Map of CI/CD providers that are used to detect them.
  private static final Map<String, List<EnvVar>> PROVIDERS = new HashMap<>();

  static {
    PROVIDERS.put("github", Collections.singletonList(new EnvVar("GITHUB_ACTIONS", "true")));
    PROVIDERS.put("gitlab", Collections.singletonList(new EnvVar("GITLAB_CI", "true")));
    PROVIDERS.put("jenkins", Collections.singletonList(new EnvVar("JENKINS_URL", "")));
    PROVIDERS.put("azure-devops", Collections.singletonList(new EnvVar("TF_BUILD", "True")));
    PROVIDERS.put("circle", Collections.singletonList(new EnvVar("CIRCLECI", "true")));
    PROVIDERS.put("travis", Collections.singletonList(new EnvVar("TRAVIS", "true")));
    PROVIDERS.put("bitbucket", Collections.singletonList(new EnvVar("BITBUCKET_BUILD_NUMBER", "")));
    PROVIDERS.put(
        "google-cloud-build",
        Arrays.asList(
            new EnvVar("PROJECT_ID", ""),
            new EnvVar("BUILD_ID", ""),
            new EnvVar("PROJECT_NUMBER", ""),
            new EnvVar("LOCATION", "")));
    PROVIDERS.put(
        "aws-code-build", Collections.singletonList(new EnvVar("CODEBUILD_BUILD_ARN", "")));
    PROVIDERS.put("tf-cloud", Collections.singletonList(new EnvVar("TFC_RUN_ID", "")));
  }

  // This is a static private variable to store the CI/CD provider.
  // This is thread-safe because static initializers are executed
  // in a thread-safe manner by the Java ClassLoader.
  private static final String cicdProvider = lookupCiCdProvider();

  private static class EnvVar {
    private final String name;
    private final String expectedValue;

    public EnvVar(String name, String expectedValue) {
      this.name = name;
      this.expectedValue = expectedValue;
    }

    public boolean detect() {
      String value = System.getenv(name);
      return value != null && (expectedValue.isEmpty() || value.equals(expectedValue));
    }
  }

  private static String lookupCiCdProvider() {
    for (Map.Entry<String, List<EnvVar>> entry : PROVIDERS.entrySet()) {
      if (entry.getValue().stream().allMatch(EnvVar::detect)) {
        return entry.getKey();
      }
    }
    return "";
  }

  public static String cicdProvider() {
    return cicdProvider;
  }
}

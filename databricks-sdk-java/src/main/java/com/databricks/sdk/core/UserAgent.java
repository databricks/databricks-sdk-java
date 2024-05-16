package com.databricks.sdk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
  private static final String version = "0.25.0";

  public static void withProduct(String product, String productVersion) {
    UserAgent.product = product;
    UserAgent.productVersion = productVersion;
  }

  public static void withPartner(String partner) {
    withOtherInfo("partner", partner);
  }

  public static void withOtherInfo(String key, String value) {
    otherInfo.add(new Info(key, value));
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
    segments.addAll(
        otherInfo.stream()
            .map(e -> String.format("%s/%s", e.getKey(), e.getValue())).collect(Collectors.toSet()));
    return segments.stream().collect(Collectors.joining(" "));
  }
}

package com.databricks.sdk.core;

public final class Version {

  // TODO: check if reading from
  // /META-INF/maven/com.databricks/databrics-sdk-java/pom.properties
  // or getClass().getPackage().getImplementationVersion() is enough.
  private static final String version = "0.8.1";

  public static String sdkVersion() {
    return version;
  }

  private Version() {}
}

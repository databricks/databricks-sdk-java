package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OSUtils {

  public static String os;

  public static void setOS() {
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      os = "win";
    } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
      os = "mac";
    } else {
      os = "linux";
    }
  }

  // Return the executable command based on OS and tokenize them
  static List<String> getCliExecutableCommand(List<String> cmd) {
    if (os.equals("win")) {
      return Stream.concat(Arrays.asList("cmd.exe", "/c").stream(), cmd.stream())
          .collect(Collectors.toList());
    } else {
      return Stream.concat(Arrays.asList("/bin/bash", "-c").stream(), cmd.stream())
          .collect(Collectors.toList());
    }
  }

  public static String getTestPrefixPath() {
    if (os.equals("win")) {
      return "\\target\\test-classes\\";
    } else {
      return "/target/test-classes/";
    }
  }

  static List<String> commandToSetTestAzExecutable() {
    if (os.equals("mac")) {
      return Arrays.asList(
          "/bin/bash",
          "-c",
          "chmod a+x /Users/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
    } else {
      return Arrays.asList(
          "/bin/bash",
          "-c",
          "chmod a+x /home/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
    }
  }
}

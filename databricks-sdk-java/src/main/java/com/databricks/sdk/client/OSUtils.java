package com.databricks.sdk.client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OSUtils {

  public static boolean isWin;

  public static void setOS() {
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      isWin = true;
    } else {
      isWin = false;
    }
  }

  // Return the executable command based on OS and tokenize them
  static List<String> getCliExecutableCommand(List<String> cmd) {
    if (isWin) {
      return Stream.concat(Arrays.asList("cmd.exe", "/c").stream(), cmd.stream())
          .collect(Collectors.toList());
    } else {
      return Stream.concat(Arrays.asList("/bin/bash", "-c").stream(), cmd.stream())
          .collect(Collectors.toList());
    }
  }

  public static String getTestPrefixPath() {
    if (isWin) {
      return "\\target\\test-classes\\";
    } else {
      return "/target/test-classes/";
    }
  }

  public static String convertPathToLinuxAndMac(String path) {
    path.replace("\\", "/");
    path.replace(";", ":");
    return path;
  }

  public static String convertPathToWindows(String path) {
    path.replace("/", "\\");
    path.replace(":", ";");
    return path;
  }
}

package com.databricks.sdk.client.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * OSUtils is an interface that provides utility methods for determining the current operating
 * system and returning executable command based on the operating system.
 */
public interface OSUtils {

  /**
   * Returns the name of the current operating system.
   *
   * @return a String representing the name of the current operating system. The value will be "win"
   *     for Windows, "mac" for macOS, and "linux" for Linux-based operating systems.
   */
  default String getOS() {
    if (System.getProperty("os.name").toLowerCase().startsWith("win")) {
      return "win";
    } else if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
      return "mac";
    }
    return "linux";
  }

  /**
   * Returns a list of strings representing an executable command for the current operating system,
   * based on the given list of command tokens.
   *
   * @param cmd a list of strings representing the command to be executed.
   * @return a List of strings representing the executable command for the current operating system.
   *     On Windows, the command will be wrapped in "cmd.exe /c" and on other operating systems, it
   *     will be wrapped in "/bin/bash -c".
   */
  default List<String> getCliExecutableCommand(List<String> cmd) {
    String cmdToString = String.join(" ", cmd);
    if (getOS().equals("win")) {
      return Arrays.asList("cmd.exe", "/c", cmdToString);
    } else {
      return Arrays.asList("/bin/bash", "-c", cmdToString);
    }
  }
}

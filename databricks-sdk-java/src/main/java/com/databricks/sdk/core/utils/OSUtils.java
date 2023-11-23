package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksException;

import java.util.Arrays;
import java.util.List;

/**
 * OSUtils is an interface that provides utility methods for determining the current operating
 * system and returning executable command based on the operating system.
 */
public class OSUtils {

  /**
   * Returns the name of the current operating system.
   *
   * @return a String representing the name of the current operating system. The value will be "win"
   *     for Windows, "mac" for macOS, and "linux" for Linux-based operating systems.
   */
  public static String getOS() {
    String systemName = System.getProperty("os.name").toLowerCase();
    if (systemName.startsWith("win")) {
      return "win";
    } else if (systemName.startsWith("mac")) {
      return "mac";
    }
    return "linux";
  }

  /**
   * Returns the OS-specific utilities for the current operating system.
   */
  public static OSUtilities get() {
    String os = getOS();
      switch (os) {
          case "win":
              return new WindowsUtilities();
          case "mac":
              return new MacOSUtilities();
          case "linux":
              return new LinuxUtilities();
      }
    throw new DatabricksException("Unsupported OS: " + os);
  }
}

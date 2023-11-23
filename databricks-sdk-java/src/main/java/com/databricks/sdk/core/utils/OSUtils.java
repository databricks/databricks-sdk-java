package com.databricks.sdk.core.utils;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OSUtils is an interface that provides utility methods for determining the current operating
 * system and returning executable command based on the operating system.
 */
public class OSUtils {
  private static final Logger LOG = LoggerFactory.getLogger(OSUtils.class);

  /**
   * Returns the name of the current operating system.
   *
   * @return a String representing the name of the current operating system. The value will be "win"
   *     for Windows, "mac" for macOS, and "linux" for Linux-based operating systems.
   */
  static String getOS(DatabricksConfig cfg) {
    String systemName = cfg.getAllEnv().get("OS_NAME");
    if (systemName == null || systemName.isEmpty()) {
      systemName = System.getProperty("os.name").toLowerCase();
    }
    if (systemName.startsWith("win")) {
      return "win";
    } else if (systemName.startsWith("mac")) {
      return "mac";
    }
    return "linux";
  }

  /** Returns the OS-specific utilities for the current operating system. */
  public static OSUtilities get(DatabricksConfig cfg) {
    String os = getOS(cfg);
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

  public static String findExecutable(String name) {
    String pathVal = System.getenv("PATH");
    StringTokenizer stringTokenizer = new StringTokenizer(pathVal, File.pathSeparator);
    while (stringTokenizer.hasMoreTokens()) {
      Path path = Paths.get(stringTokenizer.nextToken(), name).toAbsolutePath().normalize();
      if (!Files.isRegularFile(path)) {
        continue;
      }
      long size;
      try {
        size = Files.size(path);
      } catch (IOException e) {
        LOG.warn("Unable to get size of databricks cli: " + e.getMessage());
        return null;
      }
      if (size < 1024 * 1024) {
        LOG.info("Databricks CLI version <0.100.0 detected");
        return null;
      }
      return path.toString();
    }
    LOG.debug("Failed to find executable named " + name + " in PATH");
    return null;
  }
}

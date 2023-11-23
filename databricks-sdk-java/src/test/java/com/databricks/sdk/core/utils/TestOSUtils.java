package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TestOSUtils provides utility methods for testing on various operating systems.
 */
public class TestOSUtils {

  Logger LOG = LoggerFactory.getLogger(TestOSUtils.class);

  /**
   * Returns the path to the directory containing test files.
   *
   * @return a String representing the path to the directory containing test files. The path will
   *     use the correct file separator for the current operating system.
   */
  public static String getTestDir() {
    String testDir = "/target/test-classes/";
    return testDir.replace("/", File.separator);
  }

  public static String resource(String file) {
    URL resource = TestOSUtils.class.getResource(file);
    if (resource == null) {
      fail("Asset not found: " + file);
    }
    return resource.getFile();
  }
}

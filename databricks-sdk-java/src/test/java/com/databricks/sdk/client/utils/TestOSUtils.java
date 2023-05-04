package com.databricks.sdk.client.utils;

import java.io.File;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TestOSUtils is an interface that extends the OSUtils interface and provides utility methods for
 * testing on various operating systems.
 */
public interface TestOSUtils extends OSUtils {

  Logger LOG = LoggerFactory.getLogger(TestOSUtils.class);

  /**
   * Returns the path to the directory containing test files.
   *
   * @return a String representing the path to the directory containing test files. The path will
   *     use the correct file separator for the current operating system.
   */
  default String getTestDir() {
    String testDir = "/target/test-classes/";
    return testDir.replace("/", File.separator);
  }
}

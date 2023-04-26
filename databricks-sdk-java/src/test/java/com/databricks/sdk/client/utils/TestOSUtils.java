package com.databricks.sdk.client.utils;

import java.io.File;
import java.util.Arrays;
import java.util.List;
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

  /**
   * Returns a list of strings representing a command to set the az executable for testing purposes
   * on Linux-based operating systems.
   *
   * @return a List of strings representing the executable command for the current operating system.
   *     On Linux-based operating systems, the command will set execute permission for the az
   *     executable in the test data directory. On other operating systems, it will return an empty
   *     list.
   */
  default List<String> commandToSetTestAzExecutable() {
    // Ubuntu:
    // OLDPWD=/home/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata
    String cmd = "";
    if (getOS().equals("linux")) {
      cmd =
          "chmod a+x "
              + System.getenv("OLDPWD")
              + "/target/test-classes/testdata/".replace("/", File.separator)
              + "az";
    }
    LOG.info("Running command: {}", cmd);
    return Arrays.asList("/bin/bash", "-c", cmd);
  }
}

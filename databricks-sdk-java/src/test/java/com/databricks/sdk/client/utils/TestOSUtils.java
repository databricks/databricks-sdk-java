package com.databricks.sdk.client.utils;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public interface TestOSUtils extends OSUtils {
  default String getTestDir() {
    String testDir = "/target/test-classes/";
    return testDir.replace("/", File.separator);
  }

  default List<String> commandToSetTestAzExecutable() {
    // Ubuntu:
    // HOME=/home/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata
    // Mac:
    // HOME=/Users/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata
    String home = System.getenv("HOME");
    String pathToAz = "chmod a+x " + home + "/".replace("/", File.separator) + "az";
    return Arrays.asList("/bin/bash", "-c", pathToAz);
  }
}

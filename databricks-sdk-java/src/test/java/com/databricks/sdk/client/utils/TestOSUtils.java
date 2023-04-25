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
    if (getOS().equals("mac")) {
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

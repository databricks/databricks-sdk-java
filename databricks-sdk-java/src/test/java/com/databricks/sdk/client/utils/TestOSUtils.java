package com.databricks.sdk.client.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public interface TestOSUtils extends OSUtils {

  Logger LOG = LoggerFactory.getLogger(TestOSUtils.class);

  default String getTestDir() {
    String testDir = "/target/test-classes/";
    return testDir.replace("/", File.separator);
  }

  default List<String> commandToSetTestAzExecutable() {
    // Ubuntu:
    // OLDPWD=/home/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata
    String cmd = "";
    if(getOS().equals("linux")) {
      cmd = "chmod a+x " + System.getenv("OLDPWD") + "/target/test-classes/testdata/".replace("/", File.separator) + "az";
    }

    LOG.info("tanmaytest -- home = {}", cmd);
    LOG.info("tanmaytest -- pathToAz = {}", cmd);

    return Arrays.asList("/bin/bash", "-c", cmd);
  }
}

package com.databricks.sdk.client;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GithubUtils {

  private static final Logger LOG = LoggerFactory.getLogger(GithubUtils.class);

  public static boolean isGithubAction = false;

  public static void checkGithub() {
    if (System.getenv("GITHUB_ACTIONS") != null) {
      isGithubAction = true;
    }
  }

  // We need this because in the GitHub actions (for Ubuntu), the runner doesn't have
  // executable permission on generated az test script by maven. This happens even if we add a step
  // in the GitHub workflows to explicitly set executable permission on the source az file. Hence,
  // we need
  // to set it inside the test so that this script is found inside the $PATH environment variable.
  // This
  // works fine for macOS.
  public static void setPermissionOnTestAz() {
    try {
      List<String> cmd;
      if (System.getProperty("os.name").toLowerCase().startsWith("mac")) {
        cmd =
            Arrays.asList(
                "/bin/bash",
                "-c",
                "chmod a+x /Users/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
      } else {
        cmd =
            Arrays.asList(
                "/bin/bash",
                "-c",
                "chmod a+x /home/runner/work/databricks-sdk-jvm/databricks-sdk-jvm/databricks-sdk-java/target/test-classes/testdata/az");
      }
      ProcessUtils.runProcess(cmd);
    } catch (IOException | InterruptedException e) {
      LOG.info("Failed to set executable permission for test az script: {}", e.getMessage());
    }
  }
}

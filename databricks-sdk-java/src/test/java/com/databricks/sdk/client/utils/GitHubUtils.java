package com.databricks.sdk.client.utils;

import com.databricks.sdk.client.ProcessUtils;
import java.io.IOException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GitHubUtils is an interface that provides utility methods for working with GitHub actions and
 * testing on various operating systems.
 */
public interface GitHubUtils extends TestOSUtils, ProcessUtils {

  Logger LOG = LoggerFactory.getLogger(GitHubUtils.class);

  /**
   * Returns a boolean indicating whether the current process is running in a GitHub Actions
   * environment.
   *
   * @return true if the process is running in a GitHub Actions environment, false otherwise.
   */
  default boolean checkIfRunningOnGithub() {
    if (System.getenv("CI") != null) {
      return true;
    }
    return false;
  }

  /**
   * Sets executable permission for the az test script, if required for the current operating
   * system.
   *
   * <p>This method is needed because in the GitHub actions (for Ubuntu), the runner doesn't have
   * executable permission on the generated az test script by maven. This happens even if a step is
   * added to the GitHub workflows to explicitly set executable permission on the source az file.
   * Hence, this method is called inside the test so that the script is found inside the $PATH
   * environment variable. This works fine for macOS.
   *
   * @throws IOException if there is an error setting the executable permission.
   * @throws InterruptedException if the thread is interrupted while waiting for the process to
   *     complete.
   */
  default void setPermissionOnTestAz() {
    try {
      if (getOS().equals("mac")) {
        // We don't require to set this for macOS
        return;
      }
      List<String> cmd = commandToSetTestAzExecutable();
      runProcess(cmd);
    } catch (IOException e) {
      LOG.info("Failed to set executable permission for test az script: {}", e.getMessage());
    } catch (InterruptedException e) {
      LOG.info("Failed to set executable permission for test az script: {}", e.getMessage());
      Thread.currentThread().interrupt();
    }
  }
}

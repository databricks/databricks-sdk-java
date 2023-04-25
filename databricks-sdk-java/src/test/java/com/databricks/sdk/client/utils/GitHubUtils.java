package com.databricks.sdk.client.utils;

import com.databricks.sdk.client.ProcessUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;

public interface GitHubUtils extends TestOSUtils, ProcessUtils {

    Logger LOG = LoggerFactory.getLogger(GitHubUtils.class);

    default boolean checkIfRunningOnGithub() {
        if (System.getenv("GITHUB_ACTIONS") != null) {
            return true;
        }
        return false;
    }

    // We need this because in the GitHub actions (for Ubuntu), the runner doesn't have
    // executable permission on generated az test script by maven. This happens even if we add a step
    // in the GitHub workflows to explicitly set executable permission on the source az file. Hence,
    // we need
    // to set it inside the test so that this script is found inside the $PATH environment variable.
    // This
    // works fine for macOS.
    default void setPermissionOnTestAz() {
        try {
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

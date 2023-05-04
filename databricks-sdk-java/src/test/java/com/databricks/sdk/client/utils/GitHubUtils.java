package com.databricks.sdk.client.utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * GitHubUtils is an interface that provides utility methods for working with GitHub actions and
 * testing on various operating systems.
 */
public interface GitHubUtils extends TestOSUtils {

  Logger LOG = LoggerFactory.getLogger(GitHubUtils.class);

  /**
   * Returns a boolean indicating whether the current process is running in a GitHub Actions
   * environment.
   *
   * @return true if the process is running in a GitHub Actions environment, false otherwise.
   */
  default boolean checkIfRunningOnGithub() {
    if (System.getenv("GITHUB_ACTIONS") != null) {
      return true;
    }
    return false;
  }

  /**
   * Sets executable permission for the az test script, if required for the current operating
   * system.
   */
  default void setPermissionOnTestAz() {
    try {
      Set<PosixFilePermission> perms = new HashSet<>();
      perms.add(PosixFilePermission.OWNER_READ);
      perms.add(PosixFilePermission.OWNER_EXECUTE);
      URL azStub = getClass().getResource("/testdata/az");
      if (azStub == null) {
        throw new IOException("cannot find `az` mock script");
      }
      File file = new File(Objects.requireNonNull(azStub).getPath());
      Files.setPosixFilePermissions(file.toPath(), perms);
    } catch (IOException e) {
      LOG.info("Failed to set executable permission for test az script: {}", e.getMessage());
    }
  }
}

package com.databricks.sdk.utils;

import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OSUtilsTest {
  /**
   * Helper class to create a temporary directory with a databricks executable in it.
   *
   * <p>We generate these files dynamically as the test is run because our check for the
   * `databricks` executable is based on the size of the file, but we don't need to check a large
   * file into our repository.
   */
  static class PathHelper implements AutoCloseable {
    private List<Path> paths;
    private String executableName;

    public PathHelper(String osName, String executableName) {
      this.executableName = executableName;
      this.paths = new ArrayList<>();
      try {
        // Random UUID
        String base = "databricks-sdk-java-test_" + osName + "_" + UUID.randomUUID();
        Path noDatabricksDir = Files.createTempDirectory(base);
        paths.add(noDatabricksDir);
        Path smallDatabricksDir = Files.createTempDirectory(base);
        Files.write(smallDatabricksDir.resolve(executableName), new byte[0]);
        paths.add(smallDatabricksDir);
        Path bigDatabricksDir = Files.createTempDirectory(base);
        Files.write(bigDatabricksDir.resolve(executableName), new byte[2000000]);
        paths.add(bigDatabricksDir);
      } catch (IOException e) {
        throw new RuntimeException(e);
      }
    }

    public List<String> getPath() {
      return paths.stream().map(Path::toString).collect(Collectors.toList());
    }

    @Override
    public void close() throws Exception {
      for (Path path : paths) {
        Files.deleteIfExists(path.resolve(executableName));
        Files.deleteIfExists(path);
      }
    }
  }

  @ParameterizedTest
  @CsvSource({
    "windows, databricks.exe, true",
    "windows, databricks, true",
    "windows, somethingElse, false",
    "macos, databricks, true",
    "linux, databricks, true"
  })
  public void testGetDatabricksCliPath(String osName, String executableName, Boolean expectFound)
      throws Exception {
    try (PathHelper pathHelper = new PathHelper(osName, executableName)) {
      Environment env = new Environment(new HashMap<>(), pathHelper.getPath(), osName);
      String executable = OSUtils.get(env).getDatabricksCliPath();
      assert (executable != null) == expectFound;
    }
  }
}

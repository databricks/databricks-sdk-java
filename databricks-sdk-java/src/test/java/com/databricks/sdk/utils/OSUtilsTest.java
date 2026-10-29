package com.databricks.sdk.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class OSUtilsTest {
  // Written by pip for the legacy Python CLI's entry point.
  private static final String LEGACY_CLI_ENTRY_POINT =
      "#!/opt/databricks-cli/bin/python\n"
          + "# -*- coding: utf-8 -*-\n"
          + "import re\n"
          + "import sys\n"
          + "from databricks_cli.cli import cli\n"
          + "if __name__ == '__main__':\n"
          + "    sys.argv[0] = re.sub(r'(-script\\.pyw|\\.exe)?$', '', sys.argv[0])\n"
          + "    sys.exit(cli())\n";

  /**
   * Helper class to create a temporary directory with a databricks executable in it.
   *
   * <p>We generate these files dynamically as the test is run because small files are skipped if
   * they are the legacy CLI, but we don't need to check a large file into our repository.
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
        Files.write(
            smallDatabricksDir.resolve(executableName),
            LEGACY_CLI_ENTRY_POINT.getBytes(StandardCharsets.UTF_8));
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

  private static String writeCli(Path dir, byte[] content) throws IOException {
    Path cli = dir.resolve("databricks");
    Files.write(cli, content);
    return cli.toAbsolutePath().normalize().toString();
  }

  private static String writeCli(Path dir, String content) throws IOException {
    return writeCli(dir, content.getBytes(StandardCharsets.UTF_8));
  }

  @Test
  public void findExecutable_skipsLegacyCliEntryPointImportingMain(@TempDir Path dir)
      throws IOException {
    writeCli(dir, LEGACY_CLI_ENTRY_POINT.replace("import cli", "import main"));
    assertNull(OSUtils.findExecutable(Collections.singletonList(dir.toString()), "databricks"));
  }

  @Test
  public void findExecutable_acceptsSmallWrapperMentioningPackageName(@TempDir Path dir)
      throws IOException {
    String expected =
        writeCli(
            dir,
            "#!/bin/sh\n# Replaces databricks_cli (databricks-cli on PyPI).\n"
                + "exec /opt/databricks/bin/databricks \"$@\"\n");
    assertEquals(
        expected, OSUtils.findExecutable(Collections.singletonList(dir.toString()), "databricks"));
  }

  // A legacy CLI is skipped, but otherwise the first CLI in PATH wins.
  @ParameterizedTest
  @CsvSource({"legacy:shim:regular, shim", "shim:regular, shim", "regular:shim, regular"})
  public void findExecutable_pathOrder(String order, String want, @TempDir Path root)
      throws IOException {
    Map<String, byte[]> contents = new HashMap<>();
    contents.put("legacy", LEGACY_CLI_ENTRY_POINT.getBytes(StandardCharsets.UTF_8));
    contents.put(
        "shim",
        "#!/bin/sh\nexec /opt/databricks/bin/databricks \"$@\"\n".getBytes(StandardCharsets.UTF_8));
    contents.put("regular", new byte[2000000]);
    Map<String, String> clis = new HashMap<>();
    for (Map.Entry<String, byte[]> e : contents.entrySet()) {
      clis.put(e.getKey(), writeCli(Files.createDirectory(root.resolve(e.getKey())), e.getValue()));
    }
    List<String> paths = new ArrayList<>();
    for (String name : order.split(":")) {
      paths.add(root.resolve(name).toString());
    }
    assertEquals(clis.get(want), OSUtils.findExecutable(paths, "databricks"));
  }
}

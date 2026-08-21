package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collections;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** TestOSUtils provides utility methods for testing on various operating systems. */
public class TestOSUtils {

  Logger LOG = LoggerFactory.getLogger(TestOSUtils.class);

  /**
   * Returns the path to the directory containing test files.
   *
   * @return a String representing the path to the directory containing test files. The path will
   *     use the correct file separator for the current operating system.
   */
  public static String getTestDir() {
    String testDir = "/target/test-classes/";
    return testDir.replace("/", File.separator);
  }

  /**
   * Returns an absolute filesystem path to a classpath resource -- a single file or a whole
   * directory subtree -- with the executable bit set, staging a writable copy only when needed.
   *
   * <p>Tests use the returned path as HOME (a fixture directory holding a .databrickscfg) or as the
   * path to a fake CLI executable, and some assert on it after stripping a fixed {@code user.dir +
   * /target/test-classes/} prefix (see StaticEnv). When the resource is already an on-disk,
   * writable file -- Maven explodes test resources into target/test-classes -- we chmod it in place
   * and return that path, so those prefix-relative assertions still hold. When it cannot be
   * chmod-ed in place (served read-only from a jar or from Bazel's runfiles), we copy it to a fresh
   * temp directory, preserving the resource path, and chmod the copy.
   */
  public static String resource(String file) {
    URL resource = TestOSUtils.class.getResource(file);
    if (resource == null) {
      fail("Asset not found: " + file);
    }
    try {
      URI uri = resource.toURI();
      if ("file".equals(uri.getScheme())) {
        // Exploded on disk (Maven): chmod in place and keep the original path, so path-based
        // assertions relative to target/test-classes still match.
        Path path = Paths.get(uri);
        if (setExecutableRecursively(path)) {
          return path.toString();
        }
        // Read-only file: resource (e.g. Bazel runfiles): fall through to the temp-copy path.
      }
      // Preserve the full resource path under the temp root (not just the basename): several
      // tests assert on a path substring like "testdata/corrupt/.databrickscfg".
      String relativePath = file.startsWith("/") ? file.substring(1) : file;
      Path dest = Files.createTempDirectory("databricks-sdk-test").resolve(relativePath);
      if ("jar".equals(uri.getScheme())) {
        // Resource lives inside a jar: mount the jar as a filesystem and copy the entry out.
        String[] parts = uri.toString().split("!", 2);
        try (FileSystem fs =
            FileSystems.newFileSystem(
                URI.create(parts[0]), Collections.<String, Object>emptyMap())) {
          copyRecursively(fs.getPath(parts[1]), dest);
        }
      } else {
        copyRecursively(Paths.get(uri), dest);
      }
      setExecutableRecursively(dest);
      return dest.toString();
    } catch (IOException | URISyntaxException e) {
      fail("Failed to stage test asset " + file + ": " + e.getMessage());
      return null; // unreachable: fail() throws
    }
  }

  private static void copyRecursively(Path source, Path dest) throws IOException {
    try (Stream<Path> paths = Files.walk(source)) {
      for (Path path : (Iterable<Path>) paths::iterator) {
        Path target = dest.resolve(source.relativize(path).toString());
        if (Files.isDirectory(path)) {
          Files.createDirectories(target);
        } else {
          Files.createDirectories(target.getParent());
          Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING);
        }
      }
    }
  }

  /**
   * Sets the executable bit on {@code root} and everything under it, returning whether all
   * succeeded.
   */
  private static boolean setExecutableRecursively(Path root) throws IOException {
    boolean ok = true;
    try (Stream<Path> paths = Files.walk(root)) {
      for (Path path : (Iterable<Path>) paths::iterator) {
        if (!path.toFile().setExecutable(true)) {
          ok = false;
        }
      }
    }
    return ok;
  }
}

package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.files.Delete;
import com.databricks.sdk.service.files.FileInfo;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class DbfsIT {
  // An integration test for DbfsExt which writes a file of 10 KiB to DBFS, reads the written file
  // back, and ensures that the contents of the file are the same as what was written out.
  @Test
  void writeFileAndReadFile(WorkspaceClient workspace) throws IOException {
    // Generate a random file name and random contents of 10 KiB.
    String fileName = "dbfs:/tmp/test-file-" + UUID.randomUUID();
    byte[] fileContents = new byte[1024 * 10];
    for (int i = 0; i < fileContents.length; i++) {
      fileContents[i] = (byte) (i % 256);
    }
    Path path = Paths.get(fileName);

    // Write the file to DBFS.
    workspace.dbfs().write(path, fileContents);

    try {
      // Read the file back from DBFS.
      byte[] readContents = workspace.dbfs().readAllBytes(path);

      // Assert that the contents of the file are the same as what was written out.
      assertArrayEquals(fileContents, readContents);
    } finally {
      workspace.dbfs().delete(fileName);
    }
  }

  /**
   * An integration test for DbfsExt.readAllLines which writes newline-delimited text to DBFS, reads
   * the written file back, and ensures that the contents of the file are the same as what was
   * written out.
   */
  @Test
  void writeLinesAndReadLines(WorkspaceClient workspace) throws IOException {
    // Generate a random file name and random contents of 10 KiB.
    String fileName = "dbfs:/tmp/test-file-" + UUID.randomUUID();
    String[] lines = new String[100];
    StringBuilder file = new StringBuilder();
    for (int i = 0; i < lines.length; i++) {
      lines[i] = "line " + i;
      file.append(lines[i]).append("\n");
    }
    Path path = Paths.get(fileName);

    // Write the file to DBFS.

    workspace.dbfs().write(path, file.toString().getBytes(StandardCharsets.UTF_8));

    try {
      // Read the file back from DBFS.
      String[] readLines =
          workspace.dbfs().readAllLines(path, StandardCharsets.UTF_8).toArray(new String[0]);

      // Assert that the contents of the file are the same as what was written out.
      assertArrayEquals(lines, readLines);
    } finally {
      workspace.dbfs().delete(fileName);
    }
  }

  /**
   * An integration test which creates a directory in DBFS, creates a random set of files and
   * directories within that directory, and then recursively lists the contents of the directory to
   * ensure that the contents of the directory match the expected contents.
   */
  @Test
  void testRecursiveListing(WorkspaceClient workspace) throws IOException {
    // Create a directory in DBFS.
    String relativeDirectoryName = "/tmp/test-directory-" + UUID.randomUUID();
    String directoryName = "dbfs:" + relativeDirectoryName;
    workspace.dbfs().mkdirs(directoryName);
    try {
      // Create a random set of files and directories within the directory.
      workspace.dbfs().write(Paths.get(directoryName, "file1"), new byte[0]);
      workspace.dbfs().write(Paths.get(directoryName, "file2"), new byte[0]);
      workspace.dbfs().mkdirs(Paths.get(directoryName, "dir1").toString());
      workspace.dbfs().write(Paths.get(directoryName, "dir1", "file3"), new byte[0]);
      workspace.dbfs().write(Paths.get(directoryName, "dir1", "file4"), new byte[0]);
      workspace.dbfs().mkdirs(Paths.get(directoryName, "dir2").toString());
      workspace.dbfs().write(Paths.get(directoryName, "dir2", "file5"), new byte[0]);

      // List the contents of the directory recursively.
      String[] expectedContents =
          new String[] {
            relativeDirectoryName + "/file1",
            relativeDirectoryName + "/file2",
            relativeDirectoryName + "/dir1",
            relativeDirectoryName + "/dir1/file3",
            relativeDirectoryName + "/dir1/file4",
            relativeDirectoryName + "/dir2",
            relativeDirectoryName + "/dir2/file5"
          };
      Set<String> expectedContentsSet = new HashSet<>(Arrays.asList(expectedContents));
      Iterable<FileInfo> actualContents = workspace.dbfs().recursiveList(directoryName);
      Set<String> actualContentsSet = new HashSet<>();

      // Compare actualContents to expectedContents.
      for (FileInfo fileInfo : actualContents) {
        actualContentsSet.add(fileInfo.getPath());
      }
      assertEquals(expectedContentsSet, actualContentsSet);
    } finally {
      // Cleanup all the files and directories created in this test.
      workspace.dbfs().delete(new Delete().setPath(directoryName).setRecursive(true));
    }
  }
}

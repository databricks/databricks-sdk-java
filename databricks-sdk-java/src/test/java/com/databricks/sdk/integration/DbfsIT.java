package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class DbfsIT {
  // An integration test for DbfsExt which writes a file of 10 KiB to DBFS, reads the written file
  // back, and ensures
  // that the contents of the file are the same as what was written out.
  @Test
  void writeFileAndReadFile(DatabricksWorkspace workspace) throws IOException {
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
}

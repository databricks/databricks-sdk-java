package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.integration.framework.NameUtils;
import com.databricks.sdk.integration.framework.ResourceWithCleanup;
import com.databricks.sdk.service.files.UploadFileRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucws")
@ExtendWith(EnvTest.class)
public class FilesIT {

  // An integration test for FilesApi that writes a file of 10 KiB to a configured volume, reads the
  // file back, and ensures that the contents of the file are the same as what was written out.
  @Test
  void writeFileAndReadFile(WorkspaceClient workspace) throws IOException {
    String schemaName = NameUtils.uniqueName("filesit");
    String volumeName = NameUtils.uniqueName("filesit");
    try (ResourceWithCleanup r = ResourceWithCleanup.makeSchema(workspace.schemas(), "main", schemaName)) {
      try (ResourceWithCleanup r1 = ResourceWithCleanup.makeVolume(workspace.volumes(), "main", schemaName, volumeName)) {
        writeFileAndReadFileInner(workspace, schemaName, volumeName);
      }
    }
  }

  private void writeFileAndReadFileInner(WorkspaceClient workspace, String schemaName, String volumeName) throws IOException {
    // Generate a random file name and random contents of 10 KiB.
    String fileName = NameUtils.uniqueName("/Volumes/main/" + schemaName + "/" + volumeName + "/test");
    byte[] fileContents = new byte[1024 * 10];
    for (int i = 0; i < fileContents.length; i++) {
      fileContents[i] = (byte) (i & 0xFF);
    }
    ByteArrayInputStream inputStream = new ByteArrayInputStream(fileContents);

    // Write the file to DBFS.
    workspace
        .files()
        .uploadFile(new UploadFileRequest().setFilePath(fileName).setContents(inputStream));

    // Read the file back from DBFS.
    try (InputStream readContents = workspace.files().downloadFile(fileName)) {
      byte[] result = new byte[fileContents.length];
      int bytesRead = readContents.read(result);
      Assertions.assertEquals(bytesRead, fileContents.length);

      // Assert that the contents of the file are the same as what was written out.
      Assertions.assertArrayEquals(fileContents, result);
    } finally {
      workspace.files().deleteFile(fileName);
    }
  }
}

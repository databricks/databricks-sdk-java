package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.integration.framework.NameUtils;
import com.databricks.sdk.integration.framework.ResourceWithCleanup;
import com.databricks.sdk.service.files.CreateDirectoryRequest;
import com.databricks.sdk.service.files.DirectoryEntry;
import com.databricks.sdk.service.files.GetMetadataResponse;
import com.databricks.sdk.service.files.UploadRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucws")
@ExtendWith(EnvTest.class)
public class FilesIT {

  // An integration test for FilesApi that writes a file of 10 KiB to a configured volume, reads the
  // file back, and ensures that the contents of the file are the same as what was written out.
  @Test
  void uploadAndDownloadFile(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          // Generate a random file name and random contents of 10 KiB.
          String fileName = NameUtils.uniqueName(volumePath + "/test-with-?-and-#");
          byte[] fileContents = new byte[1024 * 10];
          for (int i = 0; i < fileContents.length; i++) {
            fileContents[i] = (byte) (i & 0xFF);
          }
          ByteArrayInputStream inputStream = new ByteArrayInputStream(fileContents);

          // Write the file to DBFS.
          workspace
              .files()
              .upload(new UploadRequest().setFilePath(fileName).setContents(inputStream));

          // Read the file back from DBFS.
          try (InputStream readContents = workspace.files().download(fileName).getContents()) {
            byte[] result = new byte[fileContents.length];
            int bytesRead = readContents.read(result);
            Assertions.assertEquals(bytesRead, fileContents.length);

            // Assert that the contents of the file are the same as what was written out.
            Assertions.assertArrayEquals(fileContents, result);
          } finally {
            workspace.files().delete(fileName);
          }
        });
  }

  @Test
  void deleteFile(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String filePath = NameUtils.uniqueName(volumePath + "/some-file");
          workspace
              .files()
              .upload(
                  new UploadRequest()
                      .setFilePath(filePath)
                      .setContents(createInputStream("Hello, world!")));
          workspace.files().delete(filePath);
        });
  }

  @Test
  void getMetadata(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String filePath = NameUtils.uniqueName(volumePath + "/some-file");
          workspace
              .files()
              .upload(
                  new UploadRequest()
                      .setFilePath(filePath)
                      .setContents(createInputStream("Hello, world!")));

          // Check header deserialization
          GetMetadataResponse metadata = workspace.files().getMetadata(filePath);
          Assertions.assertEquals("application/octet-stream", metadata.getContentType());
          Assertions.assertEquals(13, metadata.getContentLength());
          Assertions.assertNotNull(metadata.getLastModified());
        });
  }

  @Test
  void createDirectory(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String directoryPath = NameUtils.uniqueName(volumePath + "/some-directory");
          workspace
              .files()
              .createDirectory(new CreateDirectoryRequest().setDirectoryPath(directoryPath));
        });
  }

  @Test
  void listDirectoryContents(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String fileContents = "Hello, world!";
          String directoryPath = NameUtils.uniqueName(volumePath + "/some-directory");
          workspace
              .files()
              .upload(
                  new UploadRequest()
                      .setFilePath(directoryPath + "/file1.txt")
                      .setContents(createInputStream(fileContents)));
          workspace
              .files()
              .upload(
                  new UploadRequest()
                      .setFilePath(directoryPath + "/file2.txt")
                      .setContents(createInputStream(fileContents)));
          workspace
              .files()
              .upload(
                  new UploadRequest()
                      .setFilePath(directoryPath + "/file3.txt")
                      .setContents(createInputStream(fileContents)));

          // List the contents of the root of the volume.
          Iterable<DirectoryEntry> directoryEntriesIterable =
              workspace.files().listDirectoryContents(directoryPath);
          List<DirectoryEntry> directoryEntries = CollectionUtils.asList(directoryEntriesIterable);
          CollectionUtils.assertUnique(directoryEntries);
          Assertions.assertEquals(3, directoryEntries.size());
        });
  }

  @Test
  void deleteDirectory(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String directoryPath = NameUtils.uniqueName(volumePath + "/some-directory");
          workspace
              .files()
              .createDirectory(new CreateDirectoryRequest().setDirectoryPath(directoryPath));
          workspace.files().deleteDirectory(directoryPath);
        });
  }

  @Test
  void getDirectoryMetadata(WorkspaceClient workspace) throws IOException {
    withVolume(
        workspace,
        (volumePath) -> {
          String directoryPath = NameUtils.uniqueName(volumePath + "/some-directory");
          workspace
              .files()
              .createDirectory(new CreateDirectoryRequest().setDirectoryPath(directoryPath));
          workspace.files().getDirectoryMetadata(directoryPath);
        });
  }

  /** Helper function to create an InputStream from a string. */
  private InputStream createInputStream(String text) {
    return new ByteArrayInputStream(text.getBytes());
  }

  /** Run a test with against a provisioned volume */
  void withVolume(WorkspaceClient workspace, WithVolumeRunnable runnable) throws IOException {
    String schemaName = NameUtils.uniqueName("filesit");
    String volumeName = NameUtils.uniqueName("filesit");
    try (ResourceWithCleanup r =
        ResourceWithCleanup.makeSchema(workspace.schemas(), "main", schemaName)) {
      try (ResourceWithCleanup r1 =
          ResourceWithCleanup.makeVolume(workspace.volumes(), "main", schemaName, volumeName)) {
        runnable.run("/Volumes/main/" + schemaName + "/" + volumeName);
      }
    }
  }

  private interface WithVolumeRunnable {
    void run(String volumePath) throws IOException;
  }
}

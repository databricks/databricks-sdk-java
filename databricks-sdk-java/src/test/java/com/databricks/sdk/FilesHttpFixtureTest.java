package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.FixtureServer.FixtureMapping;
import com.databricks.sdk.service.files.DirectoryEntry;
import com.databricks.sdk.service.files.DownloadResponse;
import com.databricks.sdk.service.files.GetMetadataResponse;
import com.databricks.sdk.service.files.ListDirectoryContentsRequest;
import com.databricks.sdk.service.files.UploadRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

class FilesHttpFixtureTest {
  private static final String FILE_PATH = "/Volumes/catalog/schema/volume/fixture.txt";
  private static final String DIRECTORY_PATH = "/Volumes/catalog/schema/volume";

  @Test
  void uploadAndDownloadPreserveRawBytesAndHeaders() throws IOException {
    byte[] contents = "fixture contents".getBytes(StandardCharsets.UTF_8);
    FixtureMapping upload =
        new FixtureMapping.Builder()
            .validateMethod("PUT")
            .validatePath("/api/2.0/fs/files" + FILE_PATH)
            .validateHeadersPresent(
                Collections.singletonMap(
                    "Content-Type", Collections.singletonList("application/octet-stream")))
            .validate(
                exchange ->
                    assertEquals(
                        "fixture contents",
                        IOUtils.toString(exchange.getRequestBody(), StandardCharsets.UTF_8)))
            .withResponse("", 204)
            .build();
    FixtureMapping download =
        new FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/api/2.0/fs/files" + FILE_PATH)
            .validateHeadersPresent(
                Collections.singletonMap(
                    "Accept", Collections.singletonList("application/octet-stream")))
            .withResponse("fixture contents", 200)
            .withResponseHeaders(
                headers(
                    "Content-Type",
                    "application/octet-stream",
                    "Last-Modified",
                    "Wed, 24 Sep 2025 12:00:00 GMT"))
            .build();

    try (FixtureServer server = new FixtureServer().with(upload).with(download)) {
      WorkspaceClient workspace = workspace(server);
      workspace
          .files()
          .upload(
              new UploadRequest()
                  .setFilePath(FILE_PATH)
                  .setContents(new ByteArrayInputStream(contents)));
      DownloadResponse response = workspace.files().download(FILE_PATH);

      assertEquals(
          "fixture contents", IOUtils.toString(response.getContents(), StandardCharsets.UTF_8));
      assertEquals("application/octet-stream", response.getContentType());
      assertEquals("Wed, 24 Sep 2025 12:00:00 GMT", response.getLastModified());
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void metadataAndDirectoryPaginationDecodeHttpResponses() throws IOException {
    FixtureMapping metadata =
        new FixtureMapping.Builder()
            .validateMethod("HEAD")
            .validatePath("/api/2.0/fs/files" + FILE_PATH)
            .withResponse("", 200)
            .withResponseHeaders(
                headers(
                    "Content-Type", "text/plain", "Last-Modified", "Wed, 24 Sep 2025 12:00:00 GMT"))
            .build();
    FixtureMapping firstPage =
        fixture(
            "GET",
            "/api/2.0/fs/directories" + DIRECTORY_PATH + "?page_size=1",
            "{\"contents\":[{\"name\":\"first.txt\",\"path\":\""
                + DIRECTORY_PATH
                + "/first.txt\",\"is_directory\":false}],\"next_page_token\":\"next page\"}");
    FixtureMapping secondPage =
        fixture(
            "GET",
            "/api/2.0/fs/directories" + DIRECTORY_PATH + "?page_size=1&page_token=next+page",
            "{\"contents\":[{\"name\":\"subdir\",\"path\":\""
                + DIRECTORY_PATH
                + "/subdir\",\"is_directory\":true}]}");

    try (FixtureServer server =
        new FixtureServer().with(metadata).with(firstPage).with(secondPage)) {
      WorkspaceClient workspace = workspace(server);
      GetMetadataResponse fileMetadata = workspace.files().getMetadata(FILE_PATH);
      List<String> names = new ArrayList<>();
      for (DirectoryEntry entry :
          workspace
              .files()
              .listDirectoryContents(
                  new ListDirectoryContentsRequest()
                      .setDirectoryPath(DIRECTORY_PATH)
                      .setPageSize(1L))) {
        names.add(entry.getName());
      }

      assertEquals("text/plain", fileMetadata.getContentType());
      assertEquals("Wed, 24 Sep 2025 12:00:00 GMT", fileMetadata.getLastModified());
      assertEquals(Arrays.asList("first.txt", "subdir"), names);
      server.assertAllFixturesConsumed();
    }
  }

  private static WorkspaceClient workspace(FixtureServer server) {
    return new WorkspaceClient(
        new DatabricksConfig()
            .setHost(server.getUrl())
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setDisableRetries(true));
  }

  private static FixtureMapping fixture(String method, String path, String response) {
    return new FixtureMapping.Builder()
        .validateMethod(method)
        .validatePath(path)
        .withResponse(response, 200)
        .build();
  }

  private static Map<String, List<String>> headers(String... namesAndValues) {
    Map<String, List<String>> result = new LinkedHashMap<>();
    for (int i = 0; i < namesAndValues.length; i += 2) {
      result.put(namesAndValues[i], Collections.singletonList(namesAndValues[i + 1]));
    }
    return result;
  }
}

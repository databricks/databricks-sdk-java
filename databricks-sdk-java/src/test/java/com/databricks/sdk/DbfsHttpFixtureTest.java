package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DummyCredentialsProvider;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.FixtureServer.FixtureMapping;
import com.databricks.sdk.service.files.FileInfo;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

class DbfsHttpFixtureTest {
  private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

  @Test
  void writeChunksDataAndClosesHandleAtHttpBoundary() throws IOException {
    byte[] contents = new byte[1024 * 1024 + 3];
    Arrays.fill(contents, (byte) 'a');
    String firstBlock = Base64.getEncoder().encodeToString(Arrays.copyOf(contents, 1024 * 1024));
    String secondBlock = Base64.getEncoder().encodeToString(new byte[] {'a', 'a', 'a'});

    FixtureMapping create =
        jsonFixture(
            "/api/2.0/dbfs/create",
            body -> {
              assertEquals("/fixture", body.get("path").asText());
              assertEquals(true, body.get("overwrite").asBoolean());
            },
            "{\"handle\":42}");
    FixtureMapping firstAddBlock = addBlockFixture(firstBlock);
    FixtureMapping secondAddBlock = addBlockFixture(secondBlock);
    FixtureMapping close =
        jsonFixture(
            "/api/2.0/dbfs/close", body -> assertEquals(42L, body.get("handle").asLong()), "");

    try (FixtureServer server =
        new FixtureServer().with(create).with(firstAddBlock).with(secondAddBlock).with(close)) {
      workspace(server).dbfs().write(Paths.get("/fixture"), contents);
      server.assertAllFixturesConsumed();
    }
  }

  @Test
  void readAndRecursiveListUseGeneratedHttpRequests() throws IOException {
    String firstChunk = Base64.getEncoder().encodeToString("abc".getBytes(StandardCharsets.UTF_8));
    FixtureMapping read =
        fixture(
            "GET",
            "/api/2.0/dbfs/read?length=1048576&offset=0&path=%2Ffixture",
            "{\"bytes_read\":3,\"data\":\"" + firstChunk + "\"}");
    FixtureMapping eof =
        fixture(
            "GET",
            "/api/2.0/dbfs/read?length=1048576&offset=3&path=%2Ffixture",
            "{\"bytes_read\":0,\"data\":\"\"}");
    FixtureMapping repeatedEof =
        fixture(
            "GET",
            "/api/2.0/dbfs/read?length=1048576&offset=3&path=%2Ffixture",
            "{\"bytes_read\":0,\"data\":\"\"}");
    FixtureMapping root =
        fixture(
            "GET",
            "/api/2.0/dbfs/list?path=%2Froot",
            "{\"files\":["
                + "{\"path\":\"/root/file\",\"is_dir\":false},"
                + "{\"path\":\"/root/subdir\",\"is_dir\":true}]}");
    FixtureMapping subdir =
        fixture(
            "GET",
            "/api/2.0/dbfs/list?path=%2Froot%2Fsubdir",
            "{\"files\":[{\"path\":\"/root/subdir/nested\",\"is_dir\":false}]}");

    try (FixtureServer server =
        new FixtureServer().with(read).with(eof).with(repeatedEof).with(root).with(subdir)) {
      WorkspaceClient workspace = workspace(server);
      assertArrayEquals(
          "abc".getBytes(StandardCharsets.UTF_8),
          workspace.dbfs().readAllBytes(Paths.get("/fixture")));

      List<String> paths = new ArrayList<>();
      for (FileInfo info : workspace.dbfs().recursiveList("/root")) {
        paths.add(info.getPath());
      }

      assertEquals(Arrays.asList("/root/file", "/root/subdir", "/root/subdir/nested"), paths);
      server.assertAllFixturesConsumed();
    }
  }

  private static FixtureMapping addBlockFixture(String expectedData) {
    return jsonFixture(
        "/api/2.0/dbfs/add-block",
        body -> {
          assertEquals(expectedData, body.get("data").asText());
          assertEquals(42L, body.get("handle").asLong());
        },
        "");
  }

  private static FixtureMapping jsonFixture(
      String path, JsonValidation validation, String response) {
    return new FixtureMapping.Builder()
        .validateMethod("POST")
        .validatePath(path)
        .validate(
            exchange ->
                validation.validate(
                    OBJECT_MAPPER.readTree(
                        IOUtils.toString(exchange.getRequestBody(), StandardCharsets.UTF_8))))
        .withResponse(response, 200)
        .build();
  }

  private static FixtureMapping fixture(String method, String path, String response) {
    return new FixtureMapping.Builder()
        .validateMethod(method)
        .validatePath(path)
        .withResponse(response, 200)
        .build();
  }

  private static WorkspaceClient workspace(FixtureServer server) {
    return new WorkspaceClient(
        new DatabricksConfig()
            .setHost(server.getUrl())
            .setCredentialsProvider(new DummyCredentialsProvider())
            .setDisableRetries(true));
  }

  private interface JsonValidation {
    void validate(JsonNode body);
  }
}

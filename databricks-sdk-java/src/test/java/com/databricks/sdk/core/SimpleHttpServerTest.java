package com.databricks.sdk.core;

import static com.databricks.sdk.core.SimpleHttpServer.query;
import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.service.compute.ListNodeTypesResponse;
import com.databricks.sdk.service.compute.NodeType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SimpleHttpServerTest {

  @Test
  void sample() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(
          "GET /api/2.0/clusters/list-node-types",
          "{\"node_types\": [{\"category\":\"testCategory\"}]}");

      DatabricksConfig config =
          new DatabricksConfig()
              .setHost(fixtures.getUrl())
              .setToken("testToken")
              .setHttpClient(new CommonsHttpClient(30));
      DatabricksConfig mockConfig = Mockito.spy(config);
      Mockito.doReturn(mockConfig).when(mockConfig).resolve();

      DatabricksWorkspace workspace = new DatabricksWorkspace(mockConfig);
      ListNodeTypesResponse nodeTypes = workspace.clusters().listNodeTypes();

      assertEquals(1, nodeTypes.getNodeTypes().size());
      assertTrue(nodeTypes.getNodeTypes().contains(new NodeType().setCategory("testCategory")));
    }
  }

  @Test
  public void testQuery() {
    String line = "?param1=value1&param2=value2&param3=value3";

    Map<String, String> expectedQuery = new HashMap<>();
    expectedQuery.put("param1", "value1");
    expectedQuery.put("param2", "value2");
    expectedQuery.put("param3", "value3");

    Map<String, String> actualQuery = query(line);

    assertEquals(expectedQuery.size(), actualQuery.size());
    assertTrue(expectedQuery.entrySet().containsAll(actualQuery.entrySet()));
  }
}

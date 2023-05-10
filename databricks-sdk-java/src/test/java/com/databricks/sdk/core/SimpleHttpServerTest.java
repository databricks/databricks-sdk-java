package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.service.compute.ListNodeTypesResponse;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SimpleHttpServerTest {

  @Test
  void sample() throws IOException {
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with("GET /api/2.0/clusters/list-node-types", "{\"node_types\": []}");

      DatabricksConfig config =
          new DatabricksConfig()
              .setHost(fixtures.getUrl())
              .setToken("...")
              .setHttpClient(new CommonsHttpClient(30));
      DatabricksConfig mockConfig = Mockito.spy(config);
      Mockito.doReturn(mockConfig).when(mockConfig).resolve();

      DatabricksWorkspace workspace = new DatabricksWorkspace(mockConfig);
      ListNodeTypesResponse nodeTypes = workspace.clusters().listNodeTypes();

      assertEquals(0, nodeTypes.getNodeTypes().size());
    }
  }
}

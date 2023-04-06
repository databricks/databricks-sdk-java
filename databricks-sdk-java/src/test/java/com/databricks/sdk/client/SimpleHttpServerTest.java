package com.databricks.sdk.client;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.service.clusters.ListNodeTypesResponse;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleHttpServerTest {

    @Test
    void sample() throws IOException {
        try (FixtureServer fixtures = new FixtureServer()) {
            fixtures.with("GET /api/2.0/clusters/list-node-types", "{\"node_types\": []}");

            DatabricksWorkspace workspace = new DatabricksWorkspace(new DatabricksConfig()
                    .setHost(fixtures.getUrl())
                    .setToken("..."));
            ListNodeTypesResponse nodeTypes = workspace.clusters().listNodeTypes();

            assertEquals(0, nodeTypes.getNodeTypes().size());
        }
    }
}
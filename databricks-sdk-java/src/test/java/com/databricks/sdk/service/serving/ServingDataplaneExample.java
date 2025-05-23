package com.databricks.sdk.service.serving;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServingDataplaneExample {
  private static final Logger LOG = LoggerFactory.getLogger(ServingDataplaneExample.class);

  @Test
  void testQueryModelEndpoint() {
    // Use Databricks CLI authentication with required scopes
    DatabricksConfig config = new DatabricksConfig()
        .setAuthType("databricks-cli")
        .setHost("https://e2-dogfood.staging.cloud.databricks.com")
        .setDebugHeaders(true);

    LOG.info("Creating WorkspaceClient with config: {}", config);
    WorkspaceClient client = new WorkspaceClient(config);

    // Initialize the ServingEndpointsDataPlaneAPI
    ServingEndpointsDataPlaneAPI servingEndpointsDataPlaneAPI = client.servingEndpointsDataPlane();

    // Example: Query a model endpoint
    String endpointName = "TestDirectDataplaneEmmy"; // Replace with your endpoint name

    try {
      // Create input data for trip prediction
      Map<String, Object> inputData = new HashMap<>();
      inputData.put("trip_distance", 2.5);
      inputData.put("pickup_zip", "10001");
      inputData.put("dropoff_zip", "10002");

      LOG.info("Preparing to send request to endpoint: {}", endpointName);
      LOG.info("Request payload: {}", inputData);

      // Create the query input object
      QueryEndpointInput queryInput =
          new QueryEndpointInput()
              .setName(endpointName)
              .setInputs(new Map[]{inputData});

      LOG.info("Querying endpoint {} with input: {}", endpointName, queryInput);

      // Query the endpoint
      QueryEndpointResponse response = servingEndpointsDataPlaneAPI.query(queryInput);

      // Add assertions to verify the response
      assertNotNull(response, "Response should not be null");
      assertNotNull(response.getPredictions(), "Response predictions should not be null");
      assertFalse(response.getPredictions().isEmpty(), "Response predictions should not be empty");

      // Print the response for debugging purposes
      LOG.info("Model Response: {}", response.getPredictions());

    } catch (Exception e) {
      LOG.error("Test failed with exception", e);
      fail("Test failed with exception: " + e.getMessage(), e);
    }
  }
}

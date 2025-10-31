// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.lrotesting;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of LroTesting */
@Generated
class LroTestingImpl implements LroTestingService {
  private final ApiClient apiClient;

  public LroTestingImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancelOperation(CancelOperationRequest request) {
    String path = String.format("/api/2.0/lro-testing/operations/%s/cancel", request.getName());
    try {
      Request req = new Request("POST", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation createTestResource(CreateTestResourceRequest request) {
    String path = "/api/2.0/lro-testing/resources";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getResource()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation deleteTestResource(DeleteTestResourceRequest request) {
    String path = String.format("/api/2.0/lro-testing/resources/%s", request.getResourceId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Operation getOperation(GetOperationRequest request) {
    String path = String.format("/api/2.0/lro-testing/operations/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Operation.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public TestResource getTestResource(GetTestResourceRequest request) {
    String path = String.format("/api/2.0/lro-testing/resources/%s", request.getResourceId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, TestResource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

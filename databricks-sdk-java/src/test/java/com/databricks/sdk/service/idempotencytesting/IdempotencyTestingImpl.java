// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.idempotencytesting;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;
import java.util.UUID;

/** Package-local implementation of IdempotencyTesting */
@Generated
class IdempotencyTestingImpl implements IdempotencyTestingService {
  private final ApiClient apiClient;

  public IdempotencyTestingImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public TestResource createTestResource(CreateTestResourceRequest request) {
    String path = "/api/2.0/idempotency-testing/resources";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getTestResource()));

      if (request.getRequestId() == null || request.getRequestId().isEmpty()) {
        request.setRequestId(UUID.randomUUID().toString());
      }
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, TestResource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

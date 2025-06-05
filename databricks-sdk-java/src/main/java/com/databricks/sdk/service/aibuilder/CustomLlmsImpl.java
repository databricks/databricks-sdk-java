// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of CustomLlms */
@Generated
class CustomLlmsImpl implements CustomLlmsService {
  private final ApiClient apiClient;

  public CustomLlmsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancel(CancelCustomLlmOptimizationRunRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s/optimize/cancel", request.getId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, CancelResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomLlm create(StartCustomLlmOptimizationRunRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s/optimize", request.getId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CustomLlm.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomLlm get(GetCustomLlmRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s", request.getId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, CustomLlm.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomLlm update(UpdateCustomLlmRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s", request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CustomLlm.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

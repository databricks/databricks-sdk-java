// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.agentbricks;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AgentBricks */
@Generated
class AgentBricksImpl implements AgentBricksService {
  private final ApiClient apiClient;

  public AgentBricksImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancelOptimize(CancelCustomLlmOptimizationRunRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s/optimize/cancel", request.getId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomLlm createCustomLlm(CreateCustomLlmRequest request) {
    String path = "/api/2.0/custom-llms";
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
  public void deleteCustomLlm(DeleteCustomLlmRequest request) {
    String path = String.format("/api/2.0/custom-llms/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public CustomLlm getCustomLlm(GetCustomLlmRequest request) {
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
  public CustomLlm startOptimize(StartCustomLlmOptimizationRunRequest request) {
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
  public CustomLlm updateCustomLlm(UpdateCustomLlmRequest request) {
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

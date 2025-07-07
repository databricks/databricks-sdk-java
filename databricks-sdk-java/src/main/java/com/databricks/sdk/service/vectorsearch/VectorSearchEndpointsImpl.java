// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of VectorSearchEndpoints */
@Generated
class VectorSearchEndpointsImpl implements VectorSearchEndpointsService {
  private final ApiClient apiClient;

  public VectorSearchEndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public EndpointInfo createEndpoint(CreateEndpoint request) {
    String path = "/api/2.0/vector-search/endpoints";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EndpointInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteEndpoint(DeleteEndpointRequest request) {
    String path = String.format("/api/2.0/vector-search/endpoints/%s", request.getEndpointName());
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
  public EndpointInfo getEndpoint(GetEndpointRequest request) {
    String path = String.format("/api/2.0/vector-search/endpoints/%s", request.getEndpointName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, EndpointInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListEndpointResponse listEndpoints(ListEndpointsRequest request) {
    String path = "/api/2.0/vector-search/endpoints";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListEndpointResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PatchEndpointBudgetPolicyResponse updateEndpointBudgetPolicy(
      PatchEndpointBudgetPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/vector-search/endpoints/%s/budget-policy", request.getEndpointName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PatchEndpointBudgetPolicyResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public UpdateEndpointCustomTagsResponse updateEndpointCustomTags(
      UpdateEndpointCustomTagsRequest request) {
    String path =
        String.format("/api/2.0/vector-search/endpoints/%s/tags", request.getEndpointName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, UpdateEndpointCustomTagsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

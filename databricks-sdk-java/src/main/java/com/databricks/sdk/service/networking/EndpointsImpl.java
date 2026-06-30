// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.networking;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Endpoints */
@Generated
class EndpointsImpl implements EndpointsService {
  private final ApiClient apiClient;

  public EndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Endpoint createEndpoint(CreateEndpointRequest request) {
    String path = String.format("/api/networking/v1/%s/endpoints", request.getParent());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getEndpoint()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Endpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteEndpoint(DeleteEndpointRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
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
  public Endpoint getEndpoint(GetEndpointRequest request) {
    String path = String.format("/api/networking/v1/%s", request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Endpoint.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
    String path = String.format("/api/networking/v1/%s/endpoints", request.getParent());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListEndpointsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

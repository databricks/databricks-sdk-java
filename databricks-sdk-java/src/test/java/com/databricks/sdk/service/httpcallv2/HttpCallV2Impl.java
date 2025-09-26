// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.httpcallv2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of HttpCallV2 */
@Generated
class HttpCallV2Impl implements HttpCallV2Service {
  private final ApiClient apiClient;

  public HttpCallV2Impl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public Resource createResource(CreateResourceRequest request) {
    String path =
        String.format(
            "/api/2.0/http-call/%s/%s/%s",
            request.getPathParamString(), request.getPathParamInt(), request.getPathParamBool());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Resource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Resource getResource(GetResourceRequest request) {
    String path =
        String.format(
            "/api/2.0/http-call/%s/%s/%s",
            request.getPathParamString(), request.getPathParamInt(), request.getPathParamBool());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Resource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Resource updateResource(UpdateResourceRequest request) {
    String path =
        String.format(
            "/api/2.0/http-call/%s/%s/%s",
            request.getNestedPathParamString(),
            request.getNestedPathParamInt(),
            request.getNestedPathParamBool());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getResource()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Resource.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

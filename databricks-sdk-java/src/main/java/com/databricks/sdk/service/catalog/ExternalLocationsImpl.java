// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ExternalLocations */
@Generated
class ExternalLocationsImpl implements ExternalLocationsService {
  private final ApiClient apiClient;

  public ExternalLocationsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ExternalLocationInfo create(CreateExternalLocation request) {
    String path = "/api/2.1/unity-catalog/external-locations";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ExternalLocationInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
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
  public ExternalLocationInfo get(GetExternalLocationRequest request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ExternalLocationInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListExternalLocationsResponse list(ListExternalLocationsRequest request) {
    String path = "/api/2.1/unity-catalog/external-locations";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListExternalLocationsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExternalLocationInfo update(UpdateExternalLocation request) {
    String path = String.format("/api/2.1/unity-catalog/external-locations/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ExternalLocationInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Rfa */
@Generated
class RfaImpl implements RfaService {
  private final ApiClient apiClient;

  public RfaImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BatchCreateAccessRequestsResponse batchCreateAccessRequests(
      BatchCreateAccessRequestsRequest request) {
    String path = "/api/3.0/rfa/requests";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, BatchCreateAccessRequestsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccessRequestDestinations getAccessRequestDestinations(
      GetAccessRequestDestinationsRequest request) {
    String path =
        String.format(
            "/api/3.0/rfa/destinations/%s/%s", request.getSecurableType(), request.getFullName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccessRequestDestinations.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccessRequestDestinations updateAccessRequestDestinations(
      UpdateAccessRequestDestinationsRequest request) {
    String path = "/api/3.0/rfa/destinations";
    try {
      Request req =
          new Request("PATCH", path, apiClient.serialize(request.getAccessRequestDestinations()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccessRequestDestinations.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

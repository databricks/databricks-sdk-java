// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of DbsqlPermissions */
@Generated
class DbsqlPermissionsImpl implements DbsqlPermissionsService {
  private final ApiClient apiClient;

  public DbsqlPermissionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetResponse get(GetDbsqlPermissionRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/sql/permissions/%s/%s",
            request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public SetResponse set(SetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/sql/permissions/%s/%s",
            request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, SetResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public Success transferOwnership(TransferOwnershipRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/sql/permissions/%s/%s/transfer",
            request.getObjectType(), request.getObjectId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, Success.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

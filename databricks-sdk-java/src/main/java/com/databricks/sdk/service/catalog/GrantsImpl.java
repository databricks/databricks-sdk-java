// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Grants */
@Generated
class GrantsImpl implements GrantsService {
  private final ApiClient apiClient;

  public GrantsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public PermissionsList get(GetGrantRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PermissionsList.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/effective-permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, EffectivePermissionsList.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PermissionsList update(UpdatePermissions request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PermissionsList.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}

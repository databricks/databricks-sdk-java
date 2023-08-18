// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, PermissionsList.class, headers);
  }

  @Override
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/effective-permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, EffectivePermissionsList.class, headers);
  }

  @Override
  public PermissionsList update(UpdatePermissions request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, PermissionsList.class, headers);
  }
}

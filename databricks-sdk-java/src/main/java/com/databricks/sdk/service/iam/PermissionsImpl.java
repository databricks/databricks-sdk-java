// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Permissions */
@Generated
class PermissionsImpl implements PermissionsService {
  private final ApiClient apiClient;

  public PermissionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ObjectPermissions get(GetPermissionRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, ObjectPermissions.class, headers);
  }

  @Override
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s/permissionLevels",
            request.getRequestObjectType(), request.getRequestObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, GetPermissionLevelsResponse.class, headers);
  }

  @Override
  public ObjectPermissions set(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PUT(path, request, ObjectPermissions.class, headers);
  }

  @Override
  public ObjectPermissions update(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PATCH(path, request, ObjectPermissions.class, headers);
  }
}

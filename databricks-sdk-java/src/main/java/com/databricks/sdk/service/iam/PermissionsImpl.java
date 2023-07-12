// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.GET(path, request, ObjectPermissions.class);
  }

  @Override
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s/permissionLevels",
            request.getRequestObjectType(), request.getRequestObjectId());
    return apiClient.GET(path, request, GetPermissionLevelsResponse.class);
  }

  @Override
  public void set(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    apiClient.PUT(path, request, Void.class);
  }

  @Override
  public void update(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    apiClient.PATCH(path, request, Void.class);
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Permissions */
class PermissionsImpl implements PermissionsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for PermissionsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PermissionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public ObjectPermissions get(GetPermissionRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    return apiClient.GET(path, request, ObjectPermissions.class);
  }

  /** {@inheritDoc} */
  @Override
  public GetPermissionLevelsResponse getPermissionLevels(GetPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s/permissionLevels",
            request.getRequestObjectType(), request.getRequestObjectId());
    return apiClient.GET(path, request, GetPermissionLevelsResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void set(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    apiClient.PUT(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void update(PermissionsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/%s/%s",
            request.getRequestObjectType(), request.getRequestObjectId());
    apiClient.PATCH(path, request, Void.class);
  }
}

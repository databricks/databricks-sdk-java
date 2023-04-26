// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Grants */
class GrantsImpl implements GrantsService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for GrantsImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public GrantsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public PermissionsList get(GetGrantRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    return apiClient.GET(path, request, PermissionsList.class);
  }

  /** {@inheritDoc} */
  @Override
  public EffectivePermissionsList getEffective(GetEffectiveRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/effective-permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    return apiClient.GET(path, request, EffectivePermissionsList.class);
  }

  /** {@inheritDoc} */
  @Override
  public PermissionsList update(UpdatePermissions request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/permissions/%s/%s",
            request.getSecurableType(), request.getFullName());
    return apiClient.PATCH(path, request, PermissionsList.class);
  }
}

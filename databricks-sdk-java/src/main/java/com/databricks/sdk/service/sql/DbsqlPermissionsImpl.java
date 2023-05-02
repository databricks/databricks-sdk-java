// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sql;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.GET(path, request, GetResponse.class);
  }

  @Override
  public SetResponse set(SetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/sql/permissions/%s/%s",
            request.getObjectType(), request.getObjectId());
    return apiClient.POST(path, request, SetResponse.class);
  }

  @Override
  public Success transferOwnership(TransferOwnershipRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/sql/permissions/%s/%s/transfer",
            request.getObjectType(), request.getObjectId());
    return apiClient.POST(path, request, Success.class);
  }
}

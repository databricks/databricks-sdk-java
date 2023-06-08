// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of Connections */
@Generated
class ConnectionsImpl implements ConnectionsService {
  private final ApiClient apiClient;

  public ConnectionsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ConnectionInfo create(CreateConnection request) {
    String path = "/api/2.1/unity-catalog/connections";
    return apiClient.POST(path, request, ConnectionInfo.class);
  }

  @Override
  public void delete(DeleteConnectionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/connections/%s", request.getNameArg());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public ConnectionInfo get(GetConnectionRequest request) {
    String path = String.format("/api/2.1/unity-catalog/connections/%s", request.getNameArg());
    return apiClient.GET(path, request, ConnectionInfo.class);
  }

  @Override
  public ListConnectionsResponse list() {
    String path = "/api/2.1/unity-catalog/connections";
    return apiClient.GET(path, ListConnectionsResponse.class);
  }

  @Override
  public ConnectionInfo update(UpdateConnection request) {
    String path = String.format("/api/2.1/unity-catalog/connections/%s", request.getNameArg());
    return apiClient.PATCH(path, request, ConnectionInfo.class);
  }
}

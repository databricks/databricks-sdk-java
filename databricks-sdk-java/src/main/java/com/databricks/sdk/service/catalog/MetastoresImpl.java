// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Metastores */
class MetastoresImpl implements MetastoresService {
  private final ApiClient apiClient;

  public MetastoresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void assign(CreateMetastoreAssignment request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    apiClient.PUT(path, request, Void.class);
  }

  @Override
  public MetastoreInfo create(CreateMetastore request) {
    String path = "/api/2.1/unity-catalog/metastores";
    return apiClient.POST(path, request, MetastoreInfo.class);
  }

  @Override
  public MetastoreAssignment current() {
    String path = "/api/2.1/unity-catalog/current-metastore-assignment";
    return apiClient.GET(path, MetastoreAssignment.class);
  }

  @Override
  public void delete(DeleteMetastoreRequest request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public MetastoreInfo get(GetMetastoreRequest request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    return apiClient.GET(path, request, MetastoreInfo.class);
  }

  @Override
  public ListMetastoresResponse list() {
    String path = "/api/2.1/unity-catalog/metastores";
    return apiClient.GET(path, ListMetastoresResponse.class);
  }

  @Override
  public UpdateAutoMaintenanceResponse maintenance(UpdateAutoMaintenance request) {
    String path = "/api/2.0/auto-maintenance/service";
    return apiClient.PATCH(path, request, UpdateAutoMaintenanceResponse.class);
  }

  @Override
  public GetMetastoreSummaryResponse summary() {
    String path = "/api/2.1/unity-catalog/metastore_summary";
    return apiClient.GET(path, GetMetastoreSummaryResponse.class);
  }

  @Override
  public void unassign(UnassignRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public MetastoreInfo update(UpdateMetastore request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    return apiClient.PATCH(path, request, MetastoreInfo.class);
  }

  @Override
  public void updateAssignment(UpdateMetastoreAssignment request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    apiClient.PATCH(path, request, Void.class);
  }
}

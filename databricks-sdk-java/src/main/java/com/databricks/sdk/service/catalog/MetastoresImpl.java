// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Metastores */
@Generated
class MetastoresImpl implements MetastoresService {
  private final ApiClient apiClient;

  public MetastoresImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void assign(CreateMetastoreAssignment request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PUT", path, request, AssignResponse.class, headers);
  }

  @Override
  public MetastoreInfo create(CreateMetastore request) {
    String path = "/api/2.1/unity-catalog/metastores";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, MetastoreInfo.class, headers);
  }

  @Override
  public MetastoreAssignment current() {
    String path = "/api/2.1/unity-catalog/current-metastore-assignment";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, MetastoreAssignment.class, headers);
  }

  @Override
  public void delete(DeleteMetastoreRequest request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public MetastoreInfo get(GetMetastoreRequest request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, MetastoreInfo.class, headers);
  }

  @Override
  public ListMetastoresResponse list() {
    String path = "/api/2.1/unity-catalog/metastores";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, ListMetastoresResponse.class, headers);
  }

  @Override
  public GetMetastoreSummaryResponse summary() {
    String path = "/api/2.1/unity-catalog/metastore_summary";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, GetMetastoreSummaryResponse.class, headers);
  }

  @Override
  public void unassign(UnassignRequest request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, UnassignResponse.class, headers);
  }

  @Override
  public MetastoreInfo update(UpdateMetastore request) {
    String path = String.format("/api/2.1/unity-catalog/metastores/%s", request.getId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, MetastoreInfo.class, headers);
  }

  @Override
  public void updateAssignment(UpdateMetastoreAssignment request) {
    String path =
        String.format("/api/2.1/unity-catalog/workspaces/%s/metastore", request.getWorkspaceId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("PATCH", path, request, UpdateAssignmentResponse.class, headers);
  }
}

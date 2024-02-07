// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Clusters */
@Generated
class ClustersImpl implements ClustersService {
  private final ApiClient apiClient;

  public ClustersImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void changeOwner(ChangeClusterOwner request) {
    String path = "/api/2.0/clusters/change-owner";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public CreateClusterResponse create(CreateCluster request) {
    String path = "/api/2.0/clusters/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreateClusterResponse.class, headers);
  }

  @Override
  public void delete(DeleteCluster request) {
    String path = "/api/2.0/clusters/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void edit(EditCluster request) {
    String path = "/api/2.0/clusters/edit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public GetEventsResponse events(GetEvents request) {
    String path = "/api/2.0/clusters/events";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, GetEventsResponse.class, headers);
  }

  @Override
  public ClusterDetails get(GetClusterRequest request) {
    String path = "/api/2.0/clusters/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ClusterDetails.class, headers);
  }

  @Override
  public GetClusterPermissionLevelsResponse getPermissionLevels(
      GetClusterPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/clusters/%s/permissionLevels", request.getClusterId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetClusterPermissionLevelsResponse.class, headers);
  }

  @Override
  public ClusterPermissions getPermissions(GetClusterPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/clusters/%s", request.getClusterId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ClusterPermissions.class, headers);
  }

  @Override
  public ListClustersResponse list(ListClustersRequest request) {
    String path = "/api/2.0/clusters/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListClustersResponse.class, headers);
  }

  @Override
  public ListNodeTypesResponse listNodeTypes() {
    String path = "/api/2.0/clusters/list-node-types";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListNodeTypesResponse.class, headers);
  }

  @Override
  public ListAvailableZonesResponse listZones() {
    String path = "/api/2.0/clusters/list-zones";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListAvailableZonesResponse.class, headers);
  }

  @Override
  public void permanentDelete(PermanentDeleteCluster request) {
    String path = "/api/2.0/clusters/permanent-delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void pin(PinCluster request) {
    String path = "/api/2.0/clusters/pin";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void resize(ResizeCluster request) {
    String path = "/api/2.0/clusters/resize";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void restart(RestartCluster request) {
    String path = "/api/2.0/clusters/restart";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ClusterPermissions setPermissions(ClusterPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/clusters/%s", request.getClusterId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ClusterPermissions.class, headers);
  }

  @Override
  public GetSparkVersionsResponse sparkVersions() {
    String path = "/api/2.0/clusters/spark-versions";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, GetSparkVersionsResponse.class, headers);
  }

  @Override
  public void start(StartCluster request) {
    String path = "/api/2.0/clusters/start";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void unpin(UnpinCluster request) {
    String path = "/api/2.0/clusters/unpin";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public ClusterPermissions updatePermissions(ClusterPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/clusters/%s", request.getClusterId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ClusterPermissions.class, headers);
  }
}

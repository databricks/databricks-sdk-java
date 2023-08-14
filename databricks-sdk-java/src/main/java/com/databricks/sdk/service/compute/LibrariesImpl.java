// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Libraries */
@Generated
class LibrariesImpl implements LibrariesService {
  private final ApiClient apiClient;

  public LibrariesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
    String path = "/api/2.0/libraries/all-cluster-statuses";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, ListAllClusterLibraryStatusesResponse.class, headers);
  }

  @Override
  public ClusterLibraryStatuses clusterStatus(ClusterStatusRequest request) {
    String path = "/api/2.0/libraries/cluster-status";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, ClusterLibraryStatuses.class, headers);
  }

  @Override
  public void install(InstallLibraries request) {
    String path = "/api/2.0/libraries/install";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void uninstall(UninstallLibraries request) {
    String path = "/api/2.0/libraries/uninstall";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    apiClient.POST(path, request, Void.class, headers);
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of Libraries */
class LibrariesImpl implements LibrariesService {
  private final ApiClient apiClient;

  public LibrariesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
    String path = "/api/2.0/libraries/all-cluster-statuses";
    return apiClient.GET(path, ListAllClusterLibraryStatusesResponse.class);
  }

  @Override
  public ClusterLibraryStatuses clusterStatus(ClusterStatusRequest request) {
    String path = "/api/2.0/libraries/cluster-status";
    return apiClient.GET(path, request, ClusterLibraryStatuses.class);
  }

  @Override
  public void install(InstallLibraries request) {
    String path = "/api/2.0/libraries/install";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void uninstall(UninstallLibraries request) {
    String path = "/api/2.0/libraries/uninstall";
    apiClient.POST(path, request, Void.class);
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.libraries;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

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
    public ClusterLibraryStatuses clusterStatus(ClusterStatus request) {
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
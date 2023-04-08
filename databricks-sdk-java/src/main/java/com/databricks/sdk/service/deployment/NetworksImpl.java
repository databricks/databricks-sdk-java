// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Networks */
class NetworksImpl implements NetworksService {
    private final ApiClient apiClient;

    public NetworksImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public Network create(CreateNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks");
        return apiClient.POST(path, request, Network.class);
    }
    
    @Override
    public void delete(DeleteNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks/%s", request.getNetworkId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public Network get(GetNetworkRequest request) {
        String path = String.format("/api/2.0/accounts//networks/%s", request.getNetworkId());
        return apiClient.GET(path, request, Network.class);
    }
    
    @Override
    public List<Network> list() {
        String path = String.format("/api/2.0/accounts//networks");
        return apiClient.GET(path, List.class);
    }
    
}
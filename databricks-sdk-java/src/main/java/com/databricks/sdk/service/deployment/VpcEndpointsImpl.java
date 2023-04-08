// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of VpcEndpoints */
class VpcEndpointsImpl implements VpcEndpointsService {
    private final ApiClient apiClient;

    public VpcEndpointsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public VpcEndpoint create(CreateVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints");
        return apiClient.POST(path, request, VpcEndpoint.class);
    }
    
    @Override
    public void delete(DeleteVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints/%s", request.getVpcEndpointId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public VpcEndpoint get(GetVpcEndpointRequest request) {
        String path = String.format("/api/2.0/accounts//vpc-endpoints/%s", request.getVpcEndpointId());
        return apiClient.GET(path, request, VpcEndpoint.class);
    }
    
    @Override
    public List<VpcEndpoint> list() {
        String path = String.format("/api/2.0/accounts//vpc-endpoints");
        return apiClient.GET(path, List.class);
    }
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.ipaccesslists;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of IpAccessLists */
class IpAccessListsImpl implements IpAccessListsService {
    private final ApiClient apiClient;

    public IpAccessListsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public CreateIpAccessListResponse create(CreateIpAccessList request) {
        String path = "/api/2.0/ip-access-lists";
        return apiClient.POST(path, request, CreateIpAccessListResponse.class);
    }
    
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public FetchIpAccessListResponse get(Get request) {
        String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
        return apiClient.GET(path, request, FetchIpAccessListResponse.class);
    }
    
    @Override
    public GetIpAccessListResponse list() {
        String path = "/api/2.0/ip-access-lists";
        return apiClient.GET(path, GetIpAccessListResponse.class);
    }
    
    @Override
    public void replace(ReplaceIpAccessList request) {
        String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
        apiClient.PUT(path, request, Void.class);
    }
    
    @Override
    public void update(UpdateIpAccessList request) {
        String path = String.format("/api/2.0/ip-access-lists/%s", request.getIpAccessListId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}
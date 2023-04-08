// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of AccountGroups */
class AccountGroupsImpl implements AccountGroupsService {
    private final ApiClient apiClient;

    public AccountGroupsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public Group create(Group request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups");
        return apiClient.POST(path, request, Group.class);
    }
    
    @Override
    public void delete(DeleteGroupRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public Group get(GetGroupRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        return apiClient.GET(path, request, Group.class);
    }
    
    @Override
    public ListGroupsResponse list(ListGroupsRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups");
        return apiClient.GET(path, request, ListGroupsResponse.class);
    }
    
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
    @Override
    public void update(Group request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
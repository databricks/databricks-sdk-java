// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of AccountUsers */
class AccountUsersImpl implements AccountUsersService {
    private final ApiClient apiClient;

    public AccountUsersImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public User create(User request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users");
        return apiClient.POST(path, request, User.class);
    }
    
    @Override
    public void delete(DeleteUserRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public User get(GetUserRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        return apiClient.GET(path, request, User.class);
    }
    
    @Override
    public ListUsersResponse list(ListUsersRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users");
        return apiClient.GET(path, request, ListUsersResponse.class);
    }
    
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
    @Override
    public void update(User request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
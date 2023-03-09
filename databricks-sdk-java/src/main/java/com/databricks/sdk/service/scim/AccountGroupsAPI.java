// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Groups simplify identity management, making it easier to assign access to
 * Databricks Account, data, and other securable objects.
 * 
 * It is best practice to assign access to workspaces and access-control
 * policies in Unity Catalog to groups, instead of to users individually. All
 * Databricks Account identities can be assigned as members of groups, and
 * members inherit permissions that are assigned to their group.
 */
public class AccountGroupsAPI implements AccountGroupsService {
    private final ApiClient apiClient;

    public AccountGroupsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new group.
     * 
     * Creates a group in the Databricks Account with a unique name, using the
     * supplied group details.
     */
    @Override
    public Group create(Group request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups");
        return apiClient.POST(path, request, Group.class);
    }
    
	/**
     * Delete a group.
     * 
     * Deletes a group from the Databricks Account.
     */
    @Override
    public void delete(DeleteGroupRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get group details.
     * 
     * Gets the information for a specific group in the Databricks Account.
     */
    @Override
    public Group get(GetGroupRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        return apiClient.GET(path, request, Group.class);
    }
    
	/**
     * List group details.
     * 
     * Gets all details of the groups associated with the Databricks Account.
     */
    @Override
    public ListGroupsResponse list(ListGroupsRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups");
        return apiClient.GET(path, request, ListGroupsResponse.class);
    }
    
	/**
     * Update group details.
     * 
     * Partially updates the details of a group.
     */
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
	/**
     * Replace a group.
     * 
     * Updates the details of a group by replacing the entire group entity.
     */
    @Override
    public void update(Group request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Groups/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
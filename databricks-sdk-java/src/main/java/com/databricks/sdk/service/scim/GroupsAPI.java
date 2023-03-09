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
 * Databricks Workspace, data, and other securable objects.
 * 
 * It is best practice to assign access to workspaces and access-control
 * policies in Unity Catalog to groups, instead of to users individually. All
 * Databricks Workspace identities can be assigned as members of groups, and
 * members inherit permissions that are assigned to their group.
 */
public class GroupsAPI implements GroupsService {
    private final ApiClient apiClient;

    public GroupsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new group.
     * 
     * Creates a group in the Databricks Workspace with a unique name, using the
     * supplied group details.
     */
    @Override
    public Group create(Group request) {
        String path = "/api/2.0/preview/scim/v2/Groups";
        return apiClient.POST(path, request, Group.class);
    }
    
	/**
     * Delete a group.
     * 
     * Deletes a group from the Databricks Workspace.
     */
    @Override
    public void delete(DeleteGroupRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get group details.
     * 
     * Gets the information for a specific group in the Databricks Workspace.
     */
    @Override
    public Group get(GetGroupRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
        return apiClient.GET(path, request, Group.class);
    }
    
	/**
     * List group details.
     * 
     * Gets all details of the groups associated with the Databricks Workspace.
     */
    @Override
    public ListGroupsResponse list(ListGroupsRequest request) {
        String path = "/api/2.0/preview/scim/v2/Groups";
        return apiClient.GET(path, request, ListGroupsResponse.class);
    }
    
	/**
     * Update group details.
     * 
     * Partially updates the details of a group.
     */
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
	/**
     * Replace a group.
     * 
     * Updates the details of a group by replacing the entire group entity.
     */
    @Override
    public void update(Group request) {
        String path = String.format("/api/2.0/preview/scim/v2/Groups/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * User identities recognized by Databricks and represented by email addresses.
 * 
 * Databricks recommends using SCIM provisioning to sync users and groups
 * automatically from your identity provider to your Databricks Workspace. SCIM
 * streamlines onboarding a new employee or team by using your identity provider
 * to create users and groups in Databricks Workspace and give them the proper
 * level of access. When a user leaves your organization or no longer needs
 * access to Databricks Workspace, admins can terminate the user in your
 * identity provider and that user’s account will also be removed from
 * Databricks Workspace. This ensures a consistent offboarding process and
 * prevents unauthorized users from accessing sensitive data.
 */
public class UsersAPI implements UsersService {
    private final ApiClient apiClient;

    public UsersAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new user.
     * 
     * Creates a new user in the Databricks Workspace. This new user will also
     * be added to the Databricks account.
     */
    @Override
    public User create(User request) {
        String path = "/api/2.0/preview/scim/v2/Users";
        return apiClient.POST(path, request, User.class);
    }
    
	/**
     * Delete a user.
     * 
     * Deletes a user. Deleting a user from a Databricks Workspace also removes
     * objects associated with the user.
     */
    @Override
    public void delete(DeleteUserRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get user details.
     * 
     * Gets information for a specific user in Databricks Workspace.
     */
    @Override
    public User get(GetUserRequest request) {
        String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
        return apiClient.GET(path, request, User.class);
    }
    
	/**
     * List users.
     * 
     * Gets details for all the users associated with a Databricks Workspace.
     */
    @Override
    public ListUsersResponse list(ListUsersRequest request) {
        String path = "/api/2.0/preview/scim/v2/Users";
        return apiClient.GET(path, request, ListUsersResponse.class);
    }
    
	/**
     * Update user details.
     * 
     * Partially updates a user resource by applying the supplied operations on
     * specific user attributes.
     */
    @Override
    public void patch(PartialUpdate request) {
        String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
	/**
     * Replace a user.
     * 
     * Replaces a user's information with the data supplied in request.
     */
    @Override
    public void update(User request) {
        String path = String.format("/api/2.0/preview/scim/v2/Users/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
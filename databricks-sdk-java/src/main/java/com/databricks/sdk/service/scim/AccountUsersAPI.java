// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.scim;

import javax.annotation.Generated;
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
 * automatically from your identity provider to your Databricks Account. SCIM
 * streamlines onboarding a new employee or team by using your identity provider
 * to create users and groups in Databricks Account and give them the proper
 * level of access. When a user leaves your organization or no longer needs
 * access to Databricks Account, admins can terminate the user in your identity
 * provider and that user’s account will also be removed from Databricks
 * Account. This ensures a consistent offboarding process and prevents
 * unauthorized users from accessing sensitive data.
 */
@Generated("databricks-sdk-generator")
public class AccountUsersAPI implements AccountUsersService {
    private final ApiClient apiClient;

    public AccountUsersAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a new user.
     * 
     * Creates a new user in the Databricks Account. This new user will also be
     * added to the Databricks account.
     */
    @Override
    public User create(User request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users");
        return apiClient.POST(path, request, User.class);
    }
    
	/**
     * Delete a user.
     * 
     * Deletes a user. Deleting a user from a Databricks Account also removes
     * objects associated with the user.
     */
    @Override
    public void delete(DeleteUserRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get user details.
     * 
     * Gets information for a specific user in Databricks Account.
     */
    @Override
    public User get(GetUserRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        return apiClient.GET(path, request, User.class);
    }
    
	/**
     * List users.
     * 
     * Gets details for all the users associated with a Databricks Account.
     */
    @Override
    public ListUsersResponse list(ListUsersRequest request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users");
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
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.PATCH(path, request, Void.class);
    }
    
	/**
     * Replace a user.
     * 
     * Replaces a user's information with the data supplied in request.
     */
    @Override
    public void update(User request) {
        String path = String.format("/api/2.0/accounts//scim/v2/Users/%s", request.getId());
        apiClient.PUT(path, request, Void.class);
    }
    
}
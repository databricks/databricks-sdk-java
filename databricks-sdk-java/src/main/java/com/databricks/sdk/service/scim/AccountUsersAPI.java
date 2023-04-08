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
 * automatically from your identity provider to your Databricks Account. SCIM
 * streamlines onboarding a new employee or team by using your identity provider
 * to create users and groups in Databricks Account and give them the proper
 * level of access. When a user leaves your organization or no longer needs
 * access to Databricks Account, admins can terminate the user in your identity
 * provider and that user’s account will also be removed from Databricks
 * Account. This ensures a consistent offboarding process and prevents
 * unauthorized users from accessing sensitive data.
 */
public class AccountUsersAPI {
    private final AccountUsersService impl;

    /** Regular-use constructor */
    public AccountUsersAPI(ApiClient apiClient) {
        impl = new AccountUsersImpl(apiClient);
    }

    /** Constructor for mocks */
    public AccountUsersAPI(AccountUsersService mock) {
        impl = mock;
    }
	
	/**
     * Create a new user.
     * 
     * Creates a new user in the Databricks Account. This new user will also be
     * added to the Databricks account.
     */
    public User create(User request) {
        return impl.create(request);
    }
    
	/**
     * Delete a user.
     * 
     * Deletes a user. Deleting a user from a Databricks Account also removes
     * objects associated with the user.
     */
    public void delete(DeleteUserRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get user details.
     * 
     * Gets information for a specific user in Databricks Account.
     */
    public User get(GetUserRequest request) {
        return impl.get(request);
    }
    
	/**
     * List users.
     * 
     * Gets details for all the users associated with a Databricks Account.
     */
    public ListUsersResponse list(ListUsersRequest request) {
        return impl.list(request);
    }
    
	/**
     * Update user details.
     * 
     * Partially updates a user resource by applying the supplied operations on
     * specific user attributes.
     */
    public void patch(PartialUpdate request) {
        impl.patch(request);
    }
    
	/**
     * Replace a user.
     * 
     * Replaces a user's information with the data supplied in request.
     */
    public void update(User request) {
        impl.update(request);
    }
    
    public AccountUsersService impl() {
        return impl;
    }
}
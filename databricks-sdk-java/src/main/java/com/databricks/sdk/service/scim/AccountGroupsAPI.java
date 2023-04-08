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
public class AccountGroupsAPI {
    private final AccountGroupsService impl;

    /** Regular-use constructor */
    public AccountGroupsAPI(ApiClient apiClient) {
        impl = new AccountGroupsImpl(apiClient);
    }

    /** Constructor for mocks */
    public AccountGroupsAPI(AccountGroupsService mock) {
        impl = mock;
    }
	
	/**
     * Create a new group.
     * 
     * Creates a group in the Databricks Account with a unique name, using the
     * supplied group details.
     */
    public Group create(Group request) {
        return impl.create(request);
    }
    
	/**
     * Delete a group.
     * 
     * Deletes a group from the Databricks Account.
     */
    public void delete(DeleteGroupRequest request) {
        impl.delete(request);
    }
    
	/**
     * Get group details.
     * 
     * Gets the information for a specific group in the Databricks Account.
     */
    public Group get(GetGroupRequest request) {
        return impl.get(request);
    }
    
	/**
     * List group details.
     * 
     * Gets all details of the groups associated with the Databricks Account.
     */
    public ListGroupsResponse list(ListGroupsRequest request) {
        return impl.list(request);
    }
    
	/**
     * Update group details.
     * 
     * Partially updates the details of a group.
     */
    public void patch(PartialUpdate request) {
        impl.patch(request);
    }
    
	/**
     * Replace a group.
     * 
     * Updates the details of a group by replacing the entire group entity.
     */
    public void update(Group request) {
        impl.update(request);
    }
    
    public AccountGroupsService impl() {
        return impl;
    }
}
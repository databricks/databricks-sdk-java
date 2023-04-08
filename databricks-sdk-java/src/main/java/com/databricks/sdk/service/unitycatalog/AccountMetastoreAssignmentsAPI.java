// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage metastore assignments to a workspace.
 */
public class AccountMetastoreAssignmentsAPI {
    private final AccountMetastoreAssignmentsService impl;

    /** Regular-use constructor */
    public AccountMetastoreAssignmentsAPI(ApiClient apiClient) {
        impl = new AccountMetastoreAssignmentsImpl(apiClient);
    }

    /** Constructor for mocks */
    public AccountMetastoreAssignmentsAPI(AccountMetastoreAssignmentsService mock) {
        impl = mock;
    }
	
	/**
     * Assigns a workspace to a metastore.
     * 
     * Creates an assignment to a metastore for a workspace
     */
    public MetastoreAssignment create(CreateMetastoreAssignment request) {
        return impl.create(request);
    }
    
	/**
     * Delete a metastore assignment.
     * 
     * Deletes a metastore assignment to a workspace, leaving the workspace with
     * no metastore.
     */
    public void delete(DeleteAccountMetastoreAssignmentRequest request) {
        impl.delete(request);
    }
    
	/**
     * Gets the metastore assignment for a workspace.
     * 
     * Gets the metastore assignment, if any, for the workspace specified by ID.
     * If the workspace is assigned a metastore, the mappig will be returned. If
     * no metastore is assigned to the workspace, the assignment will not be
     * found and a 404 returned.
     */
    public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get all workspaces assigned to a metastore.
     * 
     * Gets a list of all Databricks workspace IDs that have been assigned to
     * given metastore.
     */
    public List<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
        return impl.list(request);
    }
    
	/**
     * Updates a metastore assignment to a workspaces.
     * 
     * Updates an assignment to a metastore for a workspace. Currently, only the
     * default catalog may be updated
     */
    public MetastoreAssignment update(UpdateMetastoreAssignment request) {
        return impl.update(request);
    }
    
    public AccountMetastoreAssignmentsService impl() {
        return impl;
    }
}
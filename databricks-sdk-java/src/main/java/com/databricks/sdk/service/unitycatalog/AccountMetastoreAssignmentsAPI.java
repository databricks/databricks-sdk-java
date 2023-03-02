// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage metastore assignments to a workspace.
 */
@Generated("databricks-sdk-generator")
public class AccountMetastoreAssignmentsAPI implements AccountMetastoreAssignmentsService {
    private final ApiClient apiClient;

    public AccountMetastoreAssignmentsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Assigns a workspace to a metastore.
     * 
     * Creates an assignment to a metastore for a workspace
     */
    @Override
    public MetastoreAssignment create(CreateMetastoreAssignment request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        return apiClient.POST(path, request, MetastoreAssignment.class);
    }
    
	/**
     * Delete a metastore assignment.
     * 
     * Deletes a metastore assignment to a workspace, leaving the workspace with
     * no metastore.
     */
    @Override
    public void delete(DeleteAccountMetastoreAssignmentRequest request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Gets the metastore assignment for a workspace.
     * 
     * Gets the metastore assignment, if any, for the workspace specified by ID.
     * If the workspace is assigned a metastore, the mappig will be returned. If
     * no metastore is assigned to the workspace, the assignment will not be
     * found and a 404 returned.
     */
    @Override
    public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastore", request.getWorkspaceId());
        return apiClient.GET(path, request, MetastoreAssignment.class);
    }
    
	/**
     * Get all workspaces assigned to a metastore.
     * 
     * Gets a list of all Databricks workspace IDs that have been assigned to
     * given metastore.
     */
    @Override
    public List<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/workspaces", request.getMetastoreId());
        return apiClient.GET(path, request, List.class);
    }
    
	/**
     * Updates a metastore assignment to a workspaces.
     * 
     * Updates an assignment to a metastore for a workspace. Currently, only the
     * default catalog may be updated
     */
    @Override
    public MetastoreAssignment update(UpdateMetastoreAssignment request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        return apiClient.PUT(path, request, MetastoreAssignment.class);
    }
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of AccountMetastoreAssignments */
class AccountMetastoreAssignmentsImpl implements AccountMetastoreAssignmentsService {
    private final ApiClient apiClient;

    public AccountMetastoreAssignmentsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public MetastoreAssignment create(CreateMetastoreAssignment request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        return apiClient.POST(path, request, MetastoreAssignment.class);
    }
    
    @Override
    public void delete(DeleteAccountMetastoreAssignmentRequest request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public MetastoreAssignment get(GetAccountMetastoreAssignmentRequest request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastore", request.getWorkspaceId());
        return apiClient.GET(path, request, MetastoreAssignment.class);
    }
    
    @Override
    public List<MetastoreAssignment> list(ListAccountMetastoreAssignmentsRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/workspaces", request.getMetastoreId());
        return apiClient.GET(path, request, List.class);
    }
    
    @Override
    public MetastoreAssignment update(UpdateMetastoreAssignment request) {
        String path = String.format("/api/2.0/accounts//workspaces/%s/metastores/%s", request.getWorkspaceId(), request.getMetastoreId());
        return apiClient.PUT(path, request, MetastoreAssignment.class);
    }
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.workspaceconf;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * This API allows updating known workspace settings for advanced users.
 */
public class WorkspaceConfAPI implements WorkspaceConfService {
    private final ApiClient apiClient;

    public WorkspaceConfAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Check configuration status.
     * 
     * Gets the configuration status for a workspace.
     */
    @Override
    public Map<String,String> getStatus(GetStatus request) {
        String path = "/api/2.0/workspace-conf";
        return apiClient.GET(path, request, Map.class);
    }
    
	/**
     * Enable/disable features.
     * 
     * Sets the configuration status for a workspace, including enabling or
     * disabling it.
     */
    @Override
    public void setStatus(Map<String,String> request) {
        String path = "/api/2.0/workspace-conf";
        apiClient.PATCH(path, request, Void.class);
    }
    
}
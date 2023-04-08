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
public class WorkspaceConfAPI {
    private final WorkspaceConfService impl;

    /** Regular-use constructor */
    public WorkspaceConfAPI(ApiClient apiClient) {
        impl = new WorkspaceConfImpl(apiClient);
    }

    /** Constructor for mocks */
    public WorkspaceConfAPI(WorkspaceConfService mock) {
        impl = mock;
    }
	
	/**
     * Check configuration status.
     * 
     * Gets the configuration status for a workspace.
     */
    public Map<String,String> getStatus(GetStatus request) {
        return impl.getStatus(request);
    }
    
	/**
     * Enable/disable features.
     * 
     * Sets the configuration status for a workspace, including enabling or
     * disabling it.
     */
    public void setStatus(Map<String,String> request) {
        impl.setStatus(request);
    }
    
    public WorkspaceConfService impl() {
        return impl;
    }
}
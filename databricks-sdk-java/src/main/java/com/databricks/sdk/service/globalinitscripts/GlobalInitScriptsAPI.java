// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.globalinitscripts;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Global Init Scripts API enables Workspace administrators to configure
 * global initialization scripts for their workspace. These scripts run on every
 * node in every cluster in the workspace.
 * 
 * **Important:** Existing clusters must be restarted to pick up any changes
 * made to global init scripts. Global init scripts are run in order. If the
 * init script returns with a bad exit code, the Apache Spark container fails to
 * launch and init scripts with later position are skipped. If enough containers
 * fail, the entire cluster fails with a `GLOBAL_INIT_SCRIPT_FAILURE` error
 * code.
 */
@Generated("databricks-sdk-generator")
public class GlobalInitScriptsAPI implements GlobalInitScriptsService {
    private final ApiClient apiClient;

    public GlobalInitScriptsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create init script.
     * 
     * Creates a new global init script in this workspace.
     */
    @Override
    public CreateResponse create(GlobalInitScriptCreateRequest request) {
        String path = "/api/2.0/global-init-scripts";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete init script.
     * 
     * Deletes a global init script.
     */
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get an init script.
     * 
     * Gets all the details of a script, including its Base64-encoded contents.
     */
    @Override
    public GlobalInitScriptDetailsWithContent get(Get request) {
        String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
        return apiClient.GET(path, request, GlobalInitScriptDetailsWithContent.class);
    }
    
	/**
     * Get init scripts.
     * 
     * "Get a list of all global init scripts for this workspace. This returns
     * all properties for each script but **not** the script contents. To
     * retrieve the contents of a script, use the [get a global init
     * script](#operation/get-script) operation.
     */
    @Override
    public ListGlobalInitScriptsResponse list() {
        String path = "/api/2.0/global-init-scripts";
        return apiClient.GET(path, ListGlobalInitScriptsResponse.class);
    }
    
	/**
     * Update init script.
     * 
     * Updates a global init script, specifying only the fields to change. All
     * fields are optional. Unspecified fields retain their current value.
     */
    @Override
    public void update(GlobalInitScriptUpdateRequest request) {
        String path = String.format("/api/2.0/global-init-scripts/%s", request.getScriptId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}
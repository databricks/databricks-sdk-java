// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.gitcredentials;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * Registers personal access token for Databricks to do operations on behalf of
 * the user.
 * 
 * See [more info].
 * 
 * [more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
 */
public class GitCredentialsAPI implements GitCredentialsService {
    private final ApiClient apiClient;

    public GitCredentialsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create a credential entry.
     * 
     * Creates a Git credential entry for the user. Only one Git credential per
     * user is supported, so any attempts to create credentials if an entry
     * already exists will fail. Use the PATCH endpoint to update existing
     * credentials, or the DELETE endpoint to delete existing credentials.
     */
    @Override
    public CreateCredentialsResponse create(CreateCredentials request) {
        String path = "/api/2.0/git-credentials";
        return apiClient.POST(path, request, CreateCredentialsResponse.class);
    }
    
	/**
     * Delete a credential.
     * 
     * Deletes the specified Git credential.
     */
    @Override
    public void delete(Delete request) {
        String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get a credential entry.
     * 
     * Gets the Git credential with the specified credential ID.
     */
    @Override
    public CredentialInfo get(Get request) {
        String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
        return apiClient.GET(path, request, CredentialInfo.class);
    }
    
	/**
     * Get Git credentials.
     * 
     * Lists the calling user's Git credentials. One credential per user is
     * supported.
     */
    @Override
    public GetCredentialsResponse list() {
        String path = "/api/2.0/git-credentials";
        return apiClient.GET(path, GetCredentialsResponse.class);
    }
    
	/**
     * Update a credential.
     * 
     * Updates the specified Git credential.
     */
    @Override
    public void update(UpdateCredentials request) {
        String path = String.format("/api/2.0/git-credentials/%s", request.getCredentialId());
        apiClient.PATCH(path, request, Void.class);
    }
    
}
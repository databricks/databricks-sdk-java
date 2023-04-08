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
public class GitCredentialsAPI {
    private final GitCredentialsService impl;

    /** Regular-use constructor */
    public GitCredentialsAPI(ApiClient apiClient) {
        impl = new GitCredentialsImpl(apiClient);
    }

    /** Constructor for mocks */
    public GitCredentialsAPI(GitCredentialsService mock) {
        impl = mock;
    }
	
	/**
     * Create a credential entry.
     * 
     * Creates a Git credential entry for the user. Only one Git credential per
     * user is supported, so any attempts to create credentials if an entry
     * already exists will fail. Use the PATCH endpoint to update existing
     * credentials, or the DELETE endpoint to delete existing credentials.
     */
    public CreateCredentialsResponse create(CreateCredentials request) {
        return impl.create(request);
    }
    
	/**
     * Delete a credential.
     * 
     * Deletes the specified Git credential.
     */
    public void delete(Delete request) {
        impl.delete(request);
    }
    
	/**
     * Get a credential entry.
     * 
     * Gets the Git credential with the specified credential ID.
     */
    public CredentialInfo get(Get request) {
        return impl.get(request);
    }
    
	/**
     * Get Git credentials.
     * 
     * Lists the calling user's Git credentials. One credential per user is
     * supported.
     */
    public GetCredentialsResponse list() {
        return impl.list();
    }
    
	/**
     * Update a credential.
     * 
     * Updates the specified Git credential.
     */
    public void update(UpdateCredentials request) {
        impl.update(request);
    }
    
    public GitCredentialsService impl() {
        return impl;
    }
}
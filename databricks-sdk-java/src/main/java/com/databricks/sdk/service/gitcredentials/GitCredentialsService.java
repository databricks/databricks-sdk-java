// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.gitcredentials;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * Registers personal access token for Databricks to do operations on behalf of
 * the user.
 * 
 * See [more info].
 * 
 * [more info]: https://docs.databricks.com/repos/get-access-tokens-from-git-provider.html
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface GitCredentialsService {
	/**
     * Create a credential entry.
     * 
     * Creates a Git credential entry for the user. Only one Git credential per
     * user is supported, so any attempts to create credentials if an entry
     * already exists will fail. Use the PATCH endpoint to update existing
     * credentials, or the DELETE endpoint to delete existing credentials.
     */
    CreateCredentialsResponse create(CreateCredentials createCredentials);
    
	/**
     * Delete a credential.
     * 
     * Deletes the specified Git credential.
     */
    void delete(Delete delete);
    
	/**
     * Get a credential entry.
     * 
     * Gets the Git credential with the specified credential ID.
     */
    CredentialInfo get(Get get);
    
	/**
     * Get Git credentials.
     * 
     * Lists the calling user's Git credentials. One credential per user is
     * supported.
     */
    GetCredentialsResponse list();
    
	/**
     * Update a credential.
     * 
     * Updates the specified Git credential.
     */
    void update(UpdateCredentials updateCredentials);
    
}
// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.util.List;
import java.util.Map;

/**
 * These APIs manage credential configurations for this workspace. Databricks
 * needs access to a cross-account service IAM role in your AWS account so that
 * Databricks can deploy clusters in the appropriate VPC for the new workspace.
 * A credential configuration encapsulates this role information, and its ID is
 * used when creating a new workspace.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
public interface CredentialsService {
	/**
     * Create credential configuration.
     * 
     * Creates a Databricks credential configuration that represents cloud
     * cross-account credentials for a specified account. Databricks uses this
     * to set up network infrastructure properly to host Databricks clusters.
     * For your AWS IAM role, you need to trust the External ID (the Databricks
     * Account API account ID) in the returned credential object, and configure
     * the required access policy.
     * 
     * Save the response's `credentials_id` field, which is the ID for your new
     * credential configuration object.
     * 
     * For information about how to create a new workspace with this API, see
     * [Create a new workspace using the Account API]
     * 
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     */
    Credential create(CreateCredentialRequest createCredentialRequest);
    
	/**
     * Delete credential configuration.
     * 
     * Deletes a Databricks credential configuration object for an account, both
     * specified by ID. You cannot delete a credential that is associated with
     * any workspace.
     */
    void delete(DeleteCredentialRequest deleteCredentialRequest);
    
	/**
     * Get credential configuration.
     * 
     * Gets a Databricks credential configuration object for an account, both
     * specified by ID.
     */
    Credential get(GetCredentialRequest getCredentialRequest);
    
	/**
     * Get all credential configurations.
     * 
     * Gets all Databricks credential configurations associated with an account
     * specified by ID.
     */
    List<Credential> list();
    
}
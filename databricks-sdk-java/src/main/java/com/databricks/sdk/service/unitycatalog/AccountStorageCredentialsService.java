// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * These APIs manage storage credentials for a particular metastore.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface AccountStorageCredentialsService {
	/**
     * Create a storage credential.
     * 
     * Creates a new storage credential. The request object is specific to the
     * cloud:
     * 
     * * **AwsIamRole** for AWS credentials * **AzureServicePrincipal** for
     * Azure credentials * **GcpServiceAcountKey** for GCP credentials.
     * 
     * The caller must be a metastore admin and have the
     * **CREATE_STORAGE_CREDENTIAL** privilege on the metastore.
     */
    StorageCredentialInfo create(CreateStorageCredential createStorageCredential);
    
	/**
     * Gets the named storage credential.
     * 
     * Gets a storage credential from the metastore. The caller must be a
     * metastore admin, the owner of the storage credential, or have a level of
     * privilege on the storage credential.
     */
    StorageCredentialInfo get(GetAccountStorageCredentialRequest getAccountStorageCredentialRequest);
    
	/**
     * Get all storage credentials assigned to a metastore.
     * 
     * Gets a list of all storage credentials that have been assigned to given
     * metastore.
     */
    List<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest listAccountStorageCredentialsRequest);
    
}
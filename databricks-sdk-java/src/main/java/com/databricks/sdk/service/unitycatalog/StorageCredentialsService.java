// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import javax.annotation.Generated;
import java.util.List;
import java.util.Map;

/**
 * A storage credential represents an authentication and authorization mechanism
 * for accessing data stored on your cloud tenant, using an IAM role. Each
 * storage credential is subject to Unity Catalog access-control policies that
 * control which users and groups can access the credential. If a user does not
 * have access to a storage credential in Unity Catalog, the request fails and
 * Unity Catalog does not attempt to authenticate to your cloud tenant on the
 * user’s behalf.
 * 
 * Databricks recommends using external locations rather than using storage
 * credentials directly.
 * 
 * To create storage credentials, you must be a Databricks account admin. The
 * account admin who creates the storage credential can delegate ownership to
 * another user or group to manage permissions on it.
 *
 * This is the high-level interface, that contains generated methods.
 *
 * Evolving: this interface is under development. Method signatures may change.
 */
@Generated("databricks-sdk-generator")
public interface StorageCredentialsService {
	/**
     * Create credentials.
     * 
     * Creates a new storage credential. The request object is specific to the
     * cloud:
     * 
     * * **AwsIamRole** for AWS credentials * **AzureServicePrincipal** for
     * Azure credentials * **GcpServiceAcountKey** for GCP credentials.
     * 
     * The caller must be a Metastore admin and have the
     * CREATE_STORAGE_CREDENTIAL privilege on the Metastore.
     */
    StorageCredentialInfo create(CreateStorageCredential createStorageCredential);
    
	/**
     * Delete a credential.
     * 
     * Deletes a storage credential from the Metastore. The caller must be an
     * owner of the storage credential.
     */
    void delete(DeleteStorageCredentialRequest deleteStorageCredentialRequest);
    
	/**
     * Get a credential.
     * 
     * Gets a storage credential from the Metastore. The caller must be a
     * Metastore admin, the owner of the storage credential, or have a level of
     * privilege on the storage credential.
     */
    StorageCredentialInfo get(GetStorageCredentialRequest getStorageCredentialRequest);
    
	/**
     * List credentials.
     * 
     * Gets an array of storage credentials (as StorageCredentialInfo objects).
     * The array is limited to only those storage credentials the caller has the
     * privilege level to access. If the caller is a Metastore admin, all
     * storage credentials will be retrieved.
     */
    ListStorageCredentialsResponse list();
    
	/**
     * Update a credential.
     * 
     * Updates a storage credential on the Metastore. The caller must be the
     * owner of the storage credential. If the caller is a Metastore admin, only
     * the __owner__ credential can be changed.
     */
    StorageCredentialInfo update(UpdateStorageCredential updateStorageCredential);
    
}
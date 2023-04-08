// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage storage credentials for a particular metastore.
 */
public class AccountStorageCredentialsAPI {
    private final AccountStorageCredentialsService impl;

    /** Regular-use constructor */
    public AccountStorageCredentialsAPI(ApiClient apiClient) {
        impl = new AccountStorageCredentialsImpl(apiClient);
    }

    /** Constructor for mocks */
    public AccountStorageCredentialsAPI(AccountStorageCredentialsService mock) {
        impl = mock;
    }
	
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
    public StorageCredentialInfo create(CreateStorageCredential request) {
        return impl.create(request);
    }
    
	/**
     * Gets the named storage credential.
     * 
     * Gets a storage credential from the metastore. The caller must be a
     * metastore admin, the owner of the storage credential, or have a level of
     * privilege on the storage credential.
     */
    public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
        return impl.get(request);
    }
    
	/**
     * Get all storage credentials assigned to a metastore.
     * 
     * Gets a list of all storage credentials that have been assigned to given
     * metastore.
     */
    public List<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
        return impl.list(request);
    }
    
    public AccountStorageCredentialsService impl() {
        return impl;
    }
}
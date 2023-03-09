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
public class AccountStorageCredentialsAPI implements AccountStorageCredentialsService {
    private final ApiClient apiClient;

    public AccountStorageCredentialsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    @Override
    public StorageCredentialInfo create(CreateStorageCredential request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials", request.getMetastoreId());
        return apiClient.POST(path, request, StorageCredentialInfo.class);
    }
    
	/**
     * Gets the named storage credential.
     * 
     * Gets a storage credential from the metastore. The caller must be a
     * metastore admin, the owner of the storage credential, or have a level of
     * privilege on the storage credential.
     */
    @Override
    public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials/%s", request.getMetastoreId(), request.getStorageCredentialName());
        return apiClient.GET(path, request, StorageCredentialInfo.class);
    }
    
	/**
     * Get all storage credentials assigned to a metastore.
     * 
     * Gets a list of all storage credentials that have been assigned to given
     * metastore.
     */
    @Override
    public List<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials", request.getMetastoreId());
        return apiClient.GET(path, request, List.class);
    }
    
}
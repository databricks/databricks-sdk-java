// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * These APIs manage storage configurations for this workspace. A root storage
 * S3 bucket in your account is required to store objects like cluster logs,
 * notebook revisions, and job results. You can also use the root storage S3
 * bucket for storage of non-production DBFS data. A storage configuration
 * encapsulates this bucket information, and its ID is used when creating a new
 * workspace.
 */
@Generated("databricks-sdk-generator")
public class StorageAPI implements StorageService {
    private final ApiClient apiClient;

    public StorageAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Create new storage configuration.
     * 
     * Creates new storage configuration for an account, specified by ID.
     * Uploads a storage configuration object that represents the root AWS S3
     * bucket in your account. Databricks stores related workspace assets
     * including DBFS, cluster logs, and job results. For the AWS S3 bucket, you
     * need to configure the required bucket policy.
     * 
     * For information about how to create a new workspace with this API, see
     * [Create a new workspace using the Account API]
     * 
     * [Create a new workspace using the Account API]: http://docs.databricks.com/administration-guide/account-api/new-workspace.html
     */
    @Override
    public StorageConfiguration create(CreateStorageConfigurationRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations");
        return apiClient.POST(path, request, StorageConfiguration.class);
    }
    
	/**
     * Delete storage configuration.
     * 
     * Deletes a Databricks storage configuration. You cannot delete a storage
     * configuration that is associated with any workspace.
     */
    @Override
    public void delete(DeleteStorageRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations/%s", request.getStorageConfigurationId());
        apiClient.DELETE(path, request, Void.class);
    }
    
	/**
     * Get storage configuration.
     * 
     * Gets a Databricks storage configuration for an account, both specified by
     * ID.
     */
    @Override
    public StorageConfiguration get(GetStorageRequest request) {
        String path = String.format("/api/2.0/accounts//storage-configurations/%s", request.getStorageConfigurationId());
        return apiClient.GET(path, request, StorageConfiguration.class);
    }
    
	/**
     * Get all storage configurations.
     * 
     * Gets a list of all Databricks storage configurations for your account,
     * specified by ID.
     */
    @Override
    public List<StorageConfiguration> list() {
        String path = String.format("/api/2.0/accounts//storage-configurations");
        return apiClient.GET(path, List.class);
    }
    
}
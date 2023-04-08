// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of AccountStorageCredentials */
class AccountStorageCredentialsImpl implements AccountStorageCredentialsService {
    private final ApiClient apiClient;

    public AccountStorageCredentialsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public StorageCredentialInfo create(CreateStorageCredential request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials", request.getMetastoreId());
        return apiClient.POST(path, request, StorageCredentialInfo.class);
    }
    
    @Override
    public StorageCredentialInfo get(GetAccountStorageCredentialRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials/", request.getMetastoreId());
        return apiClient.GET(path, request, StorageCredentialInfo.class);
    }
    
    @Override
    public List<StorageCredentialInfo> list(ListAccountStorageCredentialsRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s/storage-credentials", request.getMetastoreId());
        return apiClient.GET(path, request, List.class);
    }
    
}
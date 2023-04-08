// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.unitycatalog;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of AccountMetastores */
class AccountMetastoresImpl implements AccountMetastoresService {
    private final ApiClient apiClient;

    public AccountMetastoresImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public MetastoreInfo create(CreateMetastore request) {
        String path = String.format("/api/2.0/accounts//metastores");
        return apiClient.POST(path, request, MetastoreInfo.class);
    }
    
    @Override
    public void delete(DeleteAccountMetastoreRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public MetastoreInfo get(GetAccountMetastoreRequest request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        return apiClient.GET(path, request, MetastoreInfo.class);
    }
    
    @Override
    public ListMetastoresResponse list() {
        String path = String.format("/api/2.0/accounts//metastores");
        return apiClient.GET(path, ListMetastoresResponse.class);
    }
    
    @Override
    public MetastoreInfo update(UpdateMetastore request) {
        String path = String.format("/api/2.0/accounts//metastores/%s", request.getMetastoreId());
        return apiClient.PUT(path, request, MetastoreInfo.class);
    }
    
}
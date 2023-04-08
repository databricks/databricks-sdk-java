// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.deployment;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of Credentials */
class CredentialsImpl implements CredentialsService {
    private final ApiClient apiClient;

    public CredentialsImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public Credential create(CreateCredentialRequest request) {
        String path = String.format("/api/2.0/accounts//credentials");
        return apiClient.POST(path, request, Credential.class);
    }
    
    @Override
    public void delete(DeleteCredentialRequest request) {
        String path = String.format("/api/2.0/accounts//credentials/%s", request.getCredentialsId());
        apiClient.DELETE(path, request, Void.class);
    }
    
    @Override
    public Credential get(GetCredentialRequest request) {
        String path = String.format("/api/2.0/accounts//credentials/%s", request.getCredentialsId());
        return apiClient.GET(path, request, Credential.class);
    }
    
    @Override
    public List<Credential> list() {
        String path = String.format("/api/2.0/accounts//credentials");
        return apiClient.GET(path, List.class);
    }
    
}
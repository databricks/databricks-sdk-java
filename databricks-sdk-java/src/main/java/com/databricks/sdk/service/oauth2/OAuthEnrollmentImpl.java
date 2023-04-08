// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of OAuthEnrollment */
class OAuthEnrollmentImpl implements OAuthEnrollmentService {
    private final ApiClient apiClient;

    public OAuthEnrollmentImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public void create(CreateOAuthEnrollment request) {
        String path = String.format("/api/2.0/accounts//oauth2/enrollment");
        apiClient.POST(path, request, Void.class);
    }
    
    @Override
    public OAuthEnrollmentStatus get() {
        String path = String.format("/api/2.0/accounts//oauth2/enrollment");
        return apiClient.GET(path, OAuthEnrollmentStatus.class);
    }
    
}
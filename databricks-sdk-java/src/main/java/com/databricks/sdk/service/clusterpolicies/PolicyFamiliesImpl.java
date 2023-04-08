// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/** Package-local implementation of PolicyFamilies */
class PolicyFamiliesImpl implements PolicyFamiliesService {
    private final ApiClient apiClient;

    public PolicyFamiliesImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
    @Override
    public PolicyFamily get(GetPolicyFamilyRequest request) {
        String path = String.format("/api/2.0/policy-families/%s", request.getPolicyFamilyId());
        return apiClient.GET(path, request, PolicyFamily.class);
    }
    
    @Override
    public ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest request) {
        String path = "/api/2.0/policy-families";
        return apiClient.GET(path, request, ListPolicyFamiliesResponse.class);
    }
    
}
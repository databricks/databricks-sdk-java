// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import javax.annotation.Generated;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * View available policy families. A policy family contains a policy definition
 * providing best practices for configuring clusters for a particular use case.
 * 
 * Databricks manages and provides policy families for several common cluster
 * use cases. You cannot create, edit, or delete policy families.
 * 
 * Policy families cannot be used directly to create clusters. Instead, you
 * create cluster policies using a policy family. Cluster policies created using
 * a policy family inherit the policy family's policy definition.
 */
@Generated("databricks-sdk-generator")
public class PolicyFamiliesAPI implements PolicyFamiliesService {
    private final ApiClient apiClient;

    public PolicyFamiliesAPI(ApiClient apiClient) {
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
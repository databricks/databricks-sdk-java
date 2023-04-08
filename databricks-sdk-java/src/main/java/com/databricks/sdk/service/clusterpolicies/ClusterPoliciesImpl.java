// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ClusterPolicies */
class ClusterPoliciesImpl implements ClusterPoliciesService {
  private final ApiClient apiClient;

  public ClusterPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreatePolicyResponse create(CreatePolicy request) {
    String path = "/api/2.0/policies/clusters/create";
    return apiClient.POST(path, request, CreatePolicyResponse.class);
  }

  @Override
  public void delete(DeletePolicy request) {
    String path = "/api/2.0/policies/clusters/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void edit(EditPolicy request) {
    String path = "/api/2.0/policies/clusters/edit";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public Policy get(Get request) {
    String path = "/api/2.0/policies/clusters/get";
    return apiClient.GET(path, request, Policy.class);
  }

  @Override
  public ListPoliciesResponse list(List request) {
    String path = "/api/2.0/policies/clusters/list";
    return apiClient.GET(path, request, ListPoliciesResponse.class);
  }
}

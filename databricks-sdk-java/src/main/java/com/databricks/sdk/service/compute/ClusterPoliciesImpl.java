// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of ClusterPolicies */
class ClusterPoliciesImpl implements ClusterPoliciesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for ClusterPoliciesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public ClusterPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public CreatePolicyResponse create(CreatePolicy request) {
    String path = "/api/2.0/policies/clusters/create";
    return apiClient.POST(path, request, CreatePolicyResponse.class);
  }

  /** {@inheritDoc} */
  @Override
  public void delete(DeletePolicy request) {
    String path = "/api/2.0/policies/clusters/delete";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public void edit(EditPolicy request) {
    String path = "/api/2.0/policies/clusters/edit";
    apiClient.POST(path, request, Void.class);
  }

  /** {@inheritDoc} */
  @Override
  public Policy get(GetClusterPolicyRequest request) {
    String path = "/api/2.0/policies/clusters/get";
    return apiClient.GET(path, request, Policy.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListPoliciesResponse list(ListClusterPoliciesRequest request) {
    String path = "/api/2.0/policies/clusters/list";
    return apiClient.GET(path, request, ListPoliciesResponse.class);
  }
}

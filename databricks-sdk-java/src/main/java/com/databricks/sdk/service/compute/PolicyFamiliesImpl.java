// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/** Package-local implementation of PolicyFamilies */
class PolicyFamiliesImpl implements PolicyFamiliesService {
  private final ApiClient apiClient;

  /**
   * <p>Constructor for PolicyFamiliesImpl.</p>
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PolicyFamiliesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /** {@inheritDoc} */
  @Override
  public PolicyFamily get(GetPolicyFamilyRequest request) {
    String path = String.format("/api/2.0/policy-families/%s", request.getPolicyFamilyId());
    return apiClient.GET(path, request, PolicyFamily.class);
  }

  /** {@inheritDoc} */
  @Override
  public ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest request) {
    String path = "/api/2.0/policy-families";
    return apiClient.GET(path, request, ListPolicyFamiliesResponse.class);
  }
}

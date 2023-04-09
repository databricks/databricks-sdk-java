// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.clusterpolicies;

import com.databricks.sdk.client.ApiClient;
import org.apache.http.client.methods.*;

/**
 * View available policy families. A policy family contains a policy definition providing best
 * practices for configuring clusters for a particular use case.
 *
 * <p>Databricks manages and provides policy families for several common cluster use cases. You
 * cannot create, edit, or delete policy families.
 *
 * <p>Policy families cannot be used directly to create clusters. Instead, you create cluster
 * policies using a policy family. Cluster policies created using a policy family inherit the policy
 * family's policy definition.
 */
public class PolicyFamiliesAPI {
  private final PolicyFamiliesService impl;

  /** Regular-use constructor */
  public PolicyFamiliesAPI(ApiClient apiClient) {
    impl = new PolicyFamiliesImpl(apiClient);
  }

  /** Constructor for mocks */
  public PolicyFamiliesAPI(PolicyFamiliesService mock) {
    impl = mock;
  }

  public PolicyFamily get(String policyFamilyId) {
    return get(new GetPolicyFamilyRequest().setPolicyFamilyId(policyFamilyId));
  }

  public PolicyFamily get(GetPolicyFamilyRequest request) {
    return impl.get(request);
  }

  public ListPolicyFamiliesResponse list(ListPolicyFamiliesRequest request) {
    return impl.list(request);
  }

  public PolicyFamiliesService impl() {
    return impl;
  }
}

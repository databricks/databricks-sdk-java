// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
@Generated
public class PolicyFamiliesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PolicyFamiliesAPI.class);

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

  /** Retrieve the information for an policy family based on its identifier and version */
  public PolicyFamily get(GetPolicyFamilyRequest request) {
    return impl.get(request);
  }

  /**
   * Returns the list of policy definition types available to use at their latest version. This API
   * is paginated.
   */
  public Iterable<PolicyFamily> list(ListPolicyFamiliesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListPolicyFamiliesResponse::getPolicyFamilies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public PolicyFamiliesService impl() {
    return impl;
  }
}

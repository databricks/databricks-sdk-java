// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.client.ApiClient;
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
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PolicyFamiliesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PolicyFamiliesAPI.class);

  private final PolicyFamiliesService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public PolicyFamiliesAPI(ApiClient apiClient) {
    impl = new PolicyFamiliesImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.compute.PolicyFamiliesService} object
   */
  public PolicyFamiliesAPI(PolicyFamiliesService mock) {
    impl = mock;
  }

  /**
   * <p>get.</p>
   *
   * @param policyFamilyId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily get(String policyFamilyId) {
    return get(new GetPolicyFamilyRequest().setPolicyFamilyId(policyFamilyId));
  }

  /**
   * <p>get.</p>
   *
   * @param request a {@link com.databricks.sdk.service.compute.GetPolicyFamilyRequest} object
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamily} object
   */
  public PolicyFamily get(GetPolicyFamilyRequest request) {
    return impl.get(request);
  }

  /**
   * <p>list.</p>
   *
   * @param request a {@link com.databricks.sdk.service.compute.ListPolicyFamiliesRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<PolicyFamily> list(ListPolicyFamiliesRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListPolicyFamiliesResponse::getPolicyFamilies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.compute.PolicyFamiliesService} object
   */
  public PolicyFamiliesService impl() {
    return impl;
  }
}

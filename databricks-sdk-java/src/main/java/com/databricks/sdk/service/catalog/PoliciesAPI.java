// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Attribute-Based Access Control (ABAC) provides high leverage governance for enforcing compliance
 * policies in Unity Catalog. With ABAC policies, access is controlled in a hierarchical and
 * scalable manner, based on data attributes rather than specific resources, enabling more flexible
 * and comprehensive access control. ABAC policies in Unity Catalog support conditions on securable
 * properties, governance tags, and environment contexts. Callers must have the `MANAGE` privilege
 * on a securable to view, create, update, or delete ABAC policies.
 */
@Generated
public class PoliciesAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PoliciesAPI.class);

  private final PoliciesService impl;

  /** Regular-use constructor */
  public PoliciesAPI(ApiClient apiClient) {
    impl = new PoliciesImpl(apiClient);
  }

  /** Constructor for mocks */
  public PoliciesAPI(PoliciesService mock) {
    impl = mock;
  }

  /**
   * Creates a new policy on a securable. The new policy applies to the securable and all its
   * descendants.
   */
  public PolicyInfo createPolicy(CreatePolicyRequest request) {
    return impl.createPolicy(request);
  }

  public DeletePolicyResponse deletePolicy(
      String onSecurableType, String onSecurableFullname, String name) {
    return deletePolicy(
        new DeletePolicyRequest()
            .setOnSecurableType(onSecurableType)
            .setOnSecurableFullname(onSecurableFullname)
            .setName(name));
  }

  /** Delete an ABAC policy defined on a securable. */
  public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
    return impl.deletePolicy(request);
  }

  public PolicyInfo getPolicy(String onSecurableType, String onSecurableFullname, String name) {
    return getPolicy(
        new GetPolicyRequest()
            .setOnSecurableType(onSecurableType)
            .setOnSecurableFullname(onSecurableFullname)
            .setName(name));
  }

  /** Get the policy definition on a securable */
  public PolicyInfo getPolicy(GetPolicyRequest request) {
    return impl.getPolicy(request);
  }

  public Iterable<PolicyInfo> listPolicies(String onSecurableType, String onSecurableFullname) {
    return listPolicies(
        new ListPoliciesRequest()
            .setOnSecurableType(onSecurableType)
            .setOnSecurableFullname(onSecurableFullname));
  }

  /**
   * List all policies defined on a securable. Optionally, the list can include inherited policies
   * defined on the securable's parent schema or catalog.
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  public Iterable<PolicyInfo> listPolicies(ListPoliciesRequest request) {
    return new Paginator<>(
        request,
        impl::listPolicies,
        ListPoliciesResponse::getPolicies,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** Update an ABAC policy on a securable. */
  public PolicyInfo updatePolicy(UpdatePolicyRequest request) {
    return impl.updatePolicy(request);
  }

  public PoliciesService impl() {
    return impl;
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/**
 * Attribute-Based Access Control (ABAC) provides high leverage governance for enforcing compliance
 * policies in Unity Catalog. With ABAC policies, access is controlled in a hierarchical and
 * scalable manner, based on data attributes rather than specific resources, enabling more flexible
 * and comprehensive access control. ABAC policies in Unity Catalog support conditions on securable
 * properties, governance tags, and environment contexts. Callers must have the `MANAGE` privilege
 * on a securable to view, create, update, or delete ABAC policies.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PoliciesService {
  /**
   * Creates a new policy on a securable. The new policy applies to the securable and all its
   * descendants.
   */
  PolicyInfo createPolicy(CreatePolicyRequest createPolicyRequest);

  /** Delete an ABAC policy defined on a securable. */
  DeletePolicyResponse deletePolicy(DeletePolicyRequest deletePolicyRequest);

  /** Get the policy definition on a securable */
  PolicyInfo getPolicy(GetPolicyRequest getPolicyRequest);

  /**
   * List all policies defined on a securable. Optionally, the list can include inherited policies
   * defined on the securable's parent schema or catalog.
   *
   * <p>PAGINATION BEHAVIOR: The API is by default paginated, a page may contain zero results while
   * still providing a next_page_token. Clients must continue reading pages until next_page_token is
   * absent, which is the only indication that the end of results has been reached.
   */
  ListPoliciesResponse listPolicies(ListPoliciesRequest listPoliciesRequest);

  /** Update an ABAC policy on a securable. */
  PolicyInfo updatePolicy(UpdatePolicyRequest updatePolicyRequest);
}

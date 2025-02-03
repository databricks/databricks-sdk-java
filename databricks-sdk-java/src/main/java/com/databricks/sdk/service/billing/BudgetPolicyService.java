// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * A service serves REST API about Budget policies
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BudgetPolicyService {
  /**
   * Create a budget policy.
   *
   * <p>Creates a new policy.
   */
  BudgetPolicy create(CreateBudgetPolicyRequest createBudgetPolicyRequest);

  /**
   * Delete a budget policy.
   *
   * <p>Deletes a policy
   */
  void delete(DeleteBudgetPolicyRequest deleteBudgetPolicyRequest);

  /**
   * Get a budget policy.
   *
   * <p>Retrieves a policy by it's ID.
   */
  BudgetPolicy get(GetBudgetPolicyRequest getBudgetPolicyRequest);

  /**
   * List policies.
   *
   * <p>Lists all policies. Policies are returned in the alphabetically ascending order of their
   * names.
   */
  ListBudgetPoliciesResponse list(ListBudgetPoliciesRequest listBudgetPoliciesRequest);

  /**
   * Update a budget policy.
   *
   * <p>Updates a policy
   */
  BudgetPolicy update(UpdateBudgetPolicyRequest updateBudgetPolicyRequest);
}

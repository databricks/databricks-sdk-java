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
  /** Creates a new policy. */
  BudgetPolicy create(CreateBudgetPolicyRequest createBudgetPolicyRequest);

  /** Deletes a policy */
  void delete(DeleteBudgetPolicyRequest deleteBudgetPolicyRequest);

  /** Retrieves a policy by it's ID. */
  BudgetPolicy get(GetBudgetPolicyRequest getBudgetPolicyRequest);

  /**
   * Lists all policies. Policies are returned in the alphabetically ascending order of their names.
   */
  ListBudgetPoliciesResponse list(ListBudgetPoliciesRequest listBudgetPoliciesRequest);

  /** Updates a policy */
  BudgetPolicy update(UpdateBudgetPolicyRequest updateBudgetPolicyRequest);
}

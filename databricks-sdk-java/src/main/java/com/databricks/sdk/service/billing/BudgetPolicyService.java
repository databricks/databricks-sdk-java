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
  /** Creates a new usage policy. The creator is granted the manager role on the new policy. */
  BudgetPolicy create(CreateBudgetPolicyRequest createBudgetPolicyRequest);

  /** Deletes a usage policy. */
  void delete(DeleteBudgetPolicyRequest deleteBudgetPolicyRequest);

  /** Retrieves a usage policy by its ID. */
  BudgetPolicy get(GetBudgetPolicyRequest getBudgetPolicyRequest);

  /**
   * Lists the usage policies that the caller has permission to view. Policies are sorted by name in
   * ascending order unless `sort_spec` requests a different order.
   */
  ListBudgetPoliciesResponse list(ListBudgetPoliciesRequest listBudgetPoliciesRequest);

  /**
   * Updates a usage policy. Changes apply only to serverless usage that starts after the update,
   * not to workloads that are already running.
   */
  BudgetPolicy update(UpdateBudgetPolicyRequest updateBudgetPolicyRequest);
}

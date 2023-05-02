// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage budget configuration including notifications for exceeding a budget for a
 * period. They can also retrieve the status of each budget.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BudgetsService {
  /**
   * Create a new budget.
   *
   * <p>Creates a new budget in the specified account.
   */
  WrappedBudgetWithStatus create(WrappedBudget wrappedBudget);

  /**
   * Delete budget.
   *
   * <p>Deletes the budget specified by its UUID.
   */
  void delete(DeleteBudgetRequest deleteBudgetRequest);

  /**
   * Get budget and its status.
   *
   * <p>Gets the budget specified by its UUID, including noncumulative status for each day that the
   * budget is configured to include.
   */
  WrappedBudgetWithStatus get(GetBudgetRequest getBudgetRequest);

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account, including noncumulative status for each day
   * that the budget is configured to include.
   */
  BudgetList list();

  /**
   * Modify budget.
   *
   * <p>Modifies a budget in this account. Budget properties are completely overwritten.
   */
  void update(WrappedBudget wrappedBudget);
}

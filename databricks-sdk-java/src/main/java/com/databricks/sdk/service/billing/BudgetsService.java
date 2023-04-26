// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

/**
 * These APIs manage budget configuration including notifications for exceeding a budget for a
 * period. They can also retrieve the status of each budget.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface BudgetsService {
  /**
   * Create a new budget.
   *
   * <p>Creates a new budget in the specified account.
   *
   * @param wrappedBudget a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  WrappedBudgetWithStatus create(WrappedBudget wrappedBudget);

  /**
   * Delete budget.
   *
   * <p>Deletes the budget specified by its UUID.
   *
   * @param deleteBudgetRequest a {@link com.databricks.sdk.service.billing.DeleteBudgetRequest} object
   */
  void delete(DeleteBudgetRequest deleteBudgetRequest);

  /**
   * Get budget and its status.
   *
   * <p>Gets the budget specified by its UUID, including noncumulative status for each day that the
   * budget is configured to include.
   *
   * @param getBudgetRequest a {@link com.databricks.sdk.service.billing.GetBudgetRequest} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  WrappedBudgetWithStatus get(GetBudgetRequest getBudgetRequest);

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account, including noncumulative status for each day
   * that the budget is configured to include.
   *
   * @return a {@link com.databricks.sdk.service.billing.BudgetList} object
   */
  BudgetList list();

  /**
   * Modify budget.
   *
   * <p>Modifies a budget in this account. Budget properties are completely overwritten.
   *
   * @param wrappedBudget a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   */
  void update(WrappedBudget wrappedBudget);
}

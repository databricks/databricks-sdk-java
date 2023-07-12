// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage budget configuration including notifications for exceeding a budget for a
 * period. They can also retrieve the status of each budget.
 */
@Generated
public class BudgetsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BudgetsAPI.class);

  private final BudgetsService impl;

  /** Regular-use constructor */
  public BudgetsAPI(ApiClient apiClient) {
    impl = new BudgetsImpl(apiClient);
  }

  /** Constructor for mocks */
  public BudgetsAPI(BudgetsService mock) {
    impl = mock;
  }

  public WrappedBudgetWithStatus create(Budget budget) {
    return create(new WrappedBudget().setBudget(budget));
  }

  /**
   * Create a new budget.
   *
   * <p>Creates a new budget in the specified account.
   */
  public WrappedBudgetWithStatus create(WrappedBudget request) {
    return impl.create(request);
  }

  public void delete(String budgetId) {
    delete(new DeleteBudgetRequest().setBudgetId(budgetId));
  }

  /**
   * Delete budget.
   *
   * <p>Deletes the budget specified by its UUID.
   */
  public void delete(DeleteBudgetRequest request) {
    impl.delete(request);
  }

  public WrappedBudgetWithStatus get(String budgetId) {
    return get(new GetBudgetRequest().setBudgetId(budgetId));
  }

  /**
   * Get budget and its status.
   *
   * <p>Gets the budget specified by its UUID, including noncumulative status for each day that the
   * budget is configured to include.
   */
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    return impl.get(request);
  }

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account, including noncumulative status for each day
   * that the budget is configured to include.
   */
  public Iterable<BudgetWithStatus> list() {
    return impl.list().getBudgets();
  }

  public void update(Budget budget, String budgetId) {
    update(new WrappedBudget().setBudget(budget).setBudgetId(budgetId));
  }

  /**
   * Modify budget.
   *
   * <p>Modifies a budget in this account. Budget properties are completely overwritten.
   */
  public void update(WrappedBudget request) {
    impl.update(request);
  }

  public BudgetsService impl() {
    return impl;
  }
}

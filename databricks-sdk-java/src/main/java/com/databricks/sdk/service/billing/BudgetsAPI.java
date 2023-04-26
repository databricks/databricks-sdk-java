// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.client.ApiClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage budget configuration including notifications for exceeding a budget for a
 * period. They can also retrieve the status of each budget.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class BudgetsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(BudgetsAPI.class);

  private final BudgetsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public BudgetsAPI(ApiClient apiClient) {
    impl = new BudgetsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.billing.BudgetsService} object
   */
  public BudgetsAPI(BudgetsService mock) {
    impl = mock;
  }

  /**
   * <p>create.</p>
   *
   * @param budget a {@link com.databricks.sdk.service.billing.Budget} object
   * @param budgetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  public WrappedBudgetWithStatus create(Budget budget, String budgetId) {
    return create(new WrappedBudget().setBudget(budget).setBudgetId(budgetId));
  }

  /**
   * Create a new budget.
   *
   * <p>Creates a new budget in the specified account.
   *
   * @param request a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  public WrappedBudgetWithStatus create(WrappedBudget request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param budgetId a {@link java.lang.String} object
   */
  public void delete(String budgetId) {
    delete(new DeleteBudgetRequest().setBudgetId(budgetId));
  }

  /**
   * Delete budget.
   *
   * <p>Deletes the budget specified by its UUID.
   *
   * @param request a {@link com.databricks.sdk.service.billing.DeleteBudgetRequest} object
   */
  public void delete(DeleteBudgetRequest request) {
    impl.delete(request);
  }

  /**
   * <p>get.</p>
   *
   * @param budgetId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  public WrappedBudgetWithStatus get(String budgetId) {
    return get(new GetBudgetRequest().setBudgetId(budgetId));
  }

  /**
   * Get budget and its status.
   *
   * <p>Gets the budget specified by its UUID, including noncumulative status for each day that the
   * budget is configured to include.
   *
   * @param request a {@link com.databricks.sdk.service.billing.GetBudgetRequest} object
   * @return a {@link com.databricks.sdk.service.billing.WrappedBudgetWithStatus} object
   */
  public WrappedBudgetWithStatus get(GetBudgetRequest request) {
    return impl.get(request);
  }

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account, including noncumulative status for each day
   * that the budget is configured to include.
   *
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<BudgetWithStatus> list() {
    return impl.list().getBudgets();
  }

  /**
   * <p>update.</p>
   *
   * @param budget a {@link com.databricks.sdk.service.billing.Budget} object
   * @param budgetId a {@link java.lang.String} object
   */
  public void update(Budget budget, String budgetId) {
    update(new WrappedBudget().setBudget(budget).setBudgetId(budgetId));
  }

  /**
   * Modify budget.
   *
   * <p>Modifies a budget in this account. Budget properties are completely overwritten.
   *
   * @param request a {@link com.databricks.sdk.service.billing.WrappedBudget} object
   */
  public void update(WrappedBudget request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.BudgetsService} object
   */
  public BudgetsService impl() {
    return impl;
  }
}

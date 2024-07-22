// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * These APIs manage budget configurations for this account. Budgets enable you to monitor usage
 * across your account. You can set up budgets to either track account-wide spending, or apply
 * filters to track the spending of specific teams, projects, or workspaces.
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

  public CreateBudgetConfigurationResponse create(CreateBudgetConfigurationBudget budget) {
    return create(new CreateBudgetConfigurationRequest().setBudget(budget));
  }

  /**
   * Create new budget.
   *
   * <p>Create a new budget configuration for an account. For full details, see
   * https://docs.databricks.com/en/admin/account-settings/budgets.html.
   */
  public CreateBudgetConfigurationResponse create(CreateBudgetConfigurationRequest request) {
    return impl.create(request);
  }

  public void delete(String budgetId) {
    delete(new DeleteBudgetConfigurationRequest().setBudgetId(budgetId));
  }

  /**
   * Delete budget.
   *
   * <p>Deletes a budget configuration for an account. Both account and budget configuration are
   * specified by ID. This cannot be undone.
   */
  public void delete(DeleteBudgetConfigurationRequest request) {
    impl.delete(request);
  }

  public GetBudgetConfigurationResponse get(String budgetId) {
    return get(new GetBudgetConfigurationRequest().setBudgetId(budgetId));
  }

  /**
   * Get budget.
   *
   * <p>Gets a budget configuration for an account. Both account and budget configuration are
   * specified by ID.
   */
  public GetBudgetConfigurationResponse get(GetBudgetConfigurationRequest request) {
    return impl.get(request);
  }

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account.
   */
  public Iterable<BudgetConfiguration> list(ListBudgetConfigurationsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListBudgetConfigurationsResponse::getBudgets,
        response -> {
          String token = response.getNextPageToken();
          if (token == null) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  public UpdateBudgetConfigurationResponse update(
      String budgetId, UpdateBudgetConfigurationBudget budget) {
    return update(new UpdateBudgetConfigurationRequest().setBudgetId(budgetId).setBudget(budget));
  }

  /**
   * Modify budget.
   *
   * <p>Updates a budget configuration for an account. Both account and budget configuration are
   * specified by ID.
   */
  public UpdateBudgetConfigurationResponse update(UpdateBudgetConfigurationRequest request) {
    return impl.update(request);
  }

  public BudgetsService impl() {
    return impl;
  }
}

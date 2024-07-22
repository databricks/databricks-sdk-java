// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;

/**
 * These APIs manage budget configurations for this account. Budgets enable you to monitor usage
 * across your account. You can set up budgets to either track account-wide spending, or apply
 * filters to track the spending of specific teams, projects, or workspaces.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface BudgetsService {
  /**
   * Create new budget.
   *
   * <p>Create a new budget configuration for an account. For full details, see
   * https://docs.databricks.com/en/admin/account-settings/budgets.html.
   */
  CreateBudgetConfigurationResponse create(
      CreateBudgetConfigurationRequest createBudgetConfigurationRequest);

  /**
   * Delete budget.
   *
   * <p>Deletes a budget configuration for an account. Both account and budget configuration are
   * specified by ID. This cannot be undone.
   */
  void delete(DeleteBudgetConfigurationRequest deleteBudgetConfigurationRequest);

  /**
   * Get budget.
   *
   * <p>Gets a budget configuration for an account. Both account and budget configuration are
   * specified by ID.
   */
  GetBudgetConfigurationResponse get(GetBudgetConfigurationRequest getBudgetConfigurationRequest);

  /**
   * Get all budgets.
   *
   * <p>Gets all budgets associated with this account.
   */
  ListBudgetConfigurationsResponse list(
      ListBudgetConfigurationsRequest listBudgetConfigurationsRequest);

  /**
   * Modify budget.
   *
   * <p>Updates a budget configuration for an account. Both account and budget configuration are
   * specified by ID.
   */
  UpdateBudgetConfigurationResponse update(
      UpdateBudgetConfigurationRequest updateBudgetConfigurationRequest);
}

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
   * Create a new budget configuration for an account. For full details, see
   * https://docs.databricks.com/en/admin/account-settings/budgets.html.
   */
  CreateBudgetConfigurationResponse create(
      CreateBudgetConfigurationRequest createBudgetConfigurationRequest);

  /**
   * Deletes a budget configuration for an account. Both account and budget configuration are
   * specified by ID. This cannot be undone.
   */
  void delete(DeleteBudgetConfigurationRequest deleteBudgetConfigurationRequest);

  /**
   * Gets a budget configuration for an account. Both account and budget configuration are specified
   * by ID.
   */
  GetBudgetConfigurationResponse get(GetBudgetConfigurationRequest getBudgetConfigurationRequest);

  /**
   * Get the calling user's live spend against the blocking thresholds of a single Unity Gateway
   * budget. Any account user can call this for their own spend. Spend is reported in USD at list
   * price and is near-real-time, so it may differ slightly from billing data. Returns NOT_FOUND if
   * the budget doesn't exist or has no blocking thresholds.
   */
  BudgetSpendStatus getBudgetSpendStatus(GetBudgetSpendStatusRequest getBudgetSpendStatusRequest);

  /** Gets all budgets associated with this account. */
  ListBudgetConfigurationsResponse list(
      ListBudgetConfigurationsRequest listBudgetConfigurationsRequest);

  /**
   * List the calling user's live spend against the blocking thresholds across the account's Unity
   * Gateway budgets. Any account user can call this for their own spend. Spend is reported in USD
   * at list price and is near-real-time, so it may differ slightly from billing data. By default,
   * returns every budget in the account that has a blocking threshold. Use `filter` to narrow
   * results by workspace.
   */
  ListBudgetSpendStatusesResponse listBudgetSpendStatuses(
      ListBudgetSpendStatusesRequest listBudgetSpendStatusesRequest);

  /**
   * Updates a budget configuration for an account. Both account and budget configuration are
   * specified by ID.
   */
  UpdateBudgetConfigurationResponse update(
      UpdateBudgetConfigurationRequest updateBudgetConfigurationRequest);
}

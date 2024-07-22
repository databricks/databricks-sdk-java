// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateBudgetConfigurationBudget {
  /** Databricks account ID. */
  @JsonProperty("account_id")
  private String accountId;

  /**
   * Alerts to configure when this budget is in a triggered state. Budgets must have exactly one
   * alert configuration.
   */
  @JsonProperty("alert_configurations")
  private Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations;

  /** Human-readable name of budget configuration. Max Length: 128 */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Configured filters for this budget. These are applied to your account's usage to limit the
   * scope of what is considered for this budget. Leave empty to include all usage for this account.
   * All provided filters must be matched for usage to be included.
   */
  @JsonProperty("filter")
  private BudgetConfigurationFilter filter;

  public CreateBudgetConfigurationBudget setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CreateBudgetConfigurationBudget setAlertConfigurations(
      Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<CreateBudgetConfigurationBudgetAlertConfigurations> getAlertConfigurations() {
    return alertConfigurations;
  }

  public CreateBudgetConfigurationBudget setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateBudgetConfigurationBudget setFilter(BudgetConfigurationFilter filter) {
    this.filter = filter;
    return this;
  }

  public BudgetConfigurationFilter getFilter() {
    return filter;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetConfigurationBudget that = (CreateBudgetConfigurationBudget) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(alertConfigurations, that.alertConfigurations)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filter, that.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, alertConfigurations, displayName, filter);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudget.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("displayName", displayName)
        .add("filter", filter)
        .toString();
  }
}

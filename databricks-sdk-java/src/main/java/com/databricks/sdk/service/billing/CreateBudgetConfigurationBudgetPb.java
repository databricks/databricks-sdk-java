// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CreateBudgetConfigurationBudgetPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("alert_configurations")
  private Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("filter")
  private BudgetConfigurationFilter filter;

  public CreateBudgetConfigurationBudgetPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public CreateBudgetConfigurationBudgetPb setAlertConfigurations(
      Collection<CreateBudgetConfigurationBudgetAlertConfigurations> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<CreateBudgetConfigurationBudgetAlertConfigurations> getAlertConfigurations() {
    return alertConfigurations;
  }

  public CreateBudgetConfigurationBudgetPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateBudgetConfigurationBudgetPb setFilter(BudgetConfigurationFilter filter) {
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
    CreateBudgetConfigurationBudgetPb that = (CreateBudgetConfigurationBudgetPb) o;
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
    return new ToStringer(CreateBudgetConfigurationBudgetPb.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("displayName", displayName)
        .add("filter", filter)
        .toString();
  }
}

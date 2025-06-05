// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class BudgetConfigurationPb {
  @JsonProperty("account_id")
  private String accountId;

  @JsonProperty("alert_configurations")
  private Collection<AlertConfiguration> alertConfigurations;

  @JsonProperty("budget_configuration_id")
  private String budgetConfigurationId;

  @JsonProperty("create_time")
  private Long createTime;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("filter")
  private BudgetConfigurationFilter filter;

  @JsonProperty("update_time")
  private Long updateTime;

  public BudgetConfigurationPb setAccountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  public String getAccountId() {
    return accountId;
  }

  public BudgetConfigurationPb setAlertConfigurations(
      Collection<AlertConfiguration> alertConfigurations) {
    this.alertConfigurations = alertConfigurations;
    return this;
  }

  public Collection<AlertConfiguration> getAlertConfigurations() {
    return alertConfigurations;
  }

  public BudgetConfigurationPb setBudgetConfigurationId(String budgetConfigurationId) {
    this.budgetConfigurationId = budgetConfigurationId;
    return this;
  }

  public String getBudgetConfigurationId() {
    return budgetConfigurationId;
  }

  public BudgetConfigurationPb setCreateTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

  public Long getCreateTime() {
    return createTime;
  }

  public BudgetConfigurationPb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public BudgetConfigurationPb setFilter(BudgetConfigurationFilter filter) {
    this.filter = filter;
    return this;
  }

  public BudgetConfigurationFilter getFilter() {
    return filter;
  }

  public BudgetConfigurationPb setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Long getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetConfigurationPb that = (BudgetConfigurationPb) o;
    return Objects.equals(accountId, that.accountId)
        && Objects.equals(alertConfigurations, that.alertConfigurations)
        && Objects.equals(budgetConfigurationId, that.budgetConfigurationId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(filter, that.filter)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        alertConfigurations,
        budgetConfigurationId,
        createTime,
        displayName,
        filter,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetConfigurationPb.class)
        .add("accountId", accountId)
        .add("alertConfigurations", alertConfigurations)
        .add("budgetConfigurationId", budgetConfigurationId)
        .add("createTime", createTime)
        .add("displayName", displayName)
        .add("filter", filter)
        .add("updateTime", updateTime)
        .toString();
  }
}

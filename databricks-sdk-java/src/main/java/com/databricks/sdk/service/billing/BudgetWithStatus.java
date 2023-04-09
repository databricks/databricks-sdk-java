// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Budget configuration with daily status. */
public class BudgetWithStatus {
  /** */
  @JsonProperty("alerts")
  private Collection<BudgetAlert> alerts;

  /** */
  @JsonProperty("budget_id")
  private String budgetId;

  /** */
  @JsonProperty("creation_time")
  private String creationTime;

  /** Optional end date of the budget. */
  @JsonProperty("end_date")
  private String endDate;

  /**
   * SQL-like filter expression with workspaceId, SKU and tag. Usage in your account that matches
   * this expression will be counted in this budget.
   *
   * <p>Supported properties on left-hand side of comparison: * `workspaceId` - the ID of the
   * workspace * `sku` - SKU of the cluster, e.g. `STANDARD_ALL_PURPOSE_COMPUTE` * `tag.tagName`,
   * `tag.'tag name'` - tag of the cluster
   *
   * <p>Supported comparison operators: * `=` - equal * `!=` - not equal
   *
   * <p>Supported logical operators: `AND`, `OR`.
   *
   * <p>Examples: * `workspaceId=123 OR (sku='STANDARD_ALL_PURPOSE_COMPUTE' AND tag.'my tag'='my
   * value')` * `workspaceId!=456` * `sku='STANDARD_ALL_PURPOSE_COMPUTE' OR
   * sku='PREMIUM_ALL_PURPOSE_COMPUTE'` * `tag.name1='value1' AND tag.name2='value2'`
   */
  @JsonProperty("filter")
  private String filter;

  /** Human-readable name of the budget. */
  @JsonProperty("name")
  private String name;

  /**
   * Period length in years, months, weeks and/or days. Examples: `1 month`, `30 days`, `1 year, 2
   * months, 1 week, 2 days`
   */
  @JsonProperty("period")
  private String period;

  /** Start date of the budget period calculation. */
  @JsonProperty("start_date")
  private String startDate;

  /** Amount used in the budget for each day (noncumulative). */
  @JsonProperty("status_daily")
  private Collection<BudgetWithStatusStatusDailyItem> statusDaily;

  /** Target amount of the budget per period in USD. */
  @JsonProperty("target_amount")
  private String targetAmount;

  /** */
  @JsonProperty("update_time")
  private String updateTime;

  public BudgetWithStatus setAlerts(Collection<BudgetAlert> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Collection<BudgetAlert> getAlerts() {
    return alerts;
  }

  public BudgetWithStatus setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  public String getBudgetId() {
    return budgetId;
  }

  public BudgetWithStatus setCreationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  public String getCreationTime() {
    return creationTime;
  }

  public BudgetWithStatus setEndDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  public String getEndDate() {
    return endDate;
  }

  public BudgetWithStatus setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public BudgetWithStatus setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public BudgetWithStatus setPeriod(String period) {
    this.period = period;
    return this;
  }

  public String getPeriod() {
    return period;
  }

  public BudgetWithStatus setStartDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  public String getStartDate() {
    return startDate;
  }

  public BudgetWithStatus setStatusDaily(Collection<BudgetWithStatusStatusDailyItem> statusDaily) {
    this.statusDaily = statusDaily;
    return this;
  }

  public Collection<BudgetWithStatusStatusDailyItem> getStatusDaily() {
    return statusDaily;
  }

  public BudgetWithStatus setTargetAmount(String targetAmount) {
    this.targetAmount = targetAmount;
    return this;
  }

  public String getTargetAmount() {
    return targetAmount;
  }

  public BudgetWithStatus setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BudgetWithStatus that = (BudgetWithStatus) o;
    return Objects.equals(alerts, that.alerts)
        && Objects.equals(budgetId, that.budgetId)
        && Objects.equals(creationTime, that.creationTime)
        && Objects.equals(endDate, that.endDate)
        && Objects.equals(filter, that.filter)
        && Objects.equals(name, that.name)
        && Objects.equals(period, that.period)
        && Objects.equals(startDate, that.startDate)
        && Objects.equals(statusDaily, that.statusDaily)
        && Objects.equals(targetAmount, that.targetAmount)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        alerts,
        budgetId,
        creationTime,
        endDate,
        filter,
        name,
        period,
        startDate,
        statusDaily,
        targetAmount,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(BudgetWithStatus.class)
        .add("alerts", alerts)
        .add("budgetId", budgetId)
        .add("creationTime", creationTime)
        .add("endDate", endDate)
        .add("filter", filter)
        .add("name", name)
        .add("period", period)
        .add("startDate", startDate)
        .add("statusDaily", statusDaily)
        .add("targetAmount", targetAmount)
        .add("updateTime", updateTime)
        .toString();
  }
}

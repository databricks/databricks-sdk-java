// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateBudgetConfigurationBudgetAlertConfigurations {
  /**
   * Configured actions for this alert. These define what happens when an alert enters a triggered
   * state.
   */
  @JsonProperty("action_configurations")
  private Collection<CreateBudgetConfigurationBudgetActionConfigurations> actionConfigurations;

  /**
   * Per-principal threshold overrides for this alert. Only applies to per-user alerts (`scope_type`
   * = `ALERT_CONFIGURATION_SCOPE_TYPE_PER_USER`); ignored for shared alerts.
   */
  @JsonProperty("principal_overrides")
  private Collection<PrincipalOverride> principalOverrides;

  /**
   * The threshold for the budget alert to determine if it is in a triggered state. The number is
   * evaluated based on `quantity_type`.
   */
  @JsonProperty("quantity_threshold")
  private String quantityThreshold;

  /**
   * The way to calculate cost for this budget alert. This is what `quantity_threshold` is measured
   * in.
   */
  @JsonProperty("quantity_type")
  private AlertConfigurationQuantityType quantityType;

  /**
   * How the alert threshold is evaluated. Determines whether spend is tracked in aggregate or per
   * individual user.
   */
  @JsonProperty("scope_type")
  private AlertConfigurationScopeType scopeType;

  /** The time window of usage data for the budget. */
  @JsonProperty("time_period")
  private AlertConfigurationTimePeriod timePeriod;

  /** The evaluation method to determine when this budget alert is in a triggered state. */
  @JsonProperty("trigger_type")
  private AlertConfigurationTriggerType triggerType;

  public CreateBudgetConfigurationBudgetAlertConfigurations setActionConfigurations(
      Collection<CreateBudgetConfigurationBudgetActionConfigurations> actionConfigurations) {
    this.actionConfigurations = actionConfigurations;
    return this;
  }

  public Collection<CreateBudgetConfigurationBudgetActionConfigurations> getActionConfigurations() {
    return actionConfigurations;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setPrincipalOverrides(
      Collection<PrincipalOverride> principalOverrides) {
    this.principalOverrides = principalOverrides;
    return this;
  }

  public Collection<PrincipalOverride> getPrincipalOverrides() {
    return principalOverrides;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setQuantityThreshold(
      String quantityThreshold) {
    this.quantityThreshold = quantityThreshold;
    return this;
  }

  public String getQuantityThreshold() {
    return quantityThreshold;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setQuantityType(
      AlertConfigurationQuantityType quantityType) {
    this.quantityType = quantityType;
    return this;
  }

  public AlertConfigurationQuantityType getQuantityType() {
    return quantityType;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setScopeType(
      AlertConfigurationScopeType scopeType) {
    this.scopeType = scopeType;
    return this;
  }

  public AlertConfigurationScopeType getScopeType() {
    return scopeType;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setTimePeriod(
      AlertConfigurationTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  public AlertConfigurationTimePeriod getTimePeriod() {
    return timePeriod;
  }

  public CreateBudgetConfigurationBudgetAlertConfigurations setTriggerType(
      AlertConfigurationTriggerType triggerType) {
    this.triggerType = triggerType;
    return this;
  }

  public AlertConfigurationTriggerType getTriggerType() {
    return triggerType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetConfigurationBudgetAlertConfigurations that =
        (CreateBudgetConfigurationBudgetAlertConfigurations) o;
    return Objects.equals(actionConfigurations, that.actionConfigurations)
        && Objects.equals(principalOverrides, that.principalOverrides)
        && Objects.equals(quantityThreshold, that.quantityThreshold)
        && Objects.equals(quantityType, that.quantityType)
        && Objects.equals(scopeType, that.scopeType)
        && Objects.equals(timePeriod, that.timePeriod)
        && Objects.equals(triggerType, that.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionConfigurations,
        principalOverrides,
        quantityThreshold,
        quantityType,
        scopeType,
        timePeriod,
        triggerType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudgetAlertConfigurations.class)
        .add("actionConfigurations", actionConfigurations)
        .add("principalOverrides", principalOverrides)
        .add("quantityThreshold", quantityThreshold)
        .add("quantityType", quantityType)
        .add("scopeType", scopeType)
        .add("timePeriod", timePeriod)
        .add("triggerType", triggerType)
        .toString();
  }
}

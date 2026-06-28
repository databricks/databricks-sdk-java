// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AlertConfiguration {
  /**
   * Configured actions for this alert. These define what happens when an alert enters a triggered
   * state.
   */
  @JsonProperty("action_configurations")
  private Collection<ActionConfiguration> actionConfigurations;

  /** Databricks alert configuration ID. */
  @JsonProperty("alert_configuration_id")
  private String alertConfigurationId;

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

  /** The time window of usage data for the budget. */
  @JsonProperty("time_period")
  private AlertConfigurationTimePeriod timePeriod;

  /** The evaluation method to determine when this budget alert is in a triggered state. */
  @JsonProperty("trigger_type")
  private AlertConfigurationTriggerType triggerType;

  public AlertConfiguration setActionConfigurations(
      Collection<ActionConfiguration> actionConfigurations) {
    this.actionConfigurations = actionConfigurations;
    return this;
  }

  public Collection<ActionConfiguration> getActionConfigurations() {
    return actionConfigurations;
  }

  public AlertConfiguration setAlertConfigurationId(String alertConfigurationId) {
    this.alertConfigurationId = alertConfigurationId;
    return this;
  }

  public String getAlertConfigurationId() {
    return alertConfigurationId;
  }

  public AlertConfiguration setQuantityThreshold(String quantityThreshold) {
    this.quantityThreshold = quantityThreshold;
    return this;
  }

  public String getQuantityThreshold() {
    return quantityThreshold;
  }

  public AlertConfiguration setQuantityType(AlertConfigurationQuantityType quantityType) {
    this.quantityType = quantityType;
    return this;
  }

  public AlertConfigurationQuantityType getQuantityType() {
    return quantityType;
  }

  public AlertConfiguration setTimePeriod(AlertConfigurationTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  public AlertConfigurationTimePeriod getTimePeriod() {
    return timePeriod;
  }

  public AlertConfiguration setTriggerType(AlertConfigurationTriggerType triggerType) {
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
    AlertConfiguration that = (AlertConfiguration) o;
    return Objects.equals(actionConfigurations, that.actionConfigurations)
        && Objects.equals(alertConfigurationId, that.alertConfigurationId)
        && Objects.equals(quantityThreshold, that.quantityThreshold)
        && Objects.equals(quantityType, that.quantityType)
        && Objects.equals(timePeriod, that.timePeriod)
        && Objects.equals(triggerType, that.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionConfigurations,
        alertConfigurationId,
        quantityThreshold,
        quantityType,
        timePeriod,
        triggerType);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConfiguration.class)
        .add("actionConfigurations", actionConfigurations)
        .add("alertConfigurationId", alertConfigurationId)
        .add("quantityThreshold", quantityThreshold)
        .add("quantityType", quantityType)
        .add("timePeriod", timePeriod)
        .add("triggerType", triggerType)
        .toString();
  }
}

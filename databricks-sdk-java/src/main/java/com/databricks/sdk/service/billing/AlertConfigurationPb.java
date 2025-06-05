// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class AlertConfigurationPb {
  @JsonProperty("action_configurations")
  private Collection<ActionConfiguration> actionConfigurations;

  @JsonProperty("alert_configuration_id")
  private String alertConfigurationId;

  @JsonProperty("quantity_threshold")
  private String quantityThreshold;

  @JsonProperty("quantity_type")
  private AlertConfigurationQuantityType quantityType;

  @JsonProperty("time_period")
  private AlertConfigurationTimePeriod timePeriod;

  @JsonProperty("trigger_type")
  private AlertConfigurationTriggerType triggerType;

  public AlertConfigurationPb setActionConfigurations(
      Collection<ActionConfiguration> actionConfigurations) {
    this.actionConfigurations = actionConfigurations;
    return this;
  }

  public Collection<ActionConfiguration> getActionConfigurations() {
    return actionConfigurations;
  }

  public AlertConfigurationPb setAlertConfigurationId(String alertConfigurationId) {
    this.alertConfigurationId = alertConfigurationId;
    return this;
  }

  public String getAlertConfigurationId() {
    return alertConfigurationId;
  }

  public AlertConfigurationPb setQuantityThreshold(String quantityThreshold) {
    this.quantityThreshold = quantityThreshold;
    return this;
  }

  public String getQuantityThreshold() {
    return quantityThreshold;
  }

  public AlertConfigurationPb setQuantityType(AlertConfigurationQuantityType quantityType) {
    this.quantityType = quantityType;
    return this;
  }

  public AlertConfigurationQuantityType getQuantityType() {
    return quantityType;
  }

  public AlertConfigurationPb setTimePeriod(AlertConfigurationTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  public AlertConfigurationTimePeriod getTimePeriod() {
    return timePeriod;
  }

  public AlertConfigurationPb setTriggerType(AlertConfigurationTriggerType triggerType) {
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
    AlertConfigurationPb that = (AlertConfigurationPb) o;
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
    return new ToStringer(AlertConfigurationPb.class)
        .add("actionConfigurations", actionConfigurations)
        .add("alertConfigurationId", alertConfigurationId)
        .add("quantityThreshold", quantityThreshold)
        .add("quantityType", quantityType)
        .add("timePeriod", timePeriod)
        .add("triggerType", triggerType)
        .toString();
  }
}

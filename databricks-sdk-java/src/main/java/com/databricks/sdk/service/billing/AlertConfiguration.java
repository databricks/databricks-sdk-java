// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AlertConfiguration.AlertConfigurationSerializer.class)
@JsonDeserialize(using = AlertConfiguration.AlertConfigurationDeserializer.class)
public class AlertConfiguration {
  /**
   * Configured actions for this alert. These define what happens when an alert enters a triggered
   * state.
   */
  private Collection<ActionConfiguration> actionConfigurations;

  /** Databricks alert configuration ID. */
  private String alertConfigurationId;

  /**
   * The threshold for the budget alert to determine if it is in a triggered state. The number is
   * evaluated based on `quantity_type`.
   */
  private String quantityThreshold;

  /**
   * The way to calculate cost for this budget alert. This is what `quantity_threshold` is measured
   * in.
   */
  private AlertConfigurationQuantityType quantityType;

  /** The time window of usage data for the budget. */
  private AlertConfigurationTimePeriod timePeriod;

  /** The evaluation method to determine when this budget alert is in a triggered state. */
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

  AlertConfigurationPb toPb() {
    AlertConfigurationPb pb = new AlertConfigurationPb();
    pb.setActionConfigurations(actionConfigurations);
    pb.setAlertConfigurationId(alertConfigurationId);
    pb.setQuantityThreshold(quantityThreshold);
    pb.setQuantityType(quantityType);
    pb.setTimePeriod(timePeriod);
    pb.setTriggerType(triggerType);

    return pb;
  }

  static AlertConfiguration fromPb(AlertConfigurationPb pb) {
    AlertConfiguration model = new AlertConfiguration();
    model.setActionConfigurations(pb.getActionConfigurations());
    model.setAlertConfigurationId(pb.getAlertConfigurationId());
    model.setQuantityThreshold(pb.getQuantityThreshold());
    model.setQuantityType(pb.getQuantityType());
    model.setTimePeriod(pb.getTimePeriod());
    model.setTriggerType(pb.getTriggerType());

    return model;
  }

  public static class AlertConfigurationSerializer extends JsonSerializer<AlertConfiguration> {
    @Override
    public void serialize(AlertConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertConfigurationDeserializer extends JsonDeserializer<AlertConfiguration> {
    @Override
    public AlertConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertConfigurationPb pb = mapper.readValue(p, AlertConfigurationPb.class);
      return AlertConfiguration.fromPb(pb);
    }
  }
}

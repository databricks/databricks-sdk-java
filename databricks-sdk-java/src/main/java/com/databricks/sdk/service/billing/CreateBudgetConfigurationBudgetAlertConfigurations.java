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
@JsonSerialize(
    using =
        CreateBudgetConfigurationBudgetAlertConfigurations
            .CreateBudgetConfigurationBudgetAlertConfigurationsSerializer.class)
@JsonDeserialize(
    using =
        CreateBudgetConfigurationBudgetAlertConfigurations
            .CreateBudgetConfigurationBudgetAlertConfigurationsDeserializer.class)
public class CreateBudgetConfigurationBudgetAlertConfigurations {
  /**
   * Configured actions for this alert. These define what happens when an alert enters a triggered
   * state.
   */
  private Collection<CreateBudgetConfigurationBudgetActionConfigurations> actionConfigurations;

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

  public CreateBudgetConfigurationBudgetAlertConfigurations setActionConfigurations(
      Collection<CreateBudgetConfigurationBudgetActionConfigurations> actionConfigurations) {
    this.actionConfigurations = actionConfigurations;
    return this;
  }

  public Collection<CreateBudgetConfigurationBudgetActionConfigurations> getActionConfigurations() {
    return actionConfigurations;
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
        && Objects.equals(quantityThreshold, that.quantityThreshold)
        && Objects.equals(quantityType, that.quantityType)
        && Objects.equals(timePeriod, that.timePeriod)
        && Objects.equals(triggerType, that.triggerType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionConfigurations, quantityThreshold, quantityType, timePeriod, triggerType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationBudgetAlertConfigurations.class)
        .add("actionConfigurations", actionConfigurations)
        .add("quantityThreshold", quantityThreshold)
        .add("quantityType", quantityType)
        .add("timePeriod", timePeriod)
        .add("triggerType", triggerType)
        .toString();
  }

  CreateBudgetConfigurationBudgetAlertConfigurationsPb toPb() {
    CreateBudgetConfigurationBudgetAlertConfigurationsPb pb =
        new CreateBudgetConfigurationBudgetAlertConfigurationsPb();
    pb.setActionConfigurations(actionConfigurations);
    pb.setQuantityThreshold(quantityThreshold);
    pb.setQuantityType(quantityType);
    pb.setTimePeriod(timePeriod);
    pb.setTriggerType(triggerType);

    return pb;
  }

  static CreateBudgetConfigurationBudgetAlertConfigurations fromPb(
      CreateBudgetConfigurationBudgetAlertConfigurationsPb pb) {
    CreateBudgetConfigurationBudgetAlertConfigurations model =
        new CreateBudgetConfigurationBudgetAlertConfigurations();
    model.setActionConfigurations(pb.getActionConfigurations());
    model.setQuantityThreshold(pb.getQuantityThreshold());
    model.setQuantityType(pb.getQuantityType());
    model.setTimePeriod(pb.getTimePeriod());
    model.setTriggerType(pb.getTriggerType());

    return model;
  }

  public static class CreateBudgetConfigurationBudgetAlertConfigurationsSerializer
      extends JsonSerializer<CreateBudgetConfigurationBudgetAlertConfigurations> {
    @Override
    public void serialize(
        CreateBudgetConfigurationBudgetAlertConfigurations value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      CreateBudgetConfigurationBudgetAlertConfigurationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetConfigurationBudgetAlertConfigurationsDeserializer
      extends JsonDeserializer<CreateBudgetConfigurationBudgetAlertConfigurations> {
    @Override
    public CreateBudgetConfigurationBudgetAlertConfigurations deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetConfigurationBudgetAlertConfigurationsPb pb =
          mapper.readValue(p, CreateBudgetConfigurationBudgetAlertConfigurationsPb.class);
      return CreateBudgetConfigurationBudgetAlertConfigurations.fromPb(pb);
    }
  }
}

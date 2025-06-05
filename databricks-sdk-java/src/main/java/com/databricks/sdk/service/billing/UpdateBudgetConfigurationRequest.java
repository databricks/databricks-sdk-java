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
import java.util.Objects;

@Generated
@JsonSerialize(
    using = UpdateBudgetConfigurationRequest.UpdateBudgetConfigurationRequestSerializer.class)
@JsonDeserialize(
    using = UpdateBudgetConfigurationRequest.UpdateBudgetConfigurationRequestDeserializer.class)
public class UpdateBudgetConfigurationRequest {
  /** The updated budget. This will overwrite the budget specified by the budget ID. */
  private UpdateBudgetConfigurationBudget budget;

  /** The Databricks budget configuration ID. */
  private String budgetId;

  public UpdateBudgetConfigurationRequest setBudget(UpdateBudgetConfigurationBudget budget) {
    this.budget = budget;
    return this;
  }

  public UpdateBudgetConfigurationBudget getBudget() {
    return budget;
  }

  public UpdateBudgetConfigurationRequest setBudgetId(String budgetId) {
    this.budgetId = budgetId;
    return this;
  }

  public String getBudgetId() {
    return budgetId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateBudgetConfigurationRequest that = (UpdateBudgetConfigurationRequest) o;
    return Objects.equals(budget, that.budget) && Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBudgetConfigurationRequest.class)
        .add("budget", budget)
        .add("budgetId", budgetId)
        .toString();
  }

  UpdateBudgetConfigurationRequestPb toPb() {
    UpdateBudgetConfigurationRequestPb pb = new UpdateBudgetConfigurationRequestPb();
    pb.setBudget(budget);
    pb.setBudgetId(budgetId);

    return pb;
  }

  static UpdateBudgetConfigurationRequest fromPb(UpdateBudgetConfigurationRequestPb pb) {
    UpdateBudgetConfigurationRequest model = new UpdateBudgetConfigurationRequest();
    model.setBudget(pb.getBudget());
    model.setBudgetId(pb.getBudgetId());

    return model;
  }

  public static class UpdateBudgetConfigurationRequestSerializer
      extends JsonSerializer<UpdateBudgetConfigurationRequest> {
    @Override
    public void serialize(
        UpdateBudgetConfigurationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateBudgetConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateBudgetConfigurationRequestDeserializer
      extends JsonDeserializer<UpdateBudgetConfigurationRequest> {
    @Override
    public UpdateBudgetConfigurationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateBudgetConfigurationRequestPb pb =
          mapper.readValue(p, UpdateBudgetConfigurationRequestPb.class);
      return UpdateBudgetConfigurationRequest.fromPb(pb);
    }
  }
}

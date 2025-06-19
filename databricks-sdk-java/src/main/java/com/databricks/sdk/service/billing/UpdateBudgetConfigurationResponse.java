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
    using = UpdateBudgetConfigurationResponse.UpdateBudgetConfigurationResponseSerializer.class)
@JsonDeserialize(
    using = UpdateBudgetConfigurationResponse.UpdateBudgetConfigurationResponseDeserializer.class)
public class UpdateBudgetConfigurationResponse {
  /** The updated budget. */
  private BudgetConfiguration budget;

  public UpdateBudgetConfigurationResponse setBudget(BudgetConfiguration budget) {
    this.budget = budget;
    return this;
  }

  public BudgetConfiguration getBudget() {
    return budget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateBudgetConfigurationResponse that = (UpdateBudgetConfigurationResponse) o;
    return Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateBudgetConfigurationResponse.class).add("budget", budget).toString();
  }

  UpdateBudgetConfigurationResponsePb toPb() {
    UpdateBudgetConfigurationResponsePb pb = new UpdateBudgetConfigurationResponsePb();
    pb.setBudget(budget);

    return pb;
  }

  static UpdateBudgetConfigurationResponse fromPb(UpdateBudgetConfigurationResponsePb pb) {
    UpdateBudgetConfigurationResponse model = new UpdateBudgetConfigurationResponse();
    model.setBudget(pb.getBudget());

    return model;
  }

  public static class UpdateBudgetConfigurationResponseSerializer
      extends JsonSerializer<UpdateBudgetConfigurationResponse> {
    @Override
    public void serialize(
        UpdateBudgetConfigurationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateBudgetConfigurationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateBudgetConfigurationResponseDeserializer
      extends JsonDeserializer<UpdateBudgetConfigurationResponse> {
    @Override
    public UpdateBudgetConfigurationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateBudgetConfigurationResponsePb pb =
          mapper.readValue(p, UpdateBudgetConfigurationResponsePb.class);
      return UpdateBudgetConfigurationResponse.fromPb(pb);
    }
  }
}

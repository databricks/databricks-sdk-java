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
    using = CreateBudgetConfigurationRequest.CreateBudgetConfigurationRequestSerializer.class)
@JsonDeserialize(
    using = CreateBudgetConfigurationRequest.CreateBudgetConfigurationRequestDeserializer.class)
public class CreateBudgetConfigurationRequest {
  /** Properties of the new budget configuration. */
  private CreateBudgetConfigurationBudget budget;

  public CreateBudgetConfigurationRequest setBudget(CreateBudgetConfigurationBudget budget) {
    this.budget = budget;
    return this;
  }

  public CreateBudgetConfigurationBudget getBudget() {
    return budget;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateBudgetConfigurationRequest that = (CreateBudgetConfigurationRequest) o;
    return Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationRequest.class).add("budget", budget).toString();
  }

  CreateBudgetConfigurationRequestPb toPb() {
    CreateBudgetConfigurationRequestPb pb = new CreateBudgetConfigurationRequestPb();
    pb.setBudget(budget);

    return pb;
  }

  static CreateBudgetConfigurationRequest fromPb(CreateBudgetConfigurationRequestPb pb) {
    CreateBudgetConfigurationRequest model = new CreateBudgetConfigurationRequest();
    model.setBudget(pb.getBudget());

    return model;
  }

  public static class CreateBudgetConfigurationRequestSerializer
      extends JsonSerializer<CreateBudgetConfigurationRequest> {
    @Override
    public void serialize(
        CreateBudgetConfigurationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBudgetConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetConfigurationRequestDeserializer
      extends JsonDeserializer<CreateBudgetConfigurationRequest> {
    @Override
    public CreateBudgetConfigurationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetConfigurationRequestPb pb =
          mapper.readValue(p, CreateBudgetConfigurationRequestPb.class);
      return CreateBudgetConfigurationRequest.fromPb(pb);
    }
  }
}

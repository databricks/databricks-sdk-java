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
    using = CreateBudgetConfigurationResponse.CreateBudgetConfigurationResponseSerializer.class)
@JsonDeserialize(
    using = CreateBudgetConfigurationResponse.CreateBudgetConfigurationResponseDeserializer.class)
public class CreateBudgetConfigurationResponse {
  /** The created budget configuration. */
  private BudgetConfiguration budget;

  public CreateBudgetConfigurationResponse setBudget(BudgetConfiguration budget) {
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
    CreateBudgetConfigurationResponse that = (CreateBudgetConfigurationResponse) o;
    return Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateBudgetConfigurationResponse.class).add("budget", budget).toString();
  }

  CreateBudgetConfigurationResponsePb toPb() {
    CreateBudgetConfigurationResponsePb pb = new CreateBudgetConfigurationResponsePb();
    pb.setBudget(budget);

    return pb;
  }

  static CreateBudgetConfigurationResponse fromPb(CreateBudgetConfigurationResponsePb pb) {
    CreateBudgetConfigurationResponse model = new CreateBudgetConfigurationResponse();
    model.setBudget(pb.getBudget());

    return model;
  }

  public static class CreateBudgetConfigurationResponseSerializer
      extends JsonSerializer<CreateBudgetConfigurationResponse> {
    @Override
    public void serialize(
        CreateBudgetConfigurationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateBudgetConfigurationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateBudgetConfigurationResponseDeserializer
      extends JsonDeserializer<CreateBudgetConfigurationResponse> {
    @Override
    public CreateBudgetConfigurationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateBudgetConfigurationResponsePb pb =
          mapper.readValue(p, CreateBudgetConfigurationResponsePb.class);
      return CreateBudgetConfigurationResponse.fromPb(pb);
    }
  }
}

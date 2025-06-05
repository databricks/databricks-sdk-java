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
    using = GetBudgetConfigurationResponse.GetBudgetConfigurationResponseSerializer.class)
@JsonDeserialize(
    using = GetBudgetConfigurationResponse.GetBudgetConfigurationResponseDeserializer.class)
public class GetBudgetConfigurationResponse {
  /** */
  private BudgetConfiguration budget;

  public GetBudgetConfigurationResponse setBudget(BudgetConfiguration budget) {
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
    GetBudgetConfigurationResponse that = (GetBudgetConfigurationResponse) o;
    return Objects.equals(budget, that.budget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetConfigurationResponse.class).add("budget", budget).toString();
  }

  GetBudgetConfigurationResponsePb toPb() {
    GetBudgetConfigurationResponsePb pb = new GetBudgetConfigurationResponsePb();
    pb.setBudget(budget);

    return pb;
  }

  static GetBudgetConfigurationResponse fromPb(GetBudgetConfigurationResponsePb pb) {
    GetBudgetConfigurationResponse model = new GetBudgetConfigurationResponse();
    model.setBudget(pb.getBudget());

    return model;
  }

  public static class GetBudgetConfigurationResponseSerializer
      extends JsonSerializer<GetBudgetConfigurationResponse> {
    @Override
    public void serialize(
        GetBudgetConfigurationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBudgetConfigurationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBudgetConfigurationResponseDeserializer
      extends JsonDeserializer<GetBudgetConfigurationResponse> {
    @Override
    public GetBudgetConfigurationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBudgetConfigurationResponsePb pb =
          mapper.readValue(p, GetBudgetConfigurationResponsePb.class);
      return GetBudgetConfigurationResponse.fromPb(pb);
    }
  }
}

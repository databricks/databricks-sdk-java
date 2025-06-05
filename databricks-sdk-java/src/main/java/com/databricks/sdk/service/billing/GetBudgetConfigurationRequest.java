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

/** Get budget */
@Generated
@JsonSerialize(using = GetBudgetConfigurationRequest.GetBudgetConfigurationRequestSerializer.class)
@JsonDeserialize(
    using = GetBudgetConfigurationRequest.GetBudgetConfigurationRequestDeserializer.class)
public class GetBudgetConfigurationRequest {
  /** The budget configuration ID */
  private String budgetId;

  public GetBudgetConfigurationRequest setBudgetId(String budgetId) {
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
    GetBudgetConfigurationRequest that = (GetBudgetConfigurationRequest) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBudgetConfigurationRequest.class).add("budgetId", budgetId).toString();
  }

  GetBudgetConfigurationRequestPb toPb() {
    GetBudgetConfigurationRequestPb pb = new GetBudgetConfigurationRequestPb();
    pb.setBudgetId(budgetId);

    return pb;
  }

  static GetBudgetConfigurationRequest fromPb(GetBudgetConfigurationRequestPb pb) {
    GetBudgetConfigurationRequest model = new GetBudgetConfigurationRequest();
    model.setBudgetId(pb.getBudgetId());

    return model;
  }

  public static class GetBudgetConfigurationRequestSerializer
      extends JsonSerializer<GetBudgetConfigurationRequest> {
    @Override
    public void serialize(
        GetBudgetConfigurationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBudgetConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBudgetConfigurationRequestDeserializer
      extends JsonDeserializer<GetBudgetConfigurationRequest> {
    @Override
    public GetBudgetConfigurationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBudgetConfigurationRequestPb pb =
          mapper.readValue(p, GetBudgetConfigurationRequestPb.class);
      return GetBudgetConfigurationRequest.fromPb(pb);
    }
  }
}

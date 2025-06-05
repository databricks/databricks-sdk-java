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

/** Delete budget */
@Generated
@JsonSerialize(
    using = DeleteBudgetConfigurationRequest.DeleteBudgetConfigurationRequestSerializer.class)
@JsonDeserialize(
    using = DeleteBudgetConfigurationRequest.DeleteBudgetConfigurationRequestDeserializer.class)
public class DeleteBudgetConfigurationRequest {
  /** The Databricks budget configuration ID. */
  private String budgetId;

  public DeleteBudgetConfigurationRequest setBudgetId(String budgetId) {
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
    DeleteBudgetConfigurationRequest that = (DeleteBudgetConfigurationRequest) o;
    return Objects.equals(budgetId, that.budgetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteBudgetConfigurationRequest.class)
        .add("budgetId", budgetId)
        .toString();
  }

  DeleteBudgetConfigurationRequestPb toPb() {
    DeleteBudgetConfigurationRequestPb pb = new DeleteBudgetConfigurationRequestPb();
    pb.setBudgetId(budgetId);

    return pb;
  }

  static DeleteBudgetConfigurationRequest fromPb(DeleteBudgetConfigurationRequestPb pb) {
    DeleteBudgetConfigurationRequest model = new DeleteBudgetConfigurationRequest();
    model.setBudgetId(pb.getBudgetId());

    return model;
  }

  public static class DeleteBudgetConfigurationRequestSerializer
      extends JsonSerializer<DeleteBudgetConfigurationRequest> {
    @Override
    public void serialize(
        DeleteBudgetConfigurationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteBudgetConfigurationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteBudgetConfigurationRequestDeserializer
      extends JsonDeserializer<DeleteBudgetConfigurationRequest> {
    @Override
    public DeleteBudgetConfigurationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteBudgetConfigurationRequestPb pb =
          mapper.readValue(p, DeleteBudgetConfigurationRequestPb.class);
      return DeleteBudgetConfigurationRequest.fromPb(pb);
    }
  }
}

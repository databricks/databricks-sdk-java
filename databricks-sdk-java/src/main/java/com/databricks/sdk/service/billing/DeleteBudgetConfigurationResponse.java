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
    using = DeleteBudgetConfigurationResponse.DeleteBudgetConfigurationResponseSerializer.class)
@JsonDeserialize(
    using = DeleteBudgetConfigurationResponse.DeleteBudgetConfigurationResponseDeserializer.class)
public class DeleteBudgetConfigurationResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteBudgetConfigurationResponse.class).toString();
  }

  DeleteBudgetConfigurationResponsePb toPb() {
    DeleteBudgetConfigurationResponsePb pb = new DeleteBudgetConfigurationResponsePb();

    return pb;
  }

  static DeleteBudgetConfigurationResponse fromPb(DeleteBudgetConfigurationResponsePb pb) {
    DeleteBudgetConfigurationResponse model = new DeleteBudgetConfigurationResponse();

    return model;
  }

  public static class DeleteBudgetConfigurationResponseSerializer
      extends JsonSerializer<DeleteBudgetConfigurationResponse> {
    @Override
    public void serialize(
        DeleteBudgetConfigurationResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteBudgetConfigurationResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteBudgetConfigurationResponseDeserializer
      extends JsonDeserializer<DeleteBudgetConfigurationResponse> {
    @Override
    public DeleteBudgetConfigurationResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteBudgetConfigurationResponsePb pb =
          mapper.readValue(p, DeleteBudgetConfigurationResponsePb.class);
      return DeleteBudgetConfigurationResponse.fromPb(pb);
    }
  }
}

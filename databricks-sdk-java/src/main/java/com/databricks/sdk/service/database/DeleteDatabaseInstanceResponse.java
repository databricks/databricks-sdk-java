// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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
    using = DeleteDatabaseInstanceResponse.DeleteDatabaseInstanceResponseSerializer.class)
@JsonDeserialize(
    using = DeleteDatabaseInstanceResponse.DeleteDatabaseInstanceResponseDeserializer.class)
public class DeleteDatabaseInstanceResponse {

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
    return new ToStringer(DeleteDatabaseInstanceResponse.class).toString();
  }

  DeleteDatabaseInstanceResponsePb toPb() {
    DeleteDatabaseInstanceResponsePb pb = new DeleteDatabaseInstanceResponsePb();

    return pb;
  }

  static DeleteDatabaseInstanceResponse fromPb(DeleteDatabaseInstanceResponsePb pb) {
    DeleteDatabaseInstanceResponse model = new DeleteDatabaseInstanceResponse();

    return model;
  }

  public static class DeleteDatabaseInstanceResponseSerializer
      extends JsonSerializer<DeleteDatabaseInstanceResponse> {
    @Override
    public void serialize(
        DeleteDatabaseInstanceResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDatabaseInstanceResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDatabaseInstanceResponseDeserializer
      extends JsonDeserializer<DeleteDatabaseInstanceResponse> {
    @Override
    public DeleteDatabaseInstanceResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDatabaseInstanceResponsePb pb =
          mapper.readValue(p, DeleteDatabaseInstanceResponsePb.class);
      return DeleteDatabaseInstanceResponse.fromPb(pb);
    }
  }
}

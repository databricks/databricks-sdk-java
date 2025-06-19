// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = DeleteWarehouseResponse.DeleteWarehouseResponseSerializer.class)
@JsonDeserialize(using = DeleteWarehouseResponse.DeleteWarehouseResponseDeserializer.class)
public class DeleteWarehouseResponse {

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
    return new ToStringer(DeleteWarehouseResponse.class).toString();
  }

  DeleteWarehouseResponsePb toPb() {
    DeleteWarehouseResponsePb pb = new DeleteWarehouseResponsePb();

    return pb;
  }

  static DeleteWarehouseResponse fromPb(DeleteWarehouseResponsePb pb) {
    DeleteWarehouseResponse model = new DeleteWarehouseResponse();

    return model;
  }

  public static class DeleteWarehouseResponseSerializer
      extends JsonSerializer<DeleteWarehouseResponse> {
    @Override
    public void serialize(
        DeleteWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteWarehouseResponseDeserializer
      extends JsonDeserializer<DeleteWarehouseResponse> {
    @Override
    public DeleteWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteWarehouseResponsePb pb = mapper.readValue(p, DeleteWarehouseResponsePb.class);
      return DeleteWarehouseResponse.fromPb(pb);
    }
  }
}

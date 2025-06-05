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
@JsonSerialize(using = EditWarehouseResponse.EditWarehouseResponseSerializer.class)
@JsonDeserialize(using = EditWarehouseResponse.EditWarehouseResponseDeserializer.class)
public class EditWarehouseResponse {

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
    return new ToStringer(EditWarehouseResponse.class).toString();
  }

  EditWarehouseResponsePb toPb() {
    EditWarehouseResponsePb pb = new EditWarehouseResponsePb();

    return pb;
  }

  static EditWarehouseResponse fromPb(EditWarehouseResponsePb pb) {
    EditWarehouseResponse model = new EditWarehouseResponse();

    return model;
  }

  public static class EditWarehouseResponseSerializer
      extends JsonSerializer<EditWarehouseResponse> {
    @Override
    public void serialize(
        EditWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditWarehouseResponseDeserializer
      extends JsonDeserializer<EditWarehouseResponse> {
    @Override
    public EditWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditWarehouseResponsePb pb = mapper.readValue(p, EditWarehouseResponsePb.class);
      return EditWarehouseResponse.fromPb(pb);
    }
  }
}

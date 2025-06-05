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
@JsonSerialize(using = StartWarehouseResponse.StartWarehouseResponseSerializer.class)
@JsonDeserialize(using = StartWarehouseResponse.StartWarehouseResponseDeserializer.class)
public class StartWarehouseResponse {

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
    return new ToStringer(StartWarehouseResponse.class).toString();
  }

  StartWarehouseResponsePb toPb() {
    StartWarehouseResponsePb pb = new StartWarehouseResponsePb();

    return pb;
  }

  static StartWarehouseResponse fromPb(StartWarehouseResponsePb pb) {
    StartWarehouseResponse model = new StartWarehouseResponse();

    return model;
  }

  public static class StartWarehouseResponseSerializer
      extends JsonSerializer<StartWarehouseResponse> {
    @Override
    public void serialize(
        StartWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartWarehouseResponseDeserializer
      extends JsonDeserializer<StartWarehouseResponse> {
    @Override
    public StartWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartWarehouseResponsePb pb = mapper.readValue(p, StartWarehouseResponsePb.class);
      return StartWarehouseResponse.fromPb(pb);
    }
  }
}

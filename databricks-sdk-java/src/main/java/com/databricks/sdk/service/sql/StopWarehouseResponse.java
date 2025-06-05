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
@JsonSerialize(using = StopWarehouseResponse.StopWarehouseResponseSerializer.class)
@JsonDeserialize(using = StopWarehouseResponse.StopWarehouseResponseDeserializer.class)
public class StopWarehouseResponse {

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
    return new ToStringer(StopWarehouseResponse.class).toString();
  }

  StopWarehouseResponsePb toPb() {
    StopWarehouseResponsePb pb = new StopWarehouseResponsePb();

    return pb;
  }

  static StopWarehouseResponse fromPb(StopWarehouseResponsePb pb) {
    StopWarehouseResponse model = new StopWarehouseResponse();

    return model;
  }

  public static class StopWarehouseResponseSerializer
      extends JsonSerializer<StopWarehouseResponse> {
    @Override
    public void serialize(
        StopWarehouseResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StopWarehouseResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StopWarehouseResponseDeserializer
      extends JsonDeserializer<StopWarehouseResponse> {
    @Override
    public StopWarehouseResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StopWarehouseResponsePb pb = mapper.readValue(p, StopWarehouseResponsePb.class);
      return StopWarehouseResponse.fromPb(pb);
    }
  }
}

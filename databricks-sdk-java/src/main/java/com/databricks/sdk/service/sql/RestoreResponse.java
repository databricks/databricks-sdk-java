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
@JsonSerialize(using = RestoreResponse.RestoreResponseSerializer.class)
@JsonDeserialize(using = RestoreResponse.RestoreResponseDeserializer.class)
public class RestoreResponse {

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
    return new ToStringer(RestoreResponse.class).toString();
  }

  RestoreResponsePb toPb() {
    RestoreResponsePb pb = new RestoreResponsePb();

    return pb;
  }

  static RestoreResponse fromPb(RestoreResponsePb pb) {
    RestoreResponse model = new RestoreResponse();

    return model;
  }

  public static class RestoreResponseSerializer extends JsonSerializer<RestoreResponse> {
    @Override
    public void serialize(RestoreResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreResponseDeserializer extends JsonDeserializer<RestoreResponse> {
    @Override
    public RestoreResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreResponsePb pb = mapper.readValue(p, RestoreResponsePb.class);
      return RestoreResponse.fromPb(pb);
    }
  }
}

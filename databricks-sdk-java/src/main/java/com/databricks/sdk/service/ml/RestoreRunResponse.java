// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = RestoreRunResponse.RestoreRunResponseSerializer.class)
@JsonDeserialize(using = RestoreRunResponse.RestoreRunResponseDeserializer.class)
public class RestoreRunResponse {

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
    return new ToStringer(RestoreRunResponse.class).toString();
  }

  RestoreRunResponsePb toPb() {
    RestoreRunResponsePb pb = new RestoreRunResponsePb();

    return pb;
  }

  static RestoreRunResponse fromPb(RestoreRunResponsePb pb) {
    RestoreRunResponse model = new RestoreRunResponse();

    return model;
  }

  public static class RestoreRunResponseSerializer extends JsonSerializer<RestoreRunResponse> {
    @Override
    public void serialize(RestoreRunResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreRunResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreRunResponseDeserializer extends JsonDeserializer<RestoreRunResponse> {
    @Override
    public RestoreRunResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreRunResponsePb pb = mapper.readValue(p, RestoreRunResponsePb.class);
      return RestoreRunResponse.fromPb(pb);
    }
  }
}

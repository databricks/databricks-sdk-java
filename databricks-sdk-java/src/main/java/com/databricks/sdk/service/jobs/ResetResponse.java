// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = ResetResponse.ResetResponseSerializer.class)
@JsonDeserialize(using = ResetResponse.ResetResponseDeserializer.class)
public class ResetResponse {

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
    return new ToStringer(ResetResponse.class).toString();
  }

  ResetResponsePb toPb() {
    ResetResponsePb pb = new ResetResponsePb();

    return pb;
  }

  static ResetResponse fromPb(ResetResponsePb pb) {
    ResetResponse model = new ResetResponse();

    return model;
  }

  public static class ResetResponseSerializer extends JsonSerializer<ResetResponse> {
    @Override
    public void serialize(ResetResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ResetResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ResetResponseDeserializer extends JsonDeserializer<ResetResponse> {
    @Override
    public ResetResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ResetResponsePb pb = mapper.readValue(p, ResetResponsePb.class);
      return ResetResponse.fromPb(pb);
    }
  }
}

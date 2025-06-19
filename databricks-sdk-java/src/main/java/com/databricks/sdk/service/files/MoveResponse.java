// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = MoveResponse.MoveResponseSerializer.class)
@JsonDeserialize(using = MoveResponse.MoveResponseDeserializer.class)
public class MoveResponse {

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
    return new ToStringer(MoveResponse.class).toString();
  }

  MoveResponsePb toPb() {
    MoveResponsePb pb = new MoveResponsePb();

    return pb;
  }

  static MoveResponse fromPb(MoveResponsePb pb) {
    MoveResponse model = new MoveResponse();

    return model;
  }

  public static class MoveResponseSerializer extends JsonSerializer<MoveResponse> {
    @Override
    public void serialize(MoveResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MoveResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MoveResponseDeserializer extends JsonDeserializer<MoveResponse> {
    @Override
    public MoveResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MoveResponsePb pb = mapper.readValue(p, MoveResponsePb.class);
      return MoveResponse.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = PutResponse.PutResponseSerializer.class)
@JsonDeserialize(using = PutResponse.PutResponseDeserializer.class)
public class PutResponse {

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
    return new ToStringer(PutResponse.class).toString();
  }

  PutResponsePb toPb() {
    PutResponsePb pb = new PutResponsePb();

    return pb;
  }

  static PutResponse fromPb(PutResponsePb pb) {
    PutResponse model = new PutResponse();

    return model;
  }

  public static class PutResponseSerializer extends JsonSerializer<PutResponse> {
    @Override
    public void serialize(PutResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutResponseDeserializer extends JsonDeserializer<PutResponse> {
    @Override
    public PutResponse deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutResponsePb pb = mapper.readValue(p, PutResponsePb.class);
      return PutResponse.fromPb(pb);
    }
  }
}

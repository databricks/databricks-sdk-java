// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = DestroyResponse.DestroyResponseSerializer.class)
@JsonDeserialize(using = DestroyResponse.DestroyResponseDeserializer.class)
public class DestroyResponse {

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
    return new ToStringer(DestroyResponse.class).toString();
  }

  DestroyResponsePb toPb() {
    DestroyResponsePb pb = new DestroyResponsePb();

    return pb;
  }

  static DestroyResponse fromPb(DestroyResponsePb pb) {
    DestroyResponse model = new DestroyResponse();

    return model;
  }

  public static class DestroyResponseSerializer extends JsonSerializer<DestroyResponse> {
    @Override
    public void serialize(DestroyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DestroyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DestroyResponseDeserializer extends JsonDeserializer<DestroyResponse> {
    @Override
    public DestroyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DestroyResponsePb pb = mapper.readValue(p, DestroyResponsePb.class);
      return DestroyResponse.fromPb(pb);
    }
  }
}

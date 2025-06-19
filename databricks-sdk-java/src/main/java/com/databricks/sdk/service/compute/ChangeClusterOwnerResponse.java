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
@JsonSerialize(using = ChangeClusterOwnerResponse.ChangeClusterOwnerResponseSerializer.class)
@JsonDeserialize(using = ChangeClusterOwnerResponse.ChangeClusterOwnerResponseDeserializer.class)
public class ChangeClusterOwnerResponse {

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
    return new ToStringer(ChangeClusterOwnerResponse.class).toString();
  }

  ChangeClusterOwnerResponsePb toPb() {
    ChangeClusterOwnerResponsePb pb = new ChangeClusterOwnerResponsePb();

    return pb;
  }

  static ChangeClusterOwnerResponse fromPb(ChangeClusterOwnerResponsePb pb) {
    ChangeClusterOwnerResponse model = new ChangeClusterOwnerResponse();

    return model;
  }

  public static class ChangeClusterOwnerResponseSerializer
      extends JsonSerializer<ChangeClusterOwnerResponse> {
    @Override
    public void serialize(
        ChangeClusterOwnerResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ChangeClusterOwnerResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ChangeClusterOwnerResponseDeserializer
      extends JsonDeserializer<ChangeClusterOwnerResponse> {
    @Override
    public ChangeClusterOwnerResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ChangeClusterOwnerResponsePb pb = mapper.readValue(p, ChangeClusterOwnerResponsePb.class);
      return ChangeClusterOwnerResponse.fromPb(pb);
    }
  }
}

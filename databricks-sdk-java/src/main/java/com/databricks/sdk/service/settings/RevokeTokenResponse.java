// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = RevokeTokenResponse.RevokeTokenResponseSerializer.class)
@JsonDeserialize(using = RevokeTokenResponse.RevokeTokenResponseDeserializer.class)
public class RevokeTokenResponse {

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
    return new ToStringer(RevokeTokenResponse.class).toString();
  }

  RevokeTokenResponsePb toPb() {
    RevokeTokenResponsePb pb = new RevokeTokenResponsePb();

    return pb;
  }

  static RevokeTokenResponse fromPb(RevokeTokenResponsePb pb) {
    RevokeTokenResponse model = new RevokeTokenResponse();

    return model;
  }

  public static class RevokeTokenResponseSerializer extends JsonSerializer<RevokeTokenResponse> {
    @Override
    public void serialize(RevokeTokenResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RevokeTokenResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RevokeTokenResponseDeserializer
      extends JsonDeserializer<RevokeTokenResponse> {
    @Override
    public RevokeTokenResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RevokeTokenResponsePb pb = mapper.readValue(p, RevokeTokenResponsePb.class);
      return RevokeTokenResponse.fromPb(pb);
    }
  }
}

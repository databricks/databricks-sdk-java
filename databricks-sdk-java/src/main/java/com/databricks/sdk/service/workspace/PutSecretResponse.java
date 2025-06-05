// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = PutSecretResponse.PutSecretResponseSerializer.class)
@JsonDeserialize(using = PutSecretResponse.PutSecretResponseDeserializer.class)
public class PutSecretResponse {

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
    return new ToStringer(PutSecretResponse.class).toString();
  }

  PutSecretResponsePb toPb() {
    PutSecretResponsePb pb = new PutSecretResponsePb();

    return pb;
  }

  static PutSecretResponse fromPb(PutSecretResponsePb pb) {
    PutSecretResponse model = new PutSecretResponse();

    return model;
  }

  public static class PutSecretResponseSerializer extends JsonSerializer<PutSecretResponse> {
    @Override
    public void serialize(PutSecretResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutSecretResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutSecretResponseDeserializer extends JsonDeserializer<PutSecretResponse> {
    @Override
    public PutSecretResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutSecretResponsePb pb = mapper.readValue(p, PutSecretResponsePb.class);
      return PutSecretResponse.fromPb(pb);
    }
  }
}

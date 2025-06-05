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
@JsonSerialize(using = PutAclResponse.PutAclResponseSerializer.class)
@JsonDeserialize(using = PutAclResponse.PutAclResponseDeserializer.class)
public class PutAclResponse {

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
    return new ToStringer(PutAclResponse.class).toString();
  }

  PutAclResponsePb toPb() {
    PutAclResponsePb pb = new PutAclResponsePb();

    return pb;
  }

  static PutAclResponse fromPb(PutAclResponsePb pb) {
    PutAclResponse model = new PutAclResponse();

    return model;
  }

  public static class PutAclResponseSerializer extends JsonSerializer<PutAclResponse> {
    @Override
    public void serialize(PutAclResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PutAclResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PutAclResponseDeserializer extends JsonDeserializer<PutAclResponse> {
    @Override
    public PutAclResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PutAclResponsePb pb = mapper.readValue(p, PutAclResponsePb.class);
      return PutAclResponse.fromPb(pb);
    }
  }
}

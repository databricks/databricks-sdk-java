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
@JsonSerialize(using = CreateScopeResponse.CreateScopeResponseSerializer.class)
@JsonDeserialize(using = CreateScopeResponse.CreateScopeResponseDeserializer.class)
public class CreateScopeResponse {

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
    return new ToStringer(CreateScopeResponse.class).toString();
  }

  CreateScopeResponsePb toPb() {
    CreateScopeResponsePb pb = new CreateScopeResponsePb();

    return pb;
  }

  static CreateScopeResponse fromPb(CreateScopeResponsePb pb) {
    CreateScopeResponse model = new CreateScopeResponse();

    return model;
  }

  public static class CreateScopeResponseSerializer extends JsonSerializer<CreateScopeResponse> {
    @Override
    public void serialize(CreateScopeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateScopeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateScopeResponseDeserializer
      extends JsonDeserializer<CreateScopeResponse> {
    @Override
    public CreateScopeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateScopeResponsePb pb = mapper.readValue(p, CreateScopeResponsePb.class);
      return CreateScopeResponse.fromPb(pb);
    }
  }
}

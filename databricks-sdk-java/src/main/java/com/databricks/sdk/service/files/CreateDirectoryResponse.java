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
@JsonSerialize(using = CreateDirectoryResponse.CreateDirectoryResponseSerializer.class)
@JsonDeserialize(using = CreateDirectoryResponse.CreateDirectoryResponseDeserializer.class)
public class CreateDirectoryResponse {

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
    return new ToStringer(CreateDirectoryResponse.class).toString();
  }

  CreateDirectoryResponsePb toPb() {
    CreateDirectoryResponsePb pb = new CreateDirectoryResponsePb();

    return pb;
  }

  static CreateDirectoryResponse fromPb(CreateDirectoryResponsePb pb) {
    CreateDirectoryResponse model = new CreateDirectoryResponse();

    return model;
  }

  public static class CreateDirectoryResponseSerializer
      extends JsonSerializer<CreateDirectoryResponse> {
    @Override
    public void serialize(
        CreateDirectoryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateDirectoryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateDirectoryResponseDeserializer
      extends JsonDeserializer<CreateDirectoryResponse> {
    @Override
    public CreateDirectoryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateDirectoryResponsePb pb = mapper.readValue(p, CreateDirectoryResponsePb.class);
      return CreateDirectoryResponse.fromPb(pb);
    }
  }
}

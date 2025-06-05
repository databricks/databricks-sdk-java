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
@JsonSerialize(using = GetDirectoryMetadataResponse.GetDirectoryMetadataResponseSerializer.class)
@JsonDeserialize(
    using = GetDirectoryMetadataResponse.GetDirectoryMetadataResponseDeserializer.class)
public class GetDirectoryMetadataResponse {

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
    return new ToStringer(GetDirectoryMetadataResponse.class).toString();
  }

  GetDirectoryMetadataResponsePb toPb() {
    GetDirectoryMetadataResponsePb pb = new GetDirectoryMetadataResponsePb();

    return pb;
  }

  static GetDirectoryMetadataResponse fromPb(GetDirectoryMetadataResponsePb pb) {
    GetDirectoryMetadataResponse model = new GetDirectoryMetadataResponse();

    return model;
  }

  public static class GetDirectoryMetadataResponseSerializer
      extends JsonSerializer<GetDirectoryMetadataResponse> {
    @Override
    public void serialize(
        GetDirectoryMetadataResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDirectoryMetadataResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDirectoryMetadataResponseDeserializer
      extends JsonDeserializer<GetDirectoryMetadataResponse> {
    @Override
    public GetDirectoryMetadataResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDirectoryMetadataResponsePb pb = mapper.readValue(p, GetDirectoryMetadataResponsePb.class);
      return GetDirectoryMetadataResponse.fromPb(pb);
    }
  }
}

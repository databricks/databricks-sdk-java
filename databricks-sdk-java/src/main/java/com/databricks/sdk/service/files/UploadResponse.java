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
@JsonSerialize(using = UploadResponse.UploadResponseSerializer.class)
@JsonDeserialize(using = UploadResponse.UploadResponseDeserializer.class)
public class UploadResponse {

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
    return new ToStringer(UploadResponse.class).toString();
  }

  UploadResponsePb toPb() {
    UploadResponsePb pb = new UploadResponsePb();

    return pb;
  }

  static UploadResponse fromPb(UploadResponsePb pb) {
    UploadResponse model = new UploadResponse();

    return model;
  }

  public static class UploadResponseSerializer extends JsonSerializer<UploadResponse> {
    @Override
    public void serialize(UploadResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UploadResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UploadResponseDeserializer extends JsonDeserializer<UploadResponse> {
    @Override
    public UploadResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UploadResponsePb pb = mapper.readValue(p, UploadResponsePb.class);
      return UploadResponse.fromPb(pb);
    }
  }
}

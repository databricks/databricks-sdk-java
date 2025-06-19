// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = UpdateModelVersionResponse.UpdateModelVersionResponseSerializer.class)
@JsonDeserialize(using = UpdateModelVersionResponse.UpdateModelVersionResponseDeserializer.class)
public class UpdateModelVersionResponse {

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
    return new ToStringer(UpdateModelVersionResponse.class).toString();
  }

  UpdateModelVersionResponsePb toPb() {
    UpdateModelVersionResponsePb pb = new UpdateModelVersionResponsePb();

    return pb;
  }

  static UpdateModelVersionResponse fromPb(UpdateModelVersionResponsePb pb) {
    UpdateModelVersionResponse model = new UpdateModelVersionResponse();

    return model;
  }

  public static class UpdateModelVersionResponseSerializer
      extends JsonSerializer<UpdateModelVersionResponse> {
    @Override
    public void serialize(
        UpdateModelVersionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateModelVersionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateModelVersionResponseDeserializer
      extends JsonDeserializer<UpdateModelVersionResponse> {
    @Override
    public UpdateModelVersionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateModelVersionResponsePb pb = mapper.readValue(p, UpdateModelVersionResponsePb.class);
      return UpdateModelVersionResponse.fromPb(pb);
    }
  }
}

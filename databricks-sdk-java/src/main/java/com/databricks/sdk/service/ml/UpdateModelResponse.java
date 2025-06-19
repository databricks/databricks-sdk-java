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
@JsonSerialize(using = UpdateModelResponse.UpdateModelResponseSerializer.class)
@JsonDeserialize(using = UpdateModelResponse.UpdateModelResponseDeserializer.class)
public class UpdateModelResponse {

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
    return new ToStringer(UpdateModelResponse.class).toString();
  }

  UpdateModelResponsePb toPb() {
    UpdateModelResponsePb pb = new UpdateModelResponsePb();

    return pb;
  }

  static UpdateModelResponse fromPb(UpdateModelResponsePb pb) {
    UpdateModelResponse model = new UpdateModelResponse();

    return model;
  }

  public static class UpdateModelResponseSerializer extends JsonSerializer<UpdateModelResponse> {
    @Override
    public void serialize(UpdateModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateModelResponseDeserializer
      extends JsonDeserializer<UpdateModelResponse> {
    @Override
    public UpdateModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateModelResponsePb pb = mapper.readValue(p, UpdateModelResponsePb.class);
      return UpdateModelResponse.fromPb(pb);
    }
  }
}

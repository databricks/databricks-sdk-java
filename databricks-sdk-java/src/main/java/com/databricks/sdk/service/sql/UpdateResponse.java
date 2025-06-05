// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = UpdateResponse.UpdateResponseSerializer.class)
@JsonDeserialize(using = UpdateResponse.UpdateResponseDeserializer.class)
public class UpdateResponse {

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
    return new ToStringer(UpdateResponse.class).toString();
  }

  UpdateResponsePb toPb() {
    UpdateResponsePb pb = new UpdateResponsePb();

    return pb;
  }

  static UpdateResponse fromPb(UpdateResponsePb pb) {
    UpdateResponse model = new UpdateResponse();

    return model;
  }

  public static class UpdateResponseSerializer extends JsonSerializer<UpdateResponse> {
    @Override
    public void serialize(UpdateResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateResponseDeserializer extends JsonDeserializer<UpdateResponse> {
    @Override
    public UpdateResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateResponsePb pb = mapper.readValue(p, UpdateResponsePb.class);
      return UpdateResponse.fromPb(pb);
    }
  }
}

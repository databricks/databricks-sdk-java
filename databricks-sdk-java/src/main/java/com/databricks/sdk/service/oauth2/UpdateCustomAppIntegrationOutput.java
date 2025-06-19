// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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
@JsonSerialize(
    using = UpdateCustomAppIntegrationOutput.UpdateCustomAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using = UpdateCustomAppIntegrationOutput.UpdateCustomAppIntegrationOutputDeserializer.class)
public class UpdateCustomAppIntegrationOutput {

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
    return new ToStringer(UpdateCustomAppIntegrationOutput.class).toString();
  }

  UpdateCustomAppIntegrationOutputPb toPb() {
    UpdateCustomAppIntegrationOutputPb pb = new UpdateCustomAppIntegrationOutputPb();

    return pb;
  }

  static UpdateCustomAppIntegrationOutput fromPb(UpdateCustomAppIntegrationOutputPb pb) {
    UpdateCustomAppIntegrationOutput model = new UpdateCustomAppIntegrationOutput();

    return model;
  }

  public static class UpdateCustomAppIntegrationOutputSerializer
      extends JsonSerializer<UpdateCustomAppIntegrationOutput> {
    @Override
    public void serialize(
        UpdateCustomAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCustomAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCustomAppIntegrationOutputDeserializer
      extends JsonDeserializer<UpdateCustomAppIntegrationOutput> {
    @Override
    public UpdateCustomAppIntegrationOutput deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCustomAppIntegrationOutputPb pb =
          mapper.readValue(p, UpdateCustomAppIntegrationOutputPb.class);
      return UpdateCustomAppIntegrationOutput.fromPb(pb);
    }
  }
}

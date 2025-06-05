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
    using = UpdatePublishedAppIntegrationOutput.UpdatePublishedAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using =
        UpdatePublishedAppIntegrationOutput.UpdatePublishedAppIntegrationOutputDeserializer.class)
public class UpdatePublishedAppIntegrationOutput {

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
    return new ToStringer(UpdatePublishedAppIntegrationOutput.class).toString();
  }

  UpdatePublishedAppIntegrationOutputPb toPb() {
    UpdatePublishedAppIntegrationOutputPb pb = new UpdatePublishedAppIntegrationOutputPb();

    return pb;
  }

  static UpdatePublishedAppIntegrationOutput fromPb(UpdatePublishedAppIntegrationOutputPb pb) {
    UpdatePublishedAppIntegrationOutput model = new UpdatePublishedAppIntegrationOutput();

    return model;
  }

  public static class UpdatePublishedAppIntegrationOutputSerializer
      extends JsonSerializer<UpdatePublishedAppIntegrationOutput> {
    @Override
    public void serialize(
        UpdatePublishedAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdatePublishedAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdatePublishedAppIntegrationOutputDeserializer
      extends JsonDeserializer<UpdatePublishedAppIntegrationOutput> {
    @Override
    public UpdatePublishedAppIntegrationOutput deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdatePublishedAppIntegrationOutputPb pb =
          mapper.readValue(p, UpdatePublishedAppIntegrationOutputPb.class);
      return UpdatePublishedAppIntegrationOutput.fromPb(pb);
    }
  }
}

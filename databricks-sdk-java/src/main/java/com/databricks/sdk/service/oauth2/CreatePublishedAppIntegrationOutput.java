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
    using = CreatePublishedAppIntegrationOutput.CreatePublishedAppIntegrationOutputSerializer.class)
@JsonDeserialize(
    using =
        CreatePublishedAppIntegrationOutput.CreatePublishedAppIntegrationOutputDeserializer.class)
public class CreatePublishedAppIntegrationOutput {
  /** Unique integration id for the published OAuth app */
  private String integrationId;

  public CreatePublishedAppIntegrationOutput setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreatePublishedAppIntegrationOutput that = (CreatePublishedAppIntegrationOutput) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreatePublishedAppIntegrationOutput.class)
        .add("integrationId", integrationId)
        .toString();
  }

  CreatePublishedAppIntegrationOutputPb toPb() {
    CreatePublishedAppIntegrationOutputPb pb = new CreatePublishedAppIntegrationOutputPb();
    pb.setIntegrationId(integrationId);

    return pb;
  }

  static CreatePublishedAppIntegrationOutput fromPb(CreatePublishedAppIntegrationOutputPb pb) {
    CreatePublishedAppIntegrationOutput model = new CreatePublishedAppIntegrationOutput();
    model.setIntegrationId(pb.getIntegrationId());

    return model;
  }

  public static class CreatePublishedAppIntegrationOutputSerializer
      extends JsonSerializer<CreatePublishedAppIntegrationOutput> {
    @Override
    public void serialize(
        CreatePublishedAppIntegrationOutput value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreatePublishedAppIntegrationOutputPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreatePublishedAppIntegrationOutputDeserializer
      extends JsonDeserializer<CreatePublishedAppIntegrationOutput> {
    @Override
    public CreatePublishedAppIntegrationOutput deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreatePublishedAppIntegrationOutputPb pb =
          mapper.readValue(p, CreatePublishedAppIntegrationOutputPb.class);
      return CreatePublishedAppIntegrationOutput.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
    using =
        CreateNotificationDestinationRequest.CreateNotificationDestinationRequestSerializer.class)
@JsonDeserialize(
    using =
        CreateNotificationDestinationRequest.CreateNotificationDestinationRequestDeserializer.class)
public class CreateNotificationDestinationRequest {
  /**
   * The configuration for the notification destination. Must wrap EXACTLY one of the nested
   * configs.
   */
  private Config config;

  /** The display name for the notification destination. */
  private String displayName;

  public CreateNotificationDestinationRequest setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public CreateNotificationDestinationRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateNotificationDestinationRequest that = (CreateNotificationDestinationRequest) o;
    return Objects.equals(config, that.config) && Objects.equals(displayName, that.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, displayName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateNotificationDestinationRequest.class)
        .add("config", config)
        .add("displayName", displayName)
        .toString();
  }

  CreateNotificationDestinationRequestPb toPb() {
    CreateNotificationDestinationRequestPb pb = new CreateNotificationDestinationRequestPb();
    pb.setConfig(config);
    pb.setDisplayName(displayName);

    return pb;
  }

  static CreateNotificationDestinationRequest fromPb(CreateNotificationDestinationRequestPb pb) {
    CreateNotificationDestinationRequest model = new CreateNotificationDestinationRequest();
    model.setConfig(pb.getConfig());
    model.setDisplayName(pb.getDisplayName());

    return model;
  }

  public static class CreateNotificationDestinationRequestSerializer
      extends JsonSerializer<CreateNotificationDestinationRequest> {
    @Override
    public void serialize(
        CreateNotificationDestinationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateNotificationDestinationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateNotificationDestinationRequestDeserializer
      extends JsonDeserializer<CreateNotificationDestinationRequest> {
    @Override
    public CreateNotificationDestinationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateNotificationDestinationRequestPb pb =
          mapper.readValue(p, CreateNotificationDestinationRequestPb.class);
      return CreateNotificationDestinationRequest.fromPb(pb);
    }
  }
}

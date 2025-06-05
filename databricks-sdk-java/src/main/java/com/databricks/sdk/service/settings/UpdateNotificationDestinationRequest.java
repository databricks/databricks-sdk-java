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
        UpdateNotificationDestinationRequest.UpdateNotificationDestinationRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateNotificationDestinationRequest.UpdateNotificationDestinationRequestDeserializer.class)
public class UpdateNotificationDestinationRequest {
  /**
   * The configuration for the notification destination. Must wrap EXACTLY one of the nested
   * configs.
   */
  private Config config;

  /** The display name for the notification destination. */
  private String displayName;

  /** UUID identifying notification destination. */
  private String id;

  public UpdateNotificationDestinationRequest setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public UpdateNotificationDestinationRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateNotificationDestinationRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateNotificationDestinationRequest that = (UpdateNotificationDestinationRequest) o;
    return Objects.equals(config, that.config)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateNotificationDestinationRequest.class)
        .add("config", config)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }

  UpdateNotificationDestinationRequestPb toPb() {
    UpdateNotificationDestinationRequestPb pb = new UpdateNotificationDestinationRequestPb();
    pb.setConfig(config);
    pb.setDisplayName(displayName);
    pb.setId(id);

    return pb;
  }

  static UpdateNotificationDestinationRequest fromPb(UpdateNotificationDestinationRequestPb pb) {
    UpdateNotificationDestinationRequest model = new UpdateNotificationDestinationRequest();
    model.setConfig(pb.getConfig());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());

    return model;
  }

  public static class UpdateNotificationDestinationRequestSerializer
      extends JsonSerializer<UpdateNotificationDestinationRequest> {
    @Override
    public void serialize(
        UpdateNotificationDestinationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateNotificationDestinationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateNotificationDestinationRequestDeserializer
      extends JsonDeserializer<UpdateNotificationDestinationRequest> {
    @Override
    public UpdateNotificationDestinationRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateNotificationDestinationRequestPb pb =
          mapper.readValue(p, UpdateNotificationDestinationRequestPb.class);
      return UpdateNotificationDestinationRequest.fromPb(pb);
    }
  }
}

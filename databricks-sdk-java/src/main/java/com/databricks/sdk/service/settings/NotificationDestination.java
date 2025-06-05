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
@JsonSerialize(using = NotificationDestination.NotificationDestinationSerializer.class)
@JsonDeserialize(using = NotificationDestination.NotificationDestinationDeserializer.class)
public class NotificationDestination {
  /**
   * The configuration for the notification destination. Will be exactly one of the nested configs.
   * Only returns for users with workspace admin permissions.
   */
  private Config config;

  /**
   * [Output-only] The type of the notification destination. The type can not be changed once set.
   */
  private DestinationType destinationType;

  /** The display name for the notification destination. */
  private String displayName;

  /** UUID identifying notification destination. */
  private String id;

  public NotificationDestination setConfig(Config config) {
    this.config = config;
    return this;
  }

  public Config getConfig() {
    return config;
  }

  public NotificationDestination setDestinationType(DestinationType destinationType) {
    this.destinationType = destinationType;
    return this;
  }

  public DestinationType getDestinationType() {
    return destinationType;
  }

  public NotificationDestination setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public NotificationDestination setId(String id) {
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
    NotificationDestination that = (NotificationDestination) o;
    return Objects.equals(config, that.config)
        && Objects.equals(destinationType, that.destinationType)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, destinationType, displayName, id);
  }

  @Override
  public String toString() {
    return new ToStringer(NotificationDestination.class)
        .add("config", config)
        .add("destinationType", destinationType)
        .add("displayName", displayName)
        .add("id", id)
        .toString();
  }

  NotificationDestinationPb toPb() {
    NotificationDestinationPb pb = new NotificationDestinationPb();
    pb.setConfig(config);
    pb.setDestinationType(destinationType);
    pb.setDisplayName(displayName);
    pb.setId(id);

    return pb;
  }

  static NotificationDestination fromPb(NotificationDestinationPb pb) {
    NotificationDestination model = new NotificationDestination();
    model.setConfig(pb.getConfig());
    model.setDestinationType(pb.getDestinationType());
    model.setDisplayName(pb.getDisplayName());
    model.setId(pb.getId());

    return model;
  }

  public static class NotificationDestinationSerializer
      extends JsonSerializer<NotificationDestination> {
    @Override
    public void serialize(
        NotificationDestination value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NotificationDestinationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NotificationDestinationDeserializer
      extends JsonDeserializer<NotificationDestination> {
    @Override
    public NotificationDestination deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NotificationDestinationPb pb = mapper.readValue(p, NotificationDestinationPb.class);
      return NotificationDestination.fromPb(pb);
    }
  }
}

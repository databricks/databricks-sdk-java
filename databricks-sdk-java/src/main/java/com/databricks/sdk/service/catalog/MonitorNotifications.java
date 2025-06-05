// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = MonitorNotifications.MonitorNotificationsSerializer.class)
@JsonDeserialize(using = MonitorNotifications.MonitorNotificationsDeserializer.class)
public class MonitorNotifications {
  /** Who to send notifications to on monitor failure. */
  private MonitorDestination onFailure;

  /** Who to send notifications to when new data classification tags are detected. */
  private MonitorDestination onNewClassificationTagDetected;

  public MonitorNotifications setOnFailure(MonitorDestination onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public MonitorDestination getOnFailure() {
    return onFailure;
  }

  public MonitorNotifications setOnNewClassificationTagDetected(
      MonitorDestination onNewClassificationTagDetected) {
    this.onNewClassificationTagDetected = onNewClassificationTagDetected;
    return this;
  }

  public MonitorDestination getOnNewClassificationTagDetected() {
    return onNewClassificationTagDetected;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorNotifications that = (MonitorNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onNewClassificationTagDetected, that.onNewClassificationTagDetected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onNewClassificationTagDetected);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorNotifications.class)
        .add("onFailure", onFailure)
        .add("onNewClassificationTagDetected", onNewClassificationTagDetected)
        .toString();
  }

  MonitorNotificationsPb toPb() {
    MonitorNotificationsPb pb = new MonitorNotificationsPb();
    pb.setOnFailure(onFailure);
    pb.setOnNewClassificationTagDetected(onNewClassificationTagDetected);

    return pb;
  }

  static MonitorNotifications fromPb(MonitorNotificationsPb pb) {
    MonitorNotifications model = new MonitorNotifications();
    model.setOnFailure(pb.getOnFailure());
    model.setOnNewClassificationTagDetected(pb.getOnNewClassificationTagDetected());

    return model;
  }

  public static class MonitorNotificationsSerializer extends JsonSerializer<MonitorNotifications> {
    @Override
    public void serialize(
        MonitorNotifications value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorNotificationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorNotificationsDeserializer
      extends JsonDeserializer<MonitorNotifications> {
    @Override
    public MonitorNotifications deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorNotificationsPb pb = mapper.readValue(p, MonitorNotificationsPb.class);
      return MonitorNotifications.fromPb(pb);
    }
  }
}

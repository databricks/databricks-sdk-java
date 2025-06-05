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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AlertV2Notification.AlertV2NotificationSerializer.class)
@JsonDeserialize(using = AlertV2Notification.AlertV2NotificationDeserializer.class)
public class AlertV2Notification {
  /** Whether to notify alert subscribers when alert returns back to normal. */
  private Boolean notifyOnOk;

  /**
   * Number of seconds an alert must wait after being triggered to rearm itself. After rearming, it
   * can be triggered again. If 0 or not specified, the alert will not be triggered again.
   */
  private Long retriggerSeconds;

  /** */
  private Collection<AlertV2Subscription> subscriptions;

  public AlertV2Notification setNotifyOnOk(Boolean notifyOnOk) {
    this.notifyOnOk = notifyOnOk;
    return this;
  }

  public Boolean getNotifyOnOk() {
    return notifyOnOk;
  }

  public AlertV2Notification setRetriggerSeconds(Long retriggerSeconds) {
    this.retriggerSeconds = retriggerSeconds;
    return this;
  }

  public Long getRetriggerSeconds() {
    return retriggerSeconds;
  }

  public AlertV2Notification setSubscriptions(Collection<AlertV2Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public Collection<AlertV2Subscription> getSubscriptions() {
    return subscriptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Notification that = (AlertV2Notification) o;
    return Objects.equals(notifyOnOk, that.notifyOnOk)
        && Objects.equals(retriggerSeconds, that.retriggerSeconds)
        && Objects.equals(subscriptions, that.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifyOnOk, retriggerSeconds, subscriptions);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Notification.class)
        .add("notifyOnOk", notifyOnOk)
        .add("retriggerSeconds", retriggerSeconds)
        .add("subscriptions", subscriptions)
        .toString();
  }

  AlertV2NotificationPb toPb() {
    AlertV2NotificationPb pb = new AlertV2NotificationPb();
    pb.setNotifyOnOk(notifyOnOk);
    pb.setRetriggerSeconds(retriggerSeconds);
    pb.setSubscriptions(subscriptions);

    return pb;
  }

  static AlertV2Notification fromPb(AlertV2NotificationPb pb) {
    AlertV2Notification model = new AlertV2Notification();
    model.setNotifyOnOk(pb.getNotifyOnOk());
    model.setRetriggerSeconds(pb.getRetriggerSeconds());
    model.setSubscriptions(pb.getSubscriptions());

    return model;
  }

  public static class AlertV2NotificationSerializer extends JsonSerializer<AlertV2Notification> {
    @Override
    public void serialize(AlertV2Notification value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2NotificationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2NotificationDeserializer
      extends JsonDeserializer<AlertV2Notification> {
    @Override
    public AlertV2Notification deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2NotificationPb pb = mapper.readValue(p, AlertV2NotificationPb.class);
      return AlertV2Notification.fromPb(pb);
    }
  }
}

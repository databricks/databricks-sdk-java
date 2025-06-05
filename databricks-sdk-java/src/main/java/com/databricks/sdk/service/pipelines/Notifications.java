// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = Notifications.NotificationsSerializer.class)
@JsonDeserialize(using = Notifications.NotificationsDeserializer.class)
public class Notifications {
  /**
   * A list of alerts that trigger the sending of notifications to the configured destinations. The
   * supported alerts are:
   *
   * <p>* `on-update-success`: A pipeline update completes successfully. * `on-update-failure`: Each
   * time a pipeline update fails. * `on-update-fatal-failure`: A pipeline update fails with a
   * non-retryable (fatal) error. * `on-flow-failure`: A single data flow fails.
   */
  private Collection<String> alerts;

  /** A list of email addresses notified when a configured alert is triggered. */
  private Collection<String> emailRecipients;

  public Notifications setAlerts(Collection<String> alerts) {
    this.alerts = alerts;
    return this;
  }

  public Collection<String> getAlerts() {
    return alerts;
  }

  public Notifications setEmailRecipients(Collection<String> emailRecipients) {
    this.emailRecipients = emailRecipients;
    return this;
  }

  public Collection<String> getEmailRecipients() {
    return emailRecipients;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Notifications that = (Notifications) o;
    return Objects.equals(alerts, that.alerts)
        && Objects.equals(emailRecipients, that.emailRecipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, emailRecipients);
  }

  @Override
  public String toString() {
    return new ToStringer(Notifications.class)
        .add("alerts", alerts)
        .add("emailRecipients", emailRecipients)
        .toString();
  }

  NotificationsPb toPb() {
    NotificationsPb pb = new NotificationsPb();
    pb.setAlerts(alerts);
    pb.setEmailRecipients(emailRecipients);

    return pb;
  }

  static Notifications fromPb(NotificationsPb pb) {
    Notifications model = new Notifications();
    model.setAlerts(pb.getAlerts());
    model.setEmailRecipients(pb.getEmailRecipients());

    return model;
  }

  public static class NotificationsSerializer extends JsonSerializer<Notifications> {
    @Override
    public void serialize(Notifications value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      NotificationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class NotificationsDeserializer extends JsonDeserializer<Notifications> {
    @Override
    public Notifications deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      NotificationsPb pb = mapper.readValue(p, NotificationsPb.class);
      return Notifications.fromPb(pb);
    }
  }
}

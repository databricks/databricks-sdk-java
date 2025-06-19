// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = WebhookNotifications.WebhookNotificationsSerializer.class)
@JsonDeserialize(using = WebhookNotifications.WebhookNotificationsDeserializer.class)
public class WebhookNotifications {
  /**
   * An optional list of system notification IDs to call when the duration of a run exceeds the
   * threshold specified for the `RUN_DURATION_SECONDS` metric in the `health` field. A maximum of 3
   * destinations can be specified for the `on_duration_warning_threshold_exceeded` property.
   */
  private Collection<Webhook> onDurationWarningThresholdExceeded;

  /**
   * An optional list of system notification IDs to call when the run fails. A maximum of 3
   * destinations can be specified for the `on_failure` property.
   */
  private Collection<Webhook> onFailure;

  /**
   * An optional list of system notification IDs to call when the run starts. A maximum of 3
   * destinations can be specified for the `on_start` property.
   */
  private Collection<Webhook> onStart;

  /**
   * An optional list of system notification IDs to call when any streaming backlog thresholds are
   * exceeded for any stream. Streaming backlog thresholds can be set in the `health` field using
   * the following metrics: `STREAMING_BACKLOG_BYTES`, `STREAMING_BACKLOG_RECORDS`,
   * `STREAMING_BACKLOG_SECONDS`, or `STREAMING_BACKLOG_FILES`. Alerting is based on the 10-minute
   * average of these metrics. If the issue persists, notifications are resent every 30 minutes. A
   * maximum of 3 destinations can be specified for the `on_streaming_backlog_exceeded` property.
   */
  private Collection<Webhook> onStreamingBacklogExceeded;

  /**
   * An optional list of system notification IDs to call when the run completes successfully. A
   * maximum of 3 destinations can be specified for the `on_success` property.
   */
  private Collection<Webhook> onSuccess;

  public WebhookNotifications setOnDurationWarningThresholdExceeded(
      Collection<Webhook> onDurationWarningThresholdExceeded) {
    this.onDurationWarningThresholdExceeded = onDurationWarningThresholdExceeded;
    return this;
  }

  public Collection<Webhook> getOnDurationWarningThresholdExceeded() {
    return onDurationWarningThresholdExceeded;
  }

  public WebhookNotifications setOnFailure(Collection<Webhook> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<Webhook> getOnFailure() {
    return onFailure;
  }

  public WebhookNotifications setOnStart(Collection<Webhook> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<Webhook> getOnStart() {
    return onStart;
  }

  public WebhookNotifications setOnStreamingBacklogExceeded(
      Collection<Webhook> onStreamingBacklogExceeded) {
    this.onStreamingBacklogExceeded = onStreamingBacklogExceeded;
    return this;
  }

  public Collection<Webhook> getOnStreamingBacklogExceeded() {
    return onStreamingBacklogExceeded;
  }

  public WebhookNotifications setOnSuccess(Collection<Webhook> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public Collection<Webhook> getOnSuccess() {
    return onSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WebhookNotifications that = (WebhookNotifications) o;
    return Objects.equals(
            onDurationWarningThresholdExceeded, that.onDurationWarningThresholdExceeded)
        && Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onStreamingBacklogExceeded, that.onStreamingBacklogExceeded)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        onDurationWarningThresholdExceeded,
        onFailure,
        onStart,
        onStreamingBacklogExceeded,
        onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(WebhookNotifications.class)
        .add("onDurationWarningThresholdExceeded", onDurationWarningThresholdExceeded)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onStreamingBacklogExceeded", onStreamingBacklogExceeded)
        .add("onSuccess", onSuccess)
        .toString();
  }

  WebhookNotificationsPb toPb() {
    WebhookNotificationsPb pb = new WebhookNotificationsPb();
    pb.setOnDurationWarningThresholdExceeded(onDurationWarningThresholdExceeded);
    pb.setOnFailure(onFailure);
    pb.setOnStart(onStart);
    pb.setOnStreamingBacklogExceeded(onStreamingBacklogExceeded);
    pb.setOnSuccess(onSuccess);

    return pb;
  }

  static WebhookNotifications fromPb(WebhookNotificationsPb pb) {
    WebhookNotifications model = new WebhookNotifications();
    model.setOnDurationWarningThresholdExceeded(pb.getOnDurationWarningThresholdExceeded());
    model.setOnFailure(pb.getOnFailure());
    model.setOnStart(pb.getOnStart());
    model.setOnStreamingBacklogExceeded(pb.getOnStreamingBacklogExceeded());
    model.setOnSuccess(pb.getOnSuccess());

    return model;
  }

  public static class WebhookNotificationsSerializer extends JsonSerializer<WebhookNotifications> {
    @Override
    public void serialize(
        WebhookNotifications value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WebhookNotificationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WebhookNotificationsDeserializer
      extends JsonDeserializer<WebhookNotifications> {
    @Override
    public WebhookNotifications deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WebhookNotificationsPb pb = mapper.readValue(p, WebhookNotificationsPb.class);
      return WebhookNotifications.fromPb(pb);
    }
  }
}

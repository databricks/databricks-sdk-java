// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class WebhookNotifications {
  /**
   * An optional list of system notification IDs to call when the duration of a run exceeds the
   * threshold specified for the `RUN_DURATION_SECONDS` metric in the `health` field. A maximum of 3
   * destinations can be specified for the `on_duration_warning_threshold_exceeded` property.
   */
  @JsonProperty("on_duration_warning_threshold_exceeded")
  private Collection<Webhook> onDurationWarningThresholdExceeded;

  /**
   * An optional list of system notification IDs to call when the run fails. A maximum of 3
   * destinations can be specified for the `on_failure` property.
   */
  @JsonProperty("on_failure")
  private Collection<Webhook> onFailure;

  /**
   * An optional list of system notification IDs to call when platform-initiated maintenance
   * completes for a continuous job. A maximum of 3 destinations can be specified for the
   * `on_maintenance_complete` property.
   */
  @JsonProperty("on_maintenance_complete")
  private Collection<Webhook> onMaintenanceComplete;

  /**
   * An optional list of system notification IDs to call when platform-initiated maintenance starts
   * for a continuous job. A maximum of 3 destinations can be specified for the
   * `on_maintenance_start` property.
   */
  @JsonProperty("on_maintenance_start")
  private Collection<Webhook> onMaintenanceStart;

  /**
   * An optional list of system notification IDs to call when the run starts. A maximum of 3
   * destinations can be specified for the `on_start` property.
   */
  @JsonProperty("on_start")
  private Collection<Webhook> onStart;

  /**
   * An optional list of system notification IDs to call when any streaming backlog thresholds are
   * exceeded for any stream. Streaming backlog thresholds can be set in the `health` field using
   * the following metrics: `STREAMING_BACKLOG_BYTES`, `STREAMING_BACKLOG_RECORDS`,
   * `STREAMING_BACKLOG_SECONDS`, or `STREAMING_BACKLOG_FILES`. Alerting is based on the 10-minute
   * average of these metrics. If the issue persists, notifications are resent every 30 minutes. A
   * maximum of 3 destinations can be specified for the `on_streaming_backlog_exceeded` property.
   */
  @JsonProperty("on_streaming_backlog_exceeded")
  private Collection<Webhook> onStreamingBacklogExceeded;

  /**
   * An optional list of system notification IDs to call when the run completes successfully. A
   * maximum of 3 destinations can be specified for the `on_success` property.
   */
  @JsonProperty("on_success")
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

  public WebhookNotifications setOnMaintenanceComplete(Collection<Webhook> onMaintenanceComplete) {
    this.onMaintenanceComplete = onMaintenanceComplete;
    return this;
  }

  public Collection<Webhook> getOnMaintenanceComplete() {
    return onMaintenanceComplete;
  }

  public WebhookNotifications setOnMaintenanceStart(Collection<Webhook> onMaintenanceStart) {
    this.onMaintenanceStart = onMaintenanceStart;
    return this;
  }

  public Collection<Webhook> getOnMaintenanceStart() {
    return onMaintenanceStart;
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
        && Objects.equals(onMaintenanceComplete, that.onMaintenanceComplete)
        && Objects.equals(onMaintenanceStart, that.onMaintenanceStart)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onStreamingBacklogExceeded, that.onStreamingBacklogExceeded)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        onDurationWarningThresholdExceeded,
        onFailure,
        onMaintenanceComplete,
        onMaintenanceStart,
        onStart,
        onStreamingBacklogExceeded,
        onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(WebhookNotifications.class)
        .add("onDurationWarningThresholdExceeded", onDurationWarningThresholdExceeded)
        .add("onFailure", onFailure)
        .add("onMaintenanceComplete", onMaintenanceComplete)
        .add("onMaintenanceStart", onMaintenanceStart)
        .add("onStart", onStart)
        .add("onStreamingBacklogExceeded", onStreamingBacklogExceeded)
        .add("onSuccess", onSuccess)
        .toString();
  }
}

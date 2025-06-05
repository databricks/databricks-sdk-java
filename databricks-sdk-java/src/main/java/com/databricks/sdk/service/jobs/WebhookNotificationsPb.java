// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class WebhookNotificationsPb {
  @JsonProperty("on_duration_warning_threshold_exceeded")
  private Collection<Webhook> onDurationWarningThresholdExceeded;

  @JsonProperty("on_failure")
  private Collection<Webhook> onFailure;

  @JsonProperty("on_start")
  private Collection<Webhook> onStart;

  @JsonProperty("on_streaming_backlog_exceeded")
  private Collection<Webhook> onStreamingBacklogExceeded;

  @JsonProperty("on_success")
  private Collection<Webhook> onSuccess;

  public WebhookNotificationsPb setOnDurationWarningThresholdExceeded(
      Collection<Webhook> onDurationWarningThresholdExceeded) {
    this.onDurationWarningThresholdExceeded = onDurationWarningThresholdExceeded;
    return this;
  }

  public Collection<Webhook> getOnDurationWarningThresholdExceeded() {
    return onDurationWarningThresholdExceeded;
  }

  public WebhookNotificationsPb setOnFailure(Collection<Webhook> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<Webhook> getOnFailure() {
    return onFailure;
  }

  public WebhookNotificationsPb setOnStart(Collection<Webhook> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<Webhook> getOnStart() {
    return onStart;
  }

  public WebhookNotificationsPb setOnStreamingBacklogExceeded(
      Collection<Webhook> onStreamingBacklogExceeded) {
    this.onStreamingBacklogExceeded = onStreamingBacklogExceeded;
    return this;
  }

  public Collection<Webhook> getOnStreamingBacklogExceeded() {
    return onStreamingBacklogExceeded;
  }

  public WebhookNotificationsPb setOnSuccess(Collection<Webhook> onSuccess) {
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
    WebhookNotificationsPb that = (WebhookNotificationsPb) o;
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
    return new ToStringer(WebhookNotificationsPb.class)
        .add("onDurationWarningThresholdExceeded", onDurationWarningThresholdExceeded)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onStreamingBacklogExceeded", onStreamingBacklogExceeded)
        .add("onSuccess", onSuccess)
        .toString();
  }
}

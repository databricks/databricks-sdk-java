// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TaskEmailNotificationsPb {
  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;

  @JsonProperty("on_duration_warning_threshold_exceeded")
  private Collection<String> onDurationWarningThresholdExceeded;

  @JsonProperty("on_failure")
  private Collection<String> onFailure;

  @JsonProperty("on_start")
  private Collection<String> onStart;

  @JsonProperty("on_streaming_backlog_exceeded")
  private Collection<String> onStreamingBacklogExceeded;

  @JsonProperty("on_success")
  private Collection<String> onSuccess;

  public TaskEmailNotificationsPb setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
    this.noAlertForSkippedRuns = noAlertForSkippedRuns;
    return this;
  }

  public Boolean getNoAlertForSkippedRuns() {
    return noAlertForSkippedRuns;
  }

  public TaskEmailNotificationsPb setOnDurationWarningThresholdExceeded(
      Collection<String> onDurationWarningThresholdExceeded) {
    this.onDurationWarningThresholdExceeded = onDurationWarningThresholdExceeded;
    return this;
  }

  public Collection<String> getOnDurationWarningThresholdExceeded() {
    return onDurationWarningThresholdExceeded;
  }

  public TaskEmailNotificationsPb setOnFailure(Collection<String> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<String> getOnFailure() {
    return onFailure;
  }

  public TaskEmailNotificationsPb setOnStart(Collection<String> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<String> getOnStart() {
    return onStart;
  }

  public TaskEmailNotificationsPb setOnStreamingBacklogExceeded(
      Collection<String> onStreamingBacklogExceeded) {
    this.onStreamingBacklogExceeded = onStreamingBacklogExceeded;
    return this;
  }

  public Collection<String> getOnStreamingBacklogExceeded() {
    return onStreamingBacklogExceeded;
  }

  public TaskEmailNotificationsPb setOnSuccess(Collection<String> onSuccess) {
    this.onSuccess = onSuccess;
    return this;
  }

  public Collection<String> getOnSuccess() {
    return onSuccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskEmailNotificationsPb that = (TaskEmailNotificationsPb) o;
    return Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns)
        && Objects.equals(
            onDurationWarningThresholdExceeded, that.onDurationWarningThresholdExceeded)
        && Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onStreamingBacklogExceeded, that.onStreamingBacklogExceeded)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        noAlertForSkippedRuns,
        onDurationWarningThresholdExceeded,
        onFailure,
        onStart,
        onStreamingBacklogExceeded,
        onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskEmailNotificationsPb.class)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .add("onDurationWarningThresholdExceeded", onDurationWarningThresholdExceeded)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onStreamingBacklogExceeded", onStreamingBacklogExceeded)
        .add("onSuccess", onSuccess)
        .toString();
  }
}

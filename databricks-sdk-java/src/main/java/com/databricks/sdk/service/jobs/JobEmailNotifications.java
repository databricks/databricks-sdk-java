// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class JobEmailNotifications {
  /**
   * If true, do not send email to recipients specified in `on_failure` if the run is skipped. This
   * field is `deprecated`. Please use the `notification_settings.no_alert_for_skipped_runs` field.
   */
  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;

  /**
   * A list of email addresses to be notified when the duration of a run exceeds the threshold
   * specified for the `RUN_DURATION_SECONDS` metric in the `health` field. If no rule for the
   * `RUN_DURATION_SECONDS` metric is specified in the `health` field for the job, notifications are
   * not sent.
   */
  @JsonProperty("on_duration_warning_threshold_exceeded")
  private Collection<String> onDurationWarningThresholdExceeded;

  /**
   * A list of email addresses to be notified when a run unsuccessfully completes. A run is
   * considered to have completed unsuccessfully if it ends with an `INTERNAL_ERROR`
   * `life_cycle_state` or a `FAILED`, or `TIMED_OUT` result_state. If this is not specified on job
   * creation, reset, or update the list is empty, and notifications are not sent.
   */
  @JsonProperty("on_failure")
  private Collection<String> onFailure;

  /**
   * A list of email addresses to be notified when a run begins. If not specified on job creation,
   * reset, or update, the list is empty, and notifications are not sent.
   */
  @JsonProperty("on_start")
  private Collection<String> onStart;

  /**
   * A list of email addresses to notify when any streaming backlog thresholds are exceeded for any
   * stream. Streaming backlog thresholds can be set in the `health` field using the following
   * metrics: `STREAMING_BACKLOG_BYTES`, `STREAMING_BACKLOG_RECORDS`, `STREAMING_BACKLOG_SECONDS`,
   * or `STREAMING_BACKLOG_FILES`. Alerting is based on the 10-minute average of these metrics. If
   * the issue persists, notifications are resent every 30 minutes.
   */
  @JsonProperty("on_streaming_backlog_exceeded")
  private Collection<String> onStreamingBacklogExceeded;

  /**
   * A list of email addresses to be notified when a run successfully completes. A run is considered
   * to have completed successfully if it ends with a `TERMINATED` `life_cycle_state` and a
   * `SUCCESS` result_state. If not specified on job creation, reset, or update, the list is empty,
   * and notifications are not sent.
   */
  @JsonProperty("on_success")
  private Collection<String> onSuccess;

  public JobEmailNotifications setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
    this.noAlertForSkippedRuns = noAlertForSkippedRuns;
    return this;
  }

  public Boolean getNoAlertForSkippedRuns() {
    return noAlertForSkippedRuns;
  }

  public JobEmailNotifications setOnDurationWarningThresholdExceeded(
      Collection<String> onDurationWarningThresholdExceeded) {
    this.onDurationWarningThresholdExceeded = onDurationWarningThresholdExceeded;
    return this;
  }

  public Collection<String> getOnDurationWarningThresholdExceeded() {
    return onDurationWarningThresholdExceeded;
  }

  public JobEmailNotifications setOnFailure(Collection<String> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<String> getOnFailure() {
    return onFailure;
  }

  public JobEmailNotifications setOnStart(Collection<String> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<String> getOnStart() {
    return onStart;
  }

  public JobEmailNotifications setOnStreamingBacklogExceeded(
      Collection<String> onStreamingBacklogExceeded) {
    this.onStreamingBacklogExceeded = onStreamingBacklogExceeded;
    return this;
  }

  public Collection<String> getOnStreamingBacklogExceeded() {
    return onStreamingBacklogExceeded;
  }

  public JobEmailNotifications setOnSuccess(Collection<String> onSuccess) {
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
    JobEmailNotifications that = (JobEmailNotifications) o;
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
    return new ToStringer(JobEmailNotifications.class)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .add("onDurationWarningThresholdExceeded", onDurationWarningThresholdExceeded)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onStreamingBacklogExceeded", onStreamingBacklogExceeded)
        .add("onSuccess", onSuccess)
        .toString();
  }
}

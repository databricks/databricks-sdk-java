// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class TaskEmailNotifications {
  /**
   * A list of email addresses to be notified when a run unsuccessfully completes. A run is
   * considered to have completed unsuccessfully if it ends with an `INTERNAL_ERROR`
   * `life_cycle_state` or a `SKIPPED`, `FAILED`, or `TIMED_OUT` result_state. If this is not
   * specified on job creation, reset, or update the list is empty, and notifications are not sent.
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
   * A list of email addresses to be notified when a run successfully completes. A run is considered
   * to have completed successfully if it ends with a `TERMINATED` `life_cycle_state` and a
   * `SUCCESSFUL` result_state. If not specified on job creation, reset, or update, the list is
   * empty, and notifications are not sent.
   */
  @JsonProperty("on_success")
  private Collection<String> onSuccess;

  public TaskEmailNotifications setOnFailure(Collection<String> onFailure) {
    this.onFailure = onFailure;
    return this;
  }

  public Collection<String> getOnFailure() {
    return onFailure;
  }

  public TaskEmailNotifications setOnStart(Collection<String> onStart) {
    this.onStart = onStart;
    return this;
  }

  public Collection<String> getOnStart() {
    return onStart;
  }

  public TaskEmailNotifications setOnSuccess(Collection<String> onSuccess) {
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
    TaskEmailNotifications that = (TaskEmailNotifications) o;
    return Objects.equals(onFailure, that.onFailure)
        && Objects.equals(onStart, that.onStart)
        && Objects.equals(onSuccess, that.onSuccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onFailure, onStart, onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskEmailNotifications.class)
        .add("onFailure", onFailure)
        .add("onStart", onStart)
        .add("onSuccess", onSuccess)
        .toString();
  }
}

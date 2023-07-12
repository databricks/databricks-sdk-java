// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class JobEmailNotifications {
  /**
   * If true, do not send email to recipients specified in `on_failure` if the
   * run is skipped.
   */
  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;
  
  /**
   * A list of email addresses to be notified when a run unsuccessfully
   * completes. A run is considered to have completed unsuccessfully if it ends
   * with an `INTERNAL_ERROR` `life_cycle_state` or a `FAILED`, or `TIMED_OUT`
   * result_state. If this is not specified on job creation, reset, or update
   * the list is empty, and notifications are not sent.
   */
  @JsonProperty("on_failure")
  private Collection<String> onFailure;
  
  /**
   * A list of email addresses to be notified when a run begins. If not
   * specified on job creation, reset, or update, the list is empty, and
   * notifications are not sent.
   */
  @JsonProperty("on_start")
  private Collection<String> onStart;
  
  /**
   * A list of email addresses to be notified when a run successfully completes.
   * A run is considered to have completed successfully if it ends with a
   * `TERMINATED` `life_cycle_state` and a `SUCCESS` result_state. If not
   * specified on job creation, reset, or update, the list is empty, and
   * notifications are not sent.
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
    && Objects.equals(onFailure, that.onFailure)
    && Objects.equals(onStart, that.onStart)
    && Objects.equals(onSuccess, that.onSuccess)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(noAlertForSkippedRuns, onFailure, onStart, onSuccess);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEmailNotifications.class)
      .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
      .add("onFailure", onFailure)
      .add("onStart", onStart)
      .add("onSuccess", onSuccess).toString();
  }
}

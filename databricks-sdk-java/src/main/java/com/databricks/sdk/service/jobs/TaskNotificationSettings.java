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
public class TaskNotificationSettings {
  /**
   * If true, do not send notifications to recipients specified in `on_start`
   * for the retried runs and do not send notifications to recipients specified
   * in `on_failure` until the last retry of the run.
   */
  @JsonProperty("alert_on_last_attempt")
  private Boolean alertOnLastAttempt;
  
  /**
   * If true, do not send notifications to recipients specified in `on_failure`
   * if the run is canceled.
   */
  @JsonProperty("no_alert_for_canceled_runs")
  private Boolean noAlertForCanceledRuns;
  
  /**
   * If true, do not send notifications to recipients specified in `on_failure`
   * if the run is skipped.
   */
  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;
  
  public TaskNotificationSettings setAlertOnLastAttempt(Boolean alertOnLastAttempt) {
    this.alertOnLastAttempt = alertOnLastAttempt;
    return this;
  }

  public Boolean getAlertOnLastAttempt() {
    return alertOnLastAttempt;
  }
  
  public TaskNotificationSettings setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
    this.noAlertForCanceledRuns = noAlertForCanceledRuns;
    return this;
  }

  public Boolean getNoAlertForCanceledRuns() {
    return noAlertForCanceledRuns;
  }
  
  public TaskNotificationSettings setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
    this.noAlertForSkippedRuns = noAlertForSkippedRuns;
    return this;
  }

  public Boolean getNoAlertForSkippedRuns() {
    return noAlertForSkippedRuns;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskNotificationSettings that = (TaskNotificationSettings) o;
    return Objects.equals(alertOnLastAttempt, that.alertOnLastAttempt)
    && Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
    && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOnLastAttempt, noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskNotificationSettings.class)
      .add("alertOnLastAttempt", alertOnLastAttempt)
      .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
      .add("noAlertForSkippedRuns", noAlertForSkippedRuns).toString();
  }
}

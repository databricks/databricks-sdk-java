// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TaskNotificationSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TaskNotificationSettings {
  /**
   * If true, do not send notifications to recipients specified in `on_start` for the retried runs
   * and do not send notifications to recipients specified in `on_failure` until the last retry of
   * the run.
   */
  @JsonProperty("alert_on_last_attempt")
  private Boolean alertOnLastAttempt;

  /**
   * If true, do not send notifications to recipients specified in `on_failure` if the run is
   * canceled.
   */
  @JsonProperty("no_alert_for_canceled_runs")
  private Boolean noAlertForCanceledRuns;

  /**
   * If true, do not send notifications to recipients specified in `on_failure` if the run is
   * skipped.
   */
  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;

  /**
   * <p>Setter for the field <code>alertOnLastAttempt</code>.</p>
   *
   * @param alertOnLastAttempt a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.TaskNotificationSettings} object
   */
  public TaskNotificationSettings setAlertOnLastAttempt(Boolean alertOnLastAttempt) {
    this.alertOnLastAttempt = alertOnLastAttempt;
    return this;
  }

  /**
   * <p>Getter for the field <code>alertOnLastAttempt</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getAlertOnLastAttempt() {
    return alertOnLastAttempt;
  }

  /**
   * <p>Setter for the field <code>noAlertForCanceledRuns</code>.</p>
   *
   * @param noAlertForCanceledRuns a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.TaskNotificationSettings} object
   */
  public TaskNotificationSettings setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
    this.noAlertForCanceledRuns = noAlertForCanceledRuns;
    return this;
  }

  /**
   * <p>Getter for the field <code>noAlertForCanceledRuns</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getNoAlertForCanceledRuns() {
    return noAlertForCanceledRuns;
  }

  /**
   * <p>Setter for the field <code>noAlertForSkippedRuns</code>.</p>
   *
   * @param noAlertForSkippedRuns a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.TaskNotificationSettings} object
   */
  public TaskNotificationSettings setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
    this.noAlertForSkippedRuns = noAlertForSkippedRuns;
    return this;
  }

  /**
   * <p>Getter for the field <code>noAlertForSkippedRuns</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getNoAlertForSkippedRuns() {
    return noAlertForSkippedRuns;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskNotificationSettings that = (TaskNotificationSettings) o;
    return Objects.equals(alertOnLastAttempt, that.alertOnLastAttempt)
        && Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
        && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(alertOnLastAttempt, noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TaskNotificationSettings.class)
        .add("alertOnLastAttempt", alertOnLastAttempt)
        .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .toString();
  }
}

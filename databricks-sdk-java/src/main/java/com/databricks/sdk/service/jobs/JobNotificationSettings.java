// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>JobNotificationSettings class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobNotificationSettings {
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
   * <p>Setter for the field <code>noAlertForCanceledRuns</code>.</p>
   *
   * @param noAlertForCanceledRuns a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.JobNotificationSettings} object
   */
  public JobNotificationSettings setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
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
   * @return a {@link com.databricks.sdk.service.jobs.JobNotificationSettings} object
   */
  public JobNotificationSettings setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
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
    JobNotificationSettings that = (JobNotificationSettings) o;
    return Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
        && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(JobNotificationSettings.class)
        .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .toString();
  }
}

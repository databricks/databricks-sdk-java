// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TaskNotificationSettingsPb {
  @JsonProperty("alert_on_last_attempt")
  private Boolean alertOnLastAttempt;

  @JsonProperty("no_alert_for_canceled_runs")
  private Boolean noAlertForCanceledRuns;

  @JsonProperty("no_alert_for_skipped_runs")
  private Boolean noAlertForSkippedRuns;

  public TaskNotificationSettingsPb setAlertOnLastAttempt(Boolean alertOnLastAttempt) {
    this.alertOnLastAttempt = alertOnLastAttempt;
    return this;
  }

  public Boolean getAlertOnLastAttempt() {
    return alertOnLastAttempt;
  }

  public TaskNotificationSettingsPb setNoAlertForCanceledRuns(Boolean noAlertForCanceledRuns) {
    this.noAlertForCanceledRuns = noAlertForCanceledRuns;
    return this;
  }

  public Boolean getNoAlertForCanceledRuns() {
    return noAlertForCanceledRuns;
  }

  public TaskNotificationSettingsPb setNoAlertForSkippedRuns(Boolean noAlertForSkippedRuns) {
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
    TaskNotificationSettingsPb that = (TaskNotificationSettingsPb) o;
    return Objects.equals(alertOnLastAttempt, that.alertOnLastAttempt)
        && Objects.equals(noAlertForCanceledRuns, that.noAlertForCanceledRuns)
        && Objects.equals(noAlertForSkippedRuns, that.noAlertForSkippedRuns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertOnLastAttempt, noAlertForCanceledRuns, noAlertForSkippedRuns);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskNotificationSettingsPb.class)
        .add("alertOnLastAttempt", alertOnLastAttempt)
        .add("noAlertForCanceledRuns", noAlertForCanceledRuns)
        .add("noAlertForSkippedRuns", noAlertForSkippedRuns)
        .toString();
  }
}

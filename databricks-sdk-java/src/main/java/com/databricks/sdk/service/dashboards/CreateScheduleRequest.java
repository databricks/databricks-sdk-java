// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateScheduleRequest {
  /** The cron expression describing the frequency of the periodic refresh for this schedule. */
  @JsonProperty("cron_schedule")
  private CronSchedule cronSchedule;

  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** The display name for schedule. */
  @JsonProperty("display_name")
  private String displayName;

  /** The status indicates whether this schedule is paused or not. */
  @JsonProperty("pause_status")
  private SchedulePauseStatus pauseStatus;

  public CreateScheduleRequest setCronSchedule(CronSchedule cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  public CronSchedule getCronSchedule() {
    return cronSchedule;
  }

  public CreateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateScheduleRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public CreateScheduleRequest setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateScheduleRequest that = (CreateScheduleRequest) o;
    return Objects.equals(cronSchedule, that.cronSchedule)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(pauseStatus, that.pauseStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronSchedule, dashboardId, displayName, pauseStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScheduleRequest.class)
        .add("cronSchedule", cronSchedule)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("pauseStatus", pauseStatus)
        .toString();
  }
}

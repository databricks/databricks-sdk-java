// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateScheduleRequest {
  /** The cron expression describing the frequency of the periodic refresh for this schedule. */
  @JsonProperty("cron_schedule")
  private CronSchedule cronSchedule;

  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** The display name for schedule. */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * The etag for the schedule. Must be left empty on create, must be provided on updates to ensure
   * that the schedule has not been modified since the last read, and can be optionally provided on
   * delete.
   */
  @JsonProperty("etag")
  private String etag;

  /** The status indicates whether this schedule is paused or not. */
  @JsonProperty("pause_status")
  private SchedulePauseStatus pauseStatus;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public UpdateScheduleRequest setCronSchedule(CronSchedule cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  public CronSchedule getCronSchedule() {
    return cronSchedule;
  }

  public UpdateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateScheduleRequest setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public UpdateScheduleRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public UpdateScheduleRequest setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public UpdateScheduleRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateScheduleRequest that = (UpdateScheduleRequest) o;
    return Objects.equals(cronSchedule, that.cronSchedule)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cronSchedule, dashboardId, displayName, etag, pauseStatus, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateScheduleRequest.class)
        .add("cronSchedule", cronSchedule)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("etag", etag)
        .add("pauseStatus", pauseStatus)
        .add("scheduleId", scheduleId)
        .toString();
  }
}

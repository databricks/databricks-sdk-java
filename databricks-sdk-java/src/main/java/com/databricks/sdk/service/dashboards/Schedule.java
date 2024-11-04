// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Schedule {
  /** A timestamp indicating when the schedule was created. */
  @JsonProperty("create_time")
  private String createTime;

  /** The cron expression describing the frequency of the periodic refresh for this schedule. */
  @JsonProperty("cron_schedule")
  private CronSchedule cronSchedule;

  /** UUID identifying the dashboard to which the schedule belongs. */
  @JsonProperty("dashboard_id")
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
  @JsonProperty("schedule_id")
  private String scheduleId;

  /** A timestamp indicating when the schedule was last updated. */
  @JsonProperty("update_time")
  private String updateTime;

  /** The warehouse id to run the dashboard with for the schedule. */
  @JsonProperty("warehouse_id")
  private String warehouseId;

  public Schedule setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public Schedule setCronSchedule(CronSchedule cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  public CronSchedule getCronSchedule() {
    return cronSchedule;
  }

  public Schedule setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public Schedule setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public Schedule setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public Schedule setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public Schedule setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public Schedule setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public Schedule setWarehouseId(String warehouseId) {
    this.warehouseId = warehouseId;
    return this;
  }

  public String getWarehouseId() {
    return warehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Schedule that = (Schedule) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(cronSchedule, that.cronSchedule)
        && Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(etag, that.etag)
        && Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(scheduleId, that.scheduleId)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(warehouseId, that.warehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        cronSchedule,
        dashboardId,
        displayName,
        etag,
        pauseStatus,
        scheduleId,
        updateTime,
        warehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(Schedule.class)
        .add("createTime", createTime)
        .add("cronSchedule", cronSchedule)
        .add("dashboardId", dashboardId)
        .add("displayName", displayName)
        .add("etag", etag)
        .add("pauseStatus", pauseStatus)
        .add("scheduleId", scheduleId)
        .add("updateTime", updateTime)
        .add("warehouseId", warehouseId)
        .toString();
  }
}

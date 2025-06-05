// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SchedulePb {
  @JsonProperty("create_time")
  private String createTime;

  @JsonProperty("cron_schedule")
  private CronSchedule cronSchedule;

  @JsonProperty("dashboard_id")
  private String dashboardId;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("pause_status")
  private SchedulePauseStatus pauseStatus;

  @JsonProperty("schedule_id")
  private String scheduleId;

  @JsonProperty("update_time")
  private String updateTime;

  @JsonProperty("warehouse_id")
  private String warehouseId;

  public SchedulePb setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public SchedulePb setCronSchedule(CronSchedule cronSchedule) {
    this.cronSchedule = cronSchedule;
    return this;
  }

  public CronSchedule getCronSchedule() {
    return cronSchedule;
  }

  public SchedulePb setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public SchedulePb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public SchedulePb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public SchedulePb setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public SchedulePb setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  public SchedulePb setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public SchedulePb setWarehouseId(String warehouseId) {
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
    SchedulePb that = (SchedulePb) o;
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
    return new ToStringer(SchedulePb.class)
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

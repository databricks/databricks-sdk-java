// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = Schedule.ScheduleSerializer.class)
@JsonDeserialize(using = Schedule.ScheduleDeserializer.class)
public class Schedule {
  /** A timestamp indicating when the schedule was created. */
  private String createTime;

  /** The cron expression describing the frequency of the periodic refresh for this schedule. */
  private CronSchedule cronSchedule;

  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** The display name for schedule. */
  private String displayName;

  /**
   * The etag for the schedule. Must be left empty on create, must be provided on updates to ensure
   * that the schedule has not been modified since the last read, and can be optionally provided on
   * delete.
   */
  private String etag;

  /** The status indicates whether this schedule is paused or not. */
  private SchedulePauseStatus pauseStatus;

  /** UUID identifying the schedule. */
  private String scheduleId;

  /** A timestamp indicating when the schedule was last updated. */
  private String updateTime;

  /** The warehouse id to run the dashboard with for the schedule. */
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

  SchedulePb toPb() {
    SchedulePb pb = new SchedulePb();
    pb.setCreateTime(createTime);
    pb.setCronSchedule(cronSchedule);
    pb.setDashboardId(dashboardId);
    pb.setDisplayName(displayName);
    pb.setEtag(etag);
    pb.setPauseStatus(pauseStatus);
    pb.setScheduleId(scheduleId);
    pb.setUpdateTime(updateTime);
    pb.setWarehouseId(warehouseId);

    return pb;
  }

  static Schedule fromPb(SchedulePb pb) {
    Schedule model = new Schedule();
    model.setCreateTime(pb.getCreateTime());
    model.setCronSchedule(pb.getCronSchedule());
    model.setDashboardId(pb.getDashboardId());
    model.setDisplayName(pb.getDisplayName());
    model.setEtag(pb.getEtag());
    model.setPauseStatus(pb.getPauseStatus());
    model.setScheduleId(pb.getScheduleId());
    model.setUpdateTime(pb.getUpdateTime());
    model.setWarehouseId(pb.getWarehouseId());

    return model;
  }

  public static class ScheduleSerializer extends JsonSerializer<Schedule> {
    @Override
    public void serialize(Schedule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SchedulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ScheduleDeserializer extends JsonDeserializer<Schedule> {
    @Override
    public Schedule deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SchedulePb pb = mapper.readValue(p, SchedulePb.class);
      return Schedule.fromPb(pb);
    }
  }
}

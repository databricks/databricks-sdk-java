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

/** Update dashboard schedule */
@Generated
@JsonSerialize(using = UpdateScheduleRequest.UpdateScheduleRequestSerializer.class)
@JsonDeserialize(using = UpdateScheduleRequest.UpdateScheduleRequestDeserializer.class)
public class UpdateScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** */
  private Schedule schedule;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public UpdateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public UpdateScheduleRequest setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedule getSchedule() {
    return schedule;
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
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(schedule, that.schedule)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, schedule, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("schedule", schedule)
        .add("scheduleId", scheduleId)
        .toString();
  }

  UpdateScheduleRequestPb toPb() {
    UpdateScheduleRequestPb pb = new UpdateScheduleRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setSchedule(schedule);
    pb.setScheduleId(scheduleId);

    return pb;
  }

  static UpdateScheduleRequest fromPb(UpdateScheduleRequestPb pb) {
    UpdateScheduleRequest model = new UpdateScheduleRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setSchedule(pb.getSchedule());
    model.setScheduleId(pb.getScheduleId());

    return model;
  }

  public static class UpdateScheduleRequestSerializer
      extends JsonSerializer<UpdateScheduleRequest> {
    @Override
    public void serialize(
        UpdateScheduleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateScheduleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateScheduleRequestDeserializer
      extends JsonDeserializer<UpdateScheduleRequest> {
    @Override
    public UpdateScheduleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateScheduleRequestPb pb = mapper.readValue(p, UpdateScheduleRequestPb.class);
      return UpdateScheduleRequest.fromPb(pb);
    }
  }
}

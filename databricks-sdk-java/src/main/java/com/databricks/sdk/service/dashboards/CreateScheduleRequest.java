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

/** Create dashboard schedule */
@Generated
@JsonSerialize(using = CreateScheduleRequest.CreateScheduleRequestSerializer.class)
@JsonDeserialize(using = CreateScheduleRequest.CreateScheduleRequestDeserializer.class)
public class CreateScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** */
  private Schedule schedule;

  public CreateScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public CreateScheduleRequest setSchedule(Schedule schedule) {
    this.schedule = schedule;
    return this;
  }

  public Schedule getSchedule() {
    return schedule;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateScheduleRequest that = (CreateScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId) && Objects.equals(schedule, that.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, schedule);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("schedule", schedule)
        .toString();
  }

  CreateScheduleRequestPb toPb() {
    CreateScheduleRequestPb pb = new CreateScheduleRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setSchedule(schedule);

    return pb;
  }

  static CreateScheduleRequest fromPb(CreateScheduleRequestPb pb) {
    CreateScheduleRequest model = new CreateScheduleRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setSchedule(pb.getSchedule());

    return model;
  }

  public static class CreateScheduleRequestSerializer
      extends JsonSerializer<CreateScheduleRequest> {
    @Override
    public void serialize(
        CreateScheduleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateScheduleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateScheduleRequestDeserializer
      extends JsonDeserializer<CreateScheduleRequest> {
    @Override
    public CreateScheduleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateScheduleRequestPb pb = mapper.readValue(p, CreateScheduleRequestPb.class);
      return CreateScheduleRequest.fromPb(pb);
    }
  }
}

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

/** Get dashboard schedule */
@Generated
@JsonSerialize(using = GetScheduleRequest.GetScheduleRequestSerializer.class)
@JsonDeserialize(using = GetScheduleRequest.GetScheduleRequestDeserializer.class)
public class GetScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public GetScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetScheduleRequest setScheduleId(String scheduleId) {
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
    GetScheduleRequest that = (GetScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("scheduleId", scheduleId)
        .toString();
  }

  GetScheduleRequestPb toPb() {
    GetScheduleRequestPb pb = new GetScheduleRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setScheduleId(scheduleId);

    return pb;
  }

  static GetScheduleRequest fromPb(GetScheduleRequestPb pb) {
    GetScheduleRequest model = new GetScheduleRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setScheduleId(pb.getScheduleId());

    return model;
  }

  public static class GetScheduleRequestSerializer extends JsonSerializer<GetScheduleRequest> {
    @Override
    public void serialize(GetScheduleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetScheduleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetScheduleRequestDeserializer extends JsonDeserializer<GetScheduleRequest> {
    @Override
    public GetScheduleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetScheduleRequestPb pb = mapper.readValue(p, GetScheduleRequestPb.class);
      return GetScheduleRequest.fromPb(pb);
    }
  }
}

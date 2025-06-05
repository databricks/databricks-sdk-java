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

/** Delete dashboard schedule */
@Generated
@JsonSerialize(using = DeleteScheduleRequest.DeleteScheduleRequestSerializer.class)
@JsonDeserialize(using = DeleteScheduleRequest.DeleteScheduleRequestDeserializer.class)
public class DeleteScheduleRequest {
  /** UUID identifying the dashboard to which the schedule belongs. */
  private String dashboardId;

  /**
   * The etag for the schedule. Optionally, it can be provided to verify that the schedule has not
   * been modified from its last retrieval.
   */
  private String etag;

  /** UUID identifying the schedule. */
  private String scheduleId;

  public DeleteScheduleRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public DeleteScheduleRequest setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public DeleteScheduleRequest setScheduleId(String scheduleId) {
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
    DeleteScheduleRequest that = (DeleteScheduleRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(etag, that.etag)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, etag, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteScheduleRequest.class)
        .add("dashboardId", dashboardId)
        .add("etag", etag)
        .add("scheduleId", scheduleId)
        .toString();
  }

  DeleteScheduleRequestPb toPb() {
    DeleteScheduleRequestPb pb = new DeleteScheduleRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setEtag(etag);
    pb.setScheduleId(scheduleId);

    return pb;
  }

  static DeleteScheduleRequest fromPb(DeleteScheduleRequestPb pb) {
    DeleteScheduleRequest model = new DeleteScheduleRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setEtag(pb.getEtag());
    model.setScheduleId(pb.getScheduleId());

    return model;
  }

  public static class DeleteScheduleRequestSerializer
      extends JsonSerializer<DeleteScheduleRequest> {
    @Override
    public void serialize(
        DeleteScheduleRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteScheduleRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteScheduleRequestDeserializer
      extends JsonDeserializer<DeleteScheduleRequest> {
    @Override
    public DeleteScheduleRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteScheduleRequestPb pb = mapper.readValue(p, DeleteScheduleRequestPb.class);
      return DeleteScheduleRequest.fromPb(pb);
    }
  }
}

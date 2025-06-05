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

/** Trash dashboard */
@Generated
@JsonSerialize(using = TrashDashboardRequest.TrashDashboardRequestSerializer.class)
@JsonDeserialize(using = TrashDashboardRequest.TrashDashboardRequestDeserializer.class)
public class TrashDashboardRequest {
  /** UUID identifying the dashboard. */
  private String dashboardId;

  public TrashDashboardRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TrashDashboardRequest that = (TrashDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(TrashDashboardRequest.class).add("dashboardId", dashboardId).toString();
  }

  TrashDashboardRequestPb toPb() {
    TrashDashboardRequestPb pb = new TrashDashboardRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static TrashDashboardRequest fromPb(TrashDashboardRequestPb pb) {
    TrashDashboardRequest model = new TrashDashboardRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class TrashDashboardRequestSerializer
      extends JsonSerializer<TrashDashboardRequest> {
    @Override
    public void serialize(
        TrashDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrashDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrashDashboardRequestDeserializer
      extends JsonDeserializer<TrashDashboardRequest> {
    @Override
    public TrashDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrashDashboardRequestPb pb = mapper.readValue(p, TrashDashboardRequestPb.class);
      return TrashDashboardRequest.fromPb(pb);
    }
  }
}

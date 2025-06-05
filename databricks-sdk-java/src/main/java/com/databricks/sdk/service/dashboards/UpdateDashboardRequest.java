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

/** Update dashboard */
@Generated
@JsonSerialize(using = UpdateDashboardRequest.UpdateDashboardRequestSerializer.class)
@JsonDeserialize(using = UpdateDashboardRequest.UpdateDashboardRequestDeserializer.class)
public class UpdateDashboardRequest {
  /** */
  private Dashboard dashboard;

  /** UUID identifying the dashboard. */
  private String dashboardId;

  public UpdateDashboardRequest setDashboard(Dashboard dashboard) {
    this.dashboard = dashboard;
    return this;
  }

  public Dashboard getDashboard() {
    return dashboard;
  }

  public UpdateDashboardRequest setDashboardId(String dashboardId) {
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
    UpdateDashboardRequest that = (UpdateDashboardRequest) o;
    return Objects.equals(dashboard, that.dashboard)
        && Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboard, dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateDashboardRequest.class)
        .add("dashboard", dashboard)
        .add("dashboardId", dashboardId)
        .toString();
  }

  UpdateDashboardRequestPb toPb() {
    UpdateDashboardRequestPb pb = new UpdateDashboardRequestPb();
    pb.setDashboard(dashboard);
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static UpdateDashboardRequest fromPb(UpdateDashboardRequestPb pb) {
    UpdateDashboardRequest model = new UpdateDashboardRequest();
    model.setDashboard(pb.getDashboard());
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class UpdateDashboardRequestSerializer
      extends JsonSerializer<UpdateDashboardRequest> {
    @Override
    public void serialize(
        UpdateDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateDashboardRequestDeserializer
      extends JsonDeserializer<UpdateDashboardRequest> {
    @Override
    public UpdateDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateDashboardRequestPb pb = mapper.readValue(p, UpdateDashboardRequestPb.class);
      return UpdateDashboardRequest.fromPb(pb);
    }
  }
}

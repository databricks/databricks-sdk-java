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

/** Get published dashboard */
@Generated
@JsonSerialize(using = GetPublishedDashboardRequest.GetPublishedDashboardRequestSerializer.class)
@JsonDeserialize(
    using = GetPublishedDashboardRequest.GetPublishedDashboardRequestDeserializer.class)
public class GetPublishedDashboardRequest {
  /** UUID identifying the published dashboard. */
  private String dashboardId;

  public GetPublishedDashboardRequest setDashboardId(String dashboardId) {
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
    GetPublishedDashboardRequest that = (GetPublishedDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardRequest.class)
        .add("dashboardId", dashboardId)
        .toString();
  }

  GetPublishedDashboardRequestPb toPb() {
    GetPublishedDashboardRequestPb pb = new GetPublishedDashboardRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static GetPublishedDashboardRequest fromPb(GetPublishedDashboardRequestPb pb) {
    GetPublishedDashboardRequest model = new GetPublishedDashboardRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class GetPublishedDashboardRequestSerializer
      extends JsonSerializer<GetPublishedDashboardRequest> {
    @Override
    public void serialize(
        GetPublishedDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedDashboardRequestDeserializer
      extends JsonDeserializer<GetPublishedDashboardRequest> {
    @Override
    public GetPublishedDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedDashboardRequestPb pb = mapper.readValue(p, GetPublishedDashboardRequestPb.class);
      return GetPublishedDashboardRequest.fromPb(pb);
    }
  }
}

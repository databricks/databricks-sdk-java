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

/** Get dashboard */
@Generated
@JsonSerialize(using = GetDashboardRequest.GetDashboardRequestSerializer.class)
@JsonDeserialize(using = GetDashboardRequest.GetDashboardRequestDeserializer.class)
public class GetDashboardRequest {
  /** UUID identifying the dashboard. */
  private String dashboardId;

  public GetDashboardRequest setDashboardId(String dashboardId) {
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
    GetDashboardRequest that = (GetDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetDashboardRequest.class).add("dashboardId", dashboardId).toString();
  }

  GetDashboardRequestPb toPb() {
    GetDashboardRequestPb pb = new GetDashboardRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static GetDashboardRequest fromPb(GetDashboardRequestPb pb) {
    GetDashboardRequest model = new GetDashboardRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class GetDashboardRequestSerializer extends JsonSerializer<GetDashboardRequest> {
    @Override
    public void serialize(GetDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetDashboardRequestDeserializer
      extends JsonDeserializer<GetDashboardRequest> {
    @Override
    public GetDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetDashboardRequestPb pb = mapper.readValue(p, GetDashboardRequestPb.class);
      return GetDashboardRequest.fromPb(pb);
    }
  }
}

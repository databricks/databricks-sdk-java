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

/** Read a published dashboard in an embedded ui. */
@Generated
@JsonSerialize(
    using =
        GetPublishedDashboardEmbeddedRequest.GetPublishedDashboardEmbeddedRequestSerializer.class)
@JsonDeserialize(
    using =
        GetPublishedDashboardEmbeddedRequest.GetPublishedDashboardEmbeddedRequestDeserializer.class)
public class GetPublishedDashboardEmbeddedRequest {
  /** UUID identifying the published dashboard. */
  private String dashboardId;

  public GetPublishedDashboardEmbeddedRequest setDashboardId(String dashboardId) {
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
    GetPublishedDashboardEmbeddedRequest that = (GetPublishedDashboardEmbeddedRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardEmbeddedRequest.class)
        .add("dashboardId", dashboardId)
        .toString();
  }

  GetPublishedDashboardEmbeddedRequestPb toPb() {
    GetPublishedDashboardEmbeddedRequestPb pb = new GetPublishedDashboardEmbeddedRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static GetPublishedDashboardEmbeddedRequest fromPb(GetPublishedDashboardEmbeddedRequestPb pb) {
    GetPublishedDashboardEmbeddedRequest model = new GetPublishedDashboardEmbeddedRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class GetPublishedDashboardEmbeddedRequestSerializer
      extends JsonSerializer<GetPublishedDashboardEmbeddedRequest> {
    @Override
    public void serialize(
        GetPublishedDashboardEmbeddedRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedDashboardEmbeddedRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedDashboardEmbeddedRequestDeserializer
      extends JsonDeserializer<GetPublishedDashboardEmbeddedRequest> {
    @Override
    public GetPublishedDashboardEmbeddedRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedDashboardEmbeddedRequestPb pb =
          mapper.readValue(p, GetPublishedDashboardEmbeddedRequestPb.class);
      return GetPublishedDashboardEmbeddedRequest.fromPb(pb);
    }
  }
}

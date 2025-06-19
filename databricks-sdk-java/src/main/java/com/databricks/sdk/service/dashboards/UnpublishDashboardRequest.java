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

/** Unpublish dashboard */
@Generated
@JsonSerialize(using = UnpublishDashboardRequest.UnpublishDashboardRequestSerializer.class)
@JsonDeserialize(using = UnpublishDashboardRequest.UnpublishDashboardRequestDeserializer.class)
public class UnpublishDashboardRequest {
  /** UUID identifying the published dashboard. */
  private String dashboardId;

  public UnpublishDashboardRequest setDashboardId(String dashboardId) {
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
    UnpublishDashboardRequest that = (UnpublishDashboardRequest) o;
    return Objects.equals(dashboardId, that.dashboardId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId);
  }

  @Override
  public String toString() {
    return new ToStringer(UnpublishDashboardRequest.class)
        .add("dashboardId", dashboardId)
        .toString();
  }

  UnpublishDashboardRequestPb toPb() {
    UnpublishDashboardRequestPb pb = new UnpublishDashboardRequestPb();
    pb.setDashboardId(dashboardId);

    return pb;
  }

  static UnpublishDashboardRequest fromPb(UnpublishDashboardRequestPb pb) {
    UnpublishDashboardRequest model = new UnpublishDashboardRequest();
    model.setDashboardId(pb.getDashboardId());

    return model;
  }

  public static class UnpublishDashboardRequestSerializer
      extends JsonSerializer<UnpublishDashboardRequest> {
    @Override
    public void serialize(
        UnpublishDashboardRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnpublishDashboardRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnpublishDashboardRequestDeserializer
      extends JsonDeserializer<UnpublishDashboardRequest> {
    @Override
    public UnpublishDashboardRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnpublishDashboardRequestPb pb = mapper.readValue(p, UnpublishDashboardRequestPb.class);
      return UnpublishDashboardRequest.fromPb(pb);
    }
  }
}

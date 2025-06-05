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

/** Read an information of a published dashboard to mint an OAuth token. */
@Generated
@JsonSerialize(
    using =
        GetPublishedDashboardTokenInfoRequest.GetPublishedDashboardTokenInfoRequestSerializer.class)
@JsonDeserialize(
    using =
        GetPublishedDashboardTokenInfoRequest.GetPublishedDashboardTokenInfoRequestDeserializer
            .class)
public class GetPublishedDashboardTokenInfoRequest {
  /** UUID identifying the published dashboard. */
  private String dashboardId;

  /** Provided external value to be included in the custom claim. */
  private String externalValue;

  /** Provided external viewer id to be included in the custom claim. */
  private String externalViewerId;

  public GetPublishedDashboardTokenInfoRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetPublishedDashboardTokenInfoRequest setExternalValue(String externalValue) {
    this.externalValue = externalValue;
    return this;
  }

  public String getExternalValue() {
    return externalValue;
  }

  public GetPublishedDashboardTokenInfoRequest setExternalViewerId(String externalViewerId) {
    this.externalViewerId = externalViewerId;
    return this;
  }

  public String getExternalViewerId() {
    return externalViewerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedDashboardTokenInfoRequest that = (GetPublishedDashboardTokenInfoRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(externalValue, that.externalValue)
        && Objects.equals(externalViewerId, that.externalViewerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, externalValue, externalViewerId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedDashboardTokenInfoRequest.class)
        .add("dashboardId", dashboardId)
        .add("externalValue", externalValue)
        .add("externalViewerId", externalViewerId)
        .toString();
  }

  GetPublishedDashboardTokenInfoRequestPb toPb() {
    GetPublishedDashboardTokenInfoRequestPb pb = new GetPublishedDashboardTokenInfoRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setExternalValue(externalValue);
    pb.setExternalViewerId(externalViewerId);

    return pb;
  }

  static GetPublishedDashboardTokenInfoRequest fromPb(GetPublishedDashboardTokenInfoRequestPb pb) {
    GetPublishedDashboardTokenInfoRequest model = new GetPublishedDashboardTokenInfoRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setExternalValue(pb.getExternalValue());
    model.setExternalViewerId(pb.getExternalViewerId());

    return model;
  }

  public static class GetPublishedDashboardTokenInfoRequestSerializer
      extends JsonSerializer<GetPublishedDashboardTokenInfoRequest> {
    @Override
    public void serialize(
        GetPublishedDashboardTokenInfoRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedDashboardTokenInfoRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedDashboardTokenInfoRequestDeserializer
      extends JsonDeserializer<GetPublishedDashboardTokenInfoRequest> {
    @Override
    public GetPublishedDashboardTokenInfoRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedDashboardTokenInfoRequestPb pb =
          mapper.readValue(p, GetPublishedDashboardTokenInfoRequestPb.class);
      return GetPublishedDashboardTokenInfoRequest.fromPb(pb);
    }
  }
}

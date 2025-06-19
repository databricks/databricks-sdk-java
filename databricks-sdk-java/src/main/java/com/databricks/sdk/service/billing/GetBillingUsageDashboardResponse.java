// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

@Generated
@JsonSerialize(
    using = GetBillingUsageDashboardResponse.GetBillingUsageDashboardResponseSerializer.class)
@JsonDeserialize(
    using = GetBillingUsageDashboardResponse.GetBillingUsageDashboardResponseDeserializer.class)
public class GetBillingUsageDashboardResponse {
  /** The unique id of the usage dashboard. */
  private String dashboardId;

  /** The URL of the usage dashboard. */
  private String dashboardUrl;

  public GetBillingUsageDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public GetBillingUsageDashboardResponse setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

  public String getDashboardUrl() {
    return dashboardUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetBillingUsageDashboardResponse that = (GetBillingUsageDashboardResponse) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(dashboardUrl, that.dashboardUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, dashboardUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(GetBillingUsageDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .add("dashboardUrl", dashboardUrl)
        .toString();
  }

  GetBillingUsageDashboardResponsePb toPb() {
    GetBillingUsageDashboardResponsePb pb = new GetBillingUsageDashboardResponsePb();
    pb.setDashboardId(dashboardId);
    pb.setDashboardUrl(dashboardUrl);

    return pb;
  }

  static GetBillingUsageDashboardResponse fromPb(GetBillingUsageDashboardResponsePb pb) {
    GetBillingUsageDashboardResponse model = new GetBillingUsageDashboardResponse();
    model.setDashboardId(pb.getDashboardId());
    model.setDashboardUrl(pb.getDashboardUrl());

    return model;
  }

  public static class GetBillingUsageDashboardResponseSerializer
      extends JsonSerializer<GetBillingUsageDashboardResponse> {
    @Override
    public void serialize(
        GetBillingUsageDashboardResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetBillingUsageDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetBillingUsageDashboardResponseDeserializer
      extends JsonDeserializer<GetBillingUsageDashboardResponse> {
    @Override
    public GetBillingUsageDashboardResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetBillingUsageDashboardResponsePb pb =
          mapper.readValue(p, GetBillingUsageDashboardResponsePb.class);
      return GetBillingUsageDashboardResponse.fromPb(pb);
    }
  }
}

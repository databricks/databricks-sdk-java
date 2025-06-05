// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
    using =
        ListProviderAnalyticsDashboardResponse.ListProviderAnalyticsDashboardResponseSerializer
            .class)
@JsonDeserialize(
    using =
        ListProviderAnalyticsDashboardResponse.ListProviderAnalyticsDashboardResponseDeserializer
            .class)
public class ListProviderAnalyticsDashboardResponse {
  /** dashboard_id will be used to open Lakeview dashboard. */
  private String dashboardId;

  /** */
  private String id;

  /** */
  private Long version;

  public ListProviderAnalyticsDashboardResponse setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListProviderAnalyticsDashboardResponse setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListProviderAnalyticsDashboardResponse setVersion(Long version) {
    this.version = version;
    return this;
  }

  public Long getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListProviderAnalyticsDashboardResponse that = (ListProviderAnalyticsDashboardResponse) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(id, that.id)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, id, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ListProviderAnalyticsDashboardResponse.class)
        .add("dashboardId", dashboardId)
        .add("id", id)
        .add("version", version)
        .toString();
  }

  ListProviderAnalyticsDashboardResponsePb toPb() {
    ListProviderAnalyticsDashboardResponsePb pb = new ListProviderAnalyticsDashboardResponsePb();
    pb.setDashboardId(dashboardId);
    pb.setId(id);
    pb.setVersion(version);

    return pb;
  }

  static ListProviderAnalyticsDashboardResponse fromPb(
      ListProviderAnalyticsDashboardResponsePb pb) {
    ListProviderAnalyticsDashboardResponse model = new ListProviderAnalyticsDashboardResponse();
    model.setDashboardId(pb.getDashboardId());
    model.setId(pb.getId());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class ListProviderAnalyticsDashboardResponseSerializer
      extends JsonSerializer<ListProviderAnalyticsDashboardResponse> {
    @Override
    public void serialize(
        ListProviderAnalyticsDashboardResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListProviderAnalyticsDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListProviderAnalyticsDashboardResponseDeserializer
      extends JsonDeserializer<ListProviderAnalyticsDashboardResponse> {
    @Override
    public ListProviderAnalyticsDashboardResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListProviderAnalyticsDashboardResponsePb pb =
          mapper.readValue(p, ListProviderAnalyticsDashboardResponsePb.class);
      return ListProviderAnalyticsDashboardResponse.fromPb(pb);
    }
  }
}

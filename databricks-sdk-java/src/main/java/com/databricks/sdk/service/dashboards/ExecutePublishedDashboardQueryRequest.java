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

/**
 * Execute query request for published Dashboards. Since published dashboards have the option of
 * running as the publisher, the datasets, warehouse_id are excluded from the request and instead
 * read from the source (lakeview-config) via the additional parameters (dashboardName and
 * dashboardRevisionId)
 */
@Generated
@JsonSerialize(
    using =
        ExecutePublishedDashboardQueryRequest.ExecutePublishedDashboardQueryRequestSerializer.class)
@JsonDeserialize(
    using =
        ExecutePublishedDashboardQueryRequest.ExecutePublishedDashboardQueryRequestDeserializer
            .class)
public class ExecutePublishedDashboardQueryRequest {
  /**
   * Dashboard name and revision_id is required to retrieve PublishedDatasetDataModel which contains
   * the list of datasets, warehouse_id, and embedded_credentials
   */
  private String dashboardName;

  /** */
  private String dashboardRevisionId;

  /**
   * A dashboard schedule can override the warehouse used as compute for processing the published
   * dashboard queries
   */
  private String overrideWarehouseId;

  public ExecutePublishedDashboardQueryRequest setDashboardName(String dashboardName) {
    this.dashboardName = dashboardName;
    return this;
  }

  public String getDashboardName() {
    return dashboardName;
  }

  public ExecutePublishedDashboardQueryRequest setDashboardRevisionId(String dashboardRevisionId) {
    this.dashboardRevisionId = dashboardRevisionId;
    return this;
  }

  public String getDashboardRevisionId() {
    return dashboardRevisionId;
  }

  public ExecutePublishedDashboardQueryRequest setOverrideWarehouseId(String overrideWarehouseId) {
    this.overrideWarehouseId = overrideWarehouseId;
    return this;
  }

  public String getOverrideWarehouseId() {
    return overrideWarehouseId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExecutePublishedDashboardQueryRequest that = (ExecutePublishedDashboardQueryRequest) o;
    return Objects.equals(dashboardName, that.dashboardName)
        && Objects.equals(dashboardRevisionId, that.dashboardRevisionId)
        && Objects.equals(overrideWarehouseId, that.overrideWarehouseId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardName, dashboardRevisionId, overrideWarehouseId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecutePublishedDashboardQueryRequest.class)
        .add("dashboardName", dashboardName)
        .add("dashboardRevisionId", dashboardRevisionId)
        .add("overrideWarehouseId", overrideWarehouseId)
        .toString();
  }

  ExecutePublishedDashboardQueryRequestPb toPb() {
    ExecutePublishedDashboardQueryRequestPb pb = new ExecutePublishedDashboardQueryRequestPb();
    pb.setDashboardName(dashboardName);
    pb.setDashboardRevisionId(dashboardRevisionId);
    pb.setOverrideWarehouseId(overrideWarehouseId);

    return pb;
  }

  static ExecutePublishedDashboardQueryRequest fromPb(ExecutePublishedDashboardQueryRequestPb pb) {
    ExecutePublishedDashboardQueryRequest model = new ExecutePublishedDashboardQueryRequest();
    model.setDashboardName(pb.getDashboardName());
    model.setDashboardRevisionId(pb.getDashboardRevisionId());
    model.setOverrideWarehouseId(pb.getOverrideWarehouseId());

    return model;
  }

  public static class ExecutePublishedDashboardQueryRequestSerializer
      extends JsonSerializer<ExecutePublishedDashboardQueryRequest> {
    @Override
    public void serialize(
        ExecutePublishedDashboardQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExecutePublishedDashboardQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExecutePublishedDashboardQueryRequestDeserializer
      extends JsonDeserializer<ExecutePublishedDashboardQueryRequest> {
    @Override
    public ExecutePublishedDashboardQueryRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExecutePublishedDashboardQueryRequestPb pb =
          mapper.readValue(p, ExecutePublishedDashboardQueryRequestPb.class);
      return ExecutePublishedDashboardQueryRequest.fromPb(pb);
    }
  }
}

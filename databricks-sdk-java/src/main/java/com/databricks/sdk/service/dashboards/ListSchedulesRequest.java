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

/** List dashboard schedules */
@Generated
@JsonSerialize(using = ListSchedulesRequest.ListSchedulesRequestSerializer.class)
@JsonDeserialize(using = ListSchedulesRequest.ListSchedulesRequestDeserializer.class)
public class ListSchedulesRequest {
  /** UUID identifying the dashboard to which the schedules belongs. */
  private String dashboardId;

  /** The number of schedules to return per page. */
  private Long pageSize;

  /**
   * A page token, received from a previous `ListSchedules` call. Use this to retrieve the
   * subsequent page.
   */
  private String pageToken;

  public ListSchedulesRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListSchedulesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSchedulesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSchedulesRequest that = (ListSchedulesRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSchedulesRequest.class)
        .add("dashboardId", dashboardId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListSchedulesRequestPb toPb() {
    ListSchedulesRequestPb pb = new ListSchedulesRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListSchedulesRequest fromPb(ListSchedulesRequestPb pb) {
    ListSchedulesRequest model = new ListSchedulesRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListSchedulesRequestSerializer extends JsonSerializer<ListSchedulesRequest> {
    @Override
    public void serialize(
        ListSchedulesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSchedulesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSchedulesRequestDeserializer
      extends JsonDeserializer<ListSchedulesRequest> {
    @Override
    public ListSchedulesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSchedulesRequestPb pb = mapper.readValue(p, ListSchedulesRequestPb.class);
      return ListSchedulesRequest.fromPb(pb);
    }
  }
}

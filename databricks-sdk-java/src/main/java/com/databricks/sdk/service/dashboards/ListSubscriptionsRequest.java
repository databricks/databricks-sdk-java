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

/** List schedule subscriptions */
@Generated
@JsonSerialize(using = ListSubscriptionsRequest.ListSubscriptionsRequestSerializer.class)
@JsonDeserialize(using = ListSubscriptionsRequest.ListSubscriptionsRequestDeserializer.class)
public class ListSubscriptionsRequest {
  /** UUID identifying the dashboard which the subscriptions belongs. */
  private String dashboardId;

  /** The number of subscriptions to return per page. */
  private Long pageSize;

  /**
   * A page token, received from a previous `ListSubscriptions` call. Use this to retrieve the
   * subsequent page.
   */
  private String pageToken;

  /** UUID identifying the schedule which the subscriptions belongs. */
  private String scheduleId;

  public ListSubscriptionsRequest setDashboardId(String dashboardId) {
    this.dashboardId = dashboardId;
    return this;
  }

  public String getDashboardId() {
    return dashboardId;
  }

  public ListSubscriptionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSubscriptionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSubscriptionsRequest setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }

  public String getScheduleId() {
    return scheduleId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSubscriptionsRequest that = (ListSubscriptionsRequest) o;
    return Objects.equals(dashboardId, that.dashboardId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(scheduleId, that.scheduleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardId, pageSize, pageToken, scheduleId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSubscriptionsRequest.class)
        .add("dashboardId", dashboardId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("scheduleId", scheduleId)
        .toString();
  }

  ListSubscriptionsRequestPb toPb() {
    ListSubscriptionsRequestPb pb = new ListSubscriptionsRequestPb();
    pb.setDashboardId(dashboardId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setScheduleId(scheduleId);

    return pb;
  }

  static ListSubscriptionsRequest fromPb(ListSubscriptionsRequestPb pb) {
    ListSubscriptionsRequest model = new ListSubscriptionsRequest();
    model.setDashboardId(pb.getDashboardId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setScheduleId(pb.getScheduleId());

    return model;
  }

  public static class ListSubscriptionsRequestSerializer
      extends JsonSerializer<ListSubscriptionsRequest> {
    @Override
    public void serialize(
        ListSubscriptionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListSubscriptionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListSubscriptionsRequestDeserializer
      extends JsonDeserializer<ListSubscriptionsRequest> {
    @Override
    public ListSubscriptionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListSubscriptionsRequestPb pb = mapper.readValue(p, ListSubscriptionsRequestPb.class);
      return ListSubscriptionsRequest.fromPb(pb);
    }
  }
}

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

/** List dashboards */
@Generated
@JsonSerialize(using = ListDashboardsRequest.ListDashboardsRequestSerializer.class)
@JsonDeserialize(using = ListDashboardsRequest.ListDashboardsRequestDeserializer.class)
public class ListDashboardsRequest {
  /** The number of dashboards to return per page. */
  private Long pageSize;

  /**
   * A page token, received from a previous `ListDashboards` call. This token can be used to
   * retrieve the subsequent page.
   */
  private String pageToken;

  /**
   * The flag to include dashboards located in the trash. If unspecified, only active dashboards
   * will be returned.
   */
  private Boolean showTrashed;

  /** `DASHBOARD_VIEW_BASIC`only includes summary metadata from the dashboard. */
  private DashboardView view;

  public ListDashboardsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDashboardsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDashboardsRequest setShowTrashed(Boolean showTrashed) {
    this.showTrashed = showTrashed;
    return this;
  }

  public Boolean getShowTrashed() {
    return showTrashed;
  }

  public ListDashboardsRequest setView(DashboardView view) {
    this.view = view;
    return this;
  }

  public DashboardView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDashboardsRequest that = (ListDashboardsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(showTrashed, that.showTrashed)
        && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, showTrashed, view);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("showTrashed", showTrashed)
        .add("view", view)
        .toString();
  }

  ListDashboardsRequestPb toPb() {
    ListDashboardsRequestPb pb = new ListDashboardsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setShowTrashed(showTrashed);
    pb.setView(view);

    return pb;
  }

  static ListDashboardsRequest fromPb(ListDashboardsRequestPb pb) {
    ListDashboardsRequest model = new ListDashboardsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setShowTrashed(pb.getShowTrashed());
    model.setView(pb.getView());

    return model;
  }

  public static class ListDashboardsRequestSerializer
      extends JsonSerializer<ListDashboardsRequest> {
    @Override
    public void serialize(
        ListDashboardsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDashboardsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDashboardsRequestDeserializer
      extends JsonDeserializer<ListDashboardsRequest> {
    @Override
    public ListDashboardsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDashboardsRequestPb pb = mapper.readValue(p, ListDashboardsRequestPb.class);
      return ListDashboardsRequest.fromPb(pb);
    }
  }
}

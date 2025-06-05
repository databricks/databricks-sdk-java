// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Get dashboard objects */
@Generated
@JsonSerialize(using = ListDashboardsRequest.ListDashboardsRequestSerializer.class)
@JsonDeserialize(using = ListDashboardsRequest.ListDashboardsRequestDeserializer.class)
public class ListDashboardsRequest {
  /** Name of dashboard attribute to order by. */
  private ListOrder order;

  /** Page number to retrieve. */
  private Long page;

  /** Number of dashboards to return per page. */
  private Long pageSize;

  /** Full text search term. */
  private String q;

  public ListDashboardsRequest setOrder(ListOrder order) {
    this.order = order;
    return this;
  }

  public ListOrder getOrder() {
    return order;
  }

  public ListDashboardsRequest setPage(Long page) {
    this.page = page;
    return this;
  }

  public Long getPage() {
    return page;
  }

  public ListDashboardsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDashboardsRequest setQ(String q) {
    this.q = q;
    return this;
  }

  public String getQ() {
    return q;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDashboardsRequest that = (ListDashboardsRequest) o;
    return Objects.equals(order, that.order)
        && Objects.equals(page, that.page)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(q, that.q);
  }

  @Override
  public int hashCode() {
    return Objects.hash(order, page, pageSize, q);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDashboardsRequest.class)
        .add("order", order)
        .add("page", page)
        .add("pageSize", pageSize)
        .add("q", q)
        .toString();
  }

  ListDashboardsRequestPb toPb() {
    ListDashboardsRequestPb pb = new ListDashboardsRequestPb();
    pb.setOrder(order);
    pb.setPage(page);
    pb.setPageSize(pageSize);
    pb.setQ(q);

    return pb;
  }

  static ListDashboardsRequest fromPb(ListDashboardsRequestPb pb) {
    ListDashboardsRequest model = new ListDashboardsRequest();
    model.setOrder(pb.getOrder());
    model.setPage(pb.getPage());
    model.setPageSize(pb.getPageSize());
    model.setQ(pb.getQ());

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
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDashboardsRequestPb pb = mapper.readValue(p, ListDashboardsRequestPb.class);
      return ListDashboardsRequest.fromPb(pb);
    }
  }
}

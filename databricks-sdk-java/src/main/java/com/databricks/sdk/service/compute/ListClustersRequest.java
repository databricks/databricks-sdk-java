// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** List clusters */
@Generated
@JsonSerialize(using = ListClustersRequest.ListClustersRequestSerializer.class)
@JsonDeserialize(using = ListClustersRequest.ListClustersRequestDeserializer.class)
public class ListClustersRequest {
  /** Filters to apply to the list of clusters. */
  private ListClustersFilterBy filterBy;

  /**
   * Use this field to specify the maximum number of results to be returned by the server. The
   * server may further constrain the maximum number of results returned in a single page.
   */
  private Long pageSize;

  /**
   * Use next_page_token or prev_page_token returned from the previous request to list the next or
   * previous page of clusters respectively.
   */
  private String pageToken;

  /** Sort the list of clusters by a specific criteria. */
  private ListClustersSortBy sortBy;

  public ListClustersRequest setFilterBy(ListClustersFilterBy filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  public ListClustersFilterBy getFilterBy() {
    return filterBy;
  }

  public ListClustersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListClustersRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListClustersRequest setSortBy(ListClustersSortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  public ListClustersSortBy getSortBy() {
    return sortBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClustersRequest that = (ListClustersRequest) o;
    return Objects.equals(filterBy, that.filterBy)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(sortBy, that.sortBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterBy, pageSize, pageToken, sortBy);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClustersRequest.class)
        .add("filterBy", filterBy)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("sortBy", sortBy)
        .toString();
  }

  ListClustersRequestPb toPb() {
    ListClustersRequestPb pb = new ListClustersRequestPb();
    pb.setFilterBy(filterBy);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);
    pb.setSortBy(sortBy);

    return pb;
  }

  static ListClustersRequest fromPb(ListClustersRequestPb pb) {
    ListClustersRequest model = new ListClustersRequest();
    model.setFilterBy(pb.getFilterBy());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());
    model.setSortBy(pb.getSortBy());

    return model;
  }

  public static class ListClustersRequestSerializer extends JsonSerializer<ListClustersRequest> {
    @Override
    public void serialize(ListClustersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListClustersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListClustersRequestDeserializer
      extends JsonDeserializer<ListClustersRequest> {
    @Override
    public ListClustersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListClustersRequestPb pb = mapper.readValue(p, ListClustersRequestPb.class);
      return ListClustersRequest.fromPb(pb);
    }
  }
}

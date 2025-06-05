// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.database;

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

/** List Database Instances */
@Generated
@JsonSerialize(using = ListDatabaseInstancesRequest.ListDatabaseInstancesRequestSerializer.class)
@JsonDeserialize(
    using = ListDatabaseInstancesRequest.ListDatabaseInstancesRequestDeserializer.class)
public class ListDatabaseInstancesRequest {
  /** Upper bound for items returned. */
  private Long pageSize;

  /**
   * Pagination token to go to the next page of Database Instances. Requests first page if absent.
   */
  private String pageToken;

  public ListDatabaseInstancesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDatabaseInstancesRequest setPageToken(String pageToken) {
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
    ListDatabaseInstancesRequest that = (ListDatabaseInstancesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDatabaseInstancesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListDatabaseInstancesRequestPb toPb() {
    ListDatabaseInstancesRequestPb pb = new ListDatabaseInstancesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListDatabaseInstancesRequest fromPb(ListDatabaseInstancesRequestPb pb) {
    ListDatabaseInstancesRequest model = new ListDatabaseInstancesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListDatabaseInstancesRequestSerializer
      extends JsonSerializer<ListDatabaseInstancesRequest> {
    @Override
    public void serialize(
        ListDatabaseInstancesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListDatabaseInstancesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListDatabaseInstancesRequestDeserializer
      extends JsonDeserializer<ListDatabaseInstancesRequest> {
    @Override
    public ListDatabaseInstancesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListDatabaseInstancesRequestPb pb = mapper.readValue(p, ListDatabaseInstancesRequestPb.class);
      return ListDatabaseInstancesRequest.fromPb(pb);
    }
  }
}

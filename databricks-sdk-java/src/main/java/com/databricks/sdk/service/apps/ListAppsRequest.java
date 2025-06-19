// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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

/** List apps */
@Generated
@JsonSerialize(using = ListAppsRequest.ListAppsRequestSerializer.class)
@JsonDeserialize(using = ListAppsRequest.ListAppsRequestDeserializer.class)
public class ListAppsRequest {
  /** Upper bound for items returned. */
  private Long pageSize;

  /** Pagination token to go to the next page of apps. Requests first page if absent. */
  private String pageToken;

  public ListAppsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAppsRequest setPageToken(String pageToken) {
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
    ListAppsRequest that = (ListAppsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAppsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAppsRequestPb toPb() {
    ListAppsRequestPb pb = new ListAppsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAppsRequest fromPb(ListAppsRequestPb pb) {
    ListAppsRequest model = new ListAppsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAppsRequestSerializer extends JsonSerializer<ListAppsRequest> {
    @Override
    public void serialize(ListAppsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAppsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAppsRequestDeserializer extends JsonDeserializer<ListAppsRequest> {
    @Override
    public ListAppsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAppsRequestPb pb = mapper.readValue(p, ListAppsRequestPb.class);
      return ListAppsRequest.fromPb(pb);
    }
  }
}

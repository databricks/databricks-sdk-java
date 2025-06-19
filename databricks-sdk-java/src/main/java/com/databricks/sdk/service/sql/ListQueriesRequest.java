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

/** List queries */
@Generated
@JsonSerialize(using = ListQueriesRequest.ListQueriesRequestSerializer.class)
@JsonDeserialize(using = ListQueriesRequest.ListQueriesRequestDeserializer.class)
public class ListQueriesRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListQueriesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListQueriesRequest setPageToken(String pageToken) {
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
    ListQueriesRequest that = (ListQueriesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueriesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListQueriesRequestPb toPb() {
    ListQueriesRequestPb pb = new ListQueriesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListQueriesRequest fromPb(ListQueriesRequestPb pb) {
    ListQueriesRequest model = new ListQueriesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListQueriesRequestSerializer extends JsonSerializer<ListQueriesRequest> {
    @Override
    public void serialize(ListQueriesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQueriesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQueriesRequestDeserializer extends JsonDeserializer<ListQueriesRequest> {
    @Override
    public ListQueriesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQueriesRequestPb pb = mapper.readValue(p, ListQueriesRequestPb.class);
      return ListQueriesRequest.fromPb(pb);
    }
  }
}

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

/** List visualizations on a query */
@Generated
@JsonSerialize(
    using = ListVisualizationsForQueryRequest.ListVisualizationsForQueryRequestSerializer.class)
@JsonDeserialize(
    using = ListVisualizationsForQueryRequest.ListVisualizationsForQueryRequestDeserializer.class)
public class ListVisualizationsForQueryRequest {
  /** */
  private String id;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListVisualizationsForQueryRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public ListVisualizationsForQueryRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListVisualizationsForQueryRequest setPageToken(String pageToken) {
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
    ListVisualizationsForQueryRequest that = (ListVisualizationsForQueryRequest) o;
    return Objects.equals(id, that.id)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVisualizationsForQueryRequest.class)
        .add("id", id)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListVisualizationsForQueryRequestPb toPb() {
    ListVisualizationsForQueryRequestPb pb = new ListVisualizationsForQueryRequestPb();
    pb.setId(id);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListVisualizationsForQueryRequest fromPb(ListVisualizationsForQueryRequestPb pb) {
    ListVisualizationsForQueryRequest model = new ListVisualizationsForQueryRequest();
    model.setId(pb.getId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListVisualizationsForQueryRequestSerializer
      extends JsonSerializer<ListVisualizationsForQueryRequest> {
    @Override
    public void serialize(
        ListVisualizationsForQueryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListVisualizationsForQueryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListVisualizationsForQueryRequestDeserializer
      extends JsonDeserializer<ListVisualizationsForQueryRequest> {
    @Override
    public ListVisualizationsForQueryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListVisualizationsForQueryRequestPb pb =
          mapper.readValue(p, ListVisualizationsForQueryRequestPb.class);
      return ListVisualizationsForQueryRequest.fromPb(pb);
    }
  }
}

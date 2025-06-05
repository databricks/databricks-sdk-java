// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

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

/** List clean rooms */
@Generated
@JsonSerialize(using = ListCleanRoomsRequest.ListCleanRoomsRequestSerializer.class)
@JsonDeserialize(using = ListCleanRoomsRequest.ListCleanRoomsRequestDeserializer.class)
public class ListCleanRoomsRequest {
  /** Maximum number of clean rooms to return (i.e., the page length). Defaults to 100. */
  private Long pageSize;

  /** Opaque pagination token to go to next page based on previous query. */
  private String pageToken;

  public ListCleanRoomsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListCleanRoomsRequest setPageToken(String pageToken) {
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
    ListCleanRoomsRequest that = (ListCleanRoomsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListCleanRoomsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListCleanRoomsRequestPb toPb() {
    ListCleanRoomsRequestPb pb = new ListCleanRoomsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListCleanRoomsRequest fromPb(ListCleanRoomsRequestPb pb) {
    ListCleanRoomsRequest model = new ListCleanRoomsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListCleanRoomsRequestSerializer
      extends JsonSerializer<ListCleanRoomsRequest> {
    @Override
    public void serialize(
        ListCleanRoomsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListCleanRoomsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListCleanRoomsRequestDeserializer
      extends JsonDeserializer<ListCleanRoomsRequest> {
    @Override
    public ListCleanRoomsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListCleanRoomsRequestPb pb = mapper.readValue(p, ListCleanRoomsRequestPb.class);
      return ListCleanRoomsRequest.fromPb(pb);
    }
  }
}

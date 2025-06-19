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

/** List alerts */
@Generated
@JsonSerialize(using = ListAlertsRequest.ListAlertsRequestSerializer.class)
@JsonDeserialize(using = ListAlertsRequest.ListAlertsRequestDeserializer.class)
public class ListAlertsRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListAlertsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAlertsRequest setPageToken(String pageToken) {
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
    ListAlertsRequest that = (ListAlertsRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAlertsRequestPb toPb() {
    ListAlertsRequestPb pb = new ListAlertsRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAlertsRequest fromPb(ListAlertsRequestPb pb) {
    ListAlertsRequest model = new ListAlertsRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAlertsRequestSerializer extends JsonSerializer<ListAlertsRequest> {
    @Override
    public void serialize(ListAlertsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAlertsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAlertsRequestDeserializer extends JsonDeserializer<ListAlertsRequest> {
    @Override
    public ListAlertsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAlertsRequestPb pb = mapper.readValue(p, ListAlertsRequestPb.class);
      return ListAlertsRequest.fromPb(pb);
    }
  }
}

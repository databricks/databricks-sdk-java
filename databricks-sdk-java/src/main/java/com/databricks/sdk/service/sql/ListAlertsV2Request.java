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
@JsonSerialize(using = ListAlertsV2Request.ListAlertsV2RequestSerializer.class)
@JsonDeserialize(using = ListAlertsV2Request.ListAlertsV2RequestDeserializer.class)
public class ListAlertsV2Request {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListAlertsV2Request setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListAlertsV2Request setPageToken(String pageToken) {
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
    ListAlertsV2Request that = (ListAlertsV2Request) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAlertsV2Request.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListAlertsV2RequestPb toPb() {
    ListAlertsV2RequestPb pb = new ListAlertsV2RequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListAlertsV2Request fromPb(ListAlertsV2RequestPb pb) {
    ListAlertsV2Request model = new ListAlertsV2Request();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListAlertsV2RequestSerializer extends JsonSerializer<ListAlertsV2Request> {
    @Override
    public void serialize(ListAlertsV2Request value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListAlertsV2RequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAlertsV2RequestDeserializer
      extends JsonDeserializer<ListAlertsV2Request> {
    @Override
    public ListAlertsV2Request deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAlertsV2RequestPb pb = mapper.readValue(p, ListAlertsV2RequestPb.class);
      return ListAlertsV2Request.fromPb(pb);
    }
  }
}

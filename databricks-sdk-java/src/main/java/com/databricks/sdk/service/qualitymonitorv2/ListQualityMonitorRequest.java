// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

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

/** List quality monitors */
@Generated
@JsonSerialize(using = ListQualityMonitorRequest.ListQualityMonitorRequestSerializer.class)
@JsonDeserialize(using = ListQualityMonitorRequest.ListQualityMonitorRequestDeserializer.class)
public class ListQualityMonitorRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListQualityMonitorRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListQualityMonitorRequest setPageToken(String pageToken) {
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
    ListQualityMonitorRequest that = (ListQualityMonitorRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQualityMonitorRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListQualityMonitorRequestPb toPb() {
    ListQualityMonitorRequestPb pb = new ListQualityMonitorRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListQualityMonitorRequest fromPb(ListQualityMonitorRequestPb pb) {
    ListQualityMonitorRequest model = new ListQualityMonitorRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListQualityMonitorRequestSerializer
      extends JsonSerializer<ListQualityMonitorRequest> {
    @Override
    public void serialize(
        ListQualityMonitorRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQualityMonitorRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQualityMonitorRequestDeserializer
      extends JsonDeserializer<ListQualityMonitorRequest> {
    @Override
    public ListQualityMonitorRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQualityMonitorRequestPb pb = mapper.readValue(p, ListQualityMonitorRequestPb.class);
      return ListQualityMonitorRequest.fromPb(pb);
    }
  }
}

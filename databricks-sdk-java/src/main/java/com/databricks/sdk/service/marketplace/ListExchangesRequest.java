// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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

/** List exchanges */
@Generated
@JsonSerialize(using = ListExchangesRequest.ListExchangesRequestSerializer.class)
@JsonDeserialize(using = ListExchangesRequest.ListExchangesRequestDeserializer.class)
public class ListExchangesRequest {
  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListExchangesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListExchangesRequest setPageToken(String pageToken) {
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
    ListExchangesRequest that = (ListExchangesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListExchangesRequestPb toPb() {
    ListExchangesRequestPb pb = new ListExchangesRequestPb();
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListExchangesRequest fromPb(ListExchangesRequestPb pb) {
    ListExchangesRequest model = new ListExchangesRequest();
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListExchangesRequestSerializer extends JsonSerializer<ListExchangesRequest> {
    @Override
    public void serialize(
        ListExchangesRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangesRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangesRequestDeserializer
      extends JsonDeserializer<ListExchangesRequest> {
    @Override
    public ListExchangesRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangesRequestPb pb = mapper.readValue(p, ListExchangesRequestPb.class);
      return ListExchangesRequest.fromPb(pb);
    }
  }
}

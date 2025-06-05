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

/** List exchange filters */
@Generated
@JsonSerialize(using = ListExchangeFiltersRequest.ListExchangeFiltersRequestSerializer.class)
@JsonDeserialize(using = ListExchangeFiltersRequest.ListExchangeFiltersRequestDeserializer.class)
public class ListExchangeFiltersRequest {
  /** */
  private String exchangeId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListExchangeFiltersRequest setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ListExchangeFiltersRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListExchangeFiltersRequest setPageToken(String pageToken) {
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
    ListExchangeFiltersRequest that = (ListExchangeFiltersRequest) o;
    return Objects.equals(exchangeId, that.exchangeId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangeFiltersRequest.class)
        .add("exchangeId", exchangeId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListExchangeFiltersRequestPb toPb() {
    ListExchangeFiltersRequestPb pb = new ListExchangeFiltersRequestPb();
    pb.setExchangeId(exchangeId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListExchangeFiltersRequest fromPb(ListExchangeFiltersRequestPb pb) {
    ListExchangeFiltersRequest model = new ListExchangeFiltersRequest();
    model.setExchangeId(pb.getExchangeId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListExchangeFiltersRequestSerializer
      extends JsonSerializer<ListExchangeFiltersRequest> {
    @Override
    public void serialize(
        ListExchangeFiltersRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangeFiltersRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangeFiltersRequestDeserializer
      extends JsonDeserializer<ListExchangeFiltersRequest> {
    @Override
    public ListExchangeFiltersRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangeFiltersRequestPb pb = mapper.readValue(p, ListExchangeFiltersRequestPb.class);
      return ListExchangeFiltersRequest.fromPb(pb);
    }
  }
}

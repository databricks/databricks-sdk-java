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

/** List listings for exchange */
@Generated
@JsonSerialize(
    using = ListListingsForExchangeRequest.ListListingsForExchangeRequestSerializer.class)
@JsonDeserialize(
    using = ListListingsForExchangeRequest.ListListingsForExchangeRequestDeserializer.class)
public class ListListingsForExchangeRequest {
  /** */
  private String exchangeId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListListingsForExchangeRequest setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public ListListingsForExchangeRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListListingsForExchangeRequest setPageToken(String pageToken) {
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
    ListListingsForExchangeRequest that = (ListListingsForExchangeRequest) o;
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
    return new ToStringer(ListListingsForExchangeRequest.class)
        .add("exchangeId", exchangeId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListListingsForExchangeRequestPb toPb() {
    ListListingsForExchangeRequestPb pb = new ListListingsForExchangeRequestPb();
    pb.setExchangeId(exchangeId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListListingsForExchangeRequest fromPb(ListListingsForExchangeRequestPb pb) {
    ListListingsForExchangeRequest model = new ListListingsForExchangeRequest();
    model.setExchangeId(pb.getExchangeId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListListingsForExchangeRequestSerializer
      extends JsonSerializer<ListListingsForExchangeRequest> {
    @Override
    public void serialize(
        ListListingsForExchangeRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListListingsForExchangeRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListListingsForExchangeRequestDeserializer
      extends JsonDeserializer<ListListingsForExchangeRequest> {
    @Override
    public ListListingsForExchangeRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListListingsForExchangeRequestPb pb =
          mapper.readValue(p, ListListingsForExchangeRequestPb.class);
      return ListListingsForExchangeRequest.fromPb(pb);
    }
  }
}

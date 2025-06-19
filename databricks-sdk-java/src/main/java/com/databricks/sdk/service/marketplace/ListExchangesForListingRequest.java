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

/** List exchanges for listing */
@Generated
@JsonSerialize(
    using = ListExchangesForListingRequest.ListExchangesForListingRequestSerializer.class)
@JsonDeserialize(
    using = ListExchangesForListingRequest.ListExchangesForListingRequestDeserializer.class)
public class ListExchangesForListingRequest {
  /** */
  private String listingId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListExchangesForListingRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ListExchangesForListingRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListExchangesForListingRequest setPageToken(String pageToken) {
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
    ListExchangesForListingRequest that = (ListExchangesForListingRequest) o;
    return Objects.equals(listingId, that.listingId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesForListingRequest.class)
        .add("listingId", listingId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListExchangesForListingRequestPb toPb() {
    ListExchangesForListingRequestPb pb = new ListExchangesForListingRequestPb();
    pb.setListingId(listingId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListExchangesForListingRequest fromPb(ListExchangesForListingRequestPb pb) {
    ListExchangesForListingRequest model = new ListExchangesForListingRequest();
    model.setListingId(pb.getListingId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListExchangesForListingRequestSerializer
      extends JsonSerializer<ListExchangesForListingRequest> {
    @Override
    public void serialize(
        ListExchangesForListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangesForListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangesForListingRequestDeserializer
      extends JsonDeserializer<ListExchangesForListingRequest> {
    @Override
    public ListExchangesForListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangesForListingRequestPb pb =
          mapper.readValue(p, ListExchangesForListingRequestPb.class);
      return ListExchangesForListingRequest.fromPb(pb);
    }
  }
}

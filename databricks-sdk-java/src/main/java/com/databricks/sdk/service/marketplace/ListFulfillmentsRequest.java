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

/** List all listing fulfillments */
@Generated
@JsonSerialize(using = ListFulfillmentsRequest.ListFulfillmentsRequestSerializer.class)
@JsonDeserialize(using = ListFulfillmentsRequest.ListFulfillmentsRequestDeserializer.class)
public class ListFulfillmentsRequest {
  /** */
  private String listingId;

  /** */
  private Long pageSize;

  /** */
  private String pageToken;

  public ListFulfillmentsRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  public ListFulfillmentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListFulfillmentsRequest setPageToken(String pageToken) {
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
    ListFulfillmentsRequest that = (ListFulfillmentsRequest) o;
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
    return new ToStringer(ListFulfillmentsRequest.class)
        .add("listingId", listingId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }

  ListFulfillmentsRequestPb toPb() {
    ListFulfillmentsRequestPb pb = new ListFulfillmentsRequestPb();
    pb.setListingId(listingId);
    pb.setPageSize(pageSize);
    pb.setPageToken(pageToken);

    return pb;
  }

  static ListFulfillmentsRequest fromPb(ListFulfillmentsRequestPb pb) {
    ListFulfillmentsRequest model = new ListFulfillmentsRequest();
    model.setListingId(pb.getListingId());
    model.setPageSize(pb.getPageSize());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class ListFulfillmentsRequestSerializer
      extends JsonSerializer<ListFulfillmentsRequest> {
    @Override
    public void serialize(
        ListFulfillmentsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListFulfillmentsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListFulfillmentsRequestDeserializer
      extends JsonDeserializer<ListFulfillmentsRequest> {
    @Override
    public ListFulfillmentsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListFulfillmentsRequestPb pb = mapper.readValue(p, ListFulfillmentsRequestPb.class);
      return ListFulfillmentsRequest.fromPb(pb);
    }
  }
}

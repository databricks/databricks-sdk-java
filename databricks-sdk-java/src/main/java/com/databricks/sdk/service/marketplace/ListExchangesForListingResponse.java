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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = ListExchangesForListingResponse.ListExchangesForListingResponseSerializer.class)
@JsonDeserialize(
    using = ListExchangesForListingResponse.ListExchangesForListingResponseDeserializer.class)
public class ListExchangesForListingResponse {
  /** */
  private Collection<ExchangeListing> exchangeListing;

  /** */
  private String nextPageToken;

  public ListExchangesForListingResponse setExchangeListing(
      Collection<ExchangeListing> exchangeListing) {
    this.exchangeListing = exchangeListing;
    return this;
  }

  public Collection<ExchangeListing> getExchangeListing() {
    return exchangeListing;
  }

  public ListExchangesForListingResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExchangesForListingResponse that = (ListExchangesForListingResponse) o;
    return Objects.equals(exchangeListing, that.exchangeListing)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeListing, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExchangesForListingResponse.class)
        .add("exchangeListing", exchangeListing)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListExchangesForListingResponsePb toPb() {
    ListExchangesForListingResponsePb pb = new ListExchangesForListingResponsePb();
    pb.setExchangeListing(exchangeListing);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListExchangesForListingResponse fromPb(ListExchangesForListingResponsePb pb) {
    ListExchangesForListingResponse model = new ListExchangesForListingResponse();
    model.setExchangeListing(pb.getExchangeListing());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListExchangesForListingResponseSerializer
      extends JsonSerializer<ListExchangesForListingResponse> {
    @Override
    public void serialize(
        ListExchangesForListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExchangesForListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExchangesForListingResponseDeserializer
      extends JsonDeserializer<ListExchangesForListingResponse> {
    @Override
    public ListExchangesForListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExchangesForListingResponsePb pb =
          mapper.readValue(p, ListExchangesForListingResponsePb.class);
      return ListExchangesForListingResponse.fromPb(pb);
    }
  }
}

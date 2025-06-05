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
    using = ListListingsForExchangeResponse.ListListingsForExchangeResponseSerializer.class)
@JsonDeserialize(
    using = ListListingsForExchangeResponse.ListListingsForExchangeResponseDeserializer.class)
public class ListListingsForExchangeResponse {
  /** */
  private Collection<ExchangeListing> exchangeListings;

  /** */
  private String nextPageToken;

  public ListListingsForExchangeResponse setExchangeListings(
      Collection<ExchangeListing> exchangeListings) {
    this.exchangeListings = exchangeListings;
    return this;
  }

  public Collection<ExchangeListing> getExchangeListings() {
    return exchangeListings;
  }

  public ListListingsForExchangeResponse setNextPageToken(String nextPageToken) {
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
    ListListingsForExchangeResponse that = (ListListingsForExchangeResponse) o;
    return Objects.equals(exchangeListings, that.exchangeListings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeListings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsForExchangeResponse.class)
        .add("exchangeListings", exchangeListings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListListingsForExchangeResponsePb toPb() {
    ListListingsForExchangeResponsePb pb = new ListListingsForExchangeResponsePb();
    pb.setExchangeListings(exchangeListings);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListListingsForExchangeResponse fromPb(ListListingsForExchangeResponsePb pb) {
    ListListingsForExchangeResponse model = new ListListingsForExchangeResponse();
    model.setExchangeListings(pb.getExchangeListings());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListListingsForExchangeResponseSerializer
      extends JsonSerializer<ListListingsForExchangeResponse> {
    @Override
    public void serialize(
        ListListingsForExchangeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListListingsForExchangeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListListingsForExchangeResponseDeserializer
      extends JsonDeserializer<ListListingsForExchangeResponse> {
    @Override
    public ListListingsForExchangeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListListingsForExchangeResponsePb pb =
          mapper.readValue(p, ListListingsForExchangeResponsePb.class);
      return ListListingsForExchangeResponse.fromPb(pb);
    }
  }
}

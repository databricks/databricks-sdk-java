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
@JsonSerialize(using = ListListingsResponse.ListListingsResponseSerializer.class)
@JsonDeserialize(using = ListListingsResponse.ListListingsResponseDeserializer.class)
public class ListListingsResponse {
  /** */
  private Collection<Listing> listings;

  /** */
  private String nextPageToken;

  public ListListingsResponse setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  public ListListingsResponse setNextPageToken(String nextPageToken) {
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
    ListListingsResponse that = (ListListingsResponse) o;
    return Objects.equals(listings, that.listings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListListingsResponse.class)
        .add("listings", listings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListListingsResponsePb toPb() {
    ListListingsResponsePb pb = new ListListingsResponsePb();
    pb.setListings(listings);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListListingsResponse fromPb(ListListingsResponsePb pb) {
    ListListingsResponse model = new ListListingsResponse();
    model.setListings(pb.getListings());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListListingsResponseSerializer extends JsonSerializer<ListListingsResponse> {
    @Override
    public void serialize(
        ListListingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListListingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListListingsResponseDeserializer
      extends JsonDeserializer<ListListingsResponse> {
    @Override
    public ListListingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListListingsResponsePb pb = mapper.readValue(p, ListListingsResponsePb.class);
      return ListListingsResponse.fromPb(pb);
    }
  }
}

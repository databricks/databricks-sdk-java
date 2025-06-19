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
@JsonSerialize(using = SearchListingsResponse.SearchListingsResponseSerializer.class)
@JsonDeserialize(using = SearchListingsResponse.SearchListingsResponseDeserializer.class)
public class SearchListingsResponse {
  /** */
  private Collection<Listing> listings;

  /** */
  private String nextPageToken;

  public SearchListingsResponse setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  public SearchListingsResponse setNextPageToken(String nextPageToken) {
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
    SearchListingsResponse that = (SearchListingsResponse) o;
    return Objects.equals(listings, that.listings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchListingsResponse.class)
        .add("listings", listings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  SearchListingsResponsePb toPb() {
    SearchListingsResponsePb pb = new SearchListingsResponsePb();
    pb.setListings(listings);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static SearchListingsResponse fromPb(SearchListingsResponsePb pb) {
    SearchListingsResponse model = new SearchListingsResponse();
    model.setListings(pb.getListings());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class SearchListingsResponseSerializer
      extends JsonSerializer<SearchListingsResponse> {
    @Override
    public void serialize(
        SearchListingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchListingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchListingsResponseDeserializer
      extends JsonDeserializer<SearchListingsResponse> {
    @Override
    public SearchListingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchListingsResponsePb pb = mapper.readValue(p, SearchListingsResponsePb.class);
      return SearchListingsResponse.fromPb(pb);
    }
  }
}

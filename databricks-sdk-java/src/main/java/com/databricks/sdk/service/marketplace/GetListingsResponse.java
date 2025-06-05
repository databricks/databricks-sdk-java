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
@JsonSerialize(using = GetListingsResponse.GetListingsResponseSerializer.class)
@JsonDeserialize(using = GetListingsResponse.GetListingsResponseDeserializer.class)
public class GetListingsResponse {
  /** */
  private Collection<Listing> listings;

  /** */
  private String nextPageToken;

  public GetListingsResponse setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  public GetListingsResponse setNextPageToken(String nextPageToken) {
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
    GetListingsResponse that = (GetListingsResponse) o;
    return Objects.equals(listings, that.listings)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingsResponse.class)
        .add("listings", listings)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  GetListingsResponsePb toPb() {
    GetListingsResponsePb pb = new GetListingsResponsePb();
    pb.setListings(listings);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static GetListingsResponse fromPb(GetListingsResponsePb pb) {
    GetListingsResponse model = new GetListingsResponse();
    model.setListings(pb.getListings());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class GetListingsResponseSerializer extends JsonSerializer<GetListingsResponse> {
    @Override
    public void serialize(GetListingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingsResponseDeserializer
      extends JsonDeserializer<GetListingsResponse> {
    @Override
    public GetListingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingsResponsePb pb = mapper.readValue(p, GetListingsResponsePb.class);
      return GetListingsResponse.fromPb(pb);
    }
  }
}

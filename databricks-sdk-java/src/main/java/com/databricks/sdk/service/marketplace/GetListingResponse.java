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

@Generated
@JsonSerialize(using = GetListingResponse.GetListingResponseSerializer.class)
@JsonDeserialize(using = GetListingResponse.GetListingResponseDeserializer.class)
public class GetListingResponse {
  /** */
  private Listing listing;

  public GetListingResponse setListing(Listing listing) {
    this.listing = listing;
    return this;
  }

  public Listing getListing() {
    return listing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetListingResponse that = (GetListingResponse) o;
    return Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingResponse.class).add("listing", listing).toString();
  }

  GetListingResponsePb toPb() {
    GetListingResponsePb pb = new GetListingResponsePb();
    pb.setListing(listing);

    return pb;
  }

  static GetListingResponse fromPb(GetListingResponsePb pb) {
    GetListingResponse model = new GetListingResponse();
    model.setListing(pb.getListing());

    return model;
  }

  public static class GetListingResponseSerializer extends JsonSerializer<GetListingResponse> {
    @Override
    public void serialize(GetListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingResponseDeserializer extends JsonDeserializer<GetListingResponse> {
    @Override
    public GetListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingResponsePb pb = mapper.readValue(p, GetListingResponsePb.class);
      return GetListingResponse.fromPb(pb);
    }
  }
}

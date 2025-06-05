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
@JsonSerialize(using = UpdateListingResponse.UpdateListingResponseSerializer.class)
@JsonDeserialize(using = UpdateListingResponse.UpdateListingResponseDeserializer.class)
public class UpdateListingResponse {
  /** */
  private Listing listing;

  public UpdateListingResponse setListing(Listing listing) {
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
    UpdateListingResponse that = (UpdateListingResponse) o;
    return Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateListingResponse.class).add("listing", listing).toString();
  }

  UpdateListingResponsePb toPb() {
    UpdateListingResponsePb pb = new UpdateListingResponsePb();
    pb.setListing(listing);

    return pb;
  }

  static UpdateListingResponse fromPb(UpdateListingResponsePb pb) {
    UpdateListingResponse model = new UpdateListingResponse();
    model.setListing(pb.getListing());

    return model;
  }

  public static class UpdateListingResponseSerializer
      extends JsonSerializer<UpdateListingResponse> {
    @Override
    public void serialize(
        UpdateListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateListingResponseDeserializer
      extends JsonDeserializer<UpdateListingResponse> {
    @Override
    public UpdateListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateListingResponsePb pb = mapper.readValue(p, UpdateListingResponsePb.class);
      return UpdateListingResponse.fromPb(pb);
    }
  }
}

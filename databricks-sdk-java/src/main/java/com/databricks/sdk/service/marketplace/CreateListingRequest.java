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
@JsonSerialize(using = CreateListingRequest.CreateListingRequestSerializer.class)
@JsonDeserialize(using = CreateListingRequest.CreateListingRequestDeserializer.class)
public class CreateListingRequest {
  /** */
  private Listing listing;

  public CreateListingRequest setListing(Listing listing) {
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
    CreateListingRequest that = (CreateListingRequest) o;
    return Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listing);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateListingRequest.class).add("listing", listing).toString();
  }

  CreateListingRequestPb toPb() {
    CreateListingRequestPb pb = new CreateListingRequestPb();
    pb.setListing(listing);

    return pb;
  }

  static CreateListingRequest fromPb(CreateListingRequestPb pb) {
    CreateListingRequest model = new CreateListingRequest();
    model.setListing(pb.getListing());

    return model;
  }

  public static class CreateListingRequestSerializer extends JsonSerializer<CreateListingRequest> {
    @Override
    public void serialize(
        CreateListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateListingRequestDeserializer
      extends JsonDeserializer<CreateListingRequest> {
    @Override
    public CreateListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateListingRequestPb pb = mapper.readValue(p, CreateListingRequestPb.class);
      return CreateListingRequest.fromPb(pb);
    }
  }
}

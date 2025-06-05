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
@JsonSerialize(using = UpdateListingRequest.UpdateListingRequestSerializer.class)
@JsonDeserialize(using = UpdateListingRequest.UpdateListingRequestDeserializer.class)
public class UpdateListingRequest {
  /** */
  private String id;

  /** */
  private Listing listing;

  public UpdateListingRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public UpdateListingRequest setListing(Listing listing) {
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
    UpdateListingRequest that = (UpdateListingRequest) o;
    return Objects.equals(id, that.id) && Objects.equals(listing, that.listing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listing);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateListingRequest.class)
        .add("id", id)
        .add("listing", listing)
        .toString();
  }

  UpdateListingRequestPb toPb() {
    UpdateListingRequestPb pb = new UpdateListingRequestPb();
    pb.setId(id);
    pb.setListing(listing);

    return pb;
  }

  static UpdateListingRequest fromPb(UpdateListingRequestPb pb) {
    UpdateListingRequest model = new UpdateListingRequest();
    model.setId(pb.getId());
    model.setListing(pb.getListing());

    return model;
  }

  public static class UpdateListingRequestSerializer extends JsonSerializer<UpdateListingRequest> {
    @Override
    public void serialize(
        UpdateListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateListingRequestDeserializer
      extends JsonDeserializer<UpdateListingRequest> {
    @Override
    public UpdateListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateListingRequestPb pb = mapper.readValue(p, UpdateListingRequestPb.class);
      return UpdateListingRequest.fromPb(pb);
    }
  }
}

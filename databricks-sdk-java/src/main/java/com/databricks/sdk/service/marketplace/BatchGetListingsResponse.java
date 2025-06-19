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
@JsonSerialize(using = BatchGetListingsResponse.BatchGetListingsResponseSerializer.class)
@JsonDeserialize(using = BatchGetListingsResponse.BatchGetListingsResponseDeserializer.class)
public class BatchGetListingsResponse {
  /** */
  private Collection<Listing> listings;

  public BatchGetListingsResponse setListings(Collection<Listing> listings) {
    this.listings = listings;
    return this;
  }

  public Collection<Listing> getListings() {
    return listings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BatchGetListingsResponse that = (BatchGetListingsResponse) o;
    return Objects.equals(listings, that.listings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listings);
  }

  @Override
  public String toString() {
    return new ToStringer(BatchGetListingsResponse.class).add("listings", listings).toString();
  }

  BatchGetListingsResponsePb toPb() {
    BatchGetListingsResponsePb pb = new BatchGetListingsResponsePb();
    pb.setListings(listings);

    return pb;
  }

  static BatchGetListingsResponse fromPb(BatchGetListingsResponsePb pb) {
    BatchGetListingsResponse model = new BatchGetListingsResponse();
    model.setListings(pb.getListings());

    return model;
  }

  public static class BatchGetListingsResponseSerializer
      extends JsonSerializer<BatchGetListingsResponse> {
    @Override
    public void serialize(
        BatchGetListingsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      BatchGetListingsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class BatchGetListingsResponseDeserializer
      extends JsonDeserializer<BatchGetListingsResponse> {
    @Override
    public BatchGetListingsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      BatchGetListingsResponsePb pb = mapper.readValue(p, BatchGetListingsResponsePb.class);
      return BatchGetListingsResponse.fromPb(pb);
    }
  }
}

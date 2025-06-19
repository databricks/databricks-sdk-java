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
@JsonSerialize(using = AddExchangeForListingRequest.AddExchangeForListingRequestSerializer.class)
@JsonDeserialize(
    using = AddExchangeForListingRequest.AddExchangeForListingRequestDeserializer.class)
public class AddExchangeForListingRequest {
  /** */
  private String exchangeId;

  /** */
  private String listingId;

  public AddExchangeForListingRequest setExchangeId(String exchangeId) {
    this.exchangeId = exchangeId;
    return this;
  }

  public String getExchangeId() {
    return exchangeId;
  }

  public AddExchangeForListingRequest setListingId(String listingId) {
    this.listingId = listingId;
    return this;
  }

  public String getListingId() {
    return listingId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddExchangeForListingRequest that = (AddExchangeForListingRequest) o;
    return Objects.equals(exchangeId, that.exchangeId) && Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeId, listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(AddExchangeForListingRequest.class)
        .add("exchangeId", exchangeId)
        .add("listingId", listingId)
        .toString();
  }

  AddExchangeForListingRequestPb toPb() {
    AddExchangeForListingRequestPb pb = new AddExchangeForListingRequestPb();
    pb.setExchangeId(exchangeId);
    pb.setListingId(listingId);

    return pb;
  }

  static AddExchangeForListingRequest fromPb(AddExchangeForListingRequestPb pb) {
    AddExchangeForListingRequest model = new AddExchangeForListingRequest();
    model.setExchangeId(pb.getExchangeId());
    model.setListingId(pb.getListingId());

    return model;
  }

  public static class AddExchangeForListingRequestSerializer
      extends JsonSerializer<AddExchangeForListingRequest> {
    @Override
    public void serialize(
        AddExchangeForListingRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddExchangeForListingRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddExchangeForListingRequestDeserializer
      extends JsonDeserializer<AddExchangeForListingRequest> {
    @Override
    public AddExchangeForListingRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddExchangeForListingRequestPb pb = mapper.readValue(p, AddExchangeForListingRequestPb.class);
      return AddExchangeForListingRequest.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = AddExchangeForListingResponse.AddExchangeForListingResponseSerializer.class)
@JsonDeserialize(
    using = AddExchangeForListingResponse.AddExchangeForListingResponseDeserializer.class)
public class AddExchangeForListingResponse {
  /** */
  private ExchangeListing exchangeForListing;

  public AddExchangeForListingResponse setExchangeForListing(ExchangeListing exchangeForListing) {
    this.exchangeForListing = exchangeForListing;
    return this;
  }

  public ExchangeListing getExchangeForListing() {
    return exchangeForListing;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddExchangeForListingResponse that = (AddExchangeForListingResponse) o;
    return Objects.equals(exchangeForListing, that.exchangeForListing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeForListing);
  }

  @Override
  public String toString() {
    return new ToStringer(AddExchangeForListingResponse.class)
        .add("exchangeForListing", exchangeForListing)
        .toString();
  }

  AddExchangeForListingResponsePb toPb() {
    AddExchangeForListingResponsePb pb = new AddExchangeForListingResponsePb();
    pb.setExchangeForListing(exchangeForListing);

    return pb;
  }

  static AddExchangeForListingResponse fromPb(AddExchangeForListingResponsePb pb) {
    AddExchangeForListingResponse model = new AddExchangeForListingResponse();
    model.setExchangeForListing(pb.getExchangeForListing());

    return model;
  }

  public static class AddExchangeForListingResponseSerializer
      extends JsonSerializer<AddExchangeForListingResponse> {
    @Override
    public void serialize(
        AddExchangeForListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AddExchangeForListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AddExchangeForListingResponseDeserializer
      extends JsonDeserializer<AddExchangeForListingResponse> {
    @Override
    public AddExchangeForListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AddExchangeForListingResponsePb pb =
          mapper.readValue(p, AddExchangeForListingResponsePb.class);
      return AddExchangeForListingResponse.fromPb(pb);
    }
  }
}

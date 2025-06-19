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
@JsonSerialize(
    using = RemoveExchangeForListingResponse.RemoveExchangeForListingResponseSerializer.class)
@JsonDeserialize(
    using = RemoveExchangeForListingResponse.RemoveExchangeForListingResponseDeserializer.class)
public class RemoveExchangeForListingResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(RemoveExchangeForListingResponse.class).toString();
  }

  RemoveExchangeForListingResponsePb toPb() {
    RemoveExchangeForListingResponsePb pb = new RemoveExchangeForListingResponsePb();

    return pb;
  }

  static RemoveExchangeForListingResponse fromPb(RemoveExchangeForListingResponsePb pb) {
    RemoveExchangeForListingResponse model = new RemoveExchangeForListingResponse();

    return model;
  }

  public static class RemoveExchangeForListingResponseSerializer
      extends JsonSerializer<RemoveExchangeForListingResponse> {
    @Override
    public void serialize(
        RemoveExchangeForListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RemoveExchangeForListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RemoveExchangeForListingResponseDeserializer
      extends JsonDeserializer<RemoveExchangeForListingResponse> {
    @Override
    public RemoveExchangeForListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RemoveExchangeForListingResponsePb pb =
          mapper.readValue(p, RemoveExchangeForListingResponsePb.class);
      return RemoveExchangeForListingResponse.fromPb(pb);
    }
  }
}

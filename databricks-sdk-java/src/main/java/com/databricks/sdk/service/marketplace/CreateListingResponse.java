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
@JsonSerialize(using = CreateListingResponse.CreateListingResponseSerializer.class)
@JsonDeserialize(using = CreateListingResponse.CreateListingResponseDeserializer.class)
public class CreateListingResponse {
  /** */
  private String listingId;

  public CreateListingResponse setListingId(String listingId) {
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
    CreateListingResponse that = (CreateListingResponse) o;
    return Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateListingResponse.class).add("listingId", listingId).toString();
  }

  CreateListingResponsePb toPb() {
    CreateListingResponsePb pb = new CreateListingResponsePb();
    pb.setListingId(listingId);

    return pb;
  }

  static CreateListingResponse fromPb(CreateListingResponsePb pb) {
    CreateListingResponse model = new CreateListingResponse();
    model.setListingId(pb.getListingId());

    return model;
  }

  public static class CreateListingResponseSerializer
      extends JsonSerializer<CreateListingResponse> {
    @Override
    public void serialize(
        CreateListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateListingResponseDeserializer
      extends JsonDeserializer<CreateListingResponse> {
    @Override
    public CreateListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateListingResponsePb pb = mapper.readValue(p, CreateListingResponsePb.class);
      return CreateListingResponse.fromPb(pb);
    }
  }
}

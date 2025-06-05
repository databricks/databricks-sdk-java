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

/** Get the personalization request for a listing */
@Generated
@JsonSerialize(
    using = GetPersonalizationRequestRequest.GetPersonalizationRequestRequestSerializer.class)
@JsonDeserialize(
    using = GetPersonalizationRequestRequest.GetPersonalizationRequestRequestDeserializer.class)
public class GetPersonalizationRequestRequest {
  /** */
  private String listingId;

  public GetPersonalizationRequestRequest setListingId(String listingId) {
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
    GetPersonalizationRequestRequest that = (GetPersonalizationRequestRequest) o;
    return Objects.equals(listingId, that.listingId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listingId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPersonalizationRequestRequest.class)
        .add("listingId", listingId)
        .toString();
  }

  GetPersonalizationRequestRequestPb toPb() {
    GetPersonalizationRequestRequestPb pb = new GetPersonalizationRequestRequestPb();
    pb.setListingId(listingId);

    return pb;
  }

  static GetPersonalizationRequestRequest fromPb(GetPersonalizationRequestRequestPb pb) {
    GetPersonalizationRequestRequest model = new GetPersonalizationRequestRequest();
    model.setListingId(pb.getListingId());

    return model;
  }

  public static class GetPersonalizationRequestRequestSerializer
      extends JsonSerializer<GetPersonalizationRequestRequest> {
    @Override
    public void serialize(
        GetPersonalizationRequestRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPersonalizationRequestRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPersonalizationRequestRequestDeserializer
      extends JsonDeserializer<GetPersonalizationRequestRequest> {
    @Override
    public GetPersonalizationRequestRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPersonalizationRequestRequestPb pb =
          mapper.readValue(p, GetPersonalizationRequestRequestPb.class);
      return GetPersonalizationRequestRequest.fromPb(pb);
    }
  }
}

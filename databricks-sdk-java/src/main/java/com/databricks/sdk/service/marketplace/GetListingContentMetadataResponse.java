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
@JsonSerialize(
    using = GetListingContentMetadataResponse.GetListingContentMetadataResponseSerializer.class)
@JsonDeserialize(
    using = GetListingContentMetadataResponse.GetListingContentMetadataResponseDeserializer.class)
public class GetListingContentMetadataResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<SharedDataObject> sharedDataObjects;

  public GetListingContentMetadataResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public GetListingContentMetadataResponse setSharedDataObjects(
      Collection<SharedDataObject> sharedDataObjects) {
    this.sharedDataObjects = sharedDataObjects;
    return this;
  }

  public Collection<SharedDataObject> getSharedDataObjects() {
    return sharedDataObjects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetListingContentMetadataResponse that = (GetListingContentMetadataResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(sharedDataObjects, that.sharedDataObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, sharedDataObjects);
  }

  @Override
  public String toString() {
    return new ToStringer(GetListingContentMetadataResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("sharedDataObjects", sharedDataObjects)
        .toString();
  }

  GetListingContentMetadataResponsePb toPb() {
    GetListingContentMetadataResponsePb pb = new GetListingContentMetadataResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setSharedDataObjects(sharedDataObjects);

    return pb;
  }

  static GetListingContentMetadataResponse fromPb(GetListingContentMetadataResponsePb pb) {
    GetListingContentMetadataResponse model = new GetListingContentMetadataResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setSharedDataObjects(pb.getSharedDataObjects());

    return model;
  }

  public static class GetListingContentMetadataResponseSerializer
      extends JsonSerializer<GetListingContentMetadataResponse> {
    @Override
    public void serialize(
        GetListingContentMetadataResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetListingContentMetadataResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetListingContentMetadataResponseDeserializer
      extends JsonDeserializer<GetListingContentMetadataResponse> {
    @Override
    public GetListingContentMetadataResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetListingContentMetadataResponsePb pb =
          mapper.readValue(p, GetListingContentMetadataResponsePb.class);
      return GetListingContentMetadataResponse.fromPb(pb);
    }
  }
}

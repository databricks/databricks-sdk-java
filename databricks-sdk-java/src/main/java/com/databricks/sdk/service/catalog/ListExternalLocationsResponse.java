// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = ListExternalLocationsResponse.ListExternalLocationsResponseSerializer.class)
@JsonDeserialize(
    using = ListExternalLocationsResponse.ListExternalLocationsResponseDeserializer.class)
public class ListExternalLocationsResponse {
  /** An array of external locations. */
  private Collection<ExternalLocationInfo> externalLocations;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListExternalLocationsResponse setExternalLocations(
      Collection<ExternalLocationInfo> externalLocations) {
    this.externalLocations = externalLocations;
    return this;
  }

  public Collection<ExternalLocationInfo> getExternalLocations() {
    return externalLocations;
  }

  public ListExternalLocationsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListExternalLocationsResponse that = (ListExternalLocationsResponse) o;
    return Objects.equals(externalLocations, that.externalLocations)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalLocations, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListExternalLocationsResponse.class)
        .add("externalLocations", externalLocations)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListExternalLocationsResponsePb toPb() {
    ListExternalLocationsResponsePb pb = new ListExternalLocationsResponsePb();
    pb.setExternalLocations(externalLocations);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListExternalLocationsResponse fromPb(ListExternalLocationsResponsePb pb) {
    ListExternalLocationsResponse model = new ListExternalLocationsResponse();
    model.setExternalLocations(pb.getExternalLocations());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListExternalLocationsResponseSerializer
      extends JsonSerializer<ListExternalLocationsResponse> {
    @Override
    public void serialize(
        ListExternalLocationsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListExternalLocationsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListExternalLocationsResponseDeserializer
      extends JsonDeserializer<ListExternalLocationsResponse> {
    @Override
    public ListExternalLocationsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListExternalLocationsResponsePb pb =
          mapper.readValue(p, ListExternalLocationsResponsePb.class);
      return ListExternalLocationsResponse.fromPb(pb);
    }
  }
}

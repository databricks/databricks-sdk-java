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
    using =
        ListAllPersonalizationRequestsResponse.ListAllPersonalizationRequestsResponseSerializer
            .class)
@JsonDeserialize(
    using =
        ListAllPersonalizationRequestsResponse.ListAllPersonalizationRequestsResponseDeserializer
            .class)
public class ListAllPersonalizationRequestsResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<PersonalizationRequest> personalizationRequests;

  public ListAllPersonalizationRequestsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListAllPersonalizationRequestsResponse setPersonalizationRequests(
      Collection<PersonalizationRequest> personalizationRequests) {
    this.personalizationRequests = personalizationRequests;
    return this;
  }

  public Collection<PersonalizationRequest> getPersonalizationRequests() {
    return personalizationRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListAllPersonalizationRequestsResponse that = (ListAllPersonalizationRequestsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(personalizationRequests, that.personalizationRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, personalizationRequests);
  }

  @Override
  public String toString() {
    return new ToStringer(ListAllPersonalizationRequestsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("personalizationRequests", personalizationRequests)
        .toString();
  }

  ListAllPersonalizationRequestsResponsePb toPb() {
    ListAllPersonalizationRequestsResponsePb pb = new ListAllPersonalizationRequestsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setPersonalizationRequests(personalizationRequests);

    return pb;
  }

  static ListAllPersonalizationRequestsResponse fromPb(
      ListAllPersonalizationRequestsResponsePb pb) {
    ListAllPersonalizationRequestsResponse model = new ListAllPersonalizationRequestsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setPersonalizationRequests(pb.getPersonalizationRequests());

    return model;
  }

  public static class ListAllPersonalizationRequestsResponseSerializer
      extends JsonSerializer<ListAllPersonalizationRequestsResponse> {
    @Override
    public void serialize(
        ListAllPersonalizationRequestsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListAllPersonalizationRequestsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListAllPersonalizationRequestsResponseDeserializer
      extends JsonDeserializer<ListAllPersonalizationRequestsResponse> {
    @Override
    public ListAllPersonalizationRequestsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListAllPersonalizationRequestsResponsePb pb =
          mapper.readValue(p, ListAllPersonalizationRequestsResponsePb.class);
      return ListAllPersonalizationRequestsResponse.fromPb(pb);
    }
  }
}

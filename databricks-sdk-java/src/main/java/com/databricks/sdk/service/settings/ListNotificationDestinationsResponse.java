// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
        ListNotificationDestinationsResponse.ListNotificationDestinationsResponseSerializer.class)
@JsonDeserialize(
    using =
        ListNotificationDestinationsResponse.ListNotificationDestinationsResponseDeserializer.class)
public class ListNotificationDestinationsResponse {
  /** Page token for next of results. */
  private String nextPageToken;

  /** */
  private Collection<ListNotificationDestinationsResult> results;

  public ListNotificationDestinationsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListNotificationDestinationsResponse setResults(
      Collection<ListNotificationDestinationsResult> results) {
    this.results = results;
    return this;
  }

  public Collection<ListNotificationDestinationsResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListNotificationDestinationsResponse that = (ListNotificationDestinationsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNotificationDestinationsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }

  ListNotificationDestinationsResponsePb toPb() {
    ListNotificationDestinationsResponsePb pb = new ListNotificationDestinationsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setResults(results);

    return pb;
  }

  static ListNotificationDestinationsResponse fromPb(ListNotificationDestinationsResponsePb pb) {
    ListNotificationDestinationsResponse model = new ListNotificationDestinationsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListNotificationDestinationsResponseSerializer
      extends JsonSerializer<ListNotificationDestinationsResponse> {
    @Override
    public void serialize(
        ListNotificationDestinationsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListNotificationDestinationsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNotificationDestinationsResponseDeserializer
      extends JsonDeserializer<ListNotificationDestinationsResponse> {
    @Override
    public ListNotificationDestinationsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNotificationDestinationsResponsePb pb =
          mapper.readValue(p, ListNotificationDestinationsResponsePb.class);
      return ListNotificationDestinationsResponse.fromPb(pb);
    }
  }
}

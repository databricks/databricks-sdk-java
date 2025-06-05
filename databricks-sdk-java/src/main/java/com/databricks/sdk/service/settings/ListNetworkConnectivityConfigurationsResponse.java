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

/** The network connectivity configuration list was successfully retrieved. */
@Generated
@JsonSerialize(
    using =
        ListNetworkConnectivityConfigurationsResponse
            .ListNetworkConnectivityConfigurationsResponseSerializer.class)
@JsonDeserialize(
    using =
        ListNetworkConnectivityConfigurationsResponse
            .ListNetworkConnectivityConfigurationsResponseDeserializer.class)
public class ListNetworkConnectivityConfigurationsResponse {
  /** */
  private Collection<NetworkConnectivityConfiguration> items;

  /**
   * A token that can be used to get the next page of results. If null, there are no more results to
   * show.
   */
  private String nextPageToken;

  public ListNetworkConnectivityConfigurationsResponse setItems(
      Collection<NetworkConnectivityConfiguration> items) {
    this.items = items;
    return this;
  }

  public Collection<NetworkConnectivityConfiguration> getItems() {
    return items;
  }

  public ListNetworkConnectivityConfigurationsResponse setNextPageToken(String nextPageToken) {
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
    ListNetworkConnectivityConfigurationsResponse that =
        (ListNetworkConnectivityConfigurationsResponse) o;
    return Objects.equals(items, that.items) && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkConnectivityConfigurationsResponse.class)
        .add("items", items)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListNetworkConnectivityConfigurationsResponsePb toPb() {
    ListNetworkConnectivityConfigurationsResponsePb pb =
        new ListNetworkConnectivityConfigurationsResponsePb();
    pb.setItems(items);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListNetworkConnectivityConfigurationsResponse fromPb(
      ListNetworkConnectivityConfigurationsResponsePb pb) {
    ListNetworkConnectivityConfigurationsResponse model =
        new ListNetworkConnectivityConfigurationsResponse();
    model.setItems(pb.getItems());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListNetworkConnectivityConfigurationsResponseSerializer
      extends JsonSerializer<ListNetworkConnectivityConfigurationsResponse> {
    @Override
    public void serialize(
        ListNetworkConnectivityConfigurationsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      ListNetworkConnectivityConfigurationsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListNetworkConnectivityConfigurationsResponseDeserializer
      extends JsonDeserializer<ListNetworkConnectivityConfigurationsResponse> {
    @Override
    public ListNetworkConnectivityConfigurationsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListNetworkConnectivityConfigurationsResponsePb pb =
          mapper.readValue(p, ListNetworkConnectivityConfigurationsResponsePb.class);
      return ListNetworkConnectivityConfigurationsResponse.fromPb(pb);
    }
  }
}

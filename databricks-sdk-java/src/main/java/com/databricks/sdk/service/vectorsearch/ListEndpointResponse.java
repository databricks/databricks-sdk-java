// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = ListEndpointResponse.ListEndpointResponseSerializer.class)
@JsonDeserialize(using = ListEndpointResponse.ListEndpointResponseDeserializer.class)
public class ListEndpointResponse {
  /** An array of Endpoint objects */
  private Collection<EndpointInfo> endpoints;

  /**
   * A token that can be used to get the next page of results. If not present, there are no more
   * results to show.
   */
  private String nextPageToken;

  public ListEndpointResponse setEndpoints(Collection<EndpointInfo> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public Collection<EndpointInfo> getEndpoints() {
    return endpoints;
  }

  public ListEndpointResponse setNextPageToken(String nextPageToken) {
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
    ListEndpointResponse that = (ListEndpointResponse) o;
    return Objects.equals(endpoints, that.endpoints)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpoints, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointResponse.class)
        .add("endpoints", endpoints)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListEndpointResponsePb toPb() {
    ListEndpointResponsePb pb = new ListEndpointResponsePb();
    pb.setEndpoints(endpoints);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListEndpointResponse fromPb(ListEndpointResponsePb pb) {
    ListEndpointResponse model = new ListEndpointResponse();
    model.setEndpoints(pb.getEndpoints());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListEndpointResponseSerializer extends JsonSerializer<ListEndpointResponse> {
    @Override
    public void serialize(
        ListEndpointResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListEndpointResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListEndpointResponseDeserializer
      extends JsonDeserializer<ListEndpointResponse> {
    @Override
    public ListEndpointResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListEndpointResponsePb pb = mapper.readValue(p, ListEndpointResponsePb.class);
      return ListEndpointResponse.fromPb(pb);
    }
  }
}

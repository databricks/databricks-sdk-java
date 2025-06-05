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
@JsonSerialize(using = ListConnectionsResponse.ListConnectionsResponseSerializer.class)
@JsonDeserialize(using = ListConnectionsResponse.ListConnectionsResponseDeserializer.class)
public class ListConnectionsResponse {
  /** An array of connection information objects. */
  private Collection<ConnectionInfo> connections;

  /**
   * Opaque token to retrieve the next page of results. Absent if there are no more pages.
   * __page_token__ should be set to this value for the next request (for the next page of results).
   */
  private String nextPageToken;

  public ListConnectionsResponse setConnections(Collection<ConnectionInfo> connections) {
    this.connections = connections;
    return this;
  }

  public Collection<ConnectionInfo> getConnections() {
    return connections;
  }

  public ListConnectionsResponse setNextPageToken(String nextPageToken) {
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
    ListConnectionsResponse that = (ListConnectionsResponse) o;
    return Objects.equals(connections, that.connections)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connections, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListConnectionsResponse.class)
        .add("connections", connections)
        .add("nextPageToken", nextPageToken)
        .toString();
  }

  ListConnectionsResponsePb toPb() {
    ListConnectionsResponsePb pb = new ListConnectionsResponsePb();
    pb.setConnections(connections);
    pb.setNextPageToken(nextPageToken);

    return pb;
  }

  static ListConnectionsResponse fromPb(ListConnectionsResponsePb pb) {
    ListConnectionsResponse model = new ListConnectionsResponse();
    model.setConnections(pb.getConnections());
    model.setNextPageToken(pb.getNextPageToken());

    return model;
  }

  public static class ListConnectionsResponseSerializer
      extends JsonSerializer<ListConnectionsResponse> {
    @Override
    public void serialize(
        ListConnectionsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListConnectionsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListConnectionsResponseDeserializer
      extends JsonDeserializer<ListConnectionsResponse> {
    @Override
    public ListConnectionsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListConnectionsResponsePb pb = mapper.readValue(p, ListConnectionsResponsePb.class);
      return ListConnectionsResponse.fromPb(pb);
    }
  }
}

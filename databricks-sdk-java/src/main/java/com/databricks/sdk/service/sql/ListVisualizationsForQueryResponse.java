// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
    using = ListVisualizationsForQueryResponse.ListVisualizationsForQueryResponseSerializer.class)
@JsonDeserialize(
    using = ListVisualizationsForQueryResponse.ListVisualizationsForQueryResponseDeserializer.class)
public class ListVisualizationsForQueryResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<Visualization> results;

  public ListVisualizationsForQueryResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListVisualizationsForQueryResponse setResults(Collection<Visualization> results) {
    this.results = results;
    return this;
  }

  public Collection<Visualization> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListVisualizationsForQueryResponse that = (ListVisualizationsForQueryResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListVisualizationsForQueryResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }

  ListVisualizationsForQueryResponsePb toPb() {
    ListVisualizationsForQueryResponsePb pb = new ListVisualizationsForQueryResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setResults(results);

    return pb;
  }

  static ListVisualizationsForQueryResponse fromPb(ListVisualizationsForQueryResponsePb pb) {
    ListVisualizationsForQueryResponse model = new ListVisualizationsForQueryResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListVisualizationsForQueryResponseSerializer
      extends JsonSerializer<ListVisualizationsForQueryResponse> {
    @Override
    public void serialize(
        ListVisualizationsForQueryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListVisualizationsForQueryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListVisualizationsForQueryResponseDeserializer
      extends JsonDeserializer<ListVisualizationsForQueryResponse> {
    @Override
    public ListVisualizationsForQueryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListVisualizationsForQueryResponsePb pb =
          mapper.readValue(p, ListVisualizationsForQueryResponsePb.class);
      return ListVisualizationsForQueryResponse.fromPb(pb);
    }
  }
}

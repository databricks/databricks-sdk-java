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
@JsonSerialize(using = ListQueryObjectsResponse.ListQueryObjectsResponseSerializer.class)
@JsonDeserialize(using = ListQueryObjectsResponse.ListQueryObjectsResponseDeserializer.class)
public class ListQueryObjectsResponse {
  /** */
  private String nextPageToken;

  /** */
  private Collection<ListQueryObjectsResponseQuery> results;

  public ListQueryObjectsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListQueryObjectsResponse setResults(Collection<ListQueryObjectsResponseQuery> results) {
    this.results = results;
    return this;
  }

  public Collection<ListQueryObjectsResponseQuery> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListQueryObjectsResponse that = (ListQueryObjectsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(ListQueryObjectsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }

  ListQueryObjectsResponsePb toPb() {
    ListQueryObjectsResponsePb pb = new ListQueryObjectsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setResults(results);

    return pb;
  }

  static ListQueryObjectsResponse fromPb(ListQueryObjectsResponsePb pb) {
    ListQueryObjectsResponse model = new ListQueryObjectsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setResults(pb.getResults());

    return model;
  }

  public static class ListQueryObjectsResponseSerializer
      extends JsonSerializer<ListQueryObjectsResponse> {
    @Override
    public void serialize(
        ListQueryObjectsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListQueryObjectsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListQueryObjectsResponseDeserializer
      extends JsonDeserializer<ListQueryObjectsResponse> {
    @Override
    public ListQueryObjectsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListQueryObjectsResponsePb pb = mapper.readValue(p, ListQueryObjectsResponsePb.class);
      return ListQueryObjectsResponse.fromPb(pb);
    }
  }
}

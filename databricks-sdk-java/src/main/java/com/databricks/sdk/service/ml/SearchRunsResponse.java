// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = SearchRunsResponse.SearchRunsResponseSerializer.class)
@JsonDeserialize(using = SearchRunsResponse.SearchRunsResponseDeserializer.class)
public class SearchRunsResponse {
  /** Token for the next page of runs. */
  private String nextPageToken;

  /** Runs that match the search criteria. */
  private Collection<Run> runs;

  public SearchRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchRunsResponse setRuns(Collection<Run> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<Run> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchRunsResponse that = (SearchRunsResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken) && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchRunsResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("runs", runs)
        .toString();
  }

  SearchRunsResponsePb toPb() {
    SearchRunsResponsePb pb = new SearchRunsResponsePb();
    pb.setNextPageToken(nextPageToken);
    pb.setRuns(runs);

    return pb;
  }

  static SearchRunsResponse fromPb(SearchRunsResponsePb pb) {
    SearchRunsResponse model = new SearchRunsResponse();
    model.setNextPageToken(pb.getNextPageToken());
    model.setRuns(pb.getRuns());

    return model;
  }

  public static class SearchRunsResponseSerializer extends JsonSerializer<SearchRunsResponse> {
    @Override
    public void serialize(SearchRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SearchRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SearchRunsResponseDeserializer extends JsonDeserializer<SearchRunsResponse> {
    @Override
    public SearchRunsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SearchRunsResponsePb pb = mapper.readValue(p, SearchRunsResponsePb.class);
      return SearchRunsResponse.fromPb(pb);
    }
  }
}

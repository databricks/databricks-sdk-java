// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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

/** List of runs was retrieved successfully. */
@Generated
@JsonSerialize(using = ListRunsResponse.ListRunsResponseSerializer.class)
@JsonDeserialize(using = ListRunsResponse.ListRunsResponseDeserializer.class)
public class ListRunsResponse {
  /** If true, additional runs matching the provided filter are available for listing. */
  private Boolean hasMore;

  /** A token that can be used to list the next page of runs (if applicable). */
  private String nextPageToken;

  /** A token that can be used to list the previous page of runs (if applicable). */
  private String prevPageToken;

  /**
   * A list of runs, from most recently started to least. Only included in the response if there are
   * runs to list.
   */
  private Collection<BaseRun> runs;

  public ListRunsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListRunsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListRunsResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  public ListRunsResponse setRuns(Collection<BaseRun> runs) {
    this.runs = runs;
    return this;
  }

  public Collection<BaseRun> getRuns() {
    return runs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListRunsResponse that = (ListRunsResponse) o;
    return Objects.equals(hasMore, that.hasMore)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken)
        && Objects.equals(runs, that.runs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, nextPageToken, prevPageToken, runs);
  }

  @Override
  public String toString() {
    return new ToStringer(ListRunsResponse.class)
        .add("hasMore", hasMore)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .add("runs", runs)
        .toString();
  }

  ListRunsResponsePb toPb() {
    ListRunsResponsePb pb = new ListRunsResponsePb();
    pb.setHasMore(hasMore);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);
    pb.setRuns(runs);

    return pb;
  }

  static ListRunsResponse fromPb(ListRunsResponsePb pb) {
    ListRunsResponse model = new ListRunsResponse();
    model.setHasMore(pb.getHasMore());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());
    model.setRuns(pb.getRuns());

    return model;
  }

  public static class ListRunsResponseSerializer extends JsonSerializer<ListRunsResponse> {
    @Override
    public void serialize(ListRunsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListRunsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListRunsResponseDeserializer extends JsonDeserializer<ListRunsResponse> {
    @Override
    public ListRunsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListRunsResponsePb pb = mapper.readValue(p, ListRunsResponsePb.class);
      return ListRunsResponse.fromPb(pb);
    }
  }
}

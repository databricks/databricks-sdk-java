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

/** List of jobs was retrieved successfully. */
@Generated
@JsonSerialize(using = ListJobsResponse.ListJobsResponseSerializer.class)
@JsonDeserialize(using = ListJobsResponse.ListJobsResponseDeserializer.class)
public class ListJobsResponse {
  /** If true, additional jobs matching the provided filter are available for listing. */
  private Boolean hasMore;

  /** The list of jobs. Only included in the response if there are jobs to list. */
  private Collection<BaseJob> jobs;

  /** A token that can be used to list the next page of jobs (if applicable). */
  private String nextPageToken;

  /** A token that can be used to list the previous page of jobs (if applicable). */
  private String prevPageToken;

  public ListJobsResponse setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

  public Boolean getHasMore() {
    return hasMore;
  }

  public ListJobsResponse setJobs(Collection<BaseJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<BaseJob> getJobs() {
    return jobs;
  }

  public ListJobsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListJobsResponse setPrevPageToken(String prevPageToken) {
    this.prevPageToken = prevPageToken;
    return this;
  }

  public String getPrevPageToken() {
    return prevPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListJobsResponse that = (ListJobsResponse) o;
    return Objects.equals(hasMore, that.hasMore)
        && Objects.equals(jobs, that.jobs)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasMore, jobs, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobsResponse.class)
        .add("hasMore", hasMore)
        .add("jobs", jobs)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }

  ListJobsResponsePb toPb() {
    ListJobsResponsePb pb = new ListJobsResponsePb();
    pb.setHasMore(hasMore);
    pb.setJobs(jobs);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);

    return pb;
  }

  static ListJobsResponse fromPb(ListJobsResponsePb pb) {
    ListJobsResponse model = new ListJobsResponse();
    model.setHasMore(pb.getHasMore());
    model.setJobs(pb.getJobs());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());

    return model;
  }

  public static class ListJobsResponseSerializer extends JsonSerializer<ListJobsResponse> {
    @Override
    public void serialize(ListJobsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListJobsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListJobsResponseDeserializer extends JsonDeserializer<ListJobsResponse> {
    @Override
    public ListJobsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListJobsResponsePb pb = mapper.readValue(p, ListJobsResponsePb.class);
      return ListJobsResponse.fromPb(pb);
    }
  }
}

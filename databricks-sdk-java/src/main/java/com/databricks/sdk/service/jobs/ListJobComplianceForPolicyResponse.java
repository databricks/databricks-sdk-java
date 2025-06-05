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

@Generated
@JsonSerialize(
    using = ListJobComplianceForPolicyResponse.ListJobComplianceForPolicyResponseSerializer.class)
@JsonDeserialize(
    using = ListJobComplianceForPolicyResponse.ListJobComplianceForPolicyResponseDeserializer.class)
public class ListJobComplianceForPolicyResponse {
  /** A list of jobs and their policy compliance statuses. */
  private Collection<JobCompliance> jobs;

  /**
   * This field represents the pagination token to retrieve the next page of results. If this field
   * is not in the response, it means no further results for the request.
   */
  private String nextPageToken;

  /**
   * This field represents the pagination token to retrieve the previous page of results. If this
   * field is not in the response, it means no further results for the request.
   */
  private String prevPageToken;

  public ListJobComplianceForPolicyResponse setJobs(Collection<JobCompliance> jobs) {
    this.jobs = jobs;
    return this;
  }

  public Collection<JobCompliance> getJobs() {
    return jobs;
  }

  public ListJobComplianceForPolicyResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListJobComplianceForPolicyResponse setPrevPageToken(String prevPageToken) {
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
    ListJobComplianceForPolicyResponse that = (ListJobComplianceForPolicyResponse) o;
    return Objects.equals(jobs, that.jobs)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(prevPageToken, that.prevPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobs, nextPageToken, prevPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListJobComplianceForPolicyResponse.class)
        .add("jobs", jobs)
        .add("nextPageToken", nextPageToken)
        .add("prevPageToken", prevPageToken)
        .toString();
  }

  ListJobComplianceForPolicyResponsePb toPb() {
    ListJobComplianceForPolicyResponsePb pb = new ListJobComplianceForPolicyResponsePb();
    pb.setJobs(jobs);
    pb.setNextPageToken(nextPageToken);
    pb.setPrevPageToken(prevPageToken);

    return pb;
  }

  static ListJobComplianceForPolicyResponse fromPb(ListJobComplianceForPolicyResponsePb pb) {
    ListJobComplianceForPolicyResponse model = new ListJobComplianceForPolicyResponse();
    model.setJobs(pb.getJobs());
    model.setNextPageToken(pb.getNextPageToken());
    model.setPrevPageToken(pb.getPrevPageToken());

    return model;
  }

  public static class ListJobComplianceForPolicyResponseSerializer
      extends JsonSerializer<ListJobComplianceForPolicyResponse> {
    @Override
    public void serialize(
        ListJobComplianceForPolicyResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ListJobComplianceForPolicyResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ListJobComplianceForPolicyResponseDeserializer
      extends JsonDeserializer<ListJobComplianceForPolicyResponse> {
    @Override
    public ListJobComplianceForPolicyResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ListJobComplianceForPolicyResponsePb pb =
          mapper.readValue(p, ListJobComplianceForPolicyResponsePb.class);
      return ListJobComplianceForPolicyResponse.fromPb(pb);
    }
  }
}

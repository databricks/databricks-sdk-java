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
import java.util.Objects;

/** Get a single job */
@Generated
@JsonSerialize(using = GetJobRequest.GetJobRequestSerializer.class)
@JsonDeserialize(using = GetJobRequest.GetJobRequestDeserializer.class)
public class GetJobRequest {
  /** The canonical identifier of the job to retrieve information about. This field is required. */
  private Long jobId;

  /**
   * Use `next_page_token` returned from the previous GetJob response to request the next page of
   * the job's array properties.
   */
  private String pageToken;

  public GetJobRequest setJobId(Long jobId) {
    this.jobId = jobId;
    return this;
  }

  public Long getJobId() {
    return jobId;
  }

  public GetJobRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetJobRequest that = (GetJobRequest) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(GetJobRequest.class)
        .add("jobId", jobId)
        .add("pageToken", pageToken)
        .toString();
  }

  GetJobRequestPb toPb() {
    GetJobRequestPb pb = new GetJobRequestPb();
    pb.setJobId(jobId);
    pb.setPageToken(pageToken);

    return pb;
  }

  static GetJobRequest fromPb(GetJobRequestPb pb) {
    GetJobRequest model = new GetJobRequest();
    model.setJobId(pb.getJobId());
    model.setPageToken(pb.getPageToken());

    return model;
  }

  public static class GetJobRequestSerializer extends JsonSerializer<GetJobRequest> {
    @Override
    public void serialize(GetJobRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetJobRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetJobRequestDeserializer extends JsonDeserializer<GetJobRequest> {
    @Override
    public GetJobRequest deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetJobRequestPb pb = mapper.readValue(p, GetJobRequestPb.class);
      return GetJobRequest.fromPb(pb);
    }
  }
}

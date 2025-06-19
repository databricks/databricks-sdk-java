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
import java.util.Objects;

@Generated
@JsonSerialize(using = JobSpec.JobSpecSerializer.class)
@JsonDeserialize(using = JobSpec.JobSpecDeserializer.class)
public class JobSpec {
  /** The personal access token used to authorize webhook's job runs. */
  private String accessToken;

  /** ID of the job that the webhook runs. */
  private String jobId;

  /**
   * URL of the workspace containing the job that this webhook runs. If not specified, the job’s
   * workspace URL is assumed to be the same as the workspace where the webhook is created.
   */
  private String workspaceUrl;

  public JobSpec setAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public JobSpec setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobSpec setWorkspaceUrl(String workspaceUrl) {
    this.workspaceUrl = workspaceUrl;
    return this;
  }

  public String getWorkspaceUrl() {
    return workspaceUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobSpec that = (JobSpec) o;
    return Objects.equals(accessToken, that.accessToken)
        && Objects.equals(jobId, that.jobId)
        && Objects.equals(workspaceUrl, that.workspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, jobId, workspaceUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSpec.class)
        .add("accessToken", accessToken)
        .add("jobId", jobId)
        .add("workspaceUrl", workspaceUrl)
        .toString();
  }

  JobSpecPb toPb() {
    JobSpecPb pb = new JobSpecPb();
    pb.setAccessToken(accessToken);
    pb.setJobId(jobId);
    pb.setWorkspaceUrl(workspaceUrl);

    return pb;
  }

  static JobSpec fromPb(JobSpecPb pb) {
    JobSpec model = new JobSpec();
    model.setAccessToken(pb.getAccessToken());
    model.setJobId(pb.getJobId());
    model.setWorkspaceUrl(pb.getWorkspaceUrl());

    return model;
  }

  public static class JobSpecSerializer extends JsonSerializer<JobSpec> {
    @Override
    public void serialize(JobSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobSpecDeserializer extends JsonDeserializer<JobSpec> {
    @Override
    public JobSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobSpecPb pb = mapper.readValue(p, JobSpecPb.class);
      return JobSpec.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = JobSpecWithoutSecret.JobSpecWithoutSecretSerializer.class)
@JsonDeserialize(using = JobSpecWithoutSecret.JobSpecWithoutSecretDeserializer.class)
public class JobSpecWithoutSecret {
  /** ID of the job that the webhook runs. */
  private String jobId;

  /**
   * URL of the workspace containing the job that this webhook runs. Defaults to the workspace URL
   * in which the webhook is created. If not specified, the job’s workspace is assumed to be the
   * same as the webhook’s.
   */
  private String workspaceUrl;

  public JobSpecWithoutSecret setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  public JobSpecWithoutSecret setWorkspaceUrl(String workspaceUrl) {
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
    JobSpecWithoutSecret that = (JobSpecWithoutSecret) o;
    return Objects.equals(jobId, that.jobId) && Objects.equals(workspaceUrl, that.workspaceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, workspaceUrl);
  }

  @Override
  public String toString() {
    return new ToStringer(JobSpecWithoutSecret.class)
        .add("jobId", jobId)
        .add("workspaceUrl", workspaceUrl)
        .toString();
  }

  JobSpecWithoutSecretPb toPb() {
    JobSpecWithoutSecretPb pb = new JobSpecWithoutSecretPb();
    pb.setJobId(jobId);
    pb.setWorkspaceUrl(workspaceUrl);

    return pb;
  }

  static JobSpecWithoutSecret fromPb(JobSpecWithoutSecretPb pb) {
    JobSpecWithoutSecret model = new JobSpecWithoutSecret();
    model.setJobId(pb.getJobId());
    model.setWorkspaceUrl(pb.getWorkspaceUrl());

    return model;
  }

  public static class JobSpecWithoutSecretSerializer extends JsonSerializer<JobSpecWithoutSecret> {
    @Override
    public void serialize(
        JobSpecWithoutSecret value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobSpecWithoutSecretPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobSpecWithoutSecretDeserializer
      extends JsonDeserializer<JobSpecWithoutSecret> {
    @Override
    public JobSpecWithoutSecret deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobSpecWithoutSecretPb pb = mapper.readValue(p, JobSpecWithoutSecretPb.class);
      return JobSpecWithoutSecret.fromPb(pb);
    }
  }
}

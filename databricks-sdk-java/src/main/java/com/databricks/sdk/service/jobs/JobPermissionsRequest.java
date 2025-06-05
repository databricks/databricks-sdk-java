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
@JsonSerialize(using = JobPermissionsRequest.JobPermissionsRequestSerializer.class)
@JsonDeserialize(using = JobPermissionsRequest.JobPermissionsRequestDeserializer.class)
public class JobPermissionsRequest {
  /** */
  private Collection<JobAccessControlRequest> accessControlList;

  /** The job for which to get or manage permissions. */
  private String jobId;

  public JobPermissionsRequest setAccessControlList(
      Collection<JobAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<JobAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public JobPermissionsRequest setJobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  public String getJobId() {
    return jobId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobPermissionsRequest that = (JobPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(jobId, that.jobId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, jobId);
  }

  @Override
  public String toString() {
    return new ToStringer(JobPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("jobId", jobId)
        .toString();
  }

  JobPermissionsRequestPb toPb() {
    JobPermissionsRequestPb pb = new JobPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setJobId(jobId);

    return pb;
  }

  static JobPermissionsRequest fromPb(JobPermissionsRequestPb pb) {
    JobPermissionsRequest model = new JobPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setJobId(pb.getJobId());

    return model;
  }

  public static class JobPermissionsRequestSerializer
      extends JsonSerializer<JobPermissionsRequest> {
    @Override
    public void serialize(
        JobPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobPermissionsRequestDeserializer
      extends JsonDeserializer<JobPermissionsRequest> {
    @Override
    public JobPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobPermissionsRequestPb pb = mapper.readValue(p, JobPermissionsRequestPb.class);
      return JobPermissionsRequest.fromPb(pb);
    }
  }
}

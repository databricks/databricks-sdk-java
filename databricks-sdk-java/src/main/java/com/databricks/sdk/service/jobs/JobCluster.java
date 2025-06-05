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

@Generated
@JsonSerialize(using = JobCluster.JobClusterSerializer.class)
@JsonDeserialize(using = JobCluster.JobClusterDeserializer.class)
public class JobCluster {
  /**
   * A unique name for the job cluster. This field is required and must be unique within the job.
   * `JobTaskSettings` may refer to this field to determine which cluster to launch for the task
   * execution.
   */
  private String jobClusterKey;

  /** If new_cluster, a description of a cluster that is created for each task. */
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  public JobCluster setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public JobCluster setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
    this.newCluster = newCluster;
    return this;
  }

  public com.databricks.sdk.service.compute.ClusterSpec getNewCluster() {
    return newCluster;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobCluster that = (JobCluster) o;
    return Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(newCluster, that.newCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobClusterKey, newCluster);
  }

  @Override
  public String toString() {
    return new ToStringer(JobCluster.class)
        .add("jobClusterKey", jobClusterKey)
        .add("newCluster", newCluster)
        .toString();
  }

  JobClusterPb toPb() {
    JobClusterPb pb = new JobClusterPb();
    pb.setJobClusterKey(jobClusterKey);
    pb.setNewCluster(newCluster);

    return pb;
  }

  static JobCluster fromPb(JobClusterPb pb) {
    JobCluster model = new JobCluster();
    model.setJobClusterKey(pb.getJobClusterKey());
    model.setNewCluster(pb.getNewCluster());

    return model;
  }

  public static class JobClusterSerializer extends JsonSerializer<JobCluster> {
    @Override
    public void serialize(JobCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobClusterDeserializer extends JsonDeserializer<JobCluster> {
    @Override
    public JobCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobClusterPb pb = mapper.readValue(p, JobClusterPb.class);
      return JobCluster.fromPb(pb);
    }
  }
}

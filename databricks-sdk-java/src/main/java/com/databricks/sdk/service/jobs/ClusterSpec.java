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
@JsonSerialize(using = ClusterSpec.ClusterSpecSerializer.class)
@JsonDeserialize(using = ClusterSpec.ClusterSpecDeserializer.class)
public class ClusterSpec {
  /**
   * If existing_cluster_id, the ID of an existing cluster that is used for all runs. When running
   * jobs or tasks on an existing cluster, you may need to manually restart the cluster if it stops
   * responding. We suggest running jobs and tasks on new clusters for greater reliability
   */
  private String existingClusterId;

  /**
   * If job_cluster_key, this task is executed reusing the cluster specified in
   * `job.settings.job_clusters`.
   */
  private String jobClusterKey;

  /**
   * An optional list of libraries to be installed on the cluster. The default value is an empty
   * list.
   */
  private Collection<com.databricks.sdk.service.compute.Library> libraries;

  /** If new_cluster, a description of a new cluster that is created for each run. */
  private com.databricks.sdk.service.compute.ClusterSpec newCluster;

  public ClusterSpec setExistingClusterId(String existingClusterId) {
    this.existingClusterId = existingClusterId;
    return this;
  }

  public String getExistingClusterId() {
    return existingClusterId;
  }

  public ClusterSpec setJobClusterKey(String jobClusterKey) {
    this.jobClusterKey = jobClusterKey;
    return this;
  }

  public String getJobClusterKey() {
    return jobClusterKey;
  }

  public ClusterSpec setLibraries(
      Collection<com.databricks.sdk.service.compute.Library> libraries) {
    this.libraries = libraries;
    return this;
  }

  public Collection<com.databricks.sdk.service.compute.Library> getLibraries() {
    return libraries;
  }

  public ClusterSpec setNewCluster(com.databricks.sdk.service.compute.ClusterSpec newCluster) {
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
    ClusterSpec that = (ClusterSpec) o;
    return Objects.equals(existingClusterId, that.existingClusterId)
        && Objects.equals(jobClusterKey, that.jobClusterKey)
        && Objects.equals(libraries, that.libraries)
        && Objects.equals(newCluster, that.newCluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(existingClusterId, jobClusterKey, libraries, newCluster);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterSpec.class)
        .add("existingClusterId", existingClusterId)
        .add("jobClusterKey", jobClusterKey)
        .add("libraries", libraries)
        .add("newCluster", newCluster)
        .toString();
  }

  ClusterSpecPb toPb() {
    ClusterSpecPb pb = new ClusterSpecPb();
    pb.setExistingClusterId(existingClusterId);
    pb.setJobClusterKey(jobClusterKey);
    pb.setLibraries(libraries);
    pb.setNewCluster(newCluster);

    return pb;
  }

  static ClusterSpec fromPb(ClusterSpecPb pb) {
    ClusterSpec model = new ClusterSpec();
    model.setExistingClusterId(pb.getExistingClusterId());
    model.setJobClusterKey(pb.getJobClusterKey());
    model.setLibraries(pb.getLibraries());
    model.setNewCluster(pb.getNewCluster());

    return model;
  }

  public static class ClusterSpecSerializer extends JsonSerializer<ClusterSpec> {
    @Override
    public void serialize(ClusterSpec value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterSpecPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterSpecDeserializer extends JsonDeserializer<ClusterSpec> {
    @Override
    public ClusterSpec deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterSpecPb pb = mapper.readValue(p, ClusterSpecPb.class);
      return ClusterSpec.fromPb(pb);
    }
  }
}

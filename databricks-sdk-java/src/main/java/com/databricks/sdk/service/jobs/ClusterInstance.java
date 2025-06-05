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
@JsonSerialize(using = ClusterInstance.ClusterInstanceSerializer.class)
@JsonDeserialize(using = ClusterInstance.ClusterInstanceDeserializer.class)
public class ClusterInstance {
  /**
   * The canonical identifier for the cluster used by a run. This field is always available for runs
   * on existing clusters. For runs on new clusters, it becomes available once the cluster is
   * created. This value can be used to view logs by browsing to
   * `/#setting/sparkui/$cluster_id/driver-logs`. The logs continue to be available after the run
   * completes.
   *
   * <p>The response won’t include this field if the identifier is not available yet.
   */
  private String clusterId;

  /**
   * The canonical identifier for the Spark context used by a run. This field is filled in once the
   * run begins execution. This value can be used to view the Spark UI by browsing to
   * `/#setting/sparkui/$cluster_id/$spark_context_id`. The Spark UI continues to be available after
   * the run has completed.
   *
   * <p>The response won’t include this field if the identifier is not available yet.
   */
  private String sparkContextId;

  public ClusterInstance setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ClusterInstance setSparkContextId(String sparkContextId) {
    this.sparkContextId = sparkContextId;
    return this;
  }

  public String getSparkContextId() {
    return sparkContextId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterInstance that = (ClusterInstance) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(sparkContextId, that.sparkContextId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, sparkContextId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterInstance.class)
        .add("clusterId", clusterId)
        .add("sparkContextId", sparkContextId)
        .toString();
  }

  ClusterInstancePb toPb() {
    ClusterInstancePb pb = new ClusterInstancePb();
    pb.setClusterId(clusterId);
    pb.setSparkContextId(sparkContextId);

    return pb;
  }

  static ClusterInstance fromPb(ClusterInstancePb pb) {
    ClusterInstance model = new ClusterInstance();
    model.setClusterId(pb.getClusterId());
    model.setSparkContextId(pb.getSparkContextId());

    return model;
  }

  public static class ClusterInstanceSerializer extends JsonSerializer<ClusterInstance> {
    @Override
    public void serialize(ClusterInstance value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterInstancePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterInstanceDeserializer extends JsonDeserializer<ClusterInstance> {
    @Override
    public ClusterInstance deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterInstancePb pb = mapper.readValue(p, ClusterInstancePb.class);
      return ClusterInstance.fromPb(pb);
    }
  }
}

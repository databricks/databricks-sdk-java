// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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

/** Get status */
@Generated
@JsonSerialize(using = ClusterStatus.ClusterStatusSerializer.class)
@JsonDeserialize(using = ClusterStatus.ClusterStatusDeserializer.class)
public class ClusterStatus {
  /** Unique identifier of the cluster whose status should be retrieved. */
  private String clusterId;

  public ClusterStatus setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterStatus that = (ClusterStatus) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterStatus.class).add("clusterId", clusterId).toString();
  }

  ClusterStatusPb toPb() {
    ClusterStatusPb pb = new ClusterStatusPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static ClusterStatus fromPb(ClusterStatusPb pb) {
    ClusterStatus model = new ClusterStatus();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class ClusterStatusSerializer extends JsonSerializer<ClusterStatus> {
    @Override
    public void serialize(ClusterStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterStatusDeserializer extends JsonDeserializer<ClusterStatus> {
    @Override
    public ClusterStatus deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterStatusPb pb = mapper.readValue(p, ClusterStatusPb.class);
      return ClusterStatus.fromPb(pb);
    }
  }
}

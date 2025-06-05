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

@Generated
@JsonSerialize(using = PermanentDeleteCluster.PermanentDeleteClusterSerializer.class)
@JsonDeserialize(using = PermanentDeleteCluster.PermanentDeleteClusterDeserializer.class)
public class PermanentDeleteCluster {
  /** The cluster to be deleted. */
  private String clusterId;

  public PermanentDeleteCluster setClusterId(String clusterId) {
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
    PermanentDeleteCluster that = (PermanentDeleteCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(PermanentDeleteCluster.class).add("clusterId", clusterId).toString();
  }

  PermanentDeleteClusterPb toPb() {
    PermanentDeleteClusterPb pb = new PermanentDeleteClusterPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static PermanentDeleteCluster fromPb(PermanentDeleteClusterPb pb) {
    PermanentDeleteCluster model = new PermanentDeleteCluster();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class PermanentDeleteClusterSerializer
      extends JsonSerializer<PermanentDeleteCluster> {
    @Override
    public void serialize(
        PermanentDeleteCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermanentDeleteClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermanentDeleteClusterDeserializer
      extends JsonDeserializer<PermanentDeleteCluster> {
    @Override
    public PermanentDeleteCluster deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermanentDeleteClusterPb pb = mapper.readValue(p, PermanentDeleteClusterPb.class);
      return PermanentDeleteCluster.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = StartCluster.StartClusterSerializer.class)
@JsonDeserialize(using = StartCluster.StartClusterDeserializer.class)
public class StartCluster {
  /** The cluster to be started. */
  private String clusterId;

  public StartCluster setClusterId(String clusterId) {
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
    StartCluster that = (StartCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(StartCluster.class).add("clusterId", clusterId).toString();
  }

  StartClusterPb toPb() {
    StartClusterPb pb = new StartClusterPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static StartCluster fromPb(StartClusterPb pb) {
    StartCluster model = new StartCluster();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class StartClusterSerializer extends JsonSerializer<StartCluster> {
    @Override
    public void serialize(StartCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StartClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StartClusterDeserializer extends JsonDeserializer<StartCluster> {
    @Override
    public StartCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StartClusterPb pb = mapper.readValue(p, StartClusterPb.class);
      return StartCluster.fromPb(pb);
    }
  }
}

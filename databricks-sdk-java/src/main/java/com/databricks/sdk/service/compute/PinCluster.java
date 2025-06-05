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
@JsonSerialize(using = PinCluster.PinClusterSerializer.class)
@JsonDeserialize(using = PinCluster.PinClusterDeserializer.class)
public class PinCluster {
  /** */
  private String clusterId;

  public PinCluster setClusterId(String clusterId) {
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
    PinCluster that = (PinCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(PinCluster.class).add("clusterId", clusterId).toString();
  }

  PinClusterPb toPb() {
    PinClusterPb pb = new PinClusterPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static PinCluster fromPb(PinClusterPb pb) {
    PinCluster model = new PinCluster();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class PinClusterSerializer extends JsonSerializer<PinCluster> {
    @Override
    public void serialize(PinCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PinClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PinClusterDeserializer extends JsonDeserializer<PinCluster> {
    @Override
    public PinCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PinClusterPb pb = mapper.readValue(p, PinClusterPb.class);
      return PinCluster.fromPb(pb);
    }
  }
}

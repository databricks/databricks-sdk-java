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
@JsonSerialize(using = UnpinCluster.UnpinClusterSerializer.class)
@JsonDeserialize(using = UnpinCluster.UnpinClusterDeserializer.class)
public class UnpinCluster {
  /** */
  private String clusterId;

  public UnpinCluster setClusterId(String clusterId) {
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
    UnpinCluster that = (UnpinCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(UnpinCluster.class).add("clusterId", clusterId).toString();
  }

  UnpinClusterPb toPb() {
    UnpinClusterPb pb = new UnpinClusterPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static UnpinCluster fromPb(UnpinClusterPb pb) {
    UnpinCluster model = new UnpinCluster();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class UnpinClusterSerializer extends JsonSerializer<UnpinCluster> {
    @Override
    public void serialize(UnpinCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnpinClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnpinClusterDeserializer extends JsonDeserializer<UnpinCluster> {
    @Override
    public UnpinCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnpinClusterPb pb = mapper.readValue(p, UnpinClusterPb.class);
      return UnpinCluster.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = CloneCluster.CloneClusterSerializer.class)
@JsonDeserialize(using = CloneCluster.CloneClusterDeserializer.class)
public class CloneCluster {
  /** The cluster that is being cloned. */
  private String sourceClusterId;

  public CloneCluster setSourceClusterId(String sourceClusterId) {
    this.sourceClusterId = sourceClusterId;
    return this;
  }

  public String getSourceClusterId() {
    return sourceClusterId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CloneCluster that = (CloneCluster) o;
    return Objects.equals(sourceClusterId, that.sourceClusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceClusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(CloneCluster.class).add("sourceClusterId", sourceClusterId).toString();
  }

  CloneClusterPb toPb() {
    CloneClusterPb pb = new CloneClusterPb();
    pb.setSourceClusterId(sourceClusterId);

    return pb;
  }

  static CloneCluster fromPb(CloneClusterPb pb) {
    CloneCluster model = new CloneCluster();
    model.setSourceClusterId(pb.getSourceClusterId());

    return model;
  }

  public static class CloneClusterSerializer extends JsonSerializer<CloneCluster> {
    @Override
    public void serialize(CloneCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CloneClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CloneClusterDeserializer extends JsonDeserializer<CloneCluster> {
    @Override
    public CloneCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CloneClusterPb pb = mapper.readValue(p, CloneClusterPb.class);
      return CloneCluster.fromPb(pb);
    }
  }
}

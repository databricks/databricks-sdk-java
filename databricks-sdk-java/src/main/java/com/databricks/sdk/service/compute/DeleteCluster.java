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
@JsonSerialize(using = DeleteCluster.DeleteClusterSerializer.class)
@JsonDeserialize(using = DeleteCluster.DeleteClusterDeserializer.class)
public class DeleteCluster {
  /** The cluster to be terminated. */
  private String clusterId;

  public DeleteCluster setClusterId(String clusterId) {
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
    DeleteCluster that = (DeleteCluster) o;
    return Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCluster.class).add("clusterId", clusterId).toString();
  }

  DeleteClusterPb toPb() {
    DeleteClusterPb pb = new DeleteClusterPb();
    pb.setClusterId(clusterId);

    return pb;
  }

  static DeleteCluster fromPb(DeleteClusterPb pb) {
    DeleteCluster model = new DeleteCluster();
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class DeleteClusterSerializer extends JsonSerializer<DeleteCluster> {
    @Override
    public void serialize(DeleteCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteClusterDeserializer extends JsonDeserializer<DeleteCluster> {
    @Override
    public DeleteCluster deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteClusterPb pb = mapper.readValue(p, DeleteClusterPb.class);
      return DeleteCluster.fromPb(pb);
    }
  }
}

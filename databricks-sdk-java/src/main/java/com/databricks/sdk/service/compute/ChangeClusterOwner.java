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
@JsonSerialize(using = ChangeClusterOwner.ChangeClusterOwnerSerializer.class)
@JsonDeserialize(using = ChangeClusterOwner.ChangeClusterOwnerDeserializer.class)
public class ChangeClusterOwner {
  /** */
  private String clusterId;

  /** New owner of the cluster_id after this RPC. */
  private String ownerUsername;

  public ChangeClusterOwner setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public ChangeClusterOwner setOwnerUsername(String ownerUsername) {
    this.ownerUsername = ownerUsername;
    return this;
  }

  public String getOwnerUsername() {
    return ownerUsername;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ChangeClusterOwner that = (ChangeClusterOwner) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(ownerUsername, that.ownerUsername);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, ownerUsername);
  }

  @Override
  public String toString() {
    return new ToStringer(ChangeClusterOwner.class)
        .add("clusterId", clusterId)
        .add("ownerUsername", ownerUsername)
        .toString();
  }

  ChangeClusterOwnerPb toPb() {
    ChangeClusterOwnerPb pb = new ChangeClusterOwnerPb();
    pb.setClusterId(clusterId);
    pb.setOwnerUsername(ownerUsername);

    return pb;
  }

  static ChangeClusterOwner fromPb(ChangeClusterOwnerPb pb) {
    ChangeClusterOwner model = new ChangeClusterOwner();
    model.setClusterId(pb.getClusterId());
    model.setOwnerUsername(pb.getOwnerUsername());

    return model;
  }

  public static class ChangeClusterOwnerSerializer extends JsonSerializer<ChangeClusterOwner> {
    @Override
    public void serialize(ChangeClusterOwner value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ChangeClusterOwnerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ChangeClusterOwnerDeserializer extends JsonDeserializer<ChangeClusterOwner> {
    @Override
    public ChangeClusterOwner deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ChangeClusterOwnerPb pb = mapper.readValue(p, ChangeClusterOwnerPb.class);
      return ChangeClusterOwner.fromPb(pb);
    }
  }
}

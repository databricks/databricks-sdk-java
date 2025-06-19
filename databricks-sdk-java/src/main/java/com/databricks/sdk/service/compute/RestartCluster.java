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
@JsonSerialize(using = RestartCluster.RestartClusterSerializer.class)
@JsonDeserialize(using = RestartCluster.RestartClusterDeserializer.class)
public class RestartCluster {
  /** The cluster to be started. */
  private String clusterId;

  /** */
  private String restartUser;

  public RestartCluster setClusterId(String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  public String getClusterId() {
    return clusterId;
  }

  public RestartCluster setRestartUser(String restartUser) {
    this.restartUser = restartUser;
    return this;
  }

  public String getRestartUser() {
    return restartUser;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestartCluster that = (RestartCluster) o;
    return Objects.equals(clusterId, that.clusterId)
        && Objects.equals(restartUser, that.restartUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterId, restartUser);
  }

  @Override
  public String toString() {
    return new ToStringer(RestartCluster.class)
        .add("clusterId", clusterId)
        .add("restartUser", restartUser)
        .toString();
  }

  RestartClusterPb toPb() {
    RestartClusterPb pb = new RestartClusterPb();
    pb.setClusterId(clusterId);
    pb.setRestartUser(restartUser);

    return pb;
  }

  static RestartCluster fromPb(RestartClusterPb pb) {
    RestartCluster model = new RestartCluster();
    model.setClusterId(pb.getClusterId());
    model.setRestartUser(pb.getRestartUser());

    return model;
  }

  public static class RestartClusterSerializer extends JsonSerializer<RestartCluster> {
    @Override
    public void serialize(RestartCluster value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestartClusterPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestartClusterDeserializer extends JsonDeserializer<RestartCluster> {
    @Override
    public RestartCluster deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestartClusterPb pb = mapper.readValue(p, RestartClusterPb.class);
      return RestartCluster.fromPb(pb);
    }
  }
}

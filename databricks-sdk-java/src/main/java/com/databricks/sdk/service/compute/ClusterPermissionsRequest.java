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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = ClusterPermissionsRequest.ClusterPermissionsRequestSerializer.class)
@JsonDeserialize(using = ClusterPermissionsRequest.ClusterPermissionsRequestDeserializer.class)
public class ClusterPermissionsRequest {
  /** */
  private Collection<ClusterAccessControlRequest> accessControlList;

  /** The cluster for which to get or manage permissions. */
  private String clusterId;

  public ClusterPermissionsRequest setAccessControlList(
      Collection<ClusterAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPermissionsRequest setClusterId(String clusterId) {
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
    ClusterPermissionsRequest that = (ClusterPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(clusterId, that.clusterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, clusterId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("clusterId", clusterId)
        .toString();
  }

  ClusterPermissionsRequestPb toPb() {
    ClusterPermissionsRequestPb pb = new ClusterPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setClusterId(clusterId);

    return pb;
  }

  static ClusterPermissionsRequest fromPb(ClusterPermissionsRequestPb pb) {
    ClusterPermissionsRequest model = new ClusterPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setClusterId(pb.getClusterId());

    return model;
  }

  public static class ClusterPermissionsRequestSerializer
      extends JsonSerializer<ClusterPermissionsRequest> {
    @Override
    public void serialize(
        ClusterPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPermissionsRequestDeserializer
      extends JsonDeserializer<ClusterPermissionsRequest> {
    @Override
    public ClusterPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPermissionsRequestPb pb = mapper.readValue(p, ClusterPermissionsRequestPb.class);
      return ClusterPermissionsRequest.fromPb(pb);
    }
  }
}

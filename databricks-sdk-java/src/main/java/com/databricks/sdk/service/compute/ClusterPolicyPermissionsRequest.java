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
@JsonSerialize(
    using = ClusterPolicyPermissionsRequest.ClusterPolicyPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = ClusterPolicyPermissionsRequest.ClusterPolicyPermissionsRequestDeserializer.class)
public class ClusterPolicyPermissionsRequest {
  /** */
  private Collection<ClusterPolicyAccessControlRequest> accessControlList;

  /** The cluster policy for which to get or manage permissions. */
  private String clusterPolicyId;

  public ClusterPolicyPermissionsRequest setAccessControlList(
      Collection<ClusterPolicyAccessControlRequest> accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  public Collection<ClusterPolicyAccessControlRequest> getAccessControlList() {
    return accessControlList;
  }

  public ClusterPolicyPermissionsRequest setClusterPolicyId(String clusterPolicyId) {
    this.clusterPolicyId = clusterPolicyId;
    return this;
  }

  public String getClusterPolicyId() {
    return clusterPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPolicyPermissionsRequest that = (ClusterPolicyPermissionsRequest) o;
    return Objects.equals(accessControlList, that.accessControlList)
        && Objects.equals(clusterPolicyId, that.clusterPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, clusterPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPolicyPermissionsRequest.class)
        .add("accessControlList", accessControlList)
        .add("clusterPolicyId", clusterPolicyId)
        .toString();
  }

  ClusterPolicyPermissionsRequestPb toPb() {
    ClusterPolicyPermissionsRequestPb pb = new ClusterPolicyPermissionsRequestPb();
    pb.setAccessControlList(accessControlList);
    pb.setClusterPolicyId(clusterPolicyId);

    return pb;
  }

  static ClusterPolicyPermissionsRequest fromPb(ClusterPolicyPermissionsRequestPb pb) {
    ClusterPolicyPermissionsRequest model = new ClusterPolicyPermissionsRequest();
    model.setAccessControlList(pb.getAccessControlList());
    model.setClusterPolicyId(pb.getClusterPolicyId());

    return model;
  }

  public static class ClusterPolicyPermissionsRequestSerializer
      extends JsonSerializer<ClusterPolicyPermissionsRequest> {
    @Override
    public void serialize(
        ClusterPolicyPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPolicyPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPolicyPermissionsRequestDeserializer
      extends JsonDeserializer<ClusterPolicyPermissionsRequest> {
    @Override
    public ClusterPolicyPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPolicyPermissionsRequestPb pb =
          mapper.readValue(p, ClusterPolicyPermissionsRequestPb.class);
      return ClusterPolicyPermissionsRequest.fromPb(pb);
    }
  }
}

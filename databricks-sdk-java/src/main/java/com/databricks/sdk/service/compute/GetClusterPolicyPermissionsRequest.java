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

/** Get cluster policy permissions */
@Generated
@JsonSerialize(
    using = GetClusterPolicyPermissionsRequest.GetClusterPolicyPermissionsRequestSerializer.class)
@JsonDeserialize(
    using = GetClusterPolicyPermissionsRequest.GetClusterPolicyPermissionsRequestDeserializer.class)
public class GetClusterPolicyPermissionsRequest {
  /** The cluster policy for which to get or manage permissions. */
  private String clusterPolicyId;

  public GetClusterPolicyPermissionsRequest setClusterPolicyId(String clusterPolicyId) {
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
    GetClusterPolicyPermissionsRequest that = (GetClusterPolicyPermissionsRequest) o;
    return Objects.equals(clusterPolicyId, that.clusterPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyPermissionsRequest.class)
        .add("clusterPolicyId", clusterPolicyId)
        .toString();
  }

  GetClusterPolicyPermissionsRequestPb toPb() {
    GetClusterPolicyPermissionsRequestPb pb = new GetClusterPolicyPermissionsRequestPb();
    pb.setClusterPolicyId(clusterPolicyId);

    return pb;
  }

  static GetClusterPolicyPermissionsRequest fromPb(GetClusterPolicyPermissionsRequestPb pb) {
    GetClusterPolicyPermissionsRequest model = new GetClusterPolicyPermissionsRequest();
    model.setClusterPolicyId(pb.getClusterPolicyId());

    return model;
  }

  public static class GetClusterPolicyPermissionsRequestSerializer
      extends JsonSerializer<GetClusterPolicyPermissionsRequest> {
    @Override
    public void serialize(
        GetClusterPolicyPermissionsRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterPolicyPermissionsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPolicyPermissionsRequestDeserializer
      extends JsonDeserializer<GetClusterPolicyPermissionsRequest> {
    @Override
    public GetClusterPolicyPermissionsRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPolicyPermissionsRequestPb pb =
          mapper.readValue(p, GetClusterPolicyPermissionsRequestPb.class);
      return GetClusterPolicyPermissionsRequest.fromPb(pb);
    }
  }
}

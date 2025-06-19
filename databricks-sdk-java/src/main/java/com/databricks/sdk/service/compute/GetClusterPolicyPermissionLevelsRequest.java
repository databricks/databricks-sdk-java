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

/** Get cluster policy permission levels */
@Generated
@JsonSerialize(
    using =
        GetClusterPolicyPermissionLevelsRequest.GetClusterPolicyPermissionLevelsRequestSerializer
            .class)
@JsonDeserialize(
    using =
        GetClusterPolicyPermissionLevelsRequest.GetClusterPolicyPermissionLevelsRequestDeserializer
            .class)
public class GetClusterPolicyPermissionLevelsRequest {
  /** The cluster policy for which to get or manage permissions. */
  private String clusterPolicyId;

  public GetClusterPolicyPermissionLevelsRequest setClusterPolicyId(String clusterPolicyId) {
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
    GetClusterPolicyPermissionLevelsRequest that = (GetClusterPolicyPermissionLevelsRequest) o;
    return Objects.equals(clusterPolicyId, that.clusterPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterPolicyId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyPermissionLevelsRequest.class)
        .add("clusterPolicyId", clusterPolicyId)
        .toString();
  }

  GetClusterPolicyPermissionLevelsRequestPb toPb() {
    GetClusterPolicyPermissionLevelsRequestPb pb = new GetClusterPolicyPermissionLevelsRequestPb();
    pb.setClusterPolicyId(clusterPolicyId);

    return pb;
  }

  static GetClusterPolicyPermissionLevelsRequest fromPb(
      GetClusterPolicyPermissionLevelsRequestPb pb) {
    GetClusterPolicyPermissionLevelsRequest model = new GetClusterPolicyPermissionLevelsRequest();
    model.setClusterPolicyId(pb.getClusterPolicyId());

    return model;
  }

  public static class GetClusterPolicyPermissionLevelsRequestSerializer
      extends JsonSerializer<GetClusterPolicyPermissionLevelsRequest> {
    @Override
    public void serialize(
        GetClusterPolicyPermissionLevelsRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetClusterPolicyPermissionLevelsRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPolicyPermissionLevelsRequestDeserializer
      extends JsonDeserializer<GetClusterPolicyPermissionLevelsRequest> {
    @Override
    public GetClusterPolicyPermissionLevelsRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPolicyPermissionLevelsRequestPb pb =
          mapper.readValue(p, GetClusterPolicyPermissionLevelsRequestPb.class);
      return GetClusterPolicyPermissionLevelsRequest.fromPb(pb);
    }
  }
}

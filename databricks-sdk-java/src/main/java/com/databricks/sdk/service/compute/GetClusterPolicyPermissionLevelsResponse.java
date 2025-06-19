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
    using =
        GetClusterPolicyPermissionLevelsResponse.GetClusterPolicyPermissionLevelsResponseSerializer
            .class)
@JsonDeserialize(
    using =
        GetClusterPolicyPermissionLevelsResponse
            .GetClusterPolicyPermissionLevelsResponseDeserializer.class)
public class GetClusterPolicyPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<ClusterPolicyPermissionsDescription> permissionLevels;

  public GetClusterPolicyPermissionLevelsResponse setPermissionLevels(
      Collection<ClusterPolicyPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<ClusterPolicyPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetClusterPolicyPermissionLevelsResponse that = (GetClusterPolicyPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPolicyPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetClusterPolicyPermissionLevelsResponsePb toPb() {
    GetClusterPolicyPermissionLevelsResponsePb pb =
        new GetClusterPolicyPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetClusterPolicyPermissionLevelsResponse fromPb(
      GetClusterPolicyPermissionLevelsResponsePb pb) {
    GetClusterPolicyPermissionLevelsResponse model = new GetClusterPolicyPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetClusterPolicyPermissionLevelsResponseSerializer
      extends JsonSerializer<GetClusterPolicyPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetClusterPolicyPermissionLevelsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetClusterPolicyPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPolicyPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetClusterPolicyPermissionLevelsResponse> {
    @Override
    public GetClusterPolicyPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPolicyPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetClusterPolicyPermissionLevelsResponsePb.class);
      return GetClusterPolicyPermissionLevelsResponse.fromPb(pb);
    }
  }
}

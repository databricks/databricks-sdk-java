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
    using = GetClusterPermissionLevelsResponse.GetClusterPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using = GetClusterPermissionLevelsResponse.GetClusterPermissionLevelsResponseDeserializer.class)
public class GetClusterPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<ClusterPermissionsDescription> permissionLevels;

  public GetClusterPermissionLevelsResponse setPermissionLevels(
      Collection<ClusterPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<ClusterPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetClusterPermissionLevelsResponse that = (GetClusterPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetClusterPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetClusterPermissionLevelsResponsePb toPb() {
    GetClusterPermissionLevelsResponsePb pb = new GetClusterPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetClusterPermissionLevelsResponse fromPb(GetClusterPermissionLevelsResponsePb pb) {
    GetClusterPermissionLevelsResponse model = new GetClusterPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetClusterPermissionLevelsResponseSerializer
      extends JsonSerializer<GetClusterPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetClusterPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetClusterPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetClusterPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetClusterPermissionLevelsResponse> {
    @Override
    public GetClusterPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetClusterPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetClusterPermissionLevelsResponsePb.class);
      return GetClusterPermissionLevelsResponse.fromPb(pb);
    }
  }
}

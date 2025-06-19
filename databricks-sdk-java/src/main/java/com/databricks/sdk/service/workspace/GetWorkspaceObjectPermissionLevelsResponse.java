// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
        GetWorkspaceObjectPermissionLevelsResponse
            .GetWorkspaceObjectPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetWorkspaceObjectPermissionLevelsResponse
            .GetWorkspaceObjectPermissionLevelsResponseDeserializer.class)
public class GetWorkspaceObjectPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<WorkspaceObjectPermissionsDescription> permissionLevels;

  public GetWorkspaceObjectPermissionLevelsResponse setPermissionLevels(
      Collection<WorkspaceObjectPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<WorkspaceObjectPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetWorkspaceObjectPermissionLevelsResponse that =
        (GetWorkspaceObjectPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetWorkspaceObjectPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetWorkspaceObjectPermissionLevelsResponsePb toPb() {
    GetWorkspaceObjectPermissionLevelsResponsePb pb =
        new GetWorkspaceObjectPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetWorkspaceObjectPermissionLevelsResponse fromPb(
      GetWorkspaceObjectPermissionLevelsResponsePb pb) {
    GetWorkspaceObjectPermissionLevelsResponse model =
        new GetWorkspaceObjectPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetWorkspaceObjectPermissionLevelsResponseSerializer
      extends JsonSerializer<GetWorkspaceObjectPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetWorkspaceObjectPermissionLevelsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetWorkspaceObjectPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetWorkspaceObjectPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetWorkspaceObjectPermissionLevelsResponse> {
    @Override
    public GetWorkspaceObjectPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetWorkspaceObjectPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetWorkspaceObjectPermissionLevelsResponsePb.class);
      return GetWorkspaceObjectPermissionLevelsResponse.fromPb(pb);
    }
  }
}

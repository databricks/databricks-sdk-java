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
    using = GetRepoPermissionLevelsResponse.GetRepoPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using = GetRepoPermissionLevelsResponse.GetRepoPermissionLevelsResponseDeserializer.class)
public class GetRepoPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<RepoPermissionsDescription> permissionLevels;

  public GetRepoPermissionLevelsResponse setPermissionLevels(
      Collection<RepoPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<RepoPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRepoPermissionLevelsResponse that = (GetRepoPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRepoPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetRepoPermissionLevelsResponsePb toPb() {
    GetRepoPermissionLevelsResponsePb pb = new GetRepoPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetRepoPermissionLevelsResponse fromPb(GetRepoPermissionLevelsResponsePb pb) {
    GetRepoPermissionLevelsResponse model = new GetRepoPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetRepoPermissionLevelsResponseSerializer
      extends JsonSerializer<GetRepoPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetRepoPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetRepoPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRepoPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetRepoPermissionLevelsResponse> {
    @Override
    public GetRepoPermissionLevelsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRepoPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetRepoPermissionLevelsResponsePb.class);
      return GetRepoPermissionLevelsResponse.fromPb(pb);
    }
  }
}

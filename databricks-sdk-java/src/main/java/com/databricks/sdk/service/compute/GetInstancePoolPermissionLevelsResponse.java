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
        GetInstancePoolPermissionLevelsResponse.GetInstancePoolPermissionLevelsResponseSerializer
            .class)
@JsonDeserialize(
    using =
        GetInstancePoolPermissionLevelsResponse.GetInstancePoolPermissionLevelsResponseDeserializer
            .class)
public class GetInstancePoolPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<InstancePoolPermissionsDescription> permissionLevels;

  public GetInstancePoolPermissionLevelsResponse setPermissionLevels(
      Collection<InstancePoolPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<InstancePoolPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetInstancePoolPermissionLevelsResponse that = (GetInstancePoolPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetInstancePoolPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetInstancePoolPermissionLevelsResponsePb toPb() {
    GetInstancePoolPermissionLevelsResponsePb pb = new GetInstancePoolPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetInstancePoolPermissionLevelsResponse fromPb(
      GetInstancePoolPermissionLevelsResponsePb pb) {
    GetInstancePoolPermissionLevelsResponse model = new GetInstancePoolPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetInstancePoolPermissionLevelsResponseSerializer
      extends JsonSerializer<GetInstancePoolPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetInstancePoolPermissionLevelsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetInstancePoolPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetInstancePoolPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetInstancePoolPermissionLevelsResponse> {
    @Override
    public GetInstancePoolPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetInstancePoolPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetInstancePoolPermissionLevelsResponsePb.class);
      return GetInstancePoolPermissionLevelsResponse.fromPb(pb);
    }
  }
}

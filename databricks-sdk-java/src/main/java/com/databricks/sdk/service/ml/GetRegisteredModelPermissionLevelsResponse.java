// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
        GetRegisteredModelPermissionLevelsResponse
            .GetRegisteredModelPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetRegisteredModelPermissionLevelsResponse
            .GetRegisteredModelPermissionLevelsResponseDeserializer.class)
public class GetRegisteredModelPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<RegisteredModelPermissionsDescription> permissionLevels;

  public GetRegisteredModelPermissionLevelsResponse setPermissionLevels(
      Collection<RegisteredModelPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<RegisteredModelPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRegisteredModelPermissionLevelsResponse that =
        (GetRegisteredModelPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRegisteredModelPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetRegisteredModelPermissionLevelsResponsePb toPb() {
    GetRegisteredModelPermissionLevelsResponsePb pb =
        new GetRegisteredModelPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetRegisteredModelPermissionLevelsResponse fromPb(
      GetRegisteredModelPermissionLevelsResponsePb pb) {
    GetRegisteredModelPermissionLevelsResponse model =
        new GetRegisteredModelPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetRegisteredModelPermissionLevelsResponseSerializer
      extends JsonSerializer<GetRegisteredModelPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetRegisteredModelPermissionLevelsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetRegisteredModelPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetRegisteredModelPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetRegisteredModelPermissionLevelsResponse> {
    @Override
    public GetRegisteredModelPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetRegisteredModelPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetRegisteredModelPermissionLevelsResponsePb.class);
      return GetRegisteredModelPermissionLevelsResponse.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

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
        GetServingEndpointPermissionLevelsResponse
            .GetServingEndpointPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetServingEndpointPermissionLevelsResponse
            .GetServingEndpointPermissionLevelsResponseDeserializer.class)
public class GetServingEndpointPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<ServingEndpointPermissionsDescription> permissionLevels;

  public GetServingEndpointPermissionLevelsResponse setPermissionLevels(
      Collection<ServingEndpointPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<ServingEndpointPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetServingEndpointPermissionLevelsResponse that =
        (GetServingEndpointPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetServingEndpointPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetServingEndpointPermissionLevelsResponsePb toPb() {
    GetServingEndpointPermissionLevelsResponsePb pb =
        new GetServingEndpointPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetServingEndpointPermissionLevelsResponse fromPb(
      GetServingEndpointPermissionLevelsResponsePb pb) {
    GetServingEndpointPermissionLevelsResponse model =
        new GetServingEndpointPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetServingEndpointPermissionLevelsResponseSerializer
      extends JsonSerializer<GetServingEndpointPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetServingEndpointPermissionLevelsResponse value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      GetServingEndpointPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetServingEndpointPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetServingEndpointPermissionLevelsResponse> {
    @Override
    public GetServingEndpointPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetServingEndpointPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetServingEndpointPermissionLevelsResponsePb.class);
      return GetServingEndpointPermissionLevelsResponse.fromPb(pb);
    }
  }
}

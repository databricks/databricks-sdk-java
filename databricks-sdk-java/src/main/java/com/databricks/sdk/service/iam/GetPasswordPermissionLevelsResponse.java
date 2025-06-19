// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

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
    using = GetPasswordPermissionLevelsResponse.GetPasswordPermissionLevelsResponseSerializer.class)
@JsonDeserialize(
    using =
        GetPasswordPermissionLevelsResponse.GetPasswordPermissionLevelsResponseDeserializer.class)
public class GetPasswordPermissionLevelsResponse {
  /** Specific permission levels */
  private Collection<PasswordPermissionsDescription> permissionLevels;

  public GetPasswordPermissionLevelsResponse setPermissionLevels(
      Collection<PasswordPermissionsDescription> permissionLevels) {
    this.permissionLevels = permissionLevels;
    return this;
  }

  public Collection<PasswordPermissionsDescription> getPermissionLevels() {
    return permissionLevels;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPasswordPermissionLevelsResponse that = (GetPasswordPermissionLevelsResponse) o;
    return Objects.equals(permissionLevels, that.permissionLevels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissionLevels);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPasswordPermissionLevelsResponse.class)
        .add("permissionLevels", permissionLevels)
        .toString();
  }

  GetPasswordPermissionLevelsResponsePb toPb() {
    GetPasswordPermissionLevelsResponsePb pb = new GetPasswordPermissionLevelsResponsePb();
    pb.setPermissionLevels(permissionLevels);

    return pb;
  }

  static GetPasswordPermissionLevelsResponse fromPb(GetPasswordPermissionLevelsResponsePb pb) {
    GetPasswordPermissionLevelsResponse model = new GetPasswordPermissionLevelsResponse();
    model.setPermissionLevels(pb.getPermissionLevels());

    return model;
  }

  public static class GetPasswordPermissionLevelsResponseSerializer
      extends JsonSerializer<GetPasswordPermissionLevelsResponse> {
    @Override
    public void serialize(
        GetPasswordPermissionLevelsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPasswordPermissionLevelsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPasswordPermissionLevelsResponseDeserializer
      extends JsonDeserializer<GetPasswordPermissionLevelsResponse> {
    @Override
    public GetPasswordPermissionLevelsResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPasswordPermissionLevelsResponsePb pb =
          mapper.readValue(p, GetPasswordPermissionLevelsResponsePb.class);
      return GetPasswordPermissionLevelsResponse.fromPb(pb);
    }
  }
}

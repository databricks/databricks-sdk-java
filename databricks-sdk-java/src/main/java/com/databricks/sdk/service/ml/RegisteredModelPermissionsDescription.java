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
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        RegisteredModelPermissionsDescription.RegisteredModelPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using =
        RegisteredModelPermissionsDescription.RegisteredModelPermissionsDescriptionDeserializer
            .class)
public class RegisteredModelPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private RegisteredModelPermissionLevel permissionLevel;

  public RegisteredModelPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RegisteredModelPermissionsDescription setPermissionLevel(
      RegisteredModelPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public RegisteredModelPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelPermissionsDescription that = (RegisteredModelPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(RegisteredModelPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  RegisteredModelPermissionsDescriptionPb toPb() {
    RegisteredModelPermissionsDescriptionPb pb = new RegisteredModelPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static RegisteredModelPermissionsDescription fromPb(RegisteredModelPermissionsDescriptionPb pb) {
    RegisteredModelPermissionsDescription model = new RegisteredModelPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class RegisteredModelPermissionsDescriptionSerializer
      extends JsonSerializer<RegisteredModelPermissionsDescription> {
    @Override
    public void serialize(
        RegisteredModelPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelPermissionsDescriptionDeserializer
      extends JsonDeserializer<RegisteredModelPermissionsDescription> {
    @Override
    public RegisteredModelPermissionsDescription deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelPermissionsDescriptionPb pb =
          mapper.readValue(p, RegisteredModelPermissionsDescriptionPb.class);
      return RegisteredModelPermissionsDescription.fromPb(pb);
    }
  }
}

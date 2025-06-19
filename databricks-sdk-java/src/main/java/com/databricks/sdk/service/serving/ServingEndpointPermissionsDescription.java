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
import java.util.Objects;

@Generated
@JsonSerialize(
    using =
        ServingEndpointPermissionsDescription.ServingEndpointPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using =
        ServingEndpointPermissionsDescription.ServingEndpointPermissionsDescriptionDeserializer
            .class)
public class ServingEndpointPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private ServingEndpointPermissionLevel permissionLevel;

  public ServingEndpointPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ServingEndpointPermissionsDescription setPermissionLevel(
      ServingEndpointPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServingEndpointPermissionsDescription that = (ServingEndpointPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  ServingEndpointPermissionsDescriptionPb toPb() {
    ServingEndpointPermissionsDescriptionPb pb = new ServingEndpointPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static ServingEndpointPermissionsDescription fromPb(ServingEndpointPermissionsDescriptionPb pb) {
    ServingEndpointPermissionsDescription model = new ServingEndpointPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class ServingEndpointPermissionsDescriptionSerializer
      extends JsonSerializer<ServingEndpointPermissionsDescription> {
    @Override
    public void serialize(
        ServingEndpointPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ServingEndpointPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ServingEndpointPermissionsDescriptionDeserializer
      extends JsonDeserializer<ServingEndpointPermissionsDescription> {
    @Override
    public ServingEndpointPermissionsDescription deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ServingEndpointPermissionsDescriptionPb pb =
          mapper.readValue(p, ServingEndpointPermissionsDescriptionPb.class);
      return ServingEndpointPermissionsDescription.fromPb(pb);
    }
  }
}

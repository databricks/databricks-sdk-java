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
import java.util.Objects;

@Generated
@JsonSerialize(
    using = PasswordPermissionsDescription.PasswordPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = PasswordPermissionsDescription.PasswordPermissionsDescriptionDeserializer.class)
public class PasswordPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private PasswordPermissionLevel permissionLevel;

  public PasswordPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PasswordPermissionsDescription setPermissionLevel(
      PasswordPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PasswordPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PasswordPermissionsDescription that = (PasswordPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(PasswordPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  PasswordPermissionsDescriptionPb toPb() {
    PasswordPermissionsDescriptionPb pb = new PasswordPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static PasswordPermissionsDescription fromPb(PasswordPermissionsDescriptionPb pb) {
    PasswordPermissionsDescription model = new PasswordPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class PasswordPermissionsDescriptionSerializer
      extends JsonSerializer<PasswordPermissionsDescription> {
    @Override
    public void serialize(
        PasswordPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PasswordPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PasswordPermissionsDescriptionDeserializer
      extends JsonDeserializer<PasswordPermissionsDescription> {
    @Override
    public PasswordPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PasswordPermissionsDescriptionPb pb =
          mapper.readValue(p, PasswordPermissionsDescriptionPb.class);
      return PasswordPermissionsDescription.fromPb(pb);
    }
  }
}

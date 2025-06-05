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
import java.util.Objects;

@Generated
@JsonSerialize(
    using = InstancePoolPermissionsDescription.InstancePoolPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = InstancePoolPermissionsDescription.InstancePoolPermissionsDescriptionDeserializer.class)
public class InstancePoolPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private InstancePoolPermissionLevel permissionLevel;

  public InstancePoolPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public InstancePoolPermissionsDescription setPermissionLevel(
      InstancePoolPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public InstancePoolPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolPermissionsDescription that = (InstancePoolPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(InstancePoolPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  InstancePoolPermissionsDescriptionPb toPb() {
    InstancePoolPermissionsDescriptionPb pb = new InstancePoolPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static InstancePoolPermissionsDescription fromPb(InstancePoolPermissionsDescriptionPb pb) {
    InstancePoolPermissionsDescription model = new InstancePoolPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class InstancePoolPermissionsDescriptionSerializer
      extends JsonSerializer<InstancePoolPermissionsDescription> {
    @Override
    public void serialize(
        InstancePoolPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolPermissionsDescriptionDeserializer
      extends JsonDeserializer<InstancePoolPermissionsDescription> {
    @Override
    public InstancePoolPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolPermissionsDescriptionPb pb =
          mapper.readValue(p, InstancePoolPermissionsDescriptionPb.class);
      return InstancePoolPermissionsDescription.fromPb(pb);
    }
  }
}

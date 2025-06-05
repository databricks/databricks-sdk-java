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
@JsonSerialize(using = PermissionsDescription.PermissionsDescriptionSerializer.class)
@JsonDeserialize(using = PermissionsDescription.PermissionsDescriptionDeserializer.class)
public class PermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private PermissionLevel permissionLevel;

  public PermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PermissionsDescription setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsDescription that = (PermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(PermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  PermissionsDescriptionPb toPb() {
    PermissionsDescriptionPb pb = new PermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static PermissionsDescription fromPb(PermissionsDescriptionPb pb) {
    PermissionsDescription model = new PermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class PermissionsDescriptionSerializer
      extends JsonSerializer<PermissionsDescription> {
    @Override
    public void serialize(
        PermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PermissionsDescriptionDeserializer
      extends JsonDeserializer<PermissionsDescription> {
    @Override
    public PermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PermissionsDescriptionPb pb = mapper.readValue(p, PermissionsDescriptionPb.class);
      return PermissionsDescription.fromPb(pb);
    }
  }
}

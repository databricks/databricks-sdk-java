// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
    using = WarehousePermissionsDescription.WarehousePermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = WarehousePermissionsDescription.WarehousePermissionsDescriptionDeserializer.class)
public class WarehousePermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private WarehousePermissionLevel permissionLevel;

  public WarehousePermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WarehousePermissionsDescription setPermissionLevel(
      WarehousePermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WarehousePermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WarehousePermissionsDescription that = (WarehousePermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(WarehousePermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  WarehousePermissionsDescriptionPb toPb() {
    WarehousePermissionsDescriptionPb pb = new WarehousePermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static WarehousePermissionsDescription fromPb(WarehousePermissionsDescriptionPb pb) {
    WarehousePermissionsDescription model = new WarehousePermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class WarehousePermissionsDescriptionSerializer
      extends JsonSerializer<WarehousePermissionsDescription> {
    @Override
    public void serialize(
        WarehousePermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WarehousePermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WarehousePermissionsDescriptionDeserializer
      extends JsonDeserializer<WarehousePermissionsDescription> {
    @Override
    public WarehousePermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WarehousePermissionsDescriptionPb pb =
          mapper.readValue(p, WarehousePermissionsDescriptionPb.class);
      return WarehousePermissionsDescription.fromPb(pb);
    }
  }
}

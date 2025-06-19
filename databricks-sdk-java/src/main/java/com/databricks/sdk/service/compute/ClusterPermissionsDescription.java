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
@JsonSerialize(using = ClusterPermissionsDescription.ClusterPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = ClusterPermissionsDescription.ClusterPermissionsDescriptionDeserializer.class)
public class ClusterPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private ClusterPermissionLevel permissionLevel;

  public ClusterPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ClusterPermissionsDescription setPermissionLevel(ClusterPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPermissionsDescription that = (ClusterPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  ClusterPermissionsDescriptionPb toPb() {
    ClusterPermissionsDescriptionPb pb = new ClusterPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static ClusterPermissionsDescription fromPb(ClusterPermissionsDescriptionPb pb) {
    ClusterPermissionsDescription model = new ClusterPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class ClusterPermissionsDescriptionSerializer
      extends JsonSerializer<ClusterPermissionsDescription> {
    @Override
    public void serialize(
        ClusterPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPermissionsDescriptionDeserializer
      extends JsonDeserializer<ClusterPermissionsDescription> {
    @Override
    public ClusterPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPermissionsDescriptionPb pb =
          mapper.readValue(p, ClusterPermissionsDescriptionPb.class);
      return ClusterPermissionsDescription.fromPb(pb);
    }
  }
}

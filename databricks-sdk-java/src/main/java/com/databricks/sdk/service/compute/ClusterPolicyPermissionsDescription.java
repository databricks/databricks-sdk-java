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
    using = ClusterPolicyPermissionsDescription.ClusterPolicyPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using =
        ClusterPolicyPermissionsDescription.ClusterPolicyPermissionsDescriptionDeserializer.class)
public class ClusterPolicyPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private ClusterPolicyPermissionLevel permissionLevel;

  public ClusterPolicyPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ClusterPolicyPermissionsDescription setPermissionLevel(
      ClusterPolicyPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ClusterPolicyPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClusterPolicyPermissionsDescription that = (ClusterPolicyPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ClusterPolicyPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  ClusterPolicyPermissionsDescriptionPb toPb() {
    ClusterPolicyPermissionsDescriptionPb pb = new ClusterPolicyPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static ClusterPolicyPermissionsDescription fromPb(ClusterPolicyPermissionsDescriptionPb pb) {
    ClusterPolicyPermissionsDescription model = new ClusterPolicyPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class ClusterPolicyPermissionsDescriptionSerializer
      extends JsonSerializer<ClusterPolicyPermissionsDescription> {
    @Override
    public void serialize(
        ClusterPolicyPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ClusterPolicyPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ClusterPolicyPermissionsDescriptionDeserializer
      extends JsonDeserializer<ClusterPolicyPermissionsDescription> {
    @Override
    public ClusterPolicyPermissionsDescription deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ClusterPolicyPermissionsDescriptionPb pb =
          mapper.readValue(p, ClusterPolicyPermissionsDescriptionPb.class);
      return ClusterPolicyPermissionsDescription.fromPb(pb);
    }
  }
}

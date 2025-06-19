// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = RepoPermissionsDescription.RepoPermissionsDescriptionSerializer.class)
@JsonDeserialize(using = RepoPermissionsDescription.RepoPermissionsDescriptionDeserializer.class)
public class RepoPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private RepoPermissionLevel permissionLevel;

  public RepoPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public RepoPermissionsDescription setPermissionLevel(RepoPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public RepoPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepoPermissionsDescription that = (RepoPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(RepoPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  RepoPermissionsDescriptionPb toPb() {
    RepoPermissionsDescriptionPb pb = new RepoPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static RepoPermissionsDescription fromPb(RepoPermissionsDescriptionPb pb) {
    RepoPermissionsDescription model = new RepoPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class RepoPermissionsDescriptionSerializer
      extends JsonSerializer<RepoPermissionsDescription> {
    @Override
    public void serialize(
        RepoPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RepoPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RepoPermissionsDescriptionDeserializer
      extends JsonDeserializer<RepoPermissionsDescription> {
    @Override
    public RepoPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RepoPermissionsDescriptionPb pb = mapper.readValue(p, RepoPermissionsDescriptionPb.class);
      return RepoPermissionsDescription.fromPb(pb);
    }
  }
}

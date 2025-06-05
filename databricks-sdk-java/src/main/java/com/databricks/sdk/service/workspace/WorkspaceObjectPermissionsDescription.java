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
@JsonSerialize(
    using =
        WorkspaceObjectPermissionsDescription.WorkspaceObjectPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using =
        WorkspaceObjectPermissionsDescription.WorkspaceObjectPermissionsDescriptionDeserializer
            .class)
public class WorkspaceObjectPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private WorkspaceObjectPermissionLevel permissionLevel;

  public WorkspaceObjectPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public WorkspaceObjectPermissionsDescription setPermissionLevel(
      WorkspaceObjectPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public WorkspaceObjectPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WorkspaceObjectPermissionsDescription that = (WorkspaceObjectPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(WorkspaceObjectPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  WorkspaceObjectPermissionsDescriptionPb toPb() {
    WorkspaceObjectPermissionsDescriptionPb pb = new WorkspaceObjectPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static WorkspaceObjectPermissionsDescription fromPb(WorkspaceObjectPermissionsDescriptionPb pb) {
    WorkspaceObjectPermissionsDescription model = new WorkspaceObjectPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class WorkspaceObjectPermissionsDescriptionSerializer
      extends JsonSerializer<WorkspaceObjectPermissionsDescription> {
    @Override
    public void serialize(
        WorkspaceObjectPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WorkspaceObjectPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WorkspaceObjectPermissionsDescriptionDeserializer
      extends JsonDeserializer<WorkspaceObjectPermissionsDescription> {
    @Override
    public WorkspaceObjectPermissionsDescription deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WorkspaceObjectPermissionsDescriptionPb pb =
          mapper.readValue(p, WorkspaceObjectPermissionsDescriptionPb.class);
      return WorkspaceObjectPermissionsDescription.fromPb(pb);
    }
  }
}

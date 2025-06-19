// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
    using = PipelinePermissionsDescription.PipelinePermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = PipelinePermissionsDescription.PipelinePermissionsDescriptionDeserializer.class)
public class PipelinePermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private PipelinePermissionLevel permissionLevel;

  public PipelinePermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public PipelinePermissionsDescription setPermissionLevel(
      PipelinePermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PipelinePermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelinePermissionsDescription that = (PipelinePermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelinePermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  PipelinePermissionsDescriptionPb toPb() {
    PipelinePermissionsDescriptionPb pb = new PipelinePermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static PipelinePermissionsDescription fromPb(PipelinePermissionsDescriptionPb pb) {
    PipelinePermissionsDescription model = new PipelinePermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class PipelinePermissionsDescriptionSerializer
      extends JsonSerializer<PipelinePermissionsDescription> {
    @Override
    public void serialize(
        PipelinePermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelinePermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelinePermissionsDescriptionDeserializer
      extends JsonDeserializer<PipelinePermissionsDescription> {
    @Override
    public PipelinePermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelinePermissionsDescriptionPb pb =
          mapper.readValue(p, PipelinePermissionsDescriptionPb.class);
      return PipelinePermissionsDescription.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
    using = ExperimentPermissionsDescription.ExperimentPermissionsDescriptionSerializer.class)
@JsonDeserialize(
    using = ExperimentPermissionsDescription.ExperimentPermissionsDescriptionDeserializer.class)
public class ExperimentPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private ExperimentPermissionLevel permissionLevel;

  public ExperimentPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ExperimentPermissionsDescription setPermissionLevel(
      ExperimentPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ExperimentPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExperimentPermissionsDescription that = (ExperimentPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  ExperimentPermissionsDescriptionPb toPb() {
    ExperimentPermissionsDescriptionPb pb = new ExperimentPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static ExperimentPermissionsDescription fromPb(ExperimentPermissionsDescriptionPb pb) {
    ExperimentPermissionsDescription model = new ExperimentPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class ExperimentPermissionsDescriptionSerializer
      extends JsonSerializer<ExperimentPermissionsDescription> {
    @Override
    public void serialize(
        ExperimentPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ExperimentPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ExperimentPermissionsDescriptionDeserializer
      extends JsonDeserializer<ExperimentPermissionsDescription> {
    @Override
    public ExperimentPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ExperimentPermissionsDescriptionPb pb =
          mapper.readValue(p, ExperimentPermissionsDescriptionPb.class);
      return ExperimentPermissionsDescription.fromPb(pb);
    }
  }
}

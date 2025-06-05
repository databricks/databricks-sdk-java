// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = AppPermissionsDescription.AppPermissionsDescriptionSerializer.class)
@JsonDeserialize(using = AppPermissionsDescription.AppPermissionsDescriptionDeserializer.class)
public class AppPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private AppPermissionLevel permissionLevel;

  public AppPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public AppPermissionsDescription setPermissionLevel(AppPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public AppPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppPermissionsDescription that = (AppPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(AppPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  AppPermissionsDescriptionPb toPb() {
    AppPermissionsDescriptionPb pb = new AppPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static AppPermissionsDescription fromPb(AppPermissionsDescriptionPb pb) {
    AppPermissionsDescription model = new AppPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class AppPermissionsDescriptionSerializer
      extends JsonSerializer<AppPermissionsDescription> {
    @Override
    public void serialize(
        AppPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppPermissionsDescriptionDeserializer
      extends JsonDeserializer<AppPermissionsDescription> {
    @Override
    public AppPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppPermissionsDescriptionPb pb = mapper.readValue(p, AppPermissionsDescriptionPb.class);
      return AppPermissionsDescription.fromPb(pb);
    }
  }
}

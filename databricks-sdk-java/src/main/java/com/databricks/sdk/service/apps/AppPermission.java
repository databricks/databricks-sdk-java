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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = AppPermission.AppPermissionSerializer.class)
@JsonDeserialize(using = AppPermission.AppPermissionDeserializer.class)
public class AppPermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private AppPermissionLevel permissionLevel;

  public AppPermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public AppPermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public AppPermission setPermissionLevel(AppPermissionLevel permissionLevel) {
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
    AppPermission that = (AppPermission) o;
    return Objects.equals(inherited, that.inherited)
        && Objects.equals(inheritedFromObject, that.inheritedFromObject)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inherited, inheritedFromObject, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(AppPermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  AppPermissionPb toPb() {
    AppPermissionPb pb = new AppPermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static AppPermission fromPb(AppPermissionPb pb) {
    AppPermission model = new AppPermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class AppPermissionSerializer extends JsonSerializer<AppPermission> {
    @Override
    public void serialize(AppPermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppPermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppPermissionDeserializer extends JsonDeserializer<AppPermission> {
    @Override
    public AppPermission deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppPermissionPb pb = mapper.readValue(p, AppPermissionPb.class);
      return AppPermission.fromPb(pb);
    }
  }
}

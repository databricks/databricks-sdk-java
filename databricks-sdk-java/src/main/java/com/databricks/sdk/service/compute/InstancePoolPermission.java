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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = InstancePoolPermission.InstancePoolPermissionSerializer.class)
@JsonDeserialize(using = InstancePoolPermission.InstancePoolPermissionDeserializer.class)
public class InstancePoolPermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private InstancePoolPermissionLevel permissionLevel;

  public InstancePoolPermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public InstancePoolPermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public InstancePoolPermission setPermissionLevel(InstancePoolPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public InstancePoolPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InstancePoolPermission that = (InstancePoolPermission) o;
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
    return new ToStringer(InstancePoolPermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  InstancePoolPermissionPb toPb() {
    InstancePoolPermissionPb pb = new InstancePoolPermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static InstancePoolPermission fromPb(InstancePoolPermissionPb pb) {
    InstancePoolPermission model = new InstancePoolPermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class InstancePoolPermissionSerializer
      extends JsonSerializer<InstancePoolPermission> {
    @Override
    public void serialize(
        InstancePoolPermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      InstancePoolPermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class InstancePoolPermissionDeserializer
      extends JsonDeserializer<InstancePoolPermission> {
    @Override
    public InstancePoolPermission deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      InstancePoolPermissionPb pb = mapper.readValue(p, InstancePoolPermissionPb.class);
      return InstancePoolPermission.fromPb(pb);
    }
  }
}

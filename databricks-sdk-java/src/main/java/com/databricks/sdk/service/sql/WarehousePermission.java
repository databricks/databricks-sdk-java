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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = WarehousePermission.WarehousePermissionSerializer.class)
@JsonDeserialize(using = WarehousePermission.WarehousePermissionDeserializer.class)
public class WarehousePermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private WarehousePermissionLevel permissionLevel;

  public WarehousePermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public WarehousePermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public WarehousePermission setPermissionLevel(WarehousePermissionLevel permissionLevel) {
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
    WarehousePermission that = (WarehousePermission) o;
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
    return new ToStringer(WarehousePermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  WarehousePermissionPb toPb() {
    WarehousePermissionPb pb = new WarehousePermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static WarehousePermission fromPb(WarehousePermissionPb pb) {
    WarehousePermission model = new WarehousePermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class WarehousePermissionSerializer extends JsonSerializer<WarehousePermission> {
    @Override
    public void serialize(WarehousePermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WarehousePermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WarehousePermissionDeserializer
      extends JsonDeserializer<WarehousePermission> {
    @Override
    public WarehousePermission deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WarehousePermissionPb pb = mapper.readValue(p, WarehousePermissionPb.class);
      return WarehousePermission.fromPb(pb);
    }
  }
}

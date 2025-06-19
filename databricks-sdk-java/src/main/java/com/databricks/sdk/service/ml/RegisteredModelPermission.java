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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = RegisteredModelPermission.RegisteredModelPermissionSerializer.class)
@JsonDeserialize(using = RegisteredModelPermission.RegisteredModelPermissionDeserializer.class)
public class RegisteredModelPermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private RegisteredModelPermissionLevel permissionLevel;

  public RegisteredModelPermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public RegisteredModelPermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public RegisteredModelPermission setPermissionLevel(
      RegisteredModelPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public RegisteredModelPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RegisteredModelPermission that = (RegisteredModelPermission) o;
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
    return new ToStringer(RegisteredModelPermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  RegisteredModelPermissionPb toPb() {
    RegisteredModelPermissionPb pb = new RegisteredModelPermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static RegisteredModelPermission fromPb(RegisteredModelPermissionPb pb) {
    RegisteredModelPermission model = new RegisteredModelPermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class RegisteredModelPermissionSerializer
      extends JsonSerializer<RegisteredModelPermission> {
    @Override
    public void serialize(
        RegisteredModelPermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RegisteredModelPermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RegisteredModelPermissionDeserializer
      extends JsonDeserializer<RegisteredModelPermission> {
    @Override
    public RegisteredModelPermission deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RegisteredModelPermissionPb pb = mapper.readValue(p, RegisteredModelPermissionPb.class);
      return RegisteredModelPermission.fromPb(pb);
    }
  }
}

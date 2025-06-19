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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelinePermission.PipelinePermissionSerializer.class)
@JsonDeserialize(using = PipelinePermission.PipelinePermissionDeserializer.class)
public class PipelinePermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private PipelinePermissionLevel permissionLevel;

  public PipelinePermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public PipelinePermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public PipelinePermission setPermissionLevel(PipelinePermissionLevel permissionLevel) {
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
    PipelinePermission that = (PipelinePermission) o;
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
    return new ToStringer(PipelinePermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  PipelinePermissionPb toPb() {
    PipelinePermissionPb pb = new PipelinePermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static PipelinePermission fromPb(PipelinePermissionPb pb) {
    PipelinePermission model = new PipelinePermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class PipelinePermissionSerializer extends JsonSerializer<PipelinePermission> {
    @Override
    public void serialize(PipelinePermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelinePermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelinePermissionDeserializer extends JsonDeserializer<PipelinePermission> {
    @Override
    public PipelinePermission deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelinePermissionPb pb = mapper.readValue(p, PipelinePermissionPb.class);
      return PipelinePermission.fromPb(pb);
    }
  }
}

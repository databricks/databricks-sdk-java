// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

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
@JsonSerialize(using = JobPermission.JobPermissionSerializer.class)
@JsonDeserialize(using = JobPermission.JobPermissionDeserializer.class)
public class JobPermission {
  /** */
  private Boolean inherited;

  /** */
  private Collection<String> inheritedFromObject;

  /** Permission level */
  private JobPermissionLevel permissionLevel;

  public JobPermission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  public Boolean getInherited() {
    return inherited;
  }

  public JobPermission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  public JobPermission setPermissionLevel(JobPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public JobPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobPermission that = (JobPermission) o;
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
    return new ToStringer(JobPermission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  JobPermissionPb toPb() {
    JobPermissionPb pb = new JobPermissionPb();
    pb.setInherited(inherited);
    pb.setInheritedFromObject(inheritedFromObject);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static JobPermission fromPb(JobPermissionPb pb) {
    JobPermission model = new JobPermission();
    model.setInherited(pb.getInherited());
    model.setInheritedFromObject(pb.getInheritedFromObject());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class JobPermissionSerializer extends JsonSerializer<JobPermission> {
    @Override
    public void serialize(JobPermission value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobPermissionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobPermissionDeserializer extends JsonDeserializer<JobPermission> {
    @Override
    public JobPermission deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobPermissionPb pb = mapper.readValue(p, JobPermissionPb.class);
      return JobPermission.fromPb(pb);
    }
  }
}

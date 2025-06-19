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
import java.util.Objects;

@Generated
@JsonSerialize(using = JobPermissionsDescription.JobPermissionsDescriptionSerializer.class)
@JsonDeserialize(using = JobPermissionsDescription.JobPermissionsDescriptionDeserializer.class)
public class JobPermissionsDescription {
  /** */
  private String description;

  /** Permission level */
  private JobPermissionLevel permissionLevel;

  public JobPermissionsDescription setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public JobPermissionsDescription setPermissionLevel(JobPermissionLevel permissionLevel) {
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
    JobPermissionsDescription that = (JobPermissionsDescription) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  @Override
  public String toString() {
    return new ToStringer(JobPermissionsDescription.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }

  JobPermissionsDescriptionPb toPb() {
    JobPermissionsDescriptionPb pb = new JobPermissionsDescriptionPb();
    pb.setDescription(description);
    pb.setPermissionLevel(permissionLevel);

    return pb;
  }

  static JobPermissionsDescription fromPb(JobPermissionsDescriptionPb pb) {
    JobPermissionsDescription model = new JobPermissionsDescription();
    model.setDescription(pb.getDescription());
    model.setPermissionLevel(pb.getPermissionLevel());

    return model;
  }

  public static class JobPermissionsDescriptionSerializer
      extends JsonSerializer<JobPermissionsDescription> {
    @Override
    public void serialize(
        JobPermissionsDescription value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobPermissionsDescriptionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobPermissionsDescriptionDeserializer
      extends JsonDeserializer<JobPermissionsDescription> {
    @Override
    public JobPermissionsDescription deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobPermissionsDescriptionPb pb = mapper.readValue(p, JobPermissionsDescriptionPb.class);
      return JobPermissionsDescription.fromPb(pb);
    }
  }
}

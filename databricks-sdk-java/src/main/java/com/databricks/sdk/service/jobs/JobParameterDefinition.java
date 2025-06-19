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
@JsonSerialize(using = JobParameterDefinition.JobParameterDefinitionSerializer.class)
@JsonDeserialize(using = JobParameterDefinition.JobParameterDefinitionDeserializer.class)
public class JobParameterDefinition {
  /** Default value of the parameter. */
  private String defaultValue;

  /**
   * The name of the defined parameter. May only contain alphanumeric characters, `_`, `-`, and `.`
   */
  private String name;

  public JobParameterDefinition setDefault(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  public String getDefault() {
    return defaultValue;
  }

  public JobParameterDefinition setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobParameterDefinition that = (JobParameterDefinition) o;
    return Objects.equals(defaultValue, that.defaultValue) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, name);
  }

  @Override
  public String toString() {
    return new ToStringer(JobParameterDefinition.class)
        .add("defaultValue", defaultValue)
        .add("name", name)
        .toString();
  }

  JobParameterDefinitionPb toPb() {
    JobParameterDefinitionPb pb = new JobParameterDefinitionPb();
    pb.setDefault(defaultValue);
    pb.setName(name);

    return pb;
  }

  static JobParameterDefinition fromPb(JobParameterDefinitionPb pb) {
    JobParameterDefinition model = new JobParameterDefinition();
    model.setDefault(pb.getDefault());
    model.setName(pb.getName());

    return model;
  }

  public static class JobParameterDefinitionSerializer
      extends JsonSerializer<JobParameterDefinition> {
    @Override
    public void serialize(
        JobParameterDefinition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobParameterDefinitionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobParameterDefinitionDeserializer
      extends JsonDeserializer<JobParameterDefinition> {
    @Override
    public JobParameterDefinition deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobParameterDefinitionPb pb = mapper.readValue(p, JobParameterDefinitionPb.class);
      return JobParameterDefinition.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = JobEnvironment.JobEnvironmentSerializer.class)
@JsonDeserialize(using = JobEnvironment.JobEnvironmentDeserializer.class)
public class JobEnvironment {
  /** The key of an environment. It has to be unique within a job. */
  private String environmentKey;

  /**
   * The environment entity used to preserve serverless environment side panel, jobs' environment
   * for non-notebook task, and DLT's environment for classic and serverless pipelines. In this
   * minimal environment spec, only pip dependencies are supported.
   */
  private com.databricks.sdk.service.compute.Environment spec;

  public JobEnvironment setEnvironmentKey(String environmentKey) {
    this.environmentKey = environmentKey;
    return this;
  }

  public String getEnvironmentKey() {
    return environmentKey;
  }

  public JobEnvironment setSpec(com.databricks.sdk.service.compute.Environment spec) {
    this.spec = spec;
    return this;
  }

  public com.databricks.sdk.service.compute.Environment getSpec() {
    return spec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobEnvironment that = (JobEnvironment) o;
    return Objects.equals(environmentKey, that.environmentKey) && Objects.equals(spec, that.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentKey, spec);
  }

  @Override
  public String toString() {
    return new ToStringer(JobEnvironment.class)
        .add("environmentKey", environmentKey)
        .add("spec", spec)
        .toString();
  }

  JobEnvironmentPb toPb() {
    JobEnvironmentPb pb = new JobEnvironmentPb();
    pb.setEnvironmentKey(environmentKey);
    pb.setSpec(spec);

    return pb;
  }

  static JobEnvironment fromPb(JobEnvironmentPb pb) {
    JobEnvironment model = new JobEnvironment();
    model.setEnvironmentKey(pb.getEnvironmentKey());
    model.setSpec(pb.getSpec());

    return model;
  }

  public static class JobEnvironmentSerializer extends JsonSerializer<JobEnvironment> {
    @Override
    public void serialize(JobEnvironment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobEnvironmentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobEnvironmentDeserializer extends JsonDeserializer<JobEnvironment> {
    @Override
    public JobEnvironment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobEnvironmentPb pb = mapper.readValue(p, JobEnvironmentPb.class);
      return JobEnvironment.fromPb(pb);
    }
  }
}

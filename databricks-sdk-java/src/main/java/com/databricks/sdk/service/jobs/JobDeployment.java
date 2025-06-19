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
@JsonSerialize(using = JobDeployment.JobDeploymentSerializer.class)
@JsonDeserialize(using = JobDeployment.JobDeploymentDeserializer.class)
public class JobDeployment {
  /**
   * The kind of deployment that manages the job.
   *
   * <p>* `BUNDLE`: The job is managed by Databricks Asset Bundle.
   */
  private JobDeploymentKind kind;

  /** Path of the file that contains deployment metadata. */
  private String metadataFilePath;

  public JobDeployment setKind(JobDeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public JobDeploymentKind getKind() {
    return kind;
  }

  public JobDeployment setMetadataFilePath(String metadataFilePath) {
    this.metadataFilePath = metadataFilePath;
    return this;
  }

  public String getMetadataFilePath() {
    return metadataFilePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JobDeployment that = (JobDeployment) o;
    return Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, metadataFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(JobDeployment.class)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .toString();
  }

  JobDeploymentPb toPb() {
    JobDeploymentPb pb = new JobDeploymentPb();
    pb.setKind(kind);
    pb.setMetadataFilePath(metadataFilePath);

    return pb;
  }

  static JobDeployment fromPb(JobDeploymentPb pb) {
    JobDeployment model = new JobDeployment();
    model.setKind(pb.getKind());
    model.setMetadataFilePath(pb.getMetadataFilePath());

    return model;
  }

  public static class JobDeploymentSerializer extends JsonSerializer<JobDeployment> {
    @Override
    public void serialize(JobDeployment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      JobDeploymentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class JobDeploymentDeserializer extends JsonDeserializer<JobDeployment> {
    @Override
    public JobDeployment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      JobDeploymentPb pb = mapper.readValue(p, JobDeploymentPb.class);
      return JobDeployment.fromPb(pb);
    }
  }
}

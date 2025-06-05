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
import java.util.Objects;

@Generated
@JsonSerialize(using = PipelineDeployment.PipelineDeploymentSerializer.class)
@JsonDeserialize(using = PipelineDeployment.PipelineDeploymentDeserializer.class)
public class PipelineDeployment {
  /** The deployment method that manages the pipeline. */
  private DeploymentKind kind;

  /** The path to the file containing metadata about the deployment. */
  private String metadataFilePath;

  public PipelineDeployment setKind(DeploymentKind kind) {
    this.kind = kind;
    return this;
  }

  public DeploymentKind getKind() {
    return kind;
  }

  public PipelineDeployment setMetadataFilePath(String metadataFilePath) {
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
    PipelineDeployment that = (PipelineDeployment) o;
    return Objects.equals(kind, that.kind)
        && Objects.equals(metadataFilePath, that.metadataFilePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, metadataFilePath);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineDeployment.class)
        .add("kind", kind)
        .add("metadataFilePath", metadataFilePath)
        .toString();
  }

  PipelineDeploymentPb toPb() {
    PipelineDeploymentPb pb = new PipelineDeploymentPb();
    pb.setKind(kind);
    pb.setMetadataFilePath(metadataFilePath);

    return pb;
  }

  static PipelineDeployment fromPb(PipelineDeploymentPb pb) {
    PipelineDeployment model = new PipelineDeployment();
    model.setKind(pb.getKind());
    model.setMetadataFilePath(pb.getMetadataFilePath());

    return model;
  }

  public static class PipelineDeploymentSerializer extends JsonSerializer<PipelineDeployment> {
    @Override
    public void serialize(PipelineDeployment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineDeploymentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineDeploymentDeserializer extends JsonDeserializer<PipelineDeployment> {
    @Override
    public PipelineDeployment deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineDeploymentPb pb = mapper.readValue(p, PipelineDeploymentPb.class);
      return PipelineDeployment.fromPb(pb);
    }
  }
}

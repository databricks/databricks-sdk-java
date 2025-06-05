// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

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
@JsonSerialize(using = AppDeploymentArtifacts.AppDeploymentArtifactsSerializer.class)
@JsonDeserialize(using = AppDeploymentArtifacts.AppDeploymentArtifactsDeserializer.class)
public class AppDeploymentArtifacts {
  /** The snapshotted workspace file system path of the source code loaded by the deployed app. */
  private String sourceCodePath;

  public AppDeploymentArtifacts setSourceCodePath(String sourceCodePath) {
    this.sourceCodePath = sourceCodePath;
    return this;
  }

  public String getSourceCodePath() {
    return sourceCodePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDeploymentArtifacts that = (AppDeploymentArtifacts) o;
    return Objects.equals(sourceCodePath, that.sourceCodePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCodePath);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentArtifacts.class)
        .add("sourceCodePath", sourceCodePath)
        .toString();
  }

  AppDeploymentArtifactsPb toPb() {
    AppDeploymentArtifactsPb pb = new AppDeploymentArtifactsPb();
    pb.setSourceCodePath(sourceCodePath);

    return pb;
  }

  static AppDeploymentArtifacts fromPb(AppDeploymentArtifactsPb pb) {
    AppDeploymentArtifacts model = new AppDeploymentArtifacts();
    model.setSourceCodePath(pb.getSourceCodePath());

    return model;
  }

  public static class AppDeploymentArtifactsSerializer
      extends JsonSerializer<AppDeploymentArtifacts> {
    @Override
    public void serialize(
        AppDeploymentArtifacts value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppDeploymentArtifactsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppDeploymentArtifactsDeserializer
      extends JsonDeserializer<AppDeploymentArtifacts> {
    @Override
    public AppDeploymentArtifacts deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppDeploymentArtifactsPb pb = mapper.readValue(p, AppDeploymentArtifactsPb.class);
      return AppDeploymentArtifacts.fromPb(pb);
    }
  }
}

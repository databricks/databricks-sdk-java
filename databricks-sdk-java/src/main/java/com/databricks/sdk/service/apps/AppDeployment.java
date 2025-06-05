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
@JsonSerialize(using = AppDeployment.AppDeploymentSerializer.class)
@JsonDeserialize(using = AppDeployment.AppDeploymentDeserializer.class)
public class AppDeployment {
  /** The creation time of the deployment. Formatted timestamp in ISO 6801. */
  private String createTime;

  /** The email of the user creates the deployment. */
  private String creator;

  /** The deployment artifacts for an app. */
  private AppDeploymentArtifacts deploymentArtifacts;

  /** The unique id of the deployment. */
  private String deploymentId;

  /** The mode of which the deployment will manage the source code. */
  private AppDeploymentMode mode;

  /**
   * The workspace file system path of the source code used to create the app deployment. This is
   * different from `deployment_artifacts.source_code_path`, which is the path used by the deployed
   * app. The former refers to the original source code location of the app in the workspace during
   * deployment creation, whereas the latter provides a system generated stable snapshotted source
   * code path used by the deployment.
   */
  private String sourceCodePath;

  /** Status and status message of the deployment */
  private AppDeploymentStatus status;

  /** The update time of the deployment. Formatted timestamp in ISO 6801. */
  private String updateTime;

  public AppDeployment setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  public String getCreateTime() {
    return createTime;
  }

  public AppDeployment setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public AppDeployment setDeploymentArtifacts(AppDeploymentArtifacts deploymentArtifacts) {
    this.deploymentArtifacts = deploymentArtifacts;
    return this;
  }

  public AppDeploymentArtifacts getDeploymentArtifacts() {
    return deploymentArtifacts;
  }

  public AppDeployment setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  public AppDeployment setMode(AppDeploymentMode mode) {
    this.mode = mode;
    return this;
  }

  public AppDeploymentMode getMode() {
    return mode;
  }

  public AppDeployment setSourceCodePath(String sourceCodePath) {
    this.sourceCodePath = sourceCodePath;
    return this;
  }

  public String getSourceCodePath() {
    return sourceCodePath;
  }

  public AppDeployment setStatus(AppDeploymentStatus status) {
    this.status = status;
    return this;
  }

  public AppDeploymentStatus getStatus() {
    return status;
  }

  public AppDeployment setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AppDeployment that = (AppDeployment) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creator, that.creator)
        && Objects.equals(deploymentArtifacts, that.deploymentArtifacts)
        && Objects.equals(deploymentId, that.deploymentId)
        && Objects.equals(mode, that.mode)
        && Objects.equals(sourceCodePath, that.sourceCodePath)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creator,
        deploymentArtifacts,
        deploymentId,
        mode,
        sourceCodePath,
        status,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeployment.class)
        .add("createTime", createTime)
        .add("creator", creator)
        .add("deploymentArtifacts", deploymentArtifacts)
        .add("deploymentId", deploymentId)
        .add("mode", mode)
        .add("sourceCodePath", sourceCodePath)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }

  AppDeploymentPb toPb() {
    AppDeploymentPb pb = new AppDeploymentPb();
    pb.setCreateTime(createTime);
    pb.setCreator(creator);
    pb.setDeploymentArtifacts(deploymentArtifacts);
    pb.setDeploymentId(deploymentId);
    pb.setMode(mode);
    pb.setSourceCodePath(sourceCodePath);
    pb.setStatus(status);
    pb.setUpdateTime(updateTime);

    return pb;
  }

  static AppDeployment fromPb(AppDeploymentPb pb) {
    AppDeployment model = new AppDeployment();
    model.setCreateTime(pb.getCreateTime());
    model.setCreator(pb.getCreator());
    model.setDeploymentArtifacts(pb.getDeploymentArtifacts());
    model.setDeploymentId(pb.getDeploymentId());
    model.setMode(pb.getMode());
    model.setSourceCodePath(pb.getSourceCodePath());
    model.setStatus(pb.getStatus());
    model.setUpdateTime(pb.getUpdateTime());

    return model;
  }

  public static class AppDeploymentSerializer extends JsonSerializer<AppDeployment> {
    @Override
    public void serialize(AppDeployment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AppDeploymentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AppDeploymentDeserializer extends JsonDeserializer<AppDeployment> {
    @Override
    public AppDeployment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AppDeploymentPb pb = mapper.readValue(p, AppDeploymentPb.class);
      return AppDeployment.fromPb(pb);
    }
  }
}

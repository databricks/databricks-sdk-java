// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateAppDeploymentRequest {
  /** The name of the app. */
  private String appName;

  /** The mode of which the deployment will manage the source code. */
  @JsonProperty("mode")
  private AppDeploymentMode mode;

  /**
   * The workspace file system path of the source code used to create the app deployment. This is
   * different from `deployment_artifacts.source_code_path`, which is the path used by the deployed
   * app. The former refers to the original source code location of the app in the workspace during
   * deployment creation, whereas the latter provides a system generated stable snapshotted source
   * code path used by the deployment.
   */
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  public CreateAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
  }

  public CreateAppDeploymentRequest setMode(AppDeploymentMode mode) {
    this.mode = mode;
    return this;
  }

  public AppDeploymentMode getMode() {
    return mode;
  }

  public CreateAppDeploymentRequest setSourceCodePath(String sourceCodePath) {
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
    CreateAppDeploymentRequest that = (CreateAppDeploymentRequest) o;
    return Objects.equals(appName, that.appName)
        && Objects.equals(mode, that.mode)
        && Objects.equals(sourceCodePath, that.sourceCodePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, mode, sourceCodePath);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppDeploymentRequest.class)
        .add("appName", appName)
        .add("mode", mode)
        .add("sourceCodePath", sourceCodePath)
        .toString();
  }
}

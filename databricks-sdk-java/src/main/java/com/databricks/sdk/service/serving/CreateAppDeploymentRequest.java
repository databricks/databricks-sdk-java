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

  /** The source code path of the deployment. */
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  public CreateAppDeploymentRequest setAppName(String appName) {
    this.appName = appName;
    return this;
  }

  public String getAppName() {
    return appName;
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
        && Objects.equals(sourceCodePath, that.sourceCodePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, sourceCodePath);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateAppDeploymentRequest.class)
        .add("appName", appName)
        .add("sourceCodePath", sourceCodePath)
        .toString();
  }
}

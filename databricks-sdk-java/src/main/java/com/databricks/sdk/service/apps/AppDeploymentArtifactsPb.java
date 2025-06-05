// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AppDeploymentArtifactsPb {
  @JsonProperty("source_code_path")
  private String sourceCodePath;

  public AppDeploymentArtifactsPb setSourceCodePath(String sourceCodePath) {
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
    AppDeploymentArtifactsPb that = (AppDeploymentArtifactsPb) o;
    return Objects.equals(sourceCodePath, that.sourceCodePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceCodePath);
  }

  @Override
  public String toString() {
    return new ToStringer(AppDeploymentArtifactsPb.class)
        .add("sourceCodePath", sourceCodePath)
        .toString();
  }
}

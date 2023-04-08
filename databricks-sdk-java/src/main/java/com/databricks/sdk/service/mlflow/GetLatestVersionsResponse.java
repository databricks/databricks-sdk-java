// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetLatestVersionsResponse {
  /**
   * Latest version models for each requests stage. Only return models with current `READY` status.
   * If no `stages` provided, returns the latest version for each stage, including `"None"`.
   */
  @JsonProperty("model_versions")
  private java.util.List<ModelVersion> modelVersions;

  public GetLatestVersionsResponse setModelVersions(java.util.List<ModelVersion> modelVersions) {
    this.modelVersions = modelVersions;
    return this;
  }

  public java.util.List<ModelVersion> getModelVersions() {
    return modelVersions;
  }
}

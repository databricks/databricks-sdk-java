// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetModelVersionDownloadUriResponse {
  /** URI corresponding to where artifacts for this model version are stored. */
  @JsonProperty("artifact_uri")
  private String artifactUri;

  public GetModelVersionDownloadUriResponse setArtifactUri(String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  public String getArtifactUri() {
    return artifactUri;
  }
}

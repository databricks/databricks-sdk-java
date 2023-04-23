// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetModelVersionDownloadUriResponse that = (GetModelVersionDownloadUriResponse) o;
    return Objects.equals(artifactUri, that.artifactUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactUri);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriResponse.class)
        .add("artifactUri", artifactUri)
        .toString();
  }
}

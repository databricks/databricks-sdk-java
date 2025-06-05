// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GetModelVersionDownloadUriResponsePb {
  @JsonProperty("artifact_uri")
  private String artifactUri;

  public GetModelVersionDownloadUriResponsePb setArtifactUri(String artifactUri) {
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
    GetModelVersionDownloadUriResponsePb that = (GetModelVersionDownloadUriResponsePb) o;
    return Objects.equals(artifactUri, that.artifactUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactUri);
  }

  @Override
  public String toString() {
    return new ToStringer(GetModelVersionDownloadUriResponsePb.class)
        .add("artifactUri", artifactUri)
        .toString();
  }
}

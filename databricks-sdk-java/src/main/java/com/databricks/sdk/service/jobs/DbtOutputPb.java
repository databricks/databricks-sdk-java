// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
class DbtOutputPb {
  @JsonProperty("artifacts_headers")
  private Map<String, String> artifactsHeaders;

  @JsonProperty("artifacts_link")
  private String artifactsLink;

  public DbtOutputPb setArtifactsHeaders(Map<String, String> artifactsHeaders) {
    this.artifactsHeaders = artifactsHeaders;
    return this;
  }

  public Map<String, String> getArtifactsHeaders() {
    return artifactsHeaders;
  }

  public DbtOutputPb setArtifactsLink(String artifactsLink) {
    this.artifactsLink = artifactsLink;
    return this;
  }

  public String getArtifactsLink() {
    return artifactsLink;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DbtOutputPb that = (DbtOutputPb) o;
    return Objects.equals(artifactsHeaders, that.artifactsHeaders)
        && Objects.equals(artifactsLink, that.artifactsLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactsHeaders, artifactsLink);
  }

  @Override
  public String toString() {
    return new ToStringer(DbtOutputPb.class)
        .add("artifactsHeaders", artifactsHeaders)
        .add("artifactsLink", artifactsLink)
        .toString();
  }
}

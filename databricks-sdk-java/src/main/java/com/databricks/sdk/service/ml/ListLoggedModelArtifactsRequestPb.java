// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List artifacts for a logged model */
@Generated
class ListLoggedModelArtifactsRequestPb {
  @JsonIgnore
  @QueryParam("artifact_directory_path")
  private String artifactDirectoryPath;

  @JsonIgnore private String modelId;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListLoggedModelArtifactsRequestPb setArtifactDirectoryPath(String artifactDirectoryPath) {
    this.artifactDirectoryPath = artifactDirectoryPath;
    return this;
  }

  public String getArtifactDirectoryPath() {
    return artifactDirectoryPath;
  }

  public ListLoggedModelArtifactsRequestPb setModelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  public String getModelId() {
    return modelId;
  }

  public ListLoggedModelArtifactsRequestPb setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListLoggedModelArtifactsRequestPb that = (ListLoggedModelArtifactsRequestPb) o;
    return Objects.equals(artifactDirectoryPath, that.artifactDirectoryPath)
        && Objects.equals(modelId, that.modelId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactDirectoryPath, modelId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListLoggedModelArtifactsRequestPb.class)
        .add("artifactDirectoryPath", artifactDirectoryPath)
        .add("modelId", modelId)
        .add("pageToken", pageToken)
        .toString();
  }
}

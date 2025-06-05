// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ListArtifactsResponsePb {
  @JsonProperty("files")
  private Collection<FileInfo> files;

  @JsonProperty("next_page_token")
  private String nextPageToken;

  @JsonProperty("root_uri")
  private String rootUri;

  public ListArtifactsResponsePb setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  public Collection<FileInfo> getFiles() {
    return files;
  }

  public ListArtifactsResponsePb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListArtifactsResponsePb setRootUri(String rootUri) {
    this.rootUri = rootUri;
    return this;
  }

  public String getRootUri() {
    return rootUri;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListArtifactsResponsePb that = (ListArtifactsResponsePb) o;
    return Objects.equals(files, that.files)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(rootUri, that.rootUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(files, nextPageToken, rootUri);
  }

  @Override
  public String toString() {
    return new ToStringer(ListArtifactsResponsePb.class)
        .add("files", files)
        .add("nextPageToken", nextPageToken)
        .add("rootUri", rootUri)
        .toString();
  }
}

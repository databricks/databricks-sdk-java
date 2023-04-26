// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ListArtifactsResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListArtifactsResponse {
  /** File location and metadata for artifacts. */
  @JsonProperty("files")
  private Collection<FileInfo> files;

  /** Token that can be used to retrieve the next page of artifact results */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Root artifact directory for the run. */
  @JsonProperty("root_uri")
  private String rootUri;

  /**
   * <p>Setter for the field <code>files</code>.</p>
   *
   * @param files a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsResponse} object
   */
  public ListArtifactsResponse setFiles(Collection<FileInfo> files) {
    this.files = files;
    return this;
  }

  /**
   * <p>Getter for the field <code>files</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<FileInfo> getFiles() {
    return files;
  }

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsResponse} object
   */
  public ListArtifactsResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * <p>Getter for the field <code>nextPageToken</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * <p>Setter for the field <code>rootUri</code>.</p>
   *
   * @param rootUri a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.ListArtifactsResponse} object
   */
  public ListArtifactsResponse setRootUri(String rootUri) {
    this.rootUri = rootUri;
    return this;
  }

  /**
   * <p>Getter for the field <code>rootUri</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRootUri() {
    return rootUri;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListArtifactsResponse that = (ListArtifactsResponse) o;
    return Objects.equals(files, that.files)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(rootUri, that.rootUri);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(files, nextPageToken, rootUri);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListArtifactsResponse.class)
        .add("files", files)
        .add("nextPageToken", nextPageToken)
        .add("rootUri", rootUri)
        .toString();
  }
}

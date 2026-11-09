// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.softwareartifacts;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSoftwareArtifactVersionsRequest {
  /**
   * Maximum number of versions to return. If omitted or set to 0, the page size defaults to 50. The
   * maximum value is 50; values above 50 or below 0 are rejected.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Opaque continuation token from a previous response's next_page_token. Omit for the first page.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Resource name of the parent artifact, of the form
   * `software-artifacts/{catalog}.{schema}.{artifact}`.
   */
  @JsonIgnore private String parent;

  public ListSoftwareArtifactVersionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSoftwareArtifactVersionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSoftwareArtifactVersionsRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSoftwareArtifactVersionsRequest that = (ListSoftwareArtifactVersionsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSoftwareArtifactVersionsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}

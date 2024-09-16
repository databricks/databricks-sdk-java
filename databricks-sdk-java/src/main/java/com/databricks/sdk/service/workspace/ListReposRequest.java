// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get repos */
@Generated
public class ListReposRequest {
  /**
   * Token used to get the next page of results. If not specified, returns the first page of results
   * as well as a next page token if there are more results.
   */
  @JsonIgnore
  @QueryParam("next_page_token")
  private String nextPageToken;

  /**
   * Filters repos that have paths starting with the given path prefix. If not provided repos from
   * /Repos will be served.
   */
  @JsonIgnore
  @QueryParam("path_prefix")
  private String pathPrefix;

  public ListReposRequest setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposRequest setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  public String getPathPrefix() {
    return pathPrefix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposRequest that = (ListReposRequest) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(pathPrefix, that.pathPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pathPrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposRequest.class)
        .add("nextPageToken", nextPageToken)
        .add("pathPrefix", pathPrefix)
        .toString();
  }
}

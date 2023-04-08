// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.repos;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get repos */
public class List {
  /**
   * Token used to get the next page of results. If not specified, returns the first page of results
   * as well as a next page token if there are more results.
   */
  @QueryParam("next_page_token")
  private String nextPageToken;

  /** Filters repos that have paths starting with the given path prefix. */
  @QueryParam("path_prefix")
  private String pathPrefix;

  public List setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public List setPathPrefix(String pathPrefix) {
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
    List that = (List) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(pathPrefix, that.pathPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pathPrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(List.class)
        .add("nextPageToken", nextPageToken)
        .add("pathPrefix", pathPrefix)
        .toString();
  }
}

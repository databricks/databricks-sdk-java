// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get repos
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ListReposRequest {
  /**
   * Token used to get the next page of results. If not specified, returns the first page of results
   * as well as a next page token if there are more results.
   */
  @QueryParam("next_page_token")
  private String nextPageToken;

  /** Filters repos that have paths starting with the given path prefix. */
  @QueryParam("path_prefix")
  private String pathPrefix;

  /**
   * <p>Setter for the field <code>nextPageToken</code>.</p>
   *
   * @param nextPageToken a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ListReposRequest} object
   */
  public ListReposRequest setNextPageToken(String nextPageToken) {
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
   * <p>Setter for the field <code>pathPrefix</code>.</p>
   *
   * @param pathPrefix a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.workspace.ListReposRequest} object
   */
  public ListReposRequest setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * <p>Getter for the field <code>pathPrefix</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPathPrefix() {
    return pathPrefix;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListReposRequest that = (ListReposRequest) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(pathPrefix, that.pathPrefix);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pathPrefix);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ListReposRequest.class)
        .add("nextPageToken", nextPageToken)
        .add("pathPrefix", pathPrefix)
        .toString();
  }
}

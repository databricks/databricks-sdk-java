// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get repos */
@Generated
class ListReposRequestPb {
  @JsonIgnore
  @QueryParam("next_page_token")
  private String nextPageToken;

  @JsonIgnore
  @QueryParam("path_prefix")
  private String pathPrefix;

  public ListReposRequestPb setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListReposRequestPb setPathPrefix(String pathPrefix) {
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
    ListReposRequestPb that = (ListReposRequestPb) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(pathPrefix, that.pathPrefix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, pathPrefix);
  }

  @Override
  public String toString() {
    return new ToStringer(ListReposRequestPb.class)
        .add("nextPageToken", nextPageToken)
        .add("pathPrefix", pathPrefix)
        .toString();
  }
}

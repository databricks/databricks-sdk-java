// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListEndpointsRequest {
  /** Token for pagination */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListEndpointsRequest setPageToken(String pageToken) {
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
    ListEndpointsRequest that = (ListEndpointsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEndpointsRequest.class).add("pageToken", pageToken).toString();
  }
}

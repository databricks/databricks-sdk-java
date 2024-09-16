// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List indexes */
@Generated
public class ListIndexesRequest {
  /** Name of the endpoint */
  @JsonIgnore
  @QueryParam("endpoint_name")
  private String endpointName;

  /** Token for pagination */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListIndexesRequest setEndpointName(String endpointName) {
    this.endpointName = endpointName;
    return this;
  }

  public String getEndpointName() {
    return endpointName;
  }

  public ListIndexesRequest setPageToken(String pageToken) {
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
    ListIndexesRequest that = (ListIndexesRequest) o;
    return Objects.equals(endpointName, that.endpointName)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointName, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListIndexesRequest.class)
        .add("endpointName", endpointName)
        .add("pageToken", pageToken)
        .toString();
  }
}

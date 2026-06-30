// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListNetworkConnectivityConfigurationsRequest {
  /** Pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListNetworkConnectivityConfigurationsRequest setPageToken(String pageToken) {
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
    ListNetworkConnectivityConfigurationsRequest that =
        (ListNetworkConnectivityConfigurationsRequest) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkConnectivityConfigurationsRequest.class)
        .add("pageToken", pageToken)
        .toString();
  }
}

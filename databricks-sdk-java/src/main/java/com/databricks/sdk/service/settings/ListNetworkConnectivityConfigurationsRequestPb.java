// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List network connectivity configurations */
@Generated
class ListNetworkConnectivityConfigurationsRequestPb {
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListNetworkConnectivityConfigurationsRequestPb setPageToken(String pageToken) {
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
    ListNetworkConnectivityConfigurationsRequestPb that =
        (ListNetworkConnectivityConfigurationsRequestPb) o;
    return Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListNetworkConnectivityConfigurationsRequestPb.class)
        .add("pageToken", pageToken)
        .toString();
  }
}

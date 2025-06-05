// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** List private endpoint rules */
@Generated
class ListPrivateEndpointRulesRequestPb {
  @JsonIgnore private String networkConnectivityConfigId;

  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListPrivateEndpointRulesRequestPb setNetworkConnectivityConfigId(
      String networkConnectivityConfigId) {
    this.networkConnectivityConfigId = networkConnectivityConfigId;
    return this;
  }

  public String getNetworkConnectivityConfigId() {
    return networkConnectivityConfigId;
  }

  public ListPrivateEndpointRulesRequestPb setPageToken(String pageToken) {
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
    ListPrivateEndpointRulesRequestPb that = (ListPrivateEndpointRulesRequestPb) o;
    return Objects.equals(networkConnectivityConfigId, that.networkConnectivityConfigId)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkConnectivityConfigId, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateEndpointRulesRequestPb.class)
        .add("networkConnectivityConfigId", networkConnectivityConfigId)
        .add("pageToken", pageToken)
        .toString();
  }
}

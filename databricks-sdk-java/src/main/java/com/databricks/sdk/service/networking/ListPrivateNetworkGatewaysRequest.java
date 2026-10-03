// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListPrivateNetworkGatewaysRequest {
  /** An opaque token returned by a previous list request. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The network connectivity configuration containing the gateways. */
  @JsonIgnore private String parent;

  public ListPrivateNetworkGatewaysRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListPrivateNetworkGatewaysRequest setParent(String parent) {
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
    ListPrivateNetworkGatewaysRequest that = (ListPrivateNetworkGatewaysRequest) o;
    return Objects.equals(pageToken, that.pageToken) && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateNetworkGatewaysRequest.class)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}

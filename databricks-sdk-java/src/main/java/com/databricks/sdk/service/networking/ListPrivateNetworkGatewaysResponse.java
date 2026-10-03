// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.networking;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class ListPrivateNetworkGatewaysResponse {
  /** An opaque token for the next page, or empty when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** */
  @JsonProperty("private_network_gateways")
  private Collection<PrivateNetworkGateway> privateNetworkGateways;

  public ListPrivateNetworkGatewaysResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public ListPrivateNetworkGatewaysResponse setPrivateNetworkGateways(
      Collection<PrivateNetworkGateway> privateNetworkGateways) {
    this.privateNetworkGateways = privateNetworkGateways;
    return this;
  }

  public Collection<PrivateNetworkGateway> getPrivateNetworkGateways() {
    return privateNetworkGateways;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListPrivateNetworkGatewaysResponse that = (ListPrivateNetworkGatewaysResponse) o;
    return Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(privateNetworkGateways, that.privateNetworkGateways);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, privateNetworkGateways);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPrivateNetworkGatewaysResponse.class)
        .add("nextPageToken", nextPageToken)
        .add("privateNetworkGateways", privateNetworkGateways)
        .toString();
  }
}

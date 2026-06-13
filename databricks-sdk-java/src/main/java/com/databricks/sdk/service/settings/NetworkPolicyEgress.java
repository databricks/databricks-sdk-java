// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The network policies applying for egress traffic. */
@Generated
public class NetworkPolicyEgress {
  /** The access policy enforced for egress traffic to the internet. */
  @JsonProperty("network_access")
  private EgressNetworkPolicyNetworkAccessPolicy networkAccess;

  public NetworkPolicyEgress setNetworkAccess(
      EgressNetworkPolicyNetworkAccessPolicy networkAccess) {
    this.networkAccess = networkAccess;
    return this;
  }

  public EgressNetworkPolicyNetworkAccessPolicy getNetworkAccess() {
    return networkAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkPolicyEgress that = (NetworkPolicyEgress) o;
    return Objects.equals(networkAccess, that.networkAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(NetworkPolicyEgress.class).add("networkAccess", networkAccess).toString();
  }
}

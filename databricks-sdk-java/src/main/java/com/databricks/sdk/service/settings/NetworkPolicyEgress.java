// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The network policies applying for egress traffic. This message is used by the UI/REST API. We
 * translate this message to the format expected by the dataplane in Lakehouse Network Manager (for
 * the format expected by the dataplane, see networkconfig.textproto). This policy should be
 * consistent with [[com.databricks.api.proto.settingspolicy.EgressNetworkPolicy]]. Details see
 * API-design: https://docs.google.com/document/d/1DKWO_FpZMCY4cF2O62LpwII1lx8gsnDGG-qgE3t3TOA/
 */
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

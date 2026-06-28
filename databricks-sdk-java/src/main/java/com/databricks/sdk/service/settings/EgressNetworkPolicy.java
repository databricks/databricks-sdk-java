// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * The network policies applying for egress traffic. This message is used by the UI/REST API. We
 * translate this message to the format expected by the dataplane in Lakehouse Network Manager (for
 * the format expected by the dataplane, see networkconfig.textproto).
 */
@Generated
public class EgressNetworkPolicy {
  /** The access policy enforced for egress traffic to the internet. */
  @JsonProperty("internet_access")
  private EgressNetworkPolicyInternetAccessPolicy internetAccess;

  public EgressNetworkPolicy setInternetAccess(
      EgressNetworkPolicyInternetAccessPolicy internetAccess) {
    this.internetAccess = internetAccess;
    return this;
  }

  public EgressNetworkPolicyInternetAccessPolicy getInternetAccess() {
    return internetAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EgressNetworkPolicy that = (EgressNetworkPolicy) o;
    return Objects.equals(internetAccess, that.internetAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internetAccess);
  }

  @Override
  public String toString() {
    return new ToStringer(EgressNetworkPolicy.class)
        .add("internetAccess", internetAccess)
        .toString();
  }
}

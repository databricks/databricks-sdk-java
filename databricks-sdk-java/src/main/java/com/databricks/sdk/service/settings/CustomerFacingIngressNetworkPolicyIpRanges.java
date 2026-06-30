// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyIpRanges {
  /** We only support IPv4 and IPv4 CIDR notation for now. */
  @JsonProperty("ip_ranges")
  private Collection<String> ipRanges;

  public CustomerFacingIngressNetworkPolicyIpRanges setIpRanges(Collection<String> ipRanges) {
    this.ipRanges = ipRanges;
    return this;
  }

  public Collection<String> getIpRanges() {
    return ipRanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyIpRanges that =
        (CustomerFacingIngressNetworkPolicyIpRanges) o;
    return Objects.equals(ipRanges, that.ipRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipRanges);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyIpRanges.class)
        .add("ipRanges", ipRanges)
        .toString();
  }
}

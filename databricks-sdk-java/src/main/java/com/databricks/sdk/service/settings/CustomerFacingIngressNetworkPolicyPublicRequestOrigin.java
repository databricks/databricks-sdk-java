// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CustomerFacingIngressNetworkPolicyPublicRequestOrigin {
  /** Matches all IPv4 and IPv6 ranges (both public and private). */
  @JsonProperty("all_ip_ranges")
  private Boolean allIpRanges;

  /** Excluded means: all public IP ranges except this one. */
  @JsonProperty("excluded_ip_ranges")
  private CustomerFacingIngressNetworkPolicyIpRanges excludedIpRanges;

  /** Will not allow IP ranges with private IPs. */
  @JsonProperty("included_ip_ranges")
  private CustomerFacingIngressNetworkPolicyIpRanges includedIpRanges;

  public CustomerFacingIngressNetworkPolicyPublicRequestOrigin setAllIpRanges(Boolean allIpRanges) {
    this.allIpRanges = allIpRanges;
    return this;
  }

  public Boolean getAllIpRanges() {
    return allIpRanges;
  }

  public CustomerFacingIngressNetworkPolicyPublicRequestOrigin setExcludedIpRanges(
      CustomerFacingIngressNetworkPolicyIpRanges excludedIpRanges) {
    this.excludedIpRanges = excludedIpRanges;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyIpRanges getExcludedIpRanges() {
    return excludedIpRanges;
  }

  public CustomerFacingIngressNetworkPolicyPublicRequestOrigin setIncludedIpRanges(
      CustomerFacingIngressNetworkPolicyIpRanges includedIpRanges) {
    this.includedIpRanges = includedIpRanges;
    return this;
  }

  public CustomerFacingIngressNetworkPolicyIpRanges getIncludedIpRanges() {
    return includedIpRanges;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CustomerFacingIngressNetworkPolicyPublicRequestOrigin that =
        (CustomerFacingIngressNetworkPolicyPublicRequestOrigin) o;
    return Objects.equals(allIpRanges, that.allIpRanges)
        && Objects.equals(excludedIpRanges, that.excludedIpRanges)
        && Objects.equals(includedIpRanges, that.includedIpRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allIpRanges, excludedIpRanges, includedIpRanges);
  }

  @Override
  public String toString() {
    return new ToStringer(CustomerFacingIngressNetworkPolicyPublicRequestOrigin.class)
        .add("allIpRanges", allIpRanges)
        .add("excludedIpRanges", excludedIpRanges)
        .add("includedIpRanges", includedIpRanges)
        .toString();
  }
}

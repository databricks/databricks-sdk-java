// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class IpAccessList {
  /** Allowed IP Addresses in CIDR notation. Limit of 100. */
  @JsonProperty("allowed_ip_addresses")
  private Collection<String> allowedIpAddresses;

  public IpAccessList setAllowedIpAddresses(Collection<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  public Collection<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessList that = (IpAccessList) o;
    return Objects.equals(allowedIpAddresses, that.allowedIpAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIpAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(IpAccessList.class)
        .add("allowedIpAddresses", allowedIpAddresses)
        .toString();
  }
}

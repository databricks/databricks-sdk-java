// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class IpAccessListPb {
  @JsonProperty("allowed_ip_addresses")
  private Collection<String> allowedIpAddresses;

  public IpAccessListPb setAllowedIpAddresses(Collection<String> allowedIpAddresses) {
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
    IpAccessListPb that = (IpAccessListPb) o;
    return Objects.equals(allowedIpAddresses, that.allowedIpAddresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedIpAddresses);
  }

  @Override
  public String toString() {
    return new ToStringer(IpAccessListPb.class)
        .add("allowedIpAddresses", allowedIpAddresses)
        .toString();
  }
}

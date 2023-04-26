// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>IpAccessList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class IpAccessList {
  /** Allowed IP Addresses in CIDR notation. Limit of 100. */
  @JsonProperty("allowed_ip_addresses")
  private Collection<String> allowedIpAddresses;

  /**
   * <p>Setter for the field <code>allowedIpAddresses</code>.</p>
   *
   * @param allowedIpAddresses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   */
  public IpAccessList setAllowedIpAddresses(Collection<String> allowedIpAddresses) {
    this.allowedIpAddresses = allowedIpAddresses;
    return this;
  }

  /**
   * <p>Getter for the field <code>allowedIpAddresses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getAllowedIpAddresses() {
    return allowedIpAddresses;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessList that = (IpAccessList) o;
    return Objects.equals(allowedIpAddresses, that.allowedIpAddresses);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(allowedIpAddresses);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(IpAccessList.class)
        .add("allowedIpAddresses", allowedIpAddresses)
        .toString();
  }
}

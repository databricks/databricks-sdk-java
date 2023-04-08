// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class CreateIpAccessList {
  /** Array of IP addresses or CIDR values to be added to the IP access list. */
  @JsonProperty("ip_addresses")
  private Collection<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  @JsonProperty("label")
  private String label;

  /** This describes an enum */
  @JsonProperty("list_type")
  private ListType listType;

  public CreateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public CreateIpAccessList setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public CreateIpAccessList setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  public ListType getListType() {
    return listType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateIpAccessList that = (CreateIpAccessList) o;
    return Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listType, that.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, label, listType);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateIpAccessList.class)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listType", listType)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateIpAccessList {
  /** Array of IP addresses or CIDR values to be added to the IP access list. */
  @JsonProperty("ip_addresses")
  private java.util.List<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  @JsonProperty("label")
  private String label;

  /** This describes an enum */
  @JsonProperty("list_type")
  private ListType listType;

  public CreateIpAccessList setIpAddresses(java.util.List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public java.util.List<String> getIpAddresses() {
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
}

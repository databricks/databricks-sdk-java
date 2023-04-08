// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ipaccesslists;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReplaceIpAccessList {
  /** Specifies whether this IP access list is enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  /** Array of IP addresses or CIDR values to be added to the IP access list. */
  @JsonProperty("ip_addresses")
  private java.util.List<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  @JsonProperty("label")
  private String label;

  /** Universally unique identifier(UUID) of the IP access list. */
  @JsonProperty("list_id")
  private String listId;

  /** This describes an enum */
  @JsonProperty("list_type")
  private ListType listType;

  public ReplaceIpAccessList setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public ReplaceIpAccessList setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  public ReplaceIpAccessList setIpAddresses(java.util.List<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public java.util.List<String> getIpAddresses() {
    return ipAddresses;
  }

  public ReplaceIpAccessList setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public ReplaceIpAccessList setListId(String listId) {
    this.listId = listId;
    return this;
  }

  public String getListId() {
    return listId;
  }

  public ReplaceIpAccessList setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  public ListType getListType() {
    return listType;
  }
}

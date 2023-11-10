// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class UpdateIpAccessList {
  /** Specifies whether this IP access list is enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The ID for the corresponding IP access list to modify. */
  private String ipAccessListId;

  /** Array of IP addresses or CIDR values to be added to the IP access list. */
  @JsonProperty("ip_addresses")
  private Collection<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  @JsonProperty("label")
  private String label;

  /** Universally unique identifier (UUID) of the IP access list. */
  @JsonProperty("list_id")
  private String listId;

  /**
   * Type of IP access list. Valid values are as follows and are case-sensitive:
   *
   * <p>* `ALLOW`: An allow list. Include this IP or range. * `BLOCK`: A block list. Exclude this IP
   * or range. IP addresses in the block list are excluded even if they are included in an allow
   * list.
   */
  @JsonProperty("list_type")
  private ListType listType;

  public UpdateIpAccessList setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public UpdateIpAccessList setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  public String getIpAccessListId() {
    return ipAccessListId;
  }

  public UpdateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public UpdateIpAccessList setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public UpdateIpAccessList setListId(String listId) {
    this.listId = listId;
    return this;
  }

  public String getListId() {
    return listId;
  }

  public UpdateIpAccessList setListType(ListType listType) {
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
    UpdateIpAccessList that = (UpdateIpAccessList) o;
    return Objects.equals(enabled, that.enabled)
        && Objects.equals(ipAccessListId, that.ipAccessListId)
        && Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listId, that.listId)
        && Objects.equals(listType, that.listType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, ipAccessListId, ipAddresses, label, listId, listType);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateIpAccessList.class)
        .add("enabled", enabled)
        .add("ipAccessListId", ipAccessListId)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listId", listId)
        .add("listType", listType)
        .toString();
  }
}

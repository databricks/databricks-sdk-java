// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Definition of an IP Access list */
@Generated
class IpAccessListInfoPb {
  @JsonProperty("address_count")
  private Long addressCount;

  @JsonProperty("created_at")
  private Long createdAt;

  @JsonProperty("created_by")
  private Long createdBy;

  @JsonProperty("enabled")
  private Boolean enabled;

  @JsonProperty("ip_addresses")
  private Collection<String> ipAddresses;

  @JsonProperty("label")
  private String label;

  @JsonProperty("list_id")
  private String listId;

  @JsonProperty("list_type")
  private ListType listType;

  @JsonProperty("updated_at")
  private Long updatedAt;

  @JsonProperty("updated_by")
  private Long updatedBy;

  public IpAccessListInfoPb setAddressCount(Long addressCount) {
    this.addressCount = addressCount;
    return this;
  }

  public Long getAddressCount() {
    return addressCount;
  }

  public IpAccessListInfoPb setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public Long getCreatedAt() {
    return createdAt;
  }

  public IpAccessListInfoPb setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  public Long getCreatedBy() {
    return createdBy;
  }

  public IpAccessListInfoPb setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  public IpAccessListInfoPb setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  public IpAccessListInfoPb setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public IpAccessListInfoPb setListId(String listId) {
    this.listId = listId;
    return this;
  }

  public String getListId() {
    return listId;
  }

  public IpAccessListInfoPb setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  public ListType getListType() {
    return listType;
  }

  public IpAccessListInfoPb setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public Long getUpdatedAt() {
    return updatedAt;
  }

  public IpAccessListInfoPb setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  public Long getUpdatedBy() {
    return updatedBy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessListInfoPb that = (IpAccessListInfoPb) o;
    return Objects.equals(addressCount, that.addressCount)
        && Objects.equals(createdAt, that.createdAt)
        && Objects.equals(createdBy, that.createdBy)
        && Objects.equals(enabled, that.enabled)
        && Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listId, that.listId)
        && Objects.equals(listType, that.listType)
        && Objects.equals(updatedAt, that.updatedAt)
        && Objects.equals(updatedBy, that.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        addressCount,
        createdAt,
        createdBy,
        enabled,
        ipAddresses,
        label,
        listId,
        listType,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    return new ToStringer(IpAccessListInfoPb.class)
        .add("addressCount", addressCount)
        .add("createdAt", createdAt)
        .add("createdBy", createdBy)
        .add("enabled", enabled)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listId", listId)
        .add("listType", listType)
        .add("updatedAt", updatedAt)
        .add("updatedBy", updatedBy)
        .toString();
  }
}

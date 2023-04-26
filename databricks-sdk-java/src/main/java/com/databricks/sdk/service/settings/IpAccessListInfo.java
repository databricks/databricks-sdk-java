// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>IpAccessListInfo class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class IpAccessListInfo {
  /** Total number of IP or CIDR values. */
  @JsonProperty("address_count")
  private Long addressCount;

  /** Creation timestamp in milliseconds. */
  @JsonProperty("created_at")
  private Long createdAt;

  /** User ID of the user who created this list. */
  @JsonProperty("created_by")
  private Long createdBy;

  /** Specifies whether this IP access list is enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** Array of IP addresses or CIDR values to be added to the IP access list. */
  @JsonProperty("ip_addresses")
  private Collection<String> ipAddresses;

  /** Label for the IP access list. This **cannot** be empty. */
  @JsonProperty("label")
  private String label;

  /** Universally unique identifier (UUID) of the IP access list. */
  @JsonProperty("list_id")
  private String listId;

  /** This describes an enum */
  @JsonProperty("list_type")
  private ListType listType;

  /** Update timestamp in milliseconds. */
  @JsonProperty("updated_at")
  private Long updatedAt;

  /** User ID of the user who updated this list. */
  @JsonProperty("updated_by")
  private Long updatedBy;

  /**
   * <p>Setter for the field <code>addressCount</code>.</p>
   *
   * @param addressCount a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setAddressCount(Long addressCount) {
    this.addressCount = addressCount;
    return this;
  }

  /**
   * <p>Getter for the field <code>addressCount</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getAddressCount() {
    return addressCount;
  }

  /**
   * <p>Setter for the field <code>createdAt</code>.</p>
   *
   * @param createdAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedAt() {
    return createdAt;
  }

  /**
   * <p>Setter for the field <code>createdBy</code>.</p>
   *
   * @param createdBy a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>createdBy</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getCreatedBy() {
    return createdBy;
  }

  /**
   * <p>Setter for the field <code>enabled</code>.</p>
   *
   * @param enabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Getter for the field <code>enabled</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getEnabled() {
    return enabled;
  }

  /**
   * <p>Setter for the field <code>ipAddresses</code>.</p>
   *
   * @param ipAddresses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setIpAddresses(Collection<String> ipAddresses) {
    this.ipAddresses = ipAddresses;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAddresses</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getIpAddresses() {
    return ipAddresses;
  }

  /**
   * <p>Setter for the field <code>label</code>.</p>
   *
   * @param label a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setLabel(String label) {
    this.label = label;
    return this;
  }

  /**
   * <p>Getter for the field <code>label</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLabel() {
    return label;
  }

  /**
   * <p>Setter for the field <code>listId</code>.</p>
   *
   * @param listId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setListId(String listId) {
    this.listId = listId;
    return this;
  }

  /**
   * <p>Getter for the field <code>listId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getListId() {
    return listId;
  }

  /**
   * <p>Setter for the field <code>listType</code>.</p>
   *
   * @param listType a {@link com.databricks.sdk.service.settings.ListType} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setListType(ListType listType) {
    this.listType = listType;
    return this;
  }

  /**
   * <p>Getter for the field <code>listType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.settings.ListType} object
   */
  public ListType getListType() {
    return listType;
  }

  /**
   * <p>Setter for the field <code>updatedAt</code>.</p>
   *
   * @param updatedAt a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedAt</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedAt() {
    return updatedAt;
  }

  /**
   * <p>Setter for the field <code>updatedBy</code>.</p>
   *
   * @param updatedBy a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.settings.IpAccessListInfo} object
   */
  public IpAccessListInfo setUpdatedBy(Long updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * <p>Getter for the field <code>updatedBy</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getUpdatedBy() {
    return updatedBy;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    IpAccessListInfo that = (IpAccessListInfo) o;
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(IpAccessListInfo.class)
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

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateIpAccessList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateIpAccessList {
  /** Specifies whether this IP access list is enabled. */
  @JsonProperty("enabled")
  private Boolean enabled;

  /** The ID for the corresponding IP access list. */
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

  /** This describes an enum */
  @JsonProperty("list_type")
  private ListType listType;

  /**
   * <p>Setter for the field <code>enabled</code>.</p>
   *
   * @param enabled a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setEnabled(Boolean enabled) {
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
   * <p>Setter for the field <code>ipAccessListId</code>.</p>
   *
   * @param ipAccessListId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setIpAccessListId(String ipAccessListId) {
    this.ipAccessListId = ipAccessListId;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessListId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getIpAccessListId() {
    return ipAccessListId;
  }

  /**
   * <p>Setter for the field <code>ipAddresses</code>.</p>
   *
   * @param ipAddresses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
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
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setLabel(String label) {
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
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setListId(String listId) {
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
   * @return a {@link com.databricks.sdk.service.settings.UpdateIpAccessList} object
   */
  public UpdateIpAccessList setListType(ListType listType) {
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

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(enabled, ipAccessListId, ipAddresses, label, listId, listType);
  }

  /** {@inheritDoc} */
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

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>CreateIpAccessList class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>ipAddresses</code>.</p>
   *
   * @param ipAddresses a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessList} object
   */
  public CreateIpAccessList setIpAddresses(Collection<String> ipAddresses) {
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
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessList} object
   */
  public CreateIpAccessList setLabel(String label) {
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
   * <p>Setter for the field <code>listType</code>.</p>
   *
   * @param listType a {@link com.databricks.sdk.service.settings.ListType} object
   * @return a {@link com.databricks.sdk.service.settings.CreateIpAccessList} object
   */
  public CreateIpAccessList setListType(ListType listType) {
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
    CreateIpAccessList that = (CreateIpAccessList) o;
    return Objects.equals(ipAddresses, that.ipAddresses)
        && Objects.equals(label, that.label)
        && Objects.equals(listType, that.listType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(ipAddresses, label, listType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateIpAccessList.class)
        .add("ipAddresses", ipAddresses)
        .add("label", label)
        .add("listType", listType)
        .toString();
  }
}

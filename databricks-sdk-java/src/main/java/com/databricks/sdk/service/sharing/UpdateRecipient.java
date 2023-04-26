// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>UpdateRecipient class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateRecipient {
  /** Description about the recipient. */
  @JsonProperty("comment")
  private String comment;

  /** IP Access List */
  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  /** Name of Recipient. */
  @JsonProperty("name")
  private String name;

  /** Username of the recipient owner. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Recipient properties as map of string key-value pairs.
   *
   * <p>When provided in update request, the specified properties will override the existing
   * properties. To add and remove properties, one would need to perform a read-modify-write.
   */
  @JsonProperty("properties_kvpairs")
  private Object /* MISSING TYPE */ propertiesKvpairs;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public UpdateRecipient setComment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getComment() {
    return comment;
  }

  /**
   * <p>Setter for the field <code>ipAccessList</code>.</p>
   *
   * @param ipAccessList a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public UpdateRecipient setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  /**
   * <p>Getter for the field <code>ipAccessList</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   */
  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public UpdateRecipient setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /**
   * <p>Setter for the field <code>owner</code>.</p>
   *
   * @param owner a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public UpdateRecipient setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * <p>Getter for the field <code>owner</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getOwner() {
    return owner;
  }

  /**
   * <p>Setter for the field <code>propertiesKvpairs</code>.</p>
   *
   * @param propertiesKvpairs a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateRecipient} object
   */
  public UpdateRecipient setPropertiesKvpairs(Object /* MISSING TYPE */ propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  /**
   * <p>Getter for the field <code>propertiesKvpairs</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRecipient that = (UpdateRecipient) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(ipAccessList, that.ipAccessList)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment, ipAccessList, name, owner, propertiesKvpairs);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateRecipient.class)
        .add("comment", comment)
        .add("ipAccessList", ipAccessList)
        .add("name", name)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .toString();
  }
}

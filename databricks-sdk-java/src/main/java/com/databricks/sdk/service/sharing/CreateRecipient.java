// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateRecipient class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateRecipient {
  /** The delta sharing authentication type. */
  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  /** Description about the recipient. */
  @JsonProperty("comment")
  private String comment;

  /**
   * The global Unity Catalog metastore id provided by the data recipient.
   *
   * <p>This field is required when the __authentication_type__ is **DATABRICKS**.
   *
   * <p>The identifier is of format __cloud__:__region__:__metastore-uuid__.
   */
  @JsonProperty("data_recipient_global_metastore_id")
  private Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId;

  /** IP Access List */
  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  /** Name of Recipient. */
  @JsonProperty("name")
  private String name;

  /** Username of the recipient owner. */
  @JsonProperty("owner")
  private String owner;

  /** Recipient properties as map of string key-value pairs. */
  @JsonProperty("properties_kvpairs")
  private Object /* MISSING TYPE */ propertiesKvpairs;

  /**
   * The one-time sharing code provided by the data recipient. This field is required when the
   * __authentication_type__ is **DATABRICKS**.
   */
  @JsonProperty("sharing_code")
  private String sharingCode;

  /**
   * <p>Setter for the field <code>authenticationType</code>.</p>
   *
   * @param authenticationType a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  /**
   * <p>Getter for the field <code>authenticationType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sharing.AuthenticationType} object
   */
  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setComment(String comment) {
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
   * <p>Setter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @param dataRecipientGlobalMetastoreId a {@link java.lang.Object} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setDataRecipientGlobalMetastoreId(
      Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  /**
   * <p>Getter for the field <code>dataRecipientGlobalMetastoreId</code>.</p>
   *
   * @return a {@link java.lang.Object} object
   */
  public Object /* MISSING TYPE */ getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  /**
   * <p>Setter for the field <code>ipAccessList</code>.</p>
   *
   * @param ipAccessList a {@link com.databricks.sdk.service.sharing.IpAccessList} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setIpAccessList(IpAccessList ipAccessList) {
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
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setName(String name) {
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
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setOwner(String owner) {
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
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setPropertiesKvpairs(Object /* MISSING TYPE */ propertiesKvpairs) {
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

  /**
   * <p>Setter for the field <code>sharingCode</code>.</p>
   *
   * @param sharingCode a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.CreateRecipient} object
   */
  public CreateRecipient setSharingCode(String sharingCode) {
    this.sharingCode = sharingCode;
    return this;
  }

  /**
   * <p>Getter for the field <code>sharingCode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSharingCode() {
    return sharingCode;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateRecipient that = (CreateRecipient) o;
    return Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(ipAccessList, that.ipAccessList)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs)
        && Objects.equals(sharingCode, that.sharingCode);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(
        authenticationType,
        comment,
        dataRecipientGlobalMetastoreId,
        ipAccessList,
        name,
        owner,
        propertiesKvpairs,
        sharingCode);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateRecipient.class)
        .add("authenticationType", authenticationType)
        .add("comment", comment)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("ipAccessList", ipAccessList)
        .add("name", name)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .add("sharingCode", sharingCode)
        .toString();
  }
}

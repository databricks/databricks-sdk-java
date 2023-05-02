// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  public CreateRecipient setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public CreateRecipient setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateRecipient setDataRecipientGlobalMetastoreId(
      Object /* MISSING TYPE */ dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public Object /* MISSING TYPE */ getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public CreateRecipient setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public CreateRecipient setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateRecipient setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CreateRecipient setPropertiesKvpairs(Object /* MISSING TYPE */ propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public Object /* MISSING TYPE */ getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  public CreateRecipient setSharingCode(String sharingCode) {
    this.sharingCode = sharingCode;
    return this;
  }

  public String getSharingCode() {
    return sharingCode;
  }

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

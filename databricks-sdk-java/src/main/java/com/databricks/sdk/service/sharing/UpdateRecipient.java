// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateRecipient {
  /** Description about the recipient. */
  @JsonProperty("comment")
  private String comment;

  /** Expiration timestamp of the token, in epoch milliseconds. */
  @JsonProperty("expiration_time")
  private Long expirationTime;

  /** IP Access List */
  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  /** Name of the recipient. */
  @JsonIgnore private String name;

  /** New name for the recipient. */
  @JsonProperty("new_name")
  private String newName;

  /** Username of the recipient owner. */
  @JsonProperty("owner")
  private String owner;

  /**
   * Recipient properties as map of string key-value pairs. When provided in update request, the
   * specified properties will override the existing properties. To add and remove properties, one
   * would need to perform a read-modify-write.
   */
  @JsonProperty("properties_kvpairs")
  private SecurablePropertiesKvPairs propertiesKvpairs;

  public UpdateRecipient setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateRecipient setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public UpdateRecipient setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public UpdateRecipient setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRecipient setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateRecipient setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateRecipient setPropertiesKvpairs(SecurablePropertiesKvPairs propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public SecurablePropertiesKvPairs getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRecipient that = (UpdateRecipient) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(expirationTime, that.expirationTime)
        && Objects.equals(ipAccessList, that.ipAccessList)
        && Objects.equals(name, that.name)
        && Objects.equals(newName, that.newName)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, expirationTime, ipAccessList, name, newName, owner, propertiesKvpairs);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRecipient.class)
        .add("comment", comment)
        .add("expirationTime", expirationTime)
        .add("ipAccessList", ipAccessList)
        .add("name", name)
        .add("newName", newName)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .toString();
  }
}

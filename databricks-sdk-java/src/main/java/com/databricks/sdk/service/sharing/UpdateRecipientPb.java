// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRecipientPb {
  @JsonProperty("comment")
  private String comment;

  @JsonProperty("expiration_time")
  private Long expirationTime;

  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  @JsonIgnore private String name;

  @JsonProperty("new_name")
  private String newName;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("properties_kvpairs")
  private SecurablePropertiesKvPairs propertiesKvpairs;

  public UpdateRecipientPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateRecipientPb setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public UpdateRecipientPb setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public UpdateRecipientPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateRecipientPb setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  public UpdateRecipientPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public UpdateRecipientPb setPropertiesKvpairs(SecurablePropertiesKvPairs propertiesKvpairs) {
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
    UpdateRecipientPb that = (UpdateRecipientPb) o;
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
    return new ToStringer(UpdateRecipientPb.class)
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

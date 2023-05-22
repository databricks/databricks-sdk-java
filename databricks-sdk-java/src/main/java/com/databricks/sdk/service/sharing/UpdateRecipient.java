// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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
  private SecurablePropertiesKvPairs propertiesKvpairs;

  public UpdateRecipient setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
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
        && Objects.equals(ipAccessList, that.ipAccessList)
        && Objects.equals(name, that.name)
        && Objects.equals(owner, that.owner)
        && Objects.equals(propertiesKvpairs, that.propertiesKvpairs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, ipAccessList, name, owner, propertiesKvpairs);
  }

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

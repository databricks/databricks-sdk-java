// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class CreateRecipientPb {
  @JsonProperty("authentication_type")
  private AuthenticationType authenticationType;

  @JsonProperty("comment")
  private String comment;

  @JsonProperty("data_recipient_global_metastore_id")
  private String dataRecipientGlobalMetastoreId;

  @JsonProperty("expiration_time")
  private Long expirationTime;

  @JsonProperty("ip_access_list")
  private IpAccessList ipAccessList;

  @JsonProperty("name")
  private String name;

  @JsonProperty("owner")
  private String owner;

  @JsonProperty("properties_kvpairs")
  private SecurablePropertiesKvPairs propertiesKvpairs;

  @JsonProperty("sharing_code")
  private String sharingCode;

  public CreateRecipientPb setAuthenticationType(AuthenticationType authenticationType) {
    this.authenticationType = authenticationType;
    return this;
  }

  public AuthenticationType getAuthenticationType() {
    return authenticationType;
  }

  public CreateRecipientPb setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateRecipientPb setDataRecipientGlobalMetastoreId(
      String dataRecipientGlobalMetastoreId) {
    this.dataRecipientGlobalMetastoreId = dataRecipientGlobalMetastoreId;
    return this;
  }

  public String getDataRecipientGlobalMetastoreId() {
    return dataRecipientGlobalMetastoreId;
  }

  public CreateRecipientPb setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  public Long getExpirationTime() {
    return expirationTime;
  }

  public CreateRecipientPb setIpAccessList(IpAccessList ipAccessList) {
    this.ipAccessList = ipAccessList;
    return this;
  }

  public IpAccessList getIpAccessList() {
    return ipAccessList;
  }

  public CreateRecipientPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateRecipientPb setOwner(String owner) {
    this.owner = owner;
    return this;
  }

  public String getOwner() {
    return owner;
  }

  public CreateRecipientPb setPropertiesKvpairs(SecurablePropertiesKvPairs propertiesKvpairs) {
    this.propertiesKvpairs = propertiesKvpairs;
    return this;
  }

  public SecurablePropertiesKvPairs getPropertiesKvpairs() {
    return propertiesKvpairs;
  }

  public CreateRecipientPb setSharingCode(String sharingCode) {
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
    CreateRecipientPb that = (CreateRecipientPb) o;
    return Objects.equals(authenticationType, that.authenticationType)
        && Objects.equals(comment, that.comment)
        && Objects.equals(dataRecipientGlobalMetastoreId, that.dataRecipientGlobalMetastoreId)
        && Objects.equals(expirationTime, that.expirationTime)
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
        expirationTime,
        ipAccessList,
        name,
        owner,
        propertiesKvpairs,
        sharingCode);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRecipientPb.class)
        .add("authenticationType", authenticationType)
        .add("comment", comment)
        .add("dataRecipientGlobalMetastoreId", dataRecipientGlobalMetastoreId)
        .add("expirationTime", expirationTime)
        .add("ipAccessList", ipAccessList)
        .add("name", name)
        .add("owner", owner)
        .add("propertiesKvpairs", propertiesKvpairs)
        .add("sharingCode", sharingCode)
        .toString();
  }
}

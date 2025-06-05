// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountsUpdateStorageCredentialPb {
  @JsonProperty("credential_info")
  private UpdateStorageCredential credentialInfo;

  @JsonIgnore private String metastoreId;

  @JsonIgnore private String storageCredentialName;

  public AccountsUpdateStorageCredentialPb setCredentialInfo(
      UpdateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public UpdateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsUpdateStorageCredentialPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateStorageCredentialPb setStorageCredentialName(String storageCredentialName) {
    this.storageCredentialName = storageCredentialName;
    return this;
  }

  public String getStorageCredentialName() {
    return storageCredentialName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateStorageCredentialPb that = (AccountsUpdateStorageCredentialPb) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateStorageCredentialPb.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

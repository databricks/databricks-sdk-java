// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountsUpdateStorageCredential {
  /** */
  @JsonProperty("credential_info")
  private UpdateStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String storageCredentialName;

  public AccountsUpdateStorageCredential setCredentialInfo(UpdateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public UpdateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsUpdateStorageCredential setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateStorageCredential setStorageCredentialName(String storageCredentialName) {
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
    AccountsUpdateStorageCredential that = (AccountsUpdateStorageCredential) o;
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
    return new ToStringer(AccountsUpdateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The storage credential to update. */
@Generated
public class AccountsUpdateStorageCredential {
  /** */
  @JsonProperty("credential_info")
  private UpdateAccountsStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  /**
   * Optional. Supplying true to this argument skips validation of the updated set of credentials.
   */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  /** Name of the storage credential. */
  @JsonIgnore private String storageCredentialName;

  public AccountsUpdateStorageCredential setCredentialInfo(
      UpdateAccountsStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public UpdateAccountsStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsUpdateStorageCredential setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsUpdateStorageCredential setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
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
        && Objects.equals(skipValidation, that.skipValidation)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId, skipValidation, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .add("skipValidation", skipValidation)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

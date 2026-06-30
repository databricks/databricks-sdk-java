// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountsCreateStorageCredential {
  /** */
  @JsonProperty("credential_info")
  private CreateAccountsStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  /**
   * Optional, default false. Supplying true to this argument skips validation of the created set of
   * credentials.
   */
  @JsonProperty("skip_validation")
  private Boolean skipValidation;

  public AccountsCreateStorageCredential setCredentialInfo(
      CreateAccountsStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public CreateAccountsStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsCreateStorageCredential setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public AccountsCreateStorageCredential setSkipValidation(Boolean skipValidation) {
    this.skipValidation = skipValidation;
    return this;
  }

  public Boolean getSkipValidation() {
    return skipValidation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateStorageCredential that = (AccountsCreateStorageCredential) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(skipValidation, that.skipValidation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId, skipValidation);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .add("skipValidation", skipValidation)
        .toString();
  }
}

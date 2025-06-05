// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AccountsCreateStorageCredentialPb {
  @JsonProperty("credential_info")
  private CreateStorageCredential credentialInfo;

  @JsonIgnore private String metastoreId;

  public AccountsCreateStorageCredentialPb setCredentialInfo(
      CreateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public CreateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsCreateStorageCredentialPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsCreateStorageCredentialPb that = (AccountsCreateStorageCredentialPb) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateStorageCredentialPb.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .toString();
  }
}

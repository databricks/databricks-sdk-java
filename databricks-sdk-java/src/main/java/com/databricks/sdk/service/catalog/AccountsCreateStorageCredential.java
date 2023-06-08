// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccountsCreateStorageCredential {
  /** */
  @JsonProperty("credential_info")
  private CreateStorageCredential credentialInfo;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  public AccountsCreateStorageCredential setCredentialInfo(CreateStorageCredential credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public CreateStorageCredential getCredentialInfo() {
    return credentialInfo;
  }

  public AccountsCreateStorageCredential setMetastoreId(String metastoreId) {
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
    AccountsCreateStorageCredential that = (AccountsCreateStorageCredential) o;
    return Objects.equals(credentialInfo, that.credentialInfo)
        && Objects.equals(metastoreId, that.metastoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo, metastoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsCreateStorageCredential.class)
        .add("credentialInfo", credentialInfo)
        .add("metastoreId", metastoreId)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The storage credential was successfully updated. */
@Generated
public class AccountsUpdateStorageCredentialResponse {
  /** */
  @JsonProperty("credential_info")
  private StorageCredentialInfo credentialInfo;

  public AccountsUpdateStorageCredentialResponse setCredentialInfo(
      StorageCredentialInfo credentialInfo) {
    this.credentialInfo = credentialInfo;
    return this;
  }

  public StorageCredentialInfo getCredentialInfo() {
    return credentialInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccountsUpdateStorageCredentialResponse that = (AccountsUpdateStorageCredentialResponse) o;
    return Objects.equals(credentialInfo, that.credentialInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(AccountsUpdateStorageCredentialResponse.class)
        .add("credentialInfo", credentialInfo)
        .toString();
  }
}

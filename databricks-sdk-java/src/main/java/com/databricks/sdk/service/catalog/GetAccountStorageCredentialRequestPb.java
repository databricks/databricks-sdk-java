// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Gets the named storage credential */
@Generated
class GetAccountStorageCredentialRequestPb {
  @JsonIgnore private String metastoreId;

  @JsonIgnore private String storageCredentialName;

  public GetAccountStorageCredentialRequestPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public GetAccountStorageCredentialRequestPb setStorageCredentialName(
      String storageCredentialName) {
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
    GetAccountStorageCredentialRequestPb that = (GetAccountStorageCredentialRequestPb) o;
    return Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountStorageCredentialRequestPb.class)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

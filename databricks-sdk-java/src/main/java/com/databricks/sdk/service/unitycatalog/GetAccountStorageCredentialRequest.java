// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Gets the named storage credential */
public class GetAccountStorageCredentialRequest {
  /** Databricks Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String name;

  public GetAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public GetAccountStorageCredentialRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAccountStorageCredentialRequest that = (GetAccountStorageCredentialRequest) o;
    return Objects.equals(metastoreId, that.metastoreId) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metastoreId, name);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAccountStorageCredentialRequest.class)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .toString();
  }
}

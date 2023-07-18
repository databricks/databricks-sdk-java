// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete a storage credential */
@Generated
public class DeleteAccountStorageCredentialRequest {
  /** Force deletion even if the Storage Credential is not empty. Default is false. */
  @QueryParam("force")
  private Boolean force;

  /** Unity Catalog metastore ID */
  private String metastoreId;

  /** Name of the storage credential. */
  private String name;

  public DeleteAccountStorageCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteAccountStorageCredentialRequest setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DeleteAccountStorageCredentialRequest setName(String name) {
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
    DeleteAccountStorageCredentialRequest that = (DeleteAccountStorageCredentialRequest) o;
    return Objects.equals(force, that.force)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, metastoreId, name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountStorageCredentialRequest.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .add("name", name)
        .toString();
  }
}

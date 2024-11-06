// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a storage credential */
@Generated
public class DeleteAccountStorageCredentialRequest {
  /** Force deletion even if the Storage Credential is not empty. Default is false. */
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  /** Unity Catalog metastore ID */
  @JsonIgnore private String metastoreId;

  /** Name of the storage credential. */
  @JsonIgnore private String storageCredentialName;

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

  public DeleteAccountStorageCredentialRequest setStorageCredentialName(
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
    DeleteAccountStorageCredentialRequest that = (DeleteAccountStorageCredentialRequest) o;
    return Objects.equals(force, that.force)
        && Objects.equals(metastoreId, that.metastoreId)
        && Objects.equals(storageCredentialName, that.storageCredentialName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(force, metastoreId, storageCredentialName);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteAccountStorageCredentialRequest.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

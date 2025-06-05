// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Delete a storage credential */
@Generated
class DeleteAccountStorageCredentialRequestPb {
  @JsonIgnore
  @QueryParam("force")
  private Boolean force;

  @JsonIgnore private String metastoreId;

  @JsonIgnore private String storageCredentialName;

  public DeleteAccountStorageCredentialRequestPb setForce(Boolean force) {
    this.force = force;
    return this;
  }

  public Boolean getForce() {
    return force;
  }

  public DeleteAccountStorageCredentialRequestPb setMetastoreId(String metastoreId) {
    this.metastoreId = metastoreId;
    return this;
  }

  public String getMetastoreId() {
    return metastoreId;
  }

  public DeleteAccountStorageCredentialRequestPb setStorageCredentialName(
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
    DeleteAccountStorageCredentialRequestPb that = (DeleteAccountStorageCredentialRequestPb) o;
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
    return new ToStringer(DeleteAccountStorageCredentialRequestPb.class)
        .add("force", force)
        .add("metastoreId", metastoreId)
        .add("storageCredentialName", storageCredentialName)
        .toString();
  }
}

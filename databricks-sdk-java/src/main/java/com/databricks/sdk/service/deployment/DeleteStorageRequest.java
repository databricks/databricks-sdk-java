// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Delete storage configuration */
public class DeleteStorageRequest {
  /** Databricks Account API storage configuration ID. */
  private String storageConfigurationId;

  public DeleteStorageRequest setStorageConfigurationId(String storageConfigurationId) {
    this.storageConfigurationId = storageConfigurationId;
    return this;
  }

  public String getStorageConfigurationId() {
    return storageConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteStorageRequest that = (DeleteStorageRequest) o;
    return Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteStorageRequest.class)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}

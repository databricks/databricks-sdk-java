// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetStorageRequest {
  /** Databricks Account API storage configuration ID. */
  @JsonIgnore private String storageConfigurationId;

  public GetStorageRequest setStorageConfigurationId(String storageConfigurationId) {
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
    GetStorageRequest that = (GetStorageRequest) o;
    return Objects.equals(storageConfigurationId, that.storageConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetStorageRequest.class)
        .add("storageConfigurationId", storageConfigurationId)
        .toString();
  }
}

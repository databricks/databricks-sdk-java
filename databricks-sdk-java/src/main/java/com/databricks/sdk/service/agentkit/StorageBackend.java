// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Service-managed storage backing a managed memory store. */
@Generated
public class StorageBackend {
  /** Backend-specific identifier. For Lakebase, this is the project ID. */
  @JsonProperty("backend_id")
  private String backendId;

  /** Type of the storage backend. */
  @JsonProperty("backend_type")
  private StorageBackendType backendType;

  public StorageBackend setBackendId(String backendId) {
    this.backendId = backendId;
    return this;
  }

  public String getBackendId() {
    return backendId;
  }

  public StorageBackend setBackendType(StorageBackendType backendType) {
    this.backendType = backendType;
    return this;
  }

  public StorageBackendType getBackendType() {
    return backendType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StorageBackend that = (StorageBackend) o;
    return Objects.equals(backendId, that.backendId)
        && Objects.equals(backendType, that.backendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backendId, backendType);
  }

  @Override
  public String toString() {
    return new ToStringer(StorageBackend.class)
        .add("backendId", backendId)
        .add("backendType", backendType)
        .toString();
  }
}

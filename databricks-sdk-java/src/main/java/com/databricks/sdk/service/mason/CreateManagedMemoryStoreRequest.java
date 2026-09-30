// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateManagedMemoryStoreRequest {
  /** The managed memory store to create. */
  @JsonProperty("managed_memory_store")
  private ManagedMemoryStore managedMemoryStore;

  /**
   * Caller-provided, workspace-unique managed memory store ID. It must be 3-56 characters, begin
   * with a lowercase letter, contain only lowercase letters, digits, and hyphens, and end with a
   * letter or digit.
   */
  @JsonIgnore
  @QueryParam("managed_memory_store_id")
  private String managedMemoryStoreId;

  public CreateManagedMemoryStoreRequest setManagedMemoryStore(
      ManagedMemoryStore managedMemoryStore) {
    this.managedMemoryStore = managedMemoryStore;
    return this;
  }

  public ManagedMemoryStore getManagedMemoryStore() {
    return managedMemoryStore;
  }

  public CreateManagedMemoryStoreRequest setManagedMemoryStoreId(String managedMemoryStoreId) {
    this.managedMemoryStoreId = managedMemoryStoreId;
    return this;
  }

  public String getManagedMemoryStoreId() {
    return managedMemoryStoreId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateManagedMemoryStoreRequest that = (CreateManagedMemoryStoreRequest) o;
    return Objects.equals(managedMemoryStore, that.managedMemoryStore)
        && Objects.equals(managedMemoryStoreId, that.managedMemoryStoreId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryStore, managedMemoryStoreId);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateManagedMemoryStoreRequest.class)
        .add("managedMemoryStore", managedMemoryStore)
        .add("managedMemoryStoreId", managedMemoryStoreId)
        .toString();
  }
}

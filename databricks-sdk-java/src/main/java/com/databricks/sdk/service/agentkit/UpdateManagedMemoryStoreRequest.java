// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateManagedMemoryStoreRequest {
  /** The managed memory store to update. `name` is taken from the URL. */
  @JsonProperty("managed_memory_store")
  private ManagedMemoryStore managedMemoryStore;

  /** Resource name in the form `memory-stores/{managed_memory_store_id}`. */
  @JsonIgnore private String name;

  /** Only `description` may be updated. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateManagedMemoryStoreRequest setManagedMemoryStore(
      ManagedMemoryStore managedMemoryStore) {
    this.managedMemoryStore = managedMemoryStore;
    return this;
  }

  public ManagedMemoryStore getManagedMemoryStore() {
    return managedMemoryStore;
  }

  public UpdateManagedMemoryStoreRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateManagedMemoryStoreRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateManagedMemoryStoreRequest that = (UpdateManagedMemoryStoreRequest) o;
    return Objects.equals(managedMemoryStore, that.managedMemoryStore)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryStore, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateManagedMemoryStoreRequest.class)
        .add("managedMemoryStore", managedMemoryStore)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}

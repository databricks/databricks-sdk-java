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
public class UpdateManagedMemoryEntryRequest {
  /** The managed memory entry to update. */
  @JsonProperty("managed_memory_entry")
  private ManagedMemoryEntry managedMemoryEntry;

  /**
   * Resource name in the form
   * `memory-stores/{managed_memory_store_id}/entries/{managed_memory_entry_id}`.
   */
  @JsonIgnore private String name;

  /** Fields to update. Only `content` and `description` may be updated. */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateManagedMemoryEntryRequest setManagedMemoryEntry(
      ManagedMemoryEntry managedMemoryEntry) {
    this.managedMemoryEntry = managedMemoryEntry;
    return this;
  }

  public ManagedMemoryEntry getManagedMemoryEntry() {
    return managedMemoryEntry;
  }

  public UpdateManagedMemoryEntryRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateManagedMemoryEntryRequest setUpdateMask(FieldMask updateMask) {
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
    UpdateManagedMemoryEntryRequest that = (UpdateManagedMemoryEntryRequest) o;
    return Objects.equals(managedMemoryEntry, that.managedMemoryEntry)
        && Objects.equals(name, that.name)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryEntry, name, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateManagedMemoryEntryRequest.class)
        .add("managedMemoryEntry", managedMemoryEntry)
        .add("name", name)
        .add("updateMask", updateMask)
        .toString();
  }
}

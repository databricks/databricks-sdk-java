// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateManagedMemoryEntryRequest {
  /** The managed memory entry to create. */
  @JsonProperty("managed_memory_entry")
  private ManagedMemoryEntry managedMemoryEntry;

  /** Optional caller-selected managed memory entry ID. The service generates an ID when omitted. */
  @JsonIgnore
  @QueryParam("managed_memory_entry_id")
  private String managedMemoryEntryId;

  /**
   * Managed memory store that will contain the entry, in the form
   * `memory-stores/{managed_memory_store_id}`.
   */
  @JsonIgnore private String parent;

  public CreateManagedMemoryEntryRequest setManagedMemoryEntry(
      ManagedMemoryEntry managedMemoryEntry) {
    this.managedMemoryEntry = managedMemoryEntry;
    return this;
  }

  public ManagedMemoryEntry getManagedMemoryEntry() {
    return managedMemoryEntry;
  }

  public CreateManagedMemoryEntryRequest setManagedMemoryEntryId(String managedMemoryEntryId) {
    this.managedMemoryEntryId = managedMemoryEntryId;
    return this;
  }

  public String getManagedMemoryEntryId() {
    return managedMemoryEntryId;
  }

  public CreateManagedMemoryEntryRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateManagedMemoryEntryRequest that = (CreateManagedMemoryEntryRequest) o;
    return Objects.equals(managedMemoryEntry, that.managedMemoryEntry)
        && Objects.equals(managedMemoryEntryId, that.managedMemoryEntryId)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryEntry, managedMemoryEntryId, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateManagedMemoryEntryRequest.class)
        .add("managedMemoryEntry", managedMemoryEntry)
        .add("managedMemoryEntryId", managedMemoryEntryId)
        .add("parent", parent)
        .toString();
  }
}

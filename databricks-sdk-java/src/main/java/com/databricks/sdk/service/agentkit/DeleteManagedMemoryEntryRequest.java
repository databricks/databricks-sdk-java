// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class DeleteManagedMemoryEntryRequest {
  /**
   * Resource name in the form
   * `memory-stores/{managed_memory_store_id}/entries/{managed_memory_entry_id}`.
   */
  @JsonIgnore private String name;

  public DeleteManagedMemoryEntryRequest setName(String name) {
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
    DeleteManagedMemoryEntryRequest that = (DeleteManagedMemoryEntryRequest) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteManagedMemoryEntryRequest.class).add("name", name).toString();
  }
}

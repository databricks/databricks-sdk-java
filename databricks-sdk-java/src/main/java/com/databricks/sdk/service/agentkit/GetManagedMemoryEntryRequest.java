// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetManagedMemoryEntryRequest {
  /**
   * Resource name in the form
   * `memory-stores/{managed_memory_store_id}/entries/{managed_memory_entry_id}`.
   */
  @JsonIgnore private String name;

  /** Controls whether the response includes memory content. Defaults to `FULL`. */
  @JsonIgnore
  @QueryParam("view")
  private ManagedMemoryEntryView view;

  public GetManagedMemoryEntryRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetManagedMemoryEntryRequest setView(ManagedMemoryEntryView view) {
    this.view = view;
    return this;
  }

  public ManagedMemoryEntryView getView() {
    return view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetManagedMemoryEntryRequest that = (GetManagedMemoryEntryRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(view, that.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, view);
  }

  @Override
  public String toString() {
    return new ToStringer(GetManagedMemoryEntryRequest.class)
        .add("name", name)
        .add("view", view)
        .toString();
  }
}

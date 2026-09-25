// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class GetManagedMemoryEntryRequest {
  /**
   * Resource name in the form
   * `memory-stores/{managed_memory_store_id}/entries/{managed_memory_entry_id}`.
   */
  @JsonIgnore private String name;

  /**
   * Fields to return, using proto field names such as `content` (not `contents`). An omitted or
   * empty mask returns the full entry, including `content`; a non-empty mask returns only the
   * requested fields.
   */
  @JsonIgnore
  @QueryParam("read_mask")
  private FieldMask readMask;

  public GetManagedMemoryEntryRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetManagedMemoryEntryRequest setReadMask(FieldMask readMask) {
    this.readMask = readMask;
    return this;
  }

  public FieldMask getReadMask() {
    return readMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetManagedMemoryEntryRequest that = (GetManagedMemoryEntryRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(readMask, that.readMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, readMask);
  }

  @Override
  public String toString() {
    return new ToStringer(GetManagedMemoryEntryRequest.class)
        .add("name", name)
        .add("readMask", readMask)
        .toString();
  }
}

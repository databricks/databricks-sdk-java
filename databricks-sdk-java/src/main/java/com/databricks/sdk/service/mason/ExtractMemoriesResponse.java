// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Result of a single-session memory extraction. */
@Generated
public class ExtractMemoriesResponse {
  /** The memory entries written by this extraction. */
  @JsonProperty("entries")
  private Collection<ManagedMemoryEntry> entries;

  /**
   * Correlation identifier for this extraction, for logging and tracing. Not a fetchable resource.
   */
  @JsonProperty("name")
  private String name;

  public ExtractMemoriesResponse setEntries(Collection<ManagedMemoryEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Collection<ManagedMemoryEntry> getEntries() {
    return entries;
  }

  public ExtractMemoriesResponse setName(String name) {
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
    ExtractMemoriesResponse that = (ExtractMemoriesResponse) o;
    return Objects.equals(entries, that.entries) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, name);
  }

  @Override
  public String toString() {
    return new ToStringer(ExtractMemoriesResponse.class)
        .add("entries", entries)
        .add("name", name)
        .toString();
  }
}

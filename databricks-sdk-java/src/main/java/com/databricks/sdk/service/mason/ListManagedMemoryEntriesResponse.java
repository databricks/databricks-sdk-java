// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing managed memory entries. */
@Generated
public class ListManagedMemoryEntriesResponse {
  /** Managed memory entries matching the request and its read mask. */
  @JsonProperty("managed_memory_entries")
  private Collection<ManagedMemoryEntry> managedMemoryEntries;

  /** Opaque pagination token. This field is omitted when there are no more results. */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  public ListManagedMemoryEntriesResponse setManagedMemoryEntries(
      Collection<ManagedMemoryEntry> managedMemoryEntries) {
    this.managedMemoryEntries = managedMemoryEntries;
    return this;
  }

  public Collection<ManagedMemoryEntry> getManagedMemoryEntries() {
    return managedMemoryEntries;
  }

  public ListManagedMemoryEntriesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListManagedMemoryEntriesResponse that = (ListManagedMemoryEntriesResponse) o;
    return Objects.equals(managedMemoryEntries, that.managedMemoryEntries)
        && Objects.equals(nextPageToken, that.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryEntries, nextPageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListManagedMemoryEntriesResponse.class)
        .add("managedMemoryEntries", managedMemoryEntries)
        .add("nextPageToken", nextPageToken)
        .toString();
  }
}

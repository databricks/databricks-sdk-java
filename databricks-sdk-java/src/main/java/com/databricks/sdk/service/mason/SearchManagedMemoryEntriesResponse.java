// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Response containing managed memory entries ranked by relevance. */
@Generated
public class SearchManagedMemoryEntriesResponse {
  /**
   * Deprecated compatibility alias for clients migrating to `results`. This contains the same
   * entries in the same order, but omits their relevance scores.
   */
  @JsonProperty("managed_memory_entries")
  private Collection<ManagedMemoryEntry> managedMemoryEntries;

  /**
   * Opaque pagination token. Search currently returns an unpaginated ranked top-N result set, so
   * the server does not populate this field.
   */
  @JsonProperty("next_page_token")
  private String nextPageToken;

  /** Canonical matching entries and relevance scores, ordered most relevant first. */
  @JsonProperty("results")
  private Collection<ManagedMemoryEntrySearchResult> results;

  public SearchManagedMemoryEntriesResponse setManagedMemoryEntries(
      Collection<ManagedMemoryEntry> managedMemoryEntries) {
    this.managedMemoryEntries = managedMemoryEntries;
    return this;
  }

  public Collection<ManagedMemoryEntry> getManagedMemoryEntries() {
    return managedMemoryEntries;
  }

  public SearchManagedMemoryEntriesResponse setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  public String getNextPageToken() {
    return nextPageToken;
  }

  public SearchManagedMemoryEntriesResponse setResults(
      Collection<ManagedMemoryEntrySearchResult> results) {
    this.results = results;
    return this;
  }

  public Collection<ManagedMemoryEntrySearchResult> getResults() {
    return results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchManagedMemoryEntriesResponse that = (SearchManagedMemoryEntriesResponse) o;
    return Objects.equals(managedMemoryEntries, that.managedMemoryEntries)
        && Objects.equals(nextPageToken, that.nextPageToken)
        && Objects.equals(results, that.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryEntries, nextPageToken, results);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchManagedMemoryEntriesResponse.class)
        .add("managedMemoryEntries", managedMemoryEntries)
        .add("nextPageToken", nextPageToken)
        .add("results", results)
        .toString();
  }
}

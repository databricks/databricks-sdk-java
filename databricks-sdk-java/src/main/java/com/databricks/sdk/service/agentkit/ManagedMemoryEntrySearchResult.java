// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** One relevance-ranked managed memory search result. */
@Generated
public class ManagedMemoryEntrySearchResult {
  /** Managed memory entry matching the query. */
  @JsonProperty("managed_memory_entry")
  private ManagedMemoryEntry managedMemoryEntry;

  /** Relevance score for the result. Higher scores are more relevant. */
  @JsonProperty("score")
  private Double score;

  public ManagedMemoryEntrySearchResult setManagedMemoryEntry(
      ManagedMemoryEntry managedMemoryEntry) {
    this.managedMemoryEntry = managedMemoryEntry;
    return this;
  }

  public ManagedMemoryEntry getManagedMemoryEntry() {
    return managedMemoryEntry;
  }

  public ManagedMemoryEntrySearchResult setScore(Double score) {
    this.score = score;
    return this;
  }

  public Double getScore() {
    return score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ManagedMemoryEntrySearchResult that = (ManagedMemoryEntrySearchResult) o;
    return Objects.equals(managedMemoryEntry, that.managedMemoryEntry)
        && Objects.equals(score, that.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(managedMemoryEntry, score);
  }

  @Override
  public String toString() {
    return new ToStringer(ManagedMemoryEntrySearchResult.class)
        .add("managedMemoryEntry", managedMemoryEntry)
        .add("score", score)
        .toString();
  }
}

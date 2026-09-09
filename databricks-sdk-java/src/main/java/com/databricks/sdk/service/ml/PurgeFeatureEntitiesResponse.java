// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Result of a completed feature entity purge. */
@Generated
public class PurgeFeatureEntitiesResponse {
  /** Metadata about the purge operation. */
  @JsonProperty("metadata")
  private PurgeFeatureEntitiesMetadata metadata;

  /** Per-feature purge results. */
  @JsonProperty("results")
  private Collection<PurgeFeatureEntitiesResult> results;

  /** State of the purge operation. */
  @JsonProperty("state")
  private PurgeFeatureEntitiesMetadataState state;

  public PurgeFeatureEntitiesResponse setMetadata(PurgeFeatureEntitiesMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  public PurgeFeatureEntitiesMetadata getMetadata() {
    return metadata;
  }

  public PurgeFeatureEntitiesResponse setResults(Collection<PurgeFeatureEntitiesResult> results) {
    this.results = results;
    return this;
  }

  public Collection<PurgeFeatureEntitiesResult> getResults() {
    return results;
  }

  public PurgeFeatureEntitiesResponse setState(PurgeFeatureEntitiesMetadataState state) {
    this.state = state;
    return this;
  }

  public PurgeFeatureEntitiesMetadataState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PurgeFeatureEntitiesResponse that = (PurgeFeatureEntitiesResponse) o;
    return Objects.equals(metadata, that.metadata)
        && Objects.equals(results, that.results)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results, state);
  }

  @Override
  public String toString() {
    return new ToStringer(PurgeFeatureEntitiesResponse.class)
        .add("metadata", metadata)
        .add("results", results)
        .add("state", state)
        .toString();
  }
}

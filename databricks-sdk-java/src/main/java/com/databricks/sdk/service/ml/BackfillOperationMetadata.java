// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Progress and configuration for a backfill. */
@Generated
public class BackfillOperationMetadata {
  /** Output ranges targeted by the backfill. */
  @JsonProperty("backfill_ranges")
  private Collection<BackfillRange> backfillRanges;

  /** Full names of the features targeted by the backfill. */
  @JsonProperty("feature_full_names")
  private Collection<String> featureFullNames;

  /** Current state of the backfill. */
  @JsonProperty("state")
  private BackfillOperationMetadataState state;

  public BackfillOperationMetadata setBackfillRanges(Collection<BackfillRange> backfillRanges) {
    this.backfillRanges = backfillRanges;
    return this;
  }

  public Collection<BackfillRange> getBackfillRanges() {
    return backfillRanges;
  }

  public BackfillOperationMetadata setFeatureFullNames(Collection<String> featureFullNames) {
    this.featureFullNames = featureFullNames;
    return this;
  }

  public Collection<String> getFeatureFullNames() {
    return featureFullNames;
  }

  public BackfillOperationMetadata setState(BackfillOperationMetadataState state) {
    this.state = state;
    return this;
  }

  public BackfillOperationMetadataState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackfillOperationMetadata that = (BackfillOperationMetadata) o;
    return Objects.equals(backfillRanges, that.backfillRanges)
        && Objects.equals(featureFullNames, that.featureFullNames)
        && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backfillRanges, featureFullNames, state);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillOperationMetadata.class)
        .add("backfillRanges", backfillRanges)
        .add("featureFullNames", featureFullNames)
        .add("state", state)
        .toString();
  }
}

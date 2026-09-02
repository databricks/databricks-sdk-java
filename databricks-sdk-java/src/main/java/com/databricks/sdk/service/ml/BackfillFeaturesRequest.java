// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class BackfillFeaturesRequest {
  /** Output ranges to backfill. */
  @JsonProperty("backfill_ranges")
  private Collection<BackfillRange> backfillRanges;

  /** Full names of the features to backfill. */
  @JsonProperty("feature_full_names")
  private Collection<String> featureFullNames;

  /** Idempotency token for the request. */
  @JsonProperty("request_id")
  private String requestId;

  public BackfillFeaturesRequest setBackfillRanges(Collection<BackfillRange> backfillRanges) {
    this.backfillRanges = backfillRanges;
    return this;
  }

  public Collection<BackfillRange> getBackfillRanges() {
    return backfillRanges;
  }

  public BackfillFeaturesRequest setFeatureFullNames(Collection<String> featureFullNames) {
    this.featureFullNames = featureFullNames;
    return this;
  }

  public Collection<String> getFeatureFullNames() {
    return featureFullNames;
  }

  public BackfillFeaturesRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackfillFeaturesRequest that = (BackfillFeaturesRequest) o;
    return Objects.equals(backfillRanges, that.backfillRanges)
        && Objects.equals(featureFullNames, that.featureFullNames)
        && Objects.equals(requestId, that.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backfillRanges, featureFullNames, requestId);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillFeaturesRequest.class)
        .add("backfillRanges", backfillRanges)
        .add("featureFullNames", featureFullNames)
        .add("requestId", requestId)
        .toString();
  }
}

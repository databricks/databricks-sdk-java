// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class BackfillFeaturesRequest {
  /** Output ranges to backfill. */
  @JsonProperty("backfill_ranges")
  private Collection<BackfillRange> backfillRanges;

  /**
   * The budget policy ID, in UUID format, used to attribute the serverless compute cost of this
   * backfill. If not specified, a default budget policy may be applied.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /** Full names of the features to backfill. */
  @JsonProperty("feature_full_names")
  private Collection<String> featureFullNames;

  /** Idempotency token for the request. */
  @JsonProperty("request_id")
  private String requestId;

  /**
   * Custom tags to associate with this backfill. They are applied to the backfill job and forwarded
   * to the underlying compute as Databricks resource tags, so backfill cost can be attributed in
   * the billing system tables. These tags apply only to the backfill compute; they are not applied
   * to the Unity Catalog Feature resources themselves, whose tags are managed separately through
   * the Unity Catalog tagging API. A maximum of 25 tags is supported; keys and values are subject
   * to the same limitations as Databricks resource tags.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public BackfillFeaturesRequest setBackfillRanges(Collection<BackfillRange> backfillRanges) {
    this.backfillRanges = backfillRanges;
    return this;
  }

  public Collection<BackfillRange> getBackfillRanges() {
    return backfillRanges;
  }

  public BackfillFeaturesRequest setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
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

  public BackfillFeaturesRequest setTags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Map<String, String> getTags() {
    return tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BackfillFeaturesRequest that = (BackfillFeaturesRequest) o;
    return Objects.equals(backfillRanges, that.backfillRanges)
        && Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(featureFullNames, that.featureFullNames)
        && Objects.equals(requestId, that.requestId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backfillRanges, budgetPolicyId, featureFullNames, requestId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(BackfillFeaturesRequest.class)
        .add("backfillRanges", backfillRanges)
        .add("budgetPolicyId", budgetPolicyId)
        .add("featureFullNames", featureFullNames)
        .add("requestId", requestId)
        .add("tags", tags)
        .toString();
  }
}

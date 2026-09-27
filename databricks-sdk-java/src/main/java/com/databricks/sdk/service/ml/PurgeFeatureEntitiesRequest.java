// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/**
 * Request to purge materialized feature values for entities listed in a Unity Catalog Delta table.
 */
@Generated
public class PurgeFeatureEntitiesRequest {
  /**
   * The budget policy ID, in UUID format, used to attribute the serverless compute cost of this
   * purge. If not specified, a default budget policy may be applied.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /**
   * Fully qualified name of the Unity Catalog Delta table containing the entity keys to purge. The
   * table may contain a subset of each feature's entity-key columns. A partial key match deletes
   * all feature rows matching the provided key values. Non-key columns are rejected; null key
   * values are allowed.
   */
  @JsonProperty("entities_table")
  private String entitiesTable;

  /**
   * Fully qualified names of the features to purge. At least one nonempty feature name is required.
   * A request may contain at most 10000 features; submit additional features in separate requests.
   * Duplicate features are rejected.
   */
  @JsonProperty("features")
  private Collection<String> features;

  /** Optional UUID4 idempotency token for the request. */
  @JsonProperty("request_id")
  private String requestId;

  /**
   * Custom tags to associate with this purge. They are applied to the purge job and forwarded to
   * the underlying compute as Databricks resource tags, so purge cost can be attributed in the
   * billing system tables. These tags apply only to the purge compute; they are not applied to the
   * Unity Catalog Feature resources themselves, whose tags are managed separately through the Unity
   * Catalog tagging API. A maximum of 25 tags is supported; keys and values are subject to the same
   * limitations as Databricks resource tags.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public PurgeFeatureEntitiesRequest setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PurgeFeatureEntitiesRequest setEntitiesTable(String entitiesTable) {
    this.entitiesTable = entitiesTable;
    return this;
  }

  public String getEntitiesTable() {
    return entitiesTable;
  }

  public PurgeFeatureEntitiesRequest setFeatures(Collection<String> features) {
    this.features = features;
    return this;
  }

  public Collection<String> getFeatures() {
    return features;
  }

  public PurgeFeatureEntitiesRequest setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getRequestId() {
    return requestId;
  }

  public PurgeFeatureEntitiesRequest setTags(Map<String, String> tags) {
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
    PurgeFeatureEntitiesRequest that = (PurgeFeatureEntitiesRequest) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(entitiesTable, that.entitiesTable)
        && Objects.equals(features, that.features)
        && Objects.equals(requestId, that.requestId)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetPolicyId, entitiesTable, features, requestId, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(PurgeFeatureEntitiesRequest.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("entitiesTable", entitiesTable)
        .add("features", features)
        .add("requestId", requestId)
        .add("tags", tags)
        .toString();
  }
}

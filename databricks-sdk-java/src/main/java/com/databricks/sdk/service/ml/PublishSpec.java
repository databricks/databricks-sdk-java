// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

@Generated
public class PublishSpec {
  /**
   * Budget policy id used to attribute the serverless compute cost of the synced online-table sync
   * pipeline. Applied only when the sync pipeline is first created (the initial publish of a new
   * online table); republishing to an existing online table does not update it.
   */
  @JsonProperty("budget_policy_id")
  private String budgetPolicyId;

  /**
   * Full Unity Catalog name of one of the features materialized in the source table, used to derive
   * the synced online table's entity and timeseries columns. Required for view sources without a UC
   * PrimaryKeyConstraint; ignored when the source already has one.
   */
  @JsonProperty("full_feature_name")
  private String fullFeatureName;

  /** The name of the target online store. */
  @JsonProperty("online_store")
  private String onlineStore;

  /** The full three-part (catalog, schema, table) name of the online table. */
  @JsonProperty("online_table_name")
  private String onlineTableName;

  /** The publish mode of the pipeline that syncs the online table with the source table. */
  @JsonProperty("publish_mode")
  private PublishSpecPublishMode publishMode;

  /**
   * Custom tags to apply to the synced online-table sync pipeline created for this publish. They
   * are forwarded to the pipeline's compute as cluster tags so its cost can be attributed in the
   * billing system tables. Applied only when the sync pipeline is first created (the initial
   * publish of a new online table); republishing to an existing online table does not update them.
   */
  @JsonProperty("tags")
  private Map<String, String> tags;

  public PublishSpec setBudgetPolicyId(String budgetPolicyId) {
    this.budgetPolicyId = budgetPolicyId;
    return this;
  }

  public String getBudgetPolicyId() {
    return budgetPolicyId;
  }

  public PublishSpec setFullFeatureName(String fullFeatureName) {
    this.fullFeatureName = fullFeatureName;
    return this;
  }

  public String getFullFeatureName() {
    return fullFeatureName;
  }

  public PublishSpec setOnlineStore(String onlineStore) {
    this.onlineStore = onlineStore;
    return this;
  }

  public String getOnlineStore() {
    return onlineStore;
  }

  public PublishSpec setOnlineTableName(String onlineTableName) {
    this.onlineTableName = onlineTableName;
    return this;
  }

  public String getOnlineTableName() {
    return onlineTableName;
  }

  public PublishSpec setPublishMode(PublishSpecPublishMode publishMode) {
    this.publishMode = publishMode;
    return this;
  }

  public PublishSpecPublishMode getPublishMode() {
    return publishMode;
  }

  public PublishSpec setTags(Map<String, String> tags) {
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
    PublishSpec that = (PublishSpec) o;
    return Objects.equals(budgetPolicyId, that.budgetPolicyId)
        && Objects.equals(fullFeatureName, that.fullFeatureName)
        && Objects.equals(onlineStore, that.onlineStore)
        && Objects.equals(onlineTableName, that.onlineTableName)
        && Objects.equals(publishMode, that.publishMode)
        && Objects.equals(tags, that.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetPolicyId, fullFeatureName, onlineStore, onlineTableName, publishMode, tags);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishSpec.class)
        .add("budgetPolicyId", budgetPolicyId)
        .add("fullFeatureName", fullFeatureName)
        .add("onlineStore", onlineStore)
        .add("onlineTableName", onlineTableName)
        .add("publishMode", publishMode)
        .add("tags", tags)
        .toString();
  }
}

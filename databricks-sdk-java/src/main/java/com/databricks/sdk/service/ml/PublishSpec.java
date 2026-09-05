// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishSpec {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PublishSpec that = (PublishSpec) o;
    return Objects.equals(fullFeatureName, that.fullFeatureName)
        && Objects.equals(onlineStore, that.onlineStore)
        && Objects.equals(onlineTableName, that.onlineTableName)
        && Objects.equals(publishMode, that.publishMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullFeatureName, onlineStore, onlineTableName, publishMode);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishSpec.class)
        .add("fullFeatureName", fullFeatureName)
        .add("onlineStore", onlineStore)
        .add("onlineTableName", onlineTableName)
        .add("publishMode", publishMode)
        .toString();
  }
}

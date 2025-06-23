// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PublishSpec {
  /** The name of the target online store. */
  @JsonProperty("online_store")
  private String onlineStore;

  /**
   * The full three-part (catalog, schema, table) name of the online table. Auto-generated if not
   * specified.
   */
  @JsonProperty("online_table_name")
  private String onlineTableName;

  /**
   * The publish mode of the pipeline that syncs the online table with the source table. Defaults to
   * TRIGGERED if not specified. All publish modes require the source table to have Change Data Feed
   * (CDF) enabled.
   */
  @JsonProperty("publish_mode")
  private PublishSpecPublishMode publishMode;

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
    return Objects.equals(onlineStore, that.onlineStore)
        && Objects.equals(onlineTableName, that.onlineTableName)
        && Objects.equals(publishMode, that.publishMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlineStore, onlineTableName, publishMode);
  }

  @Override
  public String toString() {
    return new ToStringer(PublishSpec.class)
        .add("onlineStore", onlineStore)
        .add("onlineTableName", onlineTableName)
        .add("publishMode", publishMode)
        .toString();
  }
}

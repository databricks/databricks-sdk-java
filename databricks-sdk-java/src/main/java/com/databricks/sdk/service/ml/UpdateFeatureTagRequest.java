// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class UpdateFeatureTagRequest {
  /** */
  @JsonIgnore private String featureName;

  /** Represents a tag on a feature in a feature table. */
  @JsonProperty("feature_tag")
  private FeatureTag featureTag;

  /** */
  @JsonIgnore private String key;

  /** */
  @JsonIgnore private String tableName;

  /** The list of fields to update. */
  @JsonIgnore
  @QueryParam("update_mask")
  private String updateMask;

  public UpdateFeatureTagRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public UpdateFeatureTagRequest setFeatureTag(FeatureTag featureTag) {
    this.featureTag = featureTag;
    return this;
  }

  public FeatureTag getFeatureTag() {
    return featureTag;
  }

  public UpdateFeatureTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public UpdateFeatureTagRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  public UpdateFeatureTagRequest setUpdateMask(String updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public String getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateFeatureTagRequest that = (UpdateFeatureTagRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(featureTag, that.featureTag)
        && Objects.equals(key, that.key)
        && Objects.equals(tableName, that.tableName)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureTag, key, tableName, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateFeatureTagRequest.class)
        .add("featureName", featureName)
        .add("featureTag", featureTag)
        .add("key", key)
        .add("tableName", tableName)
        .add("updateMask", updateMask)
        .toString();
  }
}

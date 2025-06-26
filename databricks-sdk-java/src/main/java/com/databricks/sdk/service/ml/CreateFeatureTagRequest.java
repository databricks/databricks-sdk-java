// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateFeatureTagRequest {
  /** */
  @JsonIgnore private String featureName;

  /** Represents a tag on a feature in a feature table. */
  @JsonProperty("feature_tag")
  private FeatureTag featureTag;

  /** */
  @JsonIgnore private String tableName;

  public CreateFeatureTagRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public CreateFeatureTagRequest setFeatureTag(FeatureTag featureTag) {
    this.featureTag = featureTag;
    return this;
  }

  public FeatureTag getFeatureTag() {
    return featureTag;
  }

  public CreateFeatureTagRequest setTableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  public String getTableName() {
    return tableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateFeatureTagRequest that = (CreateFeatureTagRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(featureTag, that.featureTag)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureTag, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateFeatureTagRequest.class)
        .add("featureName", featureName)
        .add("featureTag", featureTag)
        .add("tableName", tableName)
        .toString();
  }
}

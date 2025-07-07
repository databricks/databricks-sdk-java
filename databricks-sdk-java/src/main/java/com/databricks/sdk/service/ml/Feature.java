// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Feature for model version. */
@Generated
public class Feature {
  /** Feature name */
  @JsonProperty("feature_name")
  private String featureName;

  /** Feature table id */
  @JsonProperty("feature_table_id")
  private String featureTableId;

  /** Feature table name */
  @JsonProperty("feature_table_name")
  private String featureTableName;

  public Feature setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public Feature setFeatureTableId(String featureTableId) {
    this.featureTableId = featureTableId;
    return this;
  }

  public String getFeatureTableId() {
    return featureTableId;
  }

  public Feature setFeatureTableName(String featureTableName) {
    this.featureTableName = featureTableName;
    return this;
  }

  public String getFeatureTableName() {
    return featureTableName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Feature that = (Feature) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(featureTableId, that.featureTableId)
        && Objects.equals(featureTableName, that.featureTableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, featureTableId, featureTableName);
  }

  @Override
  public String toString() {
    return new ToStringer(Feature.class)
        .add("featureName", featureName)
        .add("featureTableId", featureTableId)
        .add("featureTableName", featureTableName)
        .toString();
  }
}

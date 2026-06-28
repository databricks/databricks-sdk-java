// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FeatureLineageOnlineFeature {
  /** The name of the online feature (column name). */
  @JsonProperty("feature_name")
  private String featureName;

  /** The full name of the online table in Unity Catalog. */
  @JsonProperty("table_name")
  private String tableName;

  public FeatureLineageOnlineFeature setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public FeatureLineageOnlineFeature setTableName(String tableName) {
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
    FeatureLineageOnlineFeature that = (FeatureLineageOnlineFeature) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(FeatureLineageOnlineFeature.class)
        .add("featureName", featureName)
        .add("tableName", tableName)
        .toString();
  }
}

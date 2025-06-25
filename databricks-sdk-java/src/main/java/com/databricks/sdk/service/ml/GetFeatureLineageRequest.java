// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetFeatureLineageRequest {
  /** The name of the feature. */
  @JsonIgnore private String featureName;

  /** The full name of the feature table in Unity Catalog. */
  @JsonIgnore private String tableName;

  public GetFeatureLineageRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public GetFeatureLineageRequest setTableName(String tableName) {
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
    GetFeatureLineageRequest that = (GetFeatureLineageRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFeatureLineageRequest.class)
        .add("featureName", featureName)
        .add("tableName", tableName)
        .toString();
  }
}

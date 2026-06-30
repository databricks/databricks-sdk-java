// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetFeatureTagRequest {
  /** */
  @JsonIgnore private String featureName;

  /** */
  @JsonIgnore private String key;

  /** */
  @JsonIgnore private String tableName;

  public GetFeatureTagRequest setFeatureName(String featureName) {
    this.featureName = featureName;
    return this;
  }

  public String getFeatureName() {
    return featureName;
  }

  public GetFeatureTagRequest setKey(String key) {
    this.key = key;
    return this;
  }

  public String getKey() {
    return key;
  }

  public GetFeatureTagRequest setTableName(String tableName) {
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
    GetFeatureTagRequest that = (GetFeatureTagRequest) o;
    return Objects.equals(featureName, that.featureName)
        && Objects.equals(key, that.key)
        && Objects.equals(tableName, that.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featureName, key, tableName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetFeatureTagRequest.class)
        .add("featureName", featureName)
        .add("key", key)
        .add("tableName", tableName)
        .toString();
  }
}

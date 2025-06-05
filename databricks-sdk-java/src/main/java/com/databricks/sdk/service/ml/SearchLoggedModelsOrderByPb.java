// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class SearchLoggedModelsOrderByPb {
  @JsonProperty("ascending")
  private Boolean ascending;

  @JsonProperty("dataset_digest")
  private String datasetDigest;

  @JsonProperty("dataset_name")
  private String datasetName;

  @JsonProperty("field_name")
  private String fieldName;

  public SearchLoggedModelsOrderByPb setAscending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

  public Boolean getAscending() {
    return ascending;
  }

  public SearchLoggedModelsOrderByPb setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public SearchLoggedModelsOrderByPb setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public SearchLoggedModelsOrderByPb setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  public String getFieldName() {
    return fieldName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchLoggedModelsOrderByPb that = (SearchLoggedModelsOrderByPb) o;
    return Objects.equals(ascending, that.ascending)
        && Objects.equals(datasetDigest, that.datasetDigest)
        && Objects.equals(datasetName, that.datasetName)
        && Objects.equals(fieldName, that.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ascending, datasetDigest, datasetName, fieldName);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsOrderByPb.class)
        .add("ascending", ascending)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .add("fieldName", fieldName)
        .toString();
  }
}

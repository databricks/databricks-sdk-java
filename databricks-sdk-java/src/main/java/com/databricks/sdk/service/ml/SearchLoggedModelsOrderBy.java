// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SearchLoggedModelsOrderBy {
  /** Whether the search results order is ascending or not. */
  @JsonProperty("ascending")
  private Boolean ascending;

  /**
   * If ``field_name`` refers to a metric, this field specifies the digest of the dataset associated
   * with the metric. Only metrics associated with the specified dataset name and digest will be
   * considered for ordering. This field may only be set if ``dataset_name`` is also set.
   */
  @JsonProperty("dataset_digest")
  private String datasetDigest;

  /**
   * If ``field_name`` refers to a metric, this field specifies the name of the dataset associated
   * with the metric. Only metrics associated with the specified dataset name will be considered for
   * ordering. This field may only be set if ``field_name`` refers to a metric.
   */
  @JsonProperty("dataset_name")
  private String datasetName;

  /** The name of the field to order by, e.g. "metrics.accuracy". */
  @JsonProperty("field_name")
  private String fieldName;

  public SearchLoggedModelsOrderBy setAscending(Boolean ascending) {
    this.ascending = ascending;
    return this;
  }

  public Boolean getAscending() {
    return ascending;
  }

  public SearchLoggedModelsOrderBy setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public SearchLoggedModelsOrderBy setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  public SearchLoggedModelsOrderBy setFieldName(String fieldName) {
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
    SearchLoggedModelsOrderBy that = (SearchLoggedModelsOrderBy) o;
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
    return new ToStringer(SearchLoggedModelsOrderBy.class)
        .add("ascending", ascending)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .add("fieldName", fieldName)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SearchLoggedModelsDataset {
  /** The digest of the dataset. */
  @JsonProperty("dataset_digest")
  private String datasetDigest;

  /** The name of the dataset. */
  @JsonProperty("dataset_name")
  private String datasetName;

  public SearchLoggedModelsDataset setDatasetDigest(String datasetDigest) {
    this.datasetDigest = datasetDigest;
    return this;
  }

  public String getDatasetDigest() {
    return datasetDigest;
  }

  public SearchLoggedModelsDataset setDatasetName(String datasetName) {
    this.datasetName = datasetName;
    return this;
  }

  public String getDatasetName() {
    return datasetName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SearchLoggedModelsDataset that = (SearchLoggedModelsDataset) o;
    return Objects.equals(datasetDigest, that.datasetDigest)
        && Objects.equals(datasetName, that.datasetName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetDigest, datasetName);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchLoggedModelsDataset.class)
        .add("datasetDigest", datasetDigest)
        .add("datasetName", datasetName)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request payload for upserting data into a vector index. */
@Generated
public class UpsertDataVectorIndexRequest {
  /**
   * Name of the vector index where data is to be upserted. Must be a Direct Vector Access Index.
   */
  @JsonIgnore private String indexName;

  /** JSON string representing the data to be upserted. */
  @JsonProperty("inputs_json")
  private String inputsJson;

  public UpsertDataVectorIndexRequest setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public UpsertDataVectorIndexRequest setInputsJson(String inputsJson) {
    this.inputsJson = inputsJson;
    return this;
  }

  public String getInputsJson() {
    return inputsJson;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataVectorIndexRequest that = (UpsertDataVectorIndexRequest) o;
    return Objects.equals(indexName, that.indexName) && Objects.equals(inputsJson, that.inputsJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, inputsJson);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexRequest.class)
        .add("indexName", indexName)
        .add("inputsJson", inputsJson)
        .toString();
  }
}

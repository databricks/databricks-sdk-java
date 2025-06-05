// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpsertDataVectorIndexRequestPb {
  @JsonIgnore private String indexName;

  @JsonProperty("inputs_json")
  private String inputsJson;

  public UpsertDataVectorIndexRequestPb setIndexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  public String getIndexName() {
    return indexName;
  }

  public UpsertDataVectorIndexRequestPb setInputsJson(String inputsJson) {
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
    UpsertDataVectorIndexRequestPb that = (UpsertDataVectorIndexRequestPb) o;
    return Objects.equals(indexName, that.indexName) && Objects.equals(inputsJson, that.inputsJson);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexName, inputsJson);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexRequestPb.class)
        .add("indexName", indexName)
        .add("inputsJson", inputsJson)
        .toString();
  }
}

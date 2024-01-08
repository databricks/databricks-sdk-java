// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request payload for upserting data into a vector index. */
@Generated
public class UpsertDataVectorIndexRequest {
  /** JSON string representing the data to be upserted. */
  @JsonProperty("inputs_json")
  private String inputsJson;

  /**
   * Name of the vector index where data is to be upserted. Must be a Direct Vector Access Index.
   */
  private String name;

  public UpsertDataVectorIndexRequest setInputsJson(String inputsJson) {
    this.inputsJson = inputsJson;
    return this;
  }

  public String getInputsJson() {
    return inputsJson;
  }

  public UpsertDataVectorIndexRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpsertDataVectorIndexRequest that = (UpsertDataVectorIndexRequest) o;
    return Objects.equals(inputsJson, that.inputsJson) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputsJson, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataVectorIndexRequest.class)
        .add("inputsJson", inputsJson)
        .add("name", name)
        .toString();
  }
}

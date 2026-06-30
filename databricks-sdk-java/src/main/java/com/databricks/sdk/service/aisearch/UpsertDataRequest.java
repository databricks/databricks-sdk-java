// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to upsert rows into a Direct Access AI Search index. */
@Generated
public class UpsertDataRequest {
  /** JSON document describing the rows to upsert. */
  @JsonProperty("inputs_json")
  private String inputsJson;

  /**
   * Full resource name of the index. Must be a Direct Access index. Format:
   * `workspaces/{workspace_id}/endpoints/{endpoint_id}/indexes/{index_id}`
   */
  @JsonIgnore private String name;

  public UpsertDataRequest setInputsJson(String inputsJson) {
    this.inputsJson = inputsJson;
    return this;
  }

  public String getInputsJson() {
    return inputsJson;
  }

  public UpsertDataRequest setName(String name) {
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
    UpsertDataRequest that = (UpsertDataRequest) o;
    return Objects.equals(inputsJson, that.inputsJson) && Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputsJson, name);
  }

  @Override
  public String toString() {
    return new ToStringer(UpsertDataRequest.class)
        .add("inputsJson", inputsJson)
        .add("name", name)
        .toString();
  }
}

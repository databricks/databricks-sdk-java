// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aibuilder;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class StartCustomLlmOptimizationRunRequest {
  /** The Id of the tile. */
  @JsonIgnore private String id;

  public StartCustomLlmOptimizationRunRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    StartCustomLlmOptimizationRunRequest that = (StartCustomLlmOptimizationRunRequest) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return new ToStringer(StartCustomLlmOptimizationRunRequest.class).add("id", id).toString();
  }
}

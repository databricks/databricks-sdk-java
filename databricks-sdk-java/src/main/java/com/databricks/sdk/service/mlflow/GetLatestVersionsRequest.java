// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class GetLatestVersionsRequest {
  /** Registered model unique name identifier. */
  @JsonProperty("name")
  private String name;

  /** List of stages. */
  @JsonProperty("stages")
  private Collection<String> stages;

  public GetLatestVersionsRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetLatestVersionsRequest setStages(Collection<String> stages) {
    this.stages = stages;
    return this;
  }

  public Collection<String> getStages() {
    return stages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLatestVersionsRequest that = (GetLatestVersionsRequest) o;
    return Objects.equals(name, that.name) && Objects.equals(stages, that.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stages);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsRequest.class)
        .add("name", name)
        .add("stages", stages)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GetLatestVersionsRequestPb {
  @JsonProperty("name")
  private String name;

  @JsonProperty("stages")
  private Collection<String> stages;

  public GetLatestVersionsRequestPb setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public GetLatestVersionsRequestPb setStages(Collection<String> stages) {
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
    GetLatestVersionsRequestPb that = (GetLatestVersionsRequestPb) o;
    return Objects.equals(name, that.name) && Objects.equals(stages, that.stages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, stages);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLatestVersionsRequestPb.class)
        .add("name", name)
        .add("stages", stages)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get an experiment by name */
@Generated
class GetByNameRequestPb {
  @JsonIgnore
  @QueryParam("experiment_name")
  private String experimentName;

  public GetByNameRequestPb setExperimentName(String experimentName) {
    this.experimentName = experimentName;
    return this;
  }

  public String getExperimentName() {
    return experimentName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetByNameRequestPb that = (GetByNameRequestPb) o;
    return Objects.equals(experimentName, that.experimentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetByNameRequestPb.class)
        .add("experimentName", experimentName)
        .toString();
  }
}

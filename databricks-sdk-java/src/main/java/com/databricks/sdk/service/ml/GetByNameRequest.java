// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GetByNameRequest {
  /** Name of the associated experiment. */
  @JsonIgnore
  @QueryParam("experiment_name")
  private String experimentName;

  public GetByNameRequest setExperimentName(String experimentName) {
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
    GetByNameRequest that = (GetByNameRequest) o;
    return Objects.equals(experimentName, that.experimentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentName);
  }

  @Override
  public String toString() {
    return new ToStringer(GetByNameRequest.class).add("experimentName", experimentName).toString();
  }
}

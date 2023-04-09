// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;
import com.databricks.sdk.mixin.ToStringer;
import java.util.Objects;

/** Get metadata */
public class GetByNameRequest {
  /** Name of the associated experiment. */
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

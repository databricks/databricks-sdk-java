// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class GetExperimentByNameResponse {
  /** Experiment details. */
  @JsonProperty("experiment")
  private Experiment experiment;

  public GetExperimentByNameResponse setExperiment(Experiment experiment) {
    this.experiment = experiment;
    return this;
  }

  public Experiment getExperiment() {
    return experiment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetExperimentByNameResponse that = (GetExperimentByNameResponse) o;
    return Objects.equals(experiment, that.experiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiment);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentByNameResponse.class)
        .add("experiment", experiment)
        .toString();
  }
}

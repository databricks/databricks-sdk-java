// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetExperimentResponse {
  /** Experiment details. */
  @JsonProperty("experiment")
  private Experiment experiment;

  public GetExperimentResponse setExperiment(Experiment experiment) {
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
    GetExperimentResponse that = (GetExperimentResponse) o;
    return Objects.equals(experiment, that.experiment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experiment);
  }

  @Override
  public String toString() {
    return new ToStringer(GetExperimentResponse.class).add("experiment", experiment).toString();
  }
}

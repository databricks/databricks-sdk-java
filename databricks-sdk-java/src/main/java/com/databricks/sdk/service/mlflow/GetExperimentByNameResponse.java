// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}

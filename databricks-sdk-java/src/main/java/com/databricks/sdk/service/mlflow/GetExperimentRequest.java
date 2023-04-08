// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

/** Get an experiment */
public class GetExperimentRequest {
  /** ID of the associated experiment. */
  @QueryParam("experiment_id")
  private String experimentId;

  public GetExperimentRequest setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }
}

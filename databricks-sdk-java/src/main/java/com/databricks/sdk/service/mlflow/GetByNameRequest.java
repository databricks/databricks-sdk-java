// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.annotation.QueryParam;

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
}

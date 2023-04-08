// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Continuous {
  /**
   * Indicate whether the continuous execution of the job is paused or not. Defaults to UNPAUSED.
   */
  @JsonProperty("pause_status")
  private ContinuousPauseStatus pauseStatus;

  public Continuous setPauseStatus(ContinuousPauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public ContinuousPauseStatus getPauseStatus() {
    return pauseStatus;
  }
}

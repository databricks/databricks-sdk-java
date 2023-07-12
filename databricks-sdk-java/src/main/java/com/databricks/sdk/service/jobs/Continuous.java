// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class Continuous {
  /**
   * Indicate whether the continuous execution of the job is paused or not.
   * Defaults to UNPAUSED.
   */
  @JsonProperty("pause_status")
  private PauseStatus pauseStatus;
  
  public Continuous setPauseStatus(PauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public PauseStatus getPauseStatus() {
    return pauseStatus;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Continuous that = (Continuous) o;
    return Objects.equals(pauseStatus, that.pauseStatus)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus);
  }

  @Override
  public String toString() {
    return new ToStringer(Continuous.class)
      .add("pauseStatus", pauseStatus).toString();
  }
}

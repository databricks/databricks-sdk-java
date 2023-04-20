// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateExperiment {
  /** ID of the associated experiment. */
  @JsonProperty("experiment_id")
  private String experimentId;

  /** If provided, the experiment's name is changed to the new name. The new name must be unique. */
  @JsonProperty("new_name")
  private String newName;

  public UpdateExperiment setExperimentId(String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  public String getExperimentId() {
    return experimentId;
  }

  public UpdateExperiment setNewName(String newName) {
    this.newName = newName;
    return this;
  }

  public String getNewName() {
    return newName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateExperiment that = (UpdateExperiment) o;
    return Objects.equals(experimentId, that.experimentId) && Objects.equals(newName, that.newName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(experimentId, newName);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateExperiment.class)
        .add("experimentId", experimentId)
        .add("newName", newName)
        .toString();
  }
}

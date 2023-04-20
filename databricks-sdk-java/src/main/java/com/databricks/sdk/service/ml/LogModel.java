// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class LogModel {
  /** MLmodel file in json format. */
  @JsonProperty("model_json")
  private String modelJson;

  /** ID of the run to log under */
  @JsonProperty("run_id")
  private String runId;

  public LogModel setModelJson(String modelJson) {
    this.modelJson = modelJson;
    return this;
  }

  public String getModelJson() {
    return modelJson;
  }

  public LogModel setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  public String getRunId() {
    return runId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogModel that = (LogModel) o;
    return Objects.equals(modelJson, that.modelJson) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelJson, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogModel.class)
        .add("modelJson", modelJson)
        .add("runId", runId)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class LogModelPb {
  @JsonProperty("model_json")
  private String modelJson;

  @JsonProperty("run_id")
  private String runId;

  public LogModelPb setModelJson(String modelJson) {
    this.modelJson = modelJson;
    return this;
  }

  public String getModelJson() {
    return modelJson;
  }

  public LogModelPb setRunId(String runId) {
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
    LogModelPb that = (LogModelPb) o;
    return Objects.equals(modelJson, that.modelJson) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelJson, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogModelPb.class)
        .add("modelJson", modelJson)
        .add("runId", runId)
        .toString();
  }
}

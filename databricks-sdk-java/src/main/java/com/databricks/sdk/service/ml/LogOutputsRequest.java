// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class LogOutputsRequest {
  /** The model outputs from the Run. */
  @JsonProperty("models")
  private Collection<ModelOutput> models;

  /** The ID of the Run from which to log outputs. */
  @JsonProperty("run_id")
  private String runId;

  public LogOutputsRequest setModels(Collection<ModelOutput> models) {
    this.models = models;
    return this;
  }

  public Collection<ModelOutput> getModels() {
    return models;
  }

  public LogOutputsRequest setRunId(String runId) {
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
    LogOutputsRequest that = (LogOutputsRequest) o;
    return Objects.equals(models, that.models) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogOutputsRequest.class)
        .add("models", models)
        .add("runId", runId)
        .toString();
  }
}

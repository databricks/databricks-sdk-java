// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LogOutputsRequestPb {
  @JsonProperty("models")
  private Collection<ModelOutput> models;

  @JsonProperty("run_id")
  private String runId;

  public LogOutputsRequestPb setModels(Collection<ModelOutput> models) {
    this.models = models;
    return this;
  }

  public Collection<ModelOutput> getModels() {
    return models;
  }

  public LogOutputsRequestPb setRunId(String runId) {
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
    LogOutputsRequestPb that = (LogOutputsRequestPb) o;
    return Objects.equals(models, that.models) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(models, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogOutputsRequestPb.class)
        .add("models", models)
        .add("runId", runId)
        .toString();
  }
}

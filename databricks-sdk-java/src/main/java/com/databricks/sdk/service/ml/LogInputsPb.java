// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class LogInputsPb {
  @JsonProperty("datasets")
  private Collection<DatasetInput> datasets;

  @JsonProperty("models")
  private Collection<ModelInput> models;

  @JsonProperty("run_id")
  private String runId;

  public LogInputsPb setDatasets(Collection<DatasetInput> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<DatasetInput> getDatasets() {
    return datasets;
  }

  public LogInputsPb setModels(Collection<ModelInput> models) {
    this.models = models;
    return this;
  }

  public Collection<ModelInput> getModels() {
    return models;
  }

  public LogInputsPb setRunId(String runId) {
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
    LogInputsPb that = (LogInputsPb) o;
    return Objects.equals(datasets, that.datasets)
        && Objects.equals(models, that.models)
        && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, models, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogInputsPb.class)
        .add("datasets", datasets)
        .add("models", models)
        .add("runId", runId)
        .toString();
  }
}

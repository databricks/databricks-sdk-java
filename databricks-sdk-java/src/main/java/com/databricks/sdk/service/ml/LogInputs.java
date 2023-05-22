// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class LogInputs {
  /** Dataset inputs */
  @JsonProperty("datasets")
  private Collection<DatasetInput> datasets;

  /** ID of the run to log under */
  @JsonProperty("run_id")
  private String runId;

  public LogInputs setDatasets(Collection<DatasetInput> datasets) {
    this.datasets = datasets;
    return this;
  }

  public Collection<DatasetInput> getDatasets() {
    return datasets;
  }

  public LogInputs setRunId(String runId) {
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
    LogInputs that = (LogInputs) o;
    return Objects.equals(datasets, that.datasets) && Objects.equals(runId, that.runId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasets, runId);
  }

  @Override
  public String toString() {
    return new ToStringer(LogInputs.class).add("datasets", datasets).add("runId", runId).toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateRunResponse {
  /** Updated metadata of the run. */
  @JsonProperty("run_info")
  private RunInfo runInfo;

  public UpdateRunResponse setRunInfo(RunInfo runInfo) {
    this.runInfo = runInfo;
    return this;
  }

  public RunInfo getRunInfo() {
    return runInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateRunResponse that = (UpdateRunResponse) o;
    return Objects.equals(runInfo, that.runInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRunResponse.class).add("runInfo", runInfo).toString();
  }
}

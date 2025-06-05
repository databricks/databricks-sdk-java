// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class UpdateRunResponsePb {
  @JsonProperty("run_info")
  private RunInfo runInfo;

  public UpdateRunResponsePb setRunInfo(RunInfo runInfo) {
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
    UpdateRunResponsePb that = (UpdateRunResponsePb) o;
    return Objects.equals(runInfo, that.runInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runInfo);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateRunResponsePb.class).add("runInfo", runInfo).toString();
  }
}

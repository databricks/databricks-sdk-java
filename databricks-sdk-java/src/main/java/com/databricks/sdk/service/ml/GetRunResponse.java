// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GetRunResponse {
  /** Run metadata (name, start time, etc) and data (metrics, params, and tags). */
  @JsonProperty("run")
  private Run run;

  public GetRunResponse setRun(Run run) {
    this.run = run;
    return this;
  }

  public Run getRun() {
    return run;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunResponse that = (GetRunResponse) o;
    return Objects.equals(run, that.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  @Override
  public String toString() {
    return new ToStringer(GetRunResponse.class).add("run", run).toString();
  }
}

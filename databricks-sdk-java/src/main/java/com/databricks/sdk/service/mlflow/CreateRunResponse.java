// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class CreateRunResponse {
  /** The newly created run. */
  @JsonProperty("run")
  private Run run;

  public CreateRunResponse setRun(Run run) {
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
    CreateRunResponse that = (CreateRunResponse) o;
    return Objects.equals(run, that.run);
  }

  @Override
  public int hashCode() {
    return Objects.hash(run);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateRunResponse.class).add("run", run).toString();
  }
}

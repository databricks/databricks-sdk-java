// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RestoreRunsResponsePb {
  @JsonProperty("runs_restored")
  private Long runsRestored;

  public RestoreRunsResponsePb setRunsRestored(Long runsRestored) {
    this.runsRestored = runsRestored;
    return this;
  }

  public Long getRunsRestored() {
    return runsRestored;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRunsResponsePb that = (RestoreRunsResponsePb) o;
    return Objects.equals(runsRestored, that.runsRestored);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runsRestored);
  }

  @Override
  public String toString() {
    return new ToStringer(RestoreRunsResponsePb.class).add("runsRestored", runsRestored).toString();
  }
}

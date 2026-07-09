// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** The storage location for an experiment's traces. */
@Generated
public class ExperimentTraceLocation {
  /** A Unity Catalog schema where the experiment's traces are stored as Delta tables. */
  @JsonProperty("uc_trace_location")
  private UcTraceLocation ucTraceLocation;

  public ExperimentTraceLocation setUcTraceLocation(UcTraceLocation ucTraceLocation) {
    this.ucTraceLocation = ucTraceLocation;
    return this;
  }

  public UcTraceLocation getUcTraceLocation() {
    return ucTraceLocation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExperimentTraceLocation that = (ExperimentTraceLocation) o;
    return Objects.equals(ucTraceLocation, that.ucTraceLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ucTraceLocation);
  }

  @Override
  public String toString() {
    return new ToStringer(ExperimentTraceLocation.class)
        .add("ucTraceLocation", ucTraceLocation)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Export and retrieve a job run */
@Generated
class ExportRunRequestPb {
  @JsonIgnore
  @QueryParam("run_id")
  private Long runId;

  @JsonIgnore
  @QueryParam("views_to_export")
  private ViewsToExport viewsToExport;

  public ExportRunRequestPb setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public ExportRunRequestPb setViewsToExport(ViewsToExport viewsToExport) {
    this.viewsToExport = viewsToExport;
    return this;
  }

  public ViewsToExport getViewsToExport() {
    return viewsToExport;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRunRequestPb that = (ExportRunRequestPb) o;
    return Objects.equals(runId, that.runId) && Objects.equals(viewsToExport, that.viewsToExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, viewsToExport);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRunRequestPb.class)
        .add("runId", runId)
        .add("viewsToExport", viewsToExport)
        .toString();
  }
}

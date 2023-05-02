// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Export and retrieve a job run */
@Generated
public class ExportRunRequest {
  /** The canonical identifier for the run. This field is required. */
  @QueryParam("run_id")
  private Long runId;

  /** Which views to export (CODE, DASHBOARDS, or ALL). Defaults to CODE. */
  @QueryParam("views_to_export")
  private ViewsToExport viewsToExport;

  public ExportRunRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public ExportRunRequest setViewsToExport(ViewsToExport viewsToExport) {
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
    ExportRunRequest that = (ExportRunRequest) o;
    return Objects.equals(runId, that.runId) && Objects.equals(viewsToExport, that.viewsToExport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runId, viewsToExport);
  }

  @Override
  public String toString() {
    return new ToStringer(ExportRunRequest.class)
        .add("runId", runId)
        .add("viewsToExport", viewsToExport)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.annotation.QueryParam;

/** Export and retrieve a job run */
public class ExportRun {
  /** The canonical identifier for the run. This field is required. */
  @QueryParam("run_id")
  private Long runId;

  /** Which views to export (CODE, DASHBOARDS, or ALL). Defaults to CODE. */
  @QueryParam("views_to_export")
  private ViewsToExport viewsToExport;

  public ExportRun setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public ExportRun setViewsToExport(ViewsToExport viewsToExport) {
    this.viewsToExport = viewsToExport;
    return this;
  }

  public ViewsToExport getViewsToExport() {
    return viewsToExport;
  }
}

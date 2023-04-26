// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Export and retrieve a job run
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExportRunRequest {
  /** The canonical identifier for the run. This field is required. */
  @QueryParam("run_id")
  private Long runId;

  /** Which views to export (CODE, DASHBOARDS, or ALL). Defaults to CODE. */
  @QueryParam("views_to_export")
  private ViewsToExport viewsToExport;

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunRequest} object
   */
  public ExportRunRequest setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getRunId() {
    return runId;
  }

  /**
   * <p>Setter for the field <code>viewsToExport</code>.</p>
   *
   * @param viewsToExport a {@link com.databricks.sdk.service.jobs.ViewsToExport} object
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunRequest} object
   */
  public ExportRunRequest setViewsToExport(ViewsToExport viewsToExport) {
    this.viewsToExport = viewsToExport;
    return this;
  }

  /**
   * <p>Getter for the field <code>viewsToExport</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.ViewsToExport} object
   */
  public ViewsToExport getViewsToExport() {
    return viewsToExport;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExportRunRequest that = (ExportRunRequest) o;
    return Objects.equals(runId, that.runId) && Objects.equals(viewsToExport, that.viewsToExport);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(runId, viewsToExport);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ExportRunRequest.class)
        .add("runId", runId)
        .add("viewsToExport", viewsToExport)
        .toString();
  }
}

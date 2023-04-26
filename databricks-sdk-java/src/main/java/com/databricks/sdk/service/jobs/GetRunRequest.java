// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Get a single job run
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class GetRunRequest {
  /** Whether to include the repair history in the response. */
  @QueryParam("include_history")
  private Boolean includeHistory;

  /**
   * The canonical identifier of the run for which to retrieve the metadata. This field is required.
   */
  @QueryParam("run_id")
  private Long runId;

  /**
   * <p>Setter for the field <code>includeHistory</code>.</p>
   *
   * @param includeHistory a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.jobs.GetRunRequest} object
   */
  public GetRunRequest setIncludeHistory(Boolean includeHistory) {
    this.includeHistory = includeHistory;
    return this;
  }

  /**
   * <p>Getter for the field <code>includeHistory</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getIncludeHistory() {
    return includeHistory;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.GetRunRequest} object
   */
  public GetRunRequest setRunId(Long runId) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetRunRequest that = (GetRunRequest) o;
    return Objects.equals(includeHistory, that.includeHistory) && Objects.equals(runId, that.runId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(includeHistory, runId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(GetRunRequest.class)
        .add("includeHistory", includeHistory)
        .add("runId", runId)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>DeleteRun class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteRun {
  /** The canonical identifier of the run for which to retrieve the metadata. */
  @JsonProperty("run_id")
  private Long runId;

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.DeleteRun} object
   */
  public DeleteRun setRunId(Long runId) {
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
    DeleteRun that = (DeleteRun) o;
    return Objects.equals(runId, that.runId);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(runId);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteRun.class).add("runId", runId).toString();
  }
}

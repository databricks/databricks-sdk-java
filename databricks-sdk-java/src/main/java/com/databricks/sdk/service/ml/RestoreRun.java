// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>RestoreRun class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class RestoreRun {
  /** ID of the run to restore. */
  @JsonProperty("run_id")
  private String runId;

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.ml.RestoreRun} object
   */
  public RestoreRun setRunId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * <p>Getter for the field <code>runId</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getRunId() {
    return runId;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RestoreRun that = (RestoreRun) o;
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
    return new ToStringer(RestoreRun.class).add("runId", runId).toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TriggerEvaluation class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TriggerEvaluation {
  /**
   * Human-readable description of the the trigger evaluation result. Explains why the trigger
   * evaluation triggered or did not trigger a run, or failed.
   */
  @JsonProperty("description")
  private String description;

  /**
   * The ID of the run that was triggered by the trigger evaluation. Only returned if a run was
   * triggered.
   */
  @JsonProperty("run_id")
  private Long runId;

  /** Timestamp at which the trigger was evaluated. */
  @JsonProperty("timestamp")
  private Long timestamp;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>runId</code>.</p>
   *
   * @param runId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation setRunId(Long runId) {
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
   * <p>Setter for the field <code>timestamp</code>.</p>
   *
   * @param timestamp a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * <p>Getter for the field <code>timestamp</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getTimestamp() {
    return timestamp;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerEvaluation that = (TriggerEvaluation) o;
    return Objects.equals(description, that.description)
        && Objects.equals(runId, that.runId)
        && Objects.equals(timestamp, that.timestamp);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, runId, timestamp);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TriggerEvaluation.class)
        .add("description", description)
        .add("runId", runId)
        .add("timestamp", timestamp)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

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

  public TriggerEvaluation setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public TriggerEvaluation setRunId(Long runId) {
    this.runId = runId;
    return this;
  }

  public Long getRunId() {
    return runId;
  }

  public TriggerEvaluation setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerEvaluation that = (TriggerEvaluation) o;
    return Objects.equals(description, that.description)
        && Objects.equals(runId, that.runId)
        && Objects.equals(timestamp, that.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, runId, timestamp);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerEvaluation.class)
        .add("description", description)
        .add("runId", runId)
        .add("timestamp", timestamp)
        .toString();
  }
}

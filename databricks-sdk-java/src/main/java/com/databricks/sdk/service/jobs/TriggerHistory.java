// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TriggerHistory {
  /** The last time the trigger failed to evaluate. */
  @JsonProperty("last_failed")
  private TriggerEvaluation lastFailed;

  /** The last time the trigger was evaluated but did not trigger a run. */
  @JsonProperty("last_not_triggered")
  private TriggerEvaluation lastNotTriggered;

  /** The last time the run was triggered due to a file arrival. */
  @JsonProperty("last_triggered")
  private TriggerEvaluation lastTriggered;

  public TriggerHistory setLastFailed(TriggerEvaluation lastFailed) {
    this.lastFailed = lastFailed;
    return this;
  }

  public TriggerEvaluation getLastFailed() {
    return lastFailed;
  }

  public TriggerHistory setLastNotTriggered(TriggerEvaluation lastNotTriggered) {
    this.lastNotTriggered = lastNotTriggered;
    return this;
  }

  public TriggerEvaluation getLastNotTriggered() {
    return lastNotTriggered;
  }

  public TriggerHistory setLastTriggered(TriggerEvaluation lastTriggered) {
    this.lastTriggered = lastTriggered;
    return this;
  }

  public TriggerEvaluation getLastTriggered() {
    return lastTriggered;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerHistory that = (TriggerHistory) o;
    return Objects.equals(lastFailed, that.lastFailed)
        && Objects.equals(lastNotTriggered, that.lastNotTriggered)
        && Objects.equals(lastTriggered, that.lastTriggered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastFailed, lastNotTriggered, lastTriggered);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerHistory.class)
        .add("lastFailed", lastFailed)
        .add("lastNotTriggered", lastNotTriggered)
        .add("lastTriggered", lastTriggered)
        .toString();
  }
}

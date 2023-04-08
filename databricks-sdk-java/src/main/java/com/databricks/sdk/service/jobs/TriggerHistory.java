// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}

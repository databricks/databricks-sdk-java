// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TriggerHistory class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>lastFailed</code>.</p>
   *
   * @param lastFailed a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerHistory} object
   */
  public TriggerHistory setLastFailed(TriggerEvaluation lastFailed) {
    this.lastFailed = lastFailed;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastFailed</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation getLastFailed() {
    return lastFailed;
  }

  /**
   * <p>Setter for the field <code>lastNotTriggered</code>.</p>
   *
   * @param lastNotTriggered a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerHistory} object
   */
  public TriggerHistory setLastNotTriggered(TriggerEvaluation lastNotTriggered) {
    this.lastNotTriggered = lastNotTriggered;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastNotTriggered</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation getLastNotTriggered() {
    return lastNotTriggered;
  }

  /**
   * <p>Setter for the field <code>lastTriggered</code>.</p>
   *
   * @param lastTriggered a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   * @return a {@link com.databricks.sdk.service.jobs.TriggerHistory} object
   */
  public TriggerHistory setLastTriggered(TriggerEvaluation lastTriggered) {
    this.lastTriggered = lastTriggered;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastTriggered</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.TriggerEvaluation} object
   */
  public TriggerEvaluation getLastTriggered() {
    return lastTriggered;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerHistory that = (TriggerHistory) o;
    return Objects.equals(lastFailed, that.lastFailed)
        && Objects.equals(lastNotTriggered, that.lastNotTriggered)
        && Objects.equals(lastTriggered, that.lastTriggered);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(lastFailed, lastNotTriggered, lastTriggered);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TriggerHistory.class)
        .add("lastFailed", lastFailed)
        .add("lastNotTriggered", lastNotTriggered)
        .add("lastTriggered", lastTriggered)
        .toString();
  }
}

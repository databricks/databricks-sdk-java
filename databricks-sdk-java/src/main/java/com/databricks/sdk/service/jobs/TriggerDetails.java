// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Per-trigger runtime details returned by `GetJob`. Same length and order as
 * `JobSettings.triggers`; sub-fields are populated independently based on the corresponding
 * `GetJob.include_trigger_state` / `include_trigger_history` flags.
 */
@Generated
public class TriggerDetails {
  /** Recent evaluation history. Populated when `GetJob.include_trigger_history` is set. */
  @JsonProperty("history")
  private TriggerHistory history;

  /** Current runtime state. Populated when `GetJob.include_trigger_state` is set. */
  @JsonProperty("state")
  private PerTriggerState state;

  public TriggerDetails setHistory(TriggerHistory history) {
    this.history = history;
    return this;
  }

  public TriggerHistory getHistory() {
    return history;
  }

  public TriggerDetails setState(PerTriggerState state) {
    this.state = state;
    return this;
  }

  public PerTriggerState getState() {
    return state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TriggerDetails that = (TriggerDetails) o;
    return Objects.equals(history, that.history) && Objects.equals(state, that.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(history, state);
  }

  @Override
  public String toString() {
    return new ToStringer(TriggerDetails.class)
        .add("history", history)
        .add("state", state)
        .toString();
  }
}

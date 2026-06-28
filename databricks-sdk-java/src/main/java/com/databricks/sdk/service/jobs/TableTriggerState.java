// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TableTriggerState {
  /** */
  @JsonProperty("last_seen_table_states")
  private Collection<TableState> lastSeenTableStates;

  /** Indicates whether the trigger is using scalable monitoring. */
  @JsonProperty("using_scalable_monitoring")
  private Boolean usingScalableMonitoring;

  public TableTriggerState setLastSeenTableStates(Collection<TableState> lastSeenTableStates) {
    this.lastSeenTableStates = lastSeenTableStates;
    return this;
  }

  public Collection<TableState> getLastSeenTableStates() {
    return lastSeenTableStates;
  }

  public TableTriggerState setUsingScalableMonitoring(Boolean usingScalableMonitoring) {
    this.usingScalableMonitoring = usingScalableMonitoring;
    return this;
  }

  public Boolean getUsingScalableMonitoring() {
    return usingScalableMonitoring;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableTriggerState that = (TableTriggerState) o;
    return Objects.equals(lastSeenTableStates, that.lastSeenTableStates)
        && Objects.equals(usingScalableMonitoring, that.usingScalableMonitoring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSeenTableStates, usingScalableMonitoring);
  }

  @Override
  public String toString() {
    return new ToStringer(TableTriggerState.class)
        .add("lastSeenTableStates", lastSeenTableStates)
        .add("usingScalableMonitoring", usingScalableMonitoring)
        .toString();
  }
}

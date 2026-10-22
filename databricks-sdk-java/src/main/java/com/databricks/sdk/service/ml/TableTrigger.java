// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Duration;
import java.util.Objects;

/**
 * A trigger that fires when the feature's source table changes: a DeltaTableSource's table, or an
 * SdpSource's input_tables.
 */
@Generated
public class TableTrigger {
  /**
   * Which source table updates trigger a materialization run. If not set, any source table update
   * triggers a run.
   */
  @JsonProperty("condition")
  private TableTriggerTableTriggerCondition condition;

  /**
   * The minimum time between two triggered runs, so a frequently updated source table does not
   * trigger runs too often. If not set, a feature with a sliding window uses half its
   * slide_duration and a feature with a tumbling window uses half its window_duration, clamped to
   * between 5 minutes and 1 hour. Other features have no minimum.
   */
  @JsonProperty("min_time_between_triggers")
  private Duration minTimeBetweenTriggers;

  /**
   * How long the source table must go without updates before a run starts, so a series of updates
   * settles before the run. If not set, a run starts as soon as the source table updates.
   */
  @JsonProperty("wait_after_last_change")
  private Duration waitAfterLastChange;

  public TableTrigger setCondition(TableTriggerTableTriggerCondition condition) {
    this.condition = condition;
    return this;
  }

  public TableTriggerTableTriggerCondition getCondition() {
    return condition;
  }

  public TableTrigger setMinTimeBetweenTriggers(Duration minTimeBetweenTriggers) {
    this.minTimeBetweenTriggers = minTimeBetweenTriggers;
    return this;
  }

  public Duration getMinTimeBetweenTriggers() {
    return minTimeBetweenTriggers;
  }

  public TableTrigger setWaitAfterLastChange(Duration waitAfterLastChange) {
    this.waitAfterLastChange = waitAfterLastChange;
    return this;
  }

  public Duration getWaitAfterLastChange() {
    return waitAfterLastChange;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableTrigger that = (TableTrigger) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(minTimeBetweenTriggers, that.minTimeBetweenTriggers)
        && Objects.equals(waitAfterLastChange, that.waitAfterLastChange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, minTimeBetweenTriggers, waitAfterLastChange);
  }

  @Override
  public String toString() {
    return new ToStringer(TableTrigger.class)
        .add("condition", condition)
        .add("minTimeBetweenTriggers", minTimeBetweenTriggers)
        .add("waitAfterLastChange", waitAfterLastChange)
        .toString();
  }
}

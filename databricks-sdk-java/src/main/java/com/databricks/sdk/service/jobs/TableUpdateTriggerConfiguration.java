// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class TableUpdateTriggerConfiguration {
  /** The table(s) condition based on which to trigger a job run. */
  @JsonProperty("condition")
  private Condition condition;

  /**
   * If set, the trigger starts a run only after the specified amount of time has passed since the
   * last time the trigger fired. The minimum allowed value is 60 seconds.
   */
  @JsonProperty("min_time_between_triggers_seconds")
  private Long minTimeBetweenTriggersSeconds;

  /**
   * A list of Delta tables to monitor for changes. The table name must be in the format
   * `catalog_name.schema_name.table_name`.
   */
  @JsonProperty("table_names")
  private Collection<String> tableNames;

  /**
   * If set, the trigger starts a run only after no table updates have occurred for the specified
   * time and can be used to wait for a series of table updates before triggering a run. The minimum
   * allowed value is 60 seconds.
   */
  @JsonProperty("wait_after_last_change_seconds")
  private Long waitAfterLastChangeSeconds;

  public TableUpdateTriggerConfiguration setCondition(Condition condition) {
    this.condition = condition;
    return this;
  }

  public Condition getCondition() {
    return condition;
  }

  public TableUpdateTriggerConfiguration setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public TableUpdateTriggerConfiguration setTableNames(Collection<String> tableNames) {
    this.tableNames = tableNames;
    return this;
  }

  public Collection<String> getTableNames() {
    return tableNames;
  }

  public TableUpdateTriggerConfiguration setWaitAfterLastChangeSeconds(
      Long waitAfterLastChangeSeconds) {
    this.waitAfterLastChangeSeconds = waitAfterLastChangeSeconds;
    return this;
  }

  public Long getWaitAfterLastChangeSeconds() {
    return waitAfterLastChangeSeconds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TableUpdateTriggerConfiguration that = (TableUpdateTriggerConfiguration) o;
    return Objects.equals(condition, that.condition)
        && Objects.equals(minTimeBetweenTriggersSeconds, that.minTimeBetweenTriggersSeconds)
        && Objects.equals(tableNames, that.tableNames)
        && Objects.equals(waitAfterLastChangeSeconds, that.waitAfterLastChangeSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        condition, minTimeBetweenTriggersSeconds, tableNames, waitAfterLastChangeSeconds);
  }

  @Override
  public String toString() {
    return new ToStringer(TableUpdateTriggerConfiguration.class)
        .add("condition", condition)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("tableNames", tableNames)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }
}

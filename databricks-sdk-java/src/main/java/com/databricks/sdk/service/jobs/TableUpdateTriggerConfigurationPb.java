// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TableUpdateTriggerConfigurationPb {
  @JsonProperty("condition")
  private Condition condition;

  @JsonProperty("min_time_between_triggers_seconds")
  private Long minTimeBetweenTriggersSeconds;

  @JsonProperty("table_names")
  private Collection<String> tableNames;

  @JsonProperty("wait_after_last_change_seconds")
  private Long waitAfterLastChangeSeconds;

  public TableUpdateTriggerConfigurationPb setCondition(Condition condition) {
    this.condition = condition;
    return this;
  }

  public Condition getCondition() {
    return condition;
  }

  public TableUpdateTriggerConfigurationPb setMinTimeBetweenTriggersSeconds(
      Long minTimeBetweenTriggersSeconds) {
    this.minTimeBetweenTriggersSeconds = minTimeBetweenTriggersSeconds;
    return this;
  }

  public Long getMinTimeBetweenTriggersSeconds() {
    return minTimeBetweenTriggersSeconds;
  }

  public TableUpdateTriggerConfigurationPb setTableNames(Collection<String> tableNames) {
    this.tableNames = tableNames;
    return this;
  }

  public Collection<String> getTableNames() {
    return tableNames;
  }

  public TableUpdateTriggerConfigurationPb setWaitAfterLastChangeSeconds(
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
    TableUpdateTriggerConfigurationPb that = (TableUpdateTriggerConfigurationPb) o;
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
    return new ToStringer(TableUpdateTriggerConfigurationPb.class)
        .add("condition", condition)
        .add("minTimeBetweenTriggersSeconds", minTimeBetweenTriggersSeconds)
        .add("tableNames", tableNames)
        .add("waitAfterLastChangeSeconds", waitAfterLastChangeSeconds)
        .toString();
  }
}

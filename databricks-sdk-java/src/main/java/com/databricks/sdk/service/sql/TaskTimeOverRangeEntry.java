// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class TaskTimeOverRangeEntry {
  /**
   * total task completion time in this time range, aggregated over all stages and jobs in the query
   */
  @JsonProperty("task_completed_time_ms")
  private Long taskCompletedTimeMs;

  public TaskTimeOverRangeEntry setTaskCompletedTimeMs(Long taskCompletedTimeMs) {
    this.taskCompletedTimeMs = taskCompletedTimeMs;
    return this;
  }

  public Long getTaskCompletedTimeMs() {
    return taskCompletedTimeMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskTimeOverRangeEntry that = (TaskTimeOverRangeEntry) o;
    return Objects.equals(taskCompletedTimeMs, that.taskCompletedTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskCompletedTimeMs);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskTimeOverRangeEntry.class)
        .add("taskCompletedTimeMs", taskCompletedTimeMs)
        .toString();
  }
}

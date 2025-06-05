// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TaskTimeOverRangeEntryPb {
  @JsonProperty("task_completed_time_ms")
  private Long taskCompletedTimeMs;

  public TaskTimeOverRangeEntryPb setTaskCompletedTimeMs(Long taskCompletedTimeMs) {
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
    TaskTimeOverRangeEntryPb that = (TaskTimeOverRangeEntryPb) o;
    return Objects.equals(taskCompletedTimeMs, that.taskCompletedTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskCompletedTimeMs);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskTimeOverRangeEntryPb.class)
        .add("taskCompletedTimeMs", taskCompletedTimeMs)
        .toString();
  }
}

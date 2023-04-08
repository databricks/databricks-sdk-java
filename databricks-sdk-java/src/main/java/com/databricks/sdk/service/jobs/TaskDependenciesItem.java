// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class TaskDependenciesItem {
  /** */
  @JsonProperty("task_key")
  private String taskKey;

  public TaskDependenciesItem setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  public String getTaskKey() {
    return taskKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskDependenciesItem that = (TaskDependenciesItem) o;
    return Objects.equals(taskKey, that.taskKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskKey);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskDependenciesItem.class).add("taskKey", taskKey).toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TaskDependencyPb {
  @JsonProperty("outcome")
  private String outcome;

  @JsonProperty("task_key")
  private String taskKey;

  public TaskDependencyPb setOutcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  public String getOutcome() {
    return outcome;
  }

  public TaskDependencyPb setTaskKey(String taskKey) {
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
    TaskDependencyPb that = (TaskDependencyPb) o;
    return Objects.equals(outcome, that.outcome) && Objects.equals(taskKey, that.taskKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, taskKey);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskDependencyPb.class)
        .add("outcome", outcome)
        .add("taskKey", taskKey)
        .toString();
  }
}

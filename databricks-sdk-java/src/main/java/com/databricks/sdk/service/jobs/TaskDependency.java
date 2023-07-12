// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class TaskDependency {
  /**
   * Can only be specified on condition task dependencies. The outcome of the
   * dependent task that must be met for this task to run.
   */
  @JsonProperty("outcome")
  private String outcome;
  
  /**
   * The name of the task this task depends on.
   */
  @JsonProperty("task_key")
  private String taskKey;
  
  public TaskDependency setOutcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  public String getOutcome() {
    return outcome;
  }
  
  public TaskDependency setTaskKey(String taskKey) {
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
    TaskDependency that = (TaskDependency) o;
    return Objects.equals(outcome, that.outcome)
    && Objects.equals(taskKey, that.taskKey)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, taskKey);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskDependency.class)
      .add("outcome", outcome)
      .add("taskKey", taskKey).toString();
  }
}

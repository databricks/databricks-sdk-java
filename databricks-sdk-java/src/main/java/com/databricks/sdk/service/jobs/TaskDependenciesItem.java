// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>TaskDependenciesItem class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class TaskDependenciesItem {
  /** */
  @JsonProperty("task_key")
  private String taskKey;

  /**
   * <p>Setter for the field <code>taskKey</code>.</p>
   *
   * @param taskKey a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.jobs.TaskDependenciesItem} object
   */
  public TaskDependenciesItem setTaskKey(String taskKey) {
    this.taskKey = taskKey;
    return this;
  }

  /**
   * <p>Getter for the field <code>taskKey</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getTaskKey() {
    return taskKey;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskDependenciesItem that = (TaskDependenciesItem) o;
    return Objects.equals(taskKey, that.taskKey);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(taskKey);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(TaskDependenciesItem.class).add("taskKey", taskKey).toString();
  }
}

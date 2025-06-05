// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class ForEachStatsPb {
  @JsonProperty("error_message_stats")
  private Collection<ForEachTaskErrorMessageStats> errorMessageStats;

  @JsonProperty("task_run_stats")
  private ForEachTaskTaskRunStats taskRunStats;

  public ForEachStatsPb setErrorMessageStats(
      Collection<ForEachTaskErrorMessageStats> errorMessageStats) {
    this.errorMessageStats = errorMessageStats;
    return this;
  }

  public Collection<ForEachTaskErrorMessageStats> getErrorMessageStats() {
    return errorMessageStats;
  }

  public ForEachStatsPb setTaskRunStats(ForEachTaskTaskRunStats taskRunStats) {
    this.taskRunStats = taskRunStats;
    return this;
  }

  public ForEachTaskTaskRunStats getTaskRunStats() {
    return taskRunStats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForEachStatsPb that = (ForEachStatsPb) o;
    return Objects.equals(errorMessageStats, that.errorMessageStats)
        && Objects.equals(taskRunStats, that.taskRunStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessageStats, taskRunStats);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachStatsPb.class)
        .add("errorMessageStats", errorMessageStats)
        .add("taskRunStats", taskRunStats)
        .toString();
  }
}

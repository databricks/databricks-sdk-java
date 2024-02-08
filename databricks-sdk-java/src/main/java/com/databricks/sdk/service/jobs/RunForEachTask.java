// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class RunForEachTask {
  /** Controls the number of active iterations task runs. Default is 100 (maximal value). */
  @JsonProperty("concurrency")
  private Long concurrency;

  /**
   * Array for task to iterate on. This can be a JSON string or a reference to an array parameter.
   */
  @JsonProperty("inputs")
  private String inputs;

  /** */
  @JsonProperty("stats")
  private ForEachStats stats;

  /** */
  @JsonProperty("task")
  private Task task;

  public RunForEachTask setConcurrency(Long concurrency) {
    this.concurrency = concurrency;
    return this;
  }

  public Long getConcurrency() {
    return concurrency;
  }

  public RunForEachTask setInputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

  public String getInputs() {
    return inputs;
  }

  public RunForEachTask setStats(ForEachStats stats) {
    this.stats = stats;
    return this;
  }

  public ForEachStats getStats() {
    return stats;
  }

  public RunForEachTask setTask(Task task) {
    this.task = task;
    return this;
  }

  public Task getTask() {
    return task;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunForEachTask that = (RunForEachTask) o;
    return Objects.equals(concurrency, that.concurrency)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(stats, that.stats)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrency, inputs, stats, task);
  }

  @Override
  public String toString() {
    return new ToStringer(RunForEachTask.class)
        .add("concurrency", concurrency)
        .add("inputs", inputs)
        .add("stats", stats)
        .add("task", task)
        .toString();
  }
}

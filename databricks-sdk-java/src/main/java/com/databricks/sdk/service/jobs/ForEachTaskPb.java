// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ForEachTaskPb {
  @JsonProperty("concurrency")
  private Long concurrency;

  @JsonProperty("inputs")
  private String inputs;

  @JsonProperty("task")
  private Task task;

  public ForEachTaskPb setConcurrency(Long concurrency) {
    this.concurrency = concurrency;
    return this;
  }

  public Long getConcurrency() {
    return concurrency;
  }

  public ForEachTaskPb setInputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

  public String getInputs() {
    return inputs;
  }

  public ForEachTaskPb setTask(Task task) {
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
    ForEachTaskPb that = (ForEachTaskPb) o;
    return Objects.equals(concurrency, that.concurrency)
        && Objects.equals(inputs, that.inputs)
        && Objects.equals(task, that.task);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrency, inputs, task);
  }

  @Override
  public String toString() {
    return new ToStringer(ForEachTaskPb.class)
        .add("concurrency", concurrency)
        .add("inputs", inputs)
        .add("task", task)
        .toString();
  }
}

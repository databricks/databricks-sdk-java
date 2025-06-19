// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = TaskDependency.TaskDependencySerializer.class)
@JsonDeserialize(using = TaskDependency.TaskDependencyDeserializer.class)
public class TaskDependency {
  /**
   * Can only be specified on condition task dependencies. The outcome of the dependent task that
   * must be met for this task to run.
   */
  private String outcome;

  /** The name of the task this task depends on. */
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
    return Objects.equals(outcome, that.outcome) && Objects.equals(taskKey, that.taskKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcome, taskKey);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskDependency.class)
        .add("outcome", outcome)
        .add("taskKey", taskKey)
        .toString();
  }

  TaskDependencyPb toPb() {
    TaskDependencyPb pb = new TaskDependencyPb();
    pb.setOutcome(outcome);
    pb.setTaskKey(taskKey);

    return pb;
  }

  static TaskDependency fromPb(TaskDependencyPb pb) {
    TaskDependency model = new TaskDependency();
    model.setOutcome(pb.getOutcome());
    model.setTaskKey(pb.getTaskKey());

    return model;
  }

  public static class TaskDependencySerializer extends JsonSerializer<TaskDependency> {
    @Override
    public void serialize(TaskDependency value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TaskDependencyPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TaskDependencyDeserializer extends JsonDeserializer<TaskDependency> {
    @Override
    public TaskDependency deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TaskDependencyPb pb = mapper.readValue(p, TaskDependencyPb.class);
      return TaskDependency.fromPb(pb);
    }
  }
}

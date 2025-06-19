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
@JsonSerialize(using = ForEachTask.ForEachTaskSerializer.class)
@JsonDeserialize(using = ForEachTask.ForEachTaskDeserializer.class)
public class ForEachTask {
  /**
   * An optional maximum allowed number of concurrent runs of the task. Set this value if you want
   * to be able to execute multiple runs of the task concurrently.
   */
  private Long concurrency;

  /**
   * Array for task to iterate on. This can be a JSON string or a reference to an array parameter.
   */
  private String inputs;

  /** Configuration for the task that will be run for each element in the array */
  private Task task;

  public ForEachTask setConcurrency(Long concurrency) {
    this.concurrency = concurrency;
    return this;
  }

  public Long getConcurrency() {
    return concurrency;
  }

  public ForEachTask setInputs(String inputs) {
    this.inputs = inputs;
    return this;
  }

  public String getInputs() {
    return inputs;
  }

  public ForEachTask setTask(Task task) {
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
    ForEachTask that = (ForEachTask) o;
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
    return new ToStringer(ForEachTask.class)
        .add("concurrency", concurrency)
        .add("inputs", inputs)
        .add("task", task)
        .toString();
  }

  ForEachTaskPb toPb() {
    ForEachTaskPb pb = new ForEachTaskPb();
    pb.setConcurrency(concurrency);
    pb.setInputs(inputs);
    pb.setTask(task);

    return pb;
  }

  static ForEachTask fromPb(ForEachTaskPb pb) {
    ForEachTask model = new ForEachTask();
    model.setConcurrency(pb.getConcurrency());
    model.setInputs(pb.getInputs());
    model.setTask(pb.getTask());

    return model;
  }

  public static class ForEachTaskSerializer extends JsonSerializer<ForEachTask> {
    @Override
    public void serialize(ForEachTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ForEachTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ForEachTaskDeserializer extends JsonDeserializer<ForEachTask> {
    @Override
    public ForEachTask deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ForEachTaskPb pb = mapper.readValue(p, ForEachTaskPb.class);
      return ForEachTask.fromPb(pb);
    }
  }
}

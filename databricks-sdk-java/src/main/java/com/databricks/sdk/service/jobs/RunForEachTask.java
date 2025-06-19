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
@JsonSerialize(using = RunForEachTask.RunForEachTaskSerializer.class)
@JsonDeserialize(using = RunForEachTask.RunForEachTaskDeserializer.class)
public class RunForEachTask {
  /**
   * An optional maximum allowed number of concurrent runs of the task. Set this value if you want
   * to be able to execute multiple runs of the task concurrently.
   */
  private Long concurrency;

  /**
   * Array for task to iterate on. This can be a JSON string or a reference to an array parameter.
   */
  private String inputs;

  /**
   * Read only field. Populated for GetRun and ListRuns RPC calls and stores the execution stats of
   * an For each task
   */
  private ForEachStats stats;

  /** Configuration for the task that will be run for each element in the array */
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

  RunForEachTaskPb toPb() {
    RunForEachTaskPb pb = new RunForEachTaskPb();
    pb.setConcurrency(concurrency);
    pb.setInputs(inputs);
    pb.setStats(stats);
    pb.setTask(task);

    return pb;
  }

  static RunForEachTask fromPb(RunForEachTaskPb pb) {
    RunForEachTask model = new RunForEachTask();
    model.setConcurrency(pb.getConcurrency());
    model.setInputs(pb.getInputs());
    model.setStats(pb.getStats());
    model.setTask(pb.getTask());

    return model;
  }

  public static class RunForEachTaskSerializer extends JsonSerializer<RunForEachTask> {
    @Override
    public void serialize(RunForEachTask value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RunForEachTaskPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RunForEachTaskDeserializer extends JsonDeserializer<RunForEachTask> {
    @Override
    public RunForEachTask deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RunForEachTaskPb pb = mapper.readValue(p, RunForEachTaskPb.class);
      return RunForEachTask.fromPb(pb);
    }
  }
}

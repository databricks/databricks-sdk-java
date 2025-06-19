// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = TaskTimeOverRangeEntry.TaskTimeOverRangeEntrySerializer.class)
@JsonDeserialize(using = TaskTimeOverRangeEntry.TaskTimeOverRangeEntryDeserializer.class)
public class TaskTimeOverRangeEntry {
  /**
   * total task completion time in this time range, aggregated over all stages and jobs in the query
   */
  private Long taskCompletedTimeMs;

  public TaskTimeOverRangeEntry setTaskCompletedTimeMs(Long taskCompletedTimeMs) {
    this.taskCompletedTimeMs = taskCompletedTimeMs;
    return this;
  }

  public Long getTaskCompletedTimeMs() {
    return taskCompletedTimeMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskTimeOverRangeEntry that = (TaskTimeOverRangeEntry) o;
    return Objects.equals(taskCompletedTimeMs, that.taskCompletedTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskCompletedTimeMs);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskTimeOverRangeEntry.class)
        .add("taskCompletedTimeMs", taskCompletedTimeMs)
        .toString();
  }

  TaskTimeOverRangeEntryPb toPb() {
    TaskTimeOverRangeEntryPb pb = new TaskTimeOverRangeEntryPb();
    pb.setTaskCompletedTimeMs(taskCompletedTimeMs);

    return pb;
  }

  static TaskTimeOverRangeEntry fromPb(TaskTimeOverRangeEntryPb pb) {
    TaskTimeOverRangeEntry model = new TaskTimeOverRangeEntry();
    model.setTaskCompletedTimeMs(pb.getTaskCompletedTimeMs());

    return model;
  }

  public static class TaskTimeOverRangeEntrySerializer
      extends JsonSerializer<TaskTimeOverRangeEntry> {
    @Override
    public void serialize(
        TaskTimeOverRangeEntry value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TaskTimeOverRangeEntryPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TaskTimeOverRangeEntryDeserializer
      extends JsonDeserializer<TaskTimeOverRangeEntry> {
    @Override
    public TaskTimeOverRangeEntry deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TaskTimeOverRangeEntryPb pb = mapper.readValue(p, TaskTimeOverRangeEntryPb.class);
      return TaskTimeOverRangeEntry.fromPb(pb);
    }
  }
}

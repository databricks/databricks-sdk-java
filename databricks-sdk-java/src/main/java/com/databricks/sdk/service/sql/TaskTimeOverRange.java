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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = TaskTimeOverRange.TaskTimeOverRangeSerializer.class)
@JsonDeserialize(using = TaskTimeOverRange.TaskTimeOverRangeDeserializer.class)
public class TaskTimeOverRange {
  /** */
  private Collection<TaskTimeOverRangeEntry> entries;

  /**
   * interval length for all entries (difference in start time and end time of an entry range) the
   * same for all entries start time of first interval is query_start_time_ms
   */
  private Long interval;

  public TaskTimeOverRange setEntries(Collection<TaskTimeOverRangeEntry> entries) {
    this.entries = entries;
    return this;
  }

  public Collection<TaskTimeOverRangeEntry> getEntries() {
    return entries;
  }

  public TaskTimeOverRange setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TaskTimeOverRange that = (TaskTimeOverRange) o;
    return Objects.equals(entries, that.entries) && Objects.equals(interval, that.interval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, interval);
  }

  @Override
  public String toString() {
    return new ToStringer(TaskTimeOverRange.class)
        .add("entries", entries)
        .add("interval", interval)
        .toString();
  }

  TaskTimeOverRangePb toPb() {
    TaskTimeOverRangePb pb = new TaskTimeOverRangePb();
    pb.setEntries(entries);
    pb.setInterval(interval);

    return pb;
  }

  static TaskTimeOverRange fromPb(TaskTimeOverRangePb pb) {
    TaskTimeOverRange model = new TaskTimeOverRange();
    model.setEntries(pb.getEntries());
    model.setInterval(pb.getInterval());

    return model;
  }

  public static class TaskTimeOverRangeSerializer extends JsonSerializer<TaskTimeOverRange> {
    @Override
    public void serialize(TaskTimeOverRange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TaskTimeOverRangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TaskTimeOverRangeDeserializer extends JsonDeserializer<TaskTimeOverRange> {
    @Override
    public TaskTimeOverRange deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TaskTimeOverRangePb pb = mapper.readValue(p, TaskTimeOverRangePb.class);
      return TaskTimeOverRange.fromPb(pb);
    }
  }
}

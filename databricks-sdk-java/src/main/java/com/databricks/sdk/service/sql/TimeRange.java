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
@JsonSerialize(using = TimeRange.TimeRangeSerializer.class)
@JsonDeserialize(using = TimeRange.TimeRangeDeserializer.class)
public class TimeRange {
  /** The end time in milliseconds. */
  private Long endTimeMs;

  /** The start time in milliseconds. */
  private Long startTimeMs;

  public TimeRange setEndTimeMs(Long endTimeMs) {
    this.endTimeMs = endTimeMs;
    return this;
  }

  public Long getEndTimeMs() {
    return endTimeMs;
  }

  public TimeRange setStartTimeMs(Long startTimeMs) {
    this.startTimeMs = startTimeMs;
    return this;
  }

  public Long getStartTimeMs() {
    return startTimeMs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TimeRange that = (TimeRange) o;
    return Objects.equals(endTimeMs, that.endTimeMs)
        && Objects.equals(startTimeMs, that.startTimeMs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTimeMs, startTimeMs);
  }

  @Override
  public String toString() {
    return new ToStringer(TimeRange.class)
        .add("endTimeMs", endTimeMs)
        .add("startTimeMs", startTimeMs)
        .toString();
  }

  TimeRangePb toPb() {
    TimeRangePb pb = new TimeRangePb();
    pb.setEndTimeMs(endTimeMs);
    pb.setStartTimeMs(startTimeMs);

    return pb;
  }

  static TimeRange fromPb(TimeRangePb pb) {
    TimeRange model = new TimeRange();
    model.setEndTimeMs(pb.getEndTimeMs());
    model.setStartTimeMs(pb.getStartTimeMs());

    return model;
  }

  public static class TimeRangeSerializer extends JsonSerializer<TimeRange> {
    @Override
    public void serialize(TimeRange value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TimeRangePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TimeRangeDeserializer extends JsonDeserializer<TimeRange> {
    @Override
    public TimeRange deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TimeRangePb pb = mapper.readValue(p, TimeRangePb.class);
      return TimeRange.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = MonitorCronSchedule.MonitorCronScheduleSerializer.class)
@JsonDeserialize(using = MonitorCronSchedule.MonitorCronScheduleDeserializer.class)
public class MonitorCronSchedule {
  /** Read only field that indicates whether a schedule is paused or not. */
  private MonitorCronSchedulePauseStatus pauseStatus;

  /**
   * The expression that determines when to run the monitor. See [examples].
   *
   * <p>[examples]:
   * https://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  private String quartzCronExpression;

  /** The timezone id (e.g., ``"PST"``) in which to evaluate the quartz expression. */
  private String timezoneId;

  public MonitorCronSchedule setPauseStatus(MonitorCronSchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public MonitorCronSchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public MonitorCronSchedule setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
  }

  public String getQuartzCronExpression() {
    return quartzCronExpression;
  }

  public MonitorCronSchedule setTimezoneId(String timezoneId) {
    this.timezoneId = timezoneId;
    return this;
  }

  public String getTimezoneId() {
    return timezoneId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorCronSchedule that = (MonitorCronSchedule) o;
    return Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(quartzCronExpression, that.quartzCronExpression)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus, quartzCronExpression, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorCronSchedule.class)
        .add("pauseStatus", pauseStatus)
        .add("quartzCronExpression", quartzCronExpression)
        .add("timezoneId", timezoneId)
        .toString();
  }

  MonitorCronSchedulePb toPb() {
    MonitorCronSchedulePb pb = new MonitorCronSchedulePb();
    pb.setPauseStatus(pauseStatus);
    pb.setQuartzCronExpression(quartzCronExpression);
    pb.setTimezoneId(timezoneId);

    return pb;
  }

  static MonitorCronSchedule fromPb(MonitorCronSchedulePb pb) {
    MonitorCronSchedule model = new MonitorCronSchedule();
    model.setPauseStatus(pb.getPauseStatus());
    model.setQuartzCronExpression(pb.getQuartzCronExpression());
    model.setTimezoneId(pb.getTimezoneId());

    return model;
  }

  public static class MonitorCronScheduleSerializer extends JsonSerializer<MonitorCronSchedule> {
    @Override
    public void serialize(MonitorCronSchedule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorCronSchedulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorCronScheduleDeserializer
      extends JsonDeserializer<MonitorCronSchedule> {
    @Override
    public MonitorCronSchedule deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorCronSchedulePb pb = mapper.readValue(p, MonitorCronSchedulePb.class);
      return MonitorCronSchedule.fromPb(pb);
    }
  }
}

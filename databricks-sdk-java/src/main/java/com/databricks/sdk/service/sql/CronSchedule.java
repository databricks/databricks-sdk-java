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
@JsonSerialize(using = CronSchedule.CronScheduleSerializer.class)
@JsonDeserialize(using = CronSchedule.CronScheduleDeserializer.class)
public class CronSchedule {
  /** Indicate whether this schedule is paused or not. */
  private SchedulePauseStatus pauseStatus;

  /**
   * A cron expression using quartz syntax that specifies the schedule for this pipeline. Should use
   * the quartz format described here:
   * http://www.quartz-scheduler.org/documentation/quartz-2.1.7/tutorials/tutorial-lesson-06.html
   */
  private String quartzCronSchedule;

  /**
   * A Java timezone id. The schedule will be resolved using this timezone. This will be combined
   * with the quartz_cron_schedule to determine the schedule. See
   * https://docs.databricks.com/sql/language-manual/sql-ref-syntax-aux-conf-mgmt-set-timezone.html
   * for details.
   */
  private String timezoneId;

  public CronSchedule setPauseStatus(SchedulePauseStatus pauseStatus) {
    this.pauseStatus = pauseStatus;
    return this;
  }

  public SchedulePauseStatus getPauseStatus() {
    return pauseStatus;
  }

  public CronSchedule setQuartzCronSchedule(String quartzCronSchedule) {
    this.quartzCronSchedule = quartzCronSchedule;
    return this;
  }

  public String getQuartzCronSchedule() {
    return quartzCronSchedule;
  }

  public CronSchedule setTimezoneId(String timezoneId) {
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
    CronSchedule that = (CronSchedule) o;
    return Objects.equals(pauseStatus, that.pauseStatus)
        && Objects.equals(quartzCronSchedule, that.quartzCronSchedule)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pauseStatus, quartzCronSchedule, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("pauseStatus", pauseStatus)
        .add("quartzCronSchedule", quartzCronSchedule)
        .add("timezoneId", timezoneId)
        .toString();
  }

  CronSchedulePb toPb() {
    CronSchedulePb pb = new CronSchedulePb();
    pb.setPauseStatus(pauseStatus);
    pb.setQuartzCronSchedule(quartzCronSchedule);
    pb.setTimezoneId(timezoneId);

    return pb;
  }

  static CronSchedule fromPb(CronSchedulePb pb) {
    CronSchedule model = new CronSchedule();
    model.setPauseStatus(pb.getPauseStatus());
    model.setQuartzCronSchedule(pb.getQuartzCronSchedule());
    model.setTimezoneId(pb.getTimezoneId());

    return model;
  }

  public static class CronScheduleSerializer extends JsonSerializer<CronSchedule> {
    @Override
    public void serialize(CronSchedule value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CronSchedulePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CronScheduleDeserializer extends JsonDeserializer<CronSchedule> {
    @Override
    public CronSchedule deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CronSchedulePb pb = mapper.readValue(p, CronSchedulePb.class);
      return CronSchedule.fromPb(pb);
    }
  }
}

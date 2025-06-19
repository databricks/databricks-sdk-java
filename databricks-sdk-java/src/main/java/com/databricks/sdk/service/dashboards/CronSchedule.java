// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
  /**
   * A cron expression using quartz syntax. EX: `0 0 8 * * ?` represents everyday at 8am. See [Cron
   * Trigger] for details.
   *
   * <p>[Cron Trigger]:
   * http://www.quartz-scheduler.org/documentation/quartz-2.3.0/tutorials/crontrigger.html
   */
  private String quartzCronExpression;

  /**
   * A Java timezone id. The schedule will be resolved with respect to this timezone. See [Java
   * TimeZone] for details.
   *
   * <p>[Java TimeZone]: https://docs.oracle.com/javase/7/docs/api/java/util/TimeZone.html
   */
  private String timezoneId;

  public CronSchedule setQuartzCronExpression(String quartzCronExpression) {
    this.quartzCronExpression = quartzCronExpression;
    return this;
  }

  public String getQuartzCronExpression() {
    return quartzCronExpression;
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
    return Objects.equals(quartzCronExpression, that.quartzCronExpression)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quartzCronExpression, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronSchedule.class)
        .add("quartzCronExpression", quartzCronExpression)
        .add("timezoneId", timezoneId)
        .toString();
  }

  CronSchedulePb toPb() {
    CronSchedulePb pb = new CronSchedulePb();
    pb.setQuartzCronExpression(quartzCronExpression);
    pb.setTimezoneId(timezoneId);

    return pb;
  }

  static CronSchedule fromPb(CronSchedulePb pb) {
    CronSchedule model = new CronSchedule();
    model.setQuartzCronExpression(pb.getQuartzCronExpression());
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
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CronSchedulePb pb = mapper.readValue(p, CronSchedulePb.class);
      return CronSchedule.fromPb(pb);
    }
  }
}

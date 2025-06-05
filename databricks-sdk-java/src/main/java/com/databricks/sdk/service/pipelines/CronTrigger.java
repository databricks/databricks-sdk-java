// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = CronTrigger.CronTriggerSerializer.class)
@JsonDeserialize(using = CronTrigger.CronTriggerDeserializer.class)
public class CronTrigger {
  /** */
  private String quartzCronSchedule;

  /** */
  private String timezoneId;

  public CronTrigger setQuartzCronSchedule(String quartzCronSchedule) {
    this.quartzCronSchedule = quartzCronSchedule;
    return this;
  }

  public String getQuartzCronSchedule() {
    return quartzCronSchedule;
  }

  public CronTrigger setTimezoneId(String timezoneId) {
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
    CronTrigger that = (CronTrigger) o;
    return Objects.equals(quartzCronSchedule, that.quartzCronSchedule)
        && Objects.equals(timezoneId, that.timezoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quartzCronSchedule, timezoneId);
  }

  @Override
  public String toString() {
    return new ToStringer(CronTrigger.class)
        .add("quartzCronSchedule", quartzCronSchedule)
        .add("timezoneId", timezoneId)
        .toString();
  }

  CronTriggerPb toPb() {
    CronTriggerPb pb = new CronTriggerPb();
    pb.setQuartzCronSchedule(quartzCronSchedule);
    pb.setTimezoneId(timezoneId);

    return pb;
  }

  static CronTrigger fromPb(CronTriggerPb pb) {
    CronTrigger model = new CronTrigger();
    model.setQuartzCronSchedule(pb.getQuartzCronSchedule());
    model.setTimezoneId(pb.getTimezoneId());

    return model;
  }

  public static class CronTriggerSerializer extends JsonSerializer<CronTrigger> {
    @Override
    public void serialize(CronTrigger value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CronTriggerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CronTriggerDeserializer extends JsonDeserializer<CronTrigger> {
    @Override
    public CronTrigger deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CronTriggerPb pb = mapper.readValue(p, CronTriggerPb.class);
      return CronTrigger.fromPb(pb);
    }
  }
}

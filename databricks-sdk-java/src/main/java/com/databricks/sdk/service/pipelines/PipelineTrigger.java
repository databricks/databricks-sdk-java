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
@JsonSerialize(using = PipelineTrigger.PipelineTriggerSerializer.class)
@JsonDeserialize(using = PipelineTrigger.PipelineTriggerDeserializer.class)
public class PipelineTrigger {
  /** */
  private CronTrigger cron;

  /** */
  private ManualTrigger manual;

  public PipelineTrigger setCron(CronTrigger cron) {
    this.cron = cron;
    return this;
  }

  public CronTrigger getCron() {
    return cron;
  }

  public PipelineTrigger setManual(ManualTrigger manual) {
    this.manual = manual;
    return this;
  }

  public ManualTrigger getManual() {
    return manual;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PipelineTrigger that = (PipelineTrigger) o;
    return Objects.equals(cron, that.cron) && Objects.equals(manual, that.manual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cron, manual);
  }

  @Override
  public String toString() {
    return new ToStringer(PipelineTrigger.class).add("cron", cron).add("manual", manual).toString();
  }

  PipelineTriggerPb toPb() {
    PipelineTriggerPb pb = new PipelineTriggerPb();
    pb.setCron(cron);
    pb.setManual(manual);

    return pb;
  }

  static PipelineTrigger fromPb(PipelineTriggerPb pb) {
    PipelineTrigger model = new PipelineTrigger();
    model.setCron(pb.getCron());
    model.setManual(pb.getManual());

    return model;
  }

  public static class PipelineTriggerSerializer extends JsonSerializer<PipelineTrigger> {
    @Override
    public void serialize(PipelineTrigger value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PipelineTriggerPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PipelineTriggerDeserializer extends JsonDeserializer<PipelineTrigger> {
    @Override
    public PipelineTrigger deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PipelineTriggerPb pb = mapper.readValue(p, PipelineTriggerPb.class);
      return PipelineTrigger.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = PeriodicTriggerConfiguration.PeriodicTriggerConfigurationSerializer.class)
@JsonDeserialize(
    using = PeriodicTriggerConfiguration.PeriodicTriggerConfigurationDeserializer.class)
public class PeriodicTriggerConfiguration {
  /** The interval at which the trigger should run. */
  private Long interval;

  /** The unit of time for the interval. */
  private PeriodicTriggerConfigurationTimeUnit unit;

  public PeriodicTriggerConfiguration setInterval(Long interval) {
    this.interval = interval;
    return this;
  }

  public Long getInterval() {
    return interval;
  }

  public PeriodicTriggerConfiguration setUnit(PeriodicTriggerConfigurationTimeUnit unit) {
    this.unit = unit;
    return this;
  }

  public PeriodicTriggerConfigurationTimeUnit getUnit() {
    return unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PeriodicTriggerConfiguration that = (PeriodicTriggerConfiguration) o;
    return Objects.equals(interval, that.interval) && Objects.equals(unit, that.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, unit);
  }

  @Override
  public String toString() {
    return new ToStringer(PeriodicTriggerConfiguration.class)
        .add("interval", interval)
        .add("unit", unit)
        .toString();
  }

  PeriodicTriggerConfigurationPb toPb() {
    PeriodicTriggerConfigurationPb pb = new PeriodicTriggerConfigurationPb();
    pb.setInterval(interval);
    pb.setUnit(unit);

    return pb;
  }

  static PeriodicTriggerConfiguration fromPb(PeriodicTriggerConfigurationPb pb) {
    PeriodicTriggerConfiguration model = new PeriodicTriggerConfiguration();
    model.setInterval(pb.getInterval());
    model.setUnit(pb.getUnit());

    return model;
  }

  public static class PeriodicTriggerConfigurationSerializer
      extends JsonSerializer<PeriodicTriggerConfiguration> {
    @Override
    public void serialize(
        PeriodicTriggerConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      PeriodicTriggerConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class PeriodicTriggerConfigurationDeserializer
      extends JsonDeserializer<PeriodicTriggerConfiguration> {
    @Override
    public PeriodicTriggerConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      PeriodicTriggerConfigurationPb pb = mapper.readValue(p, PeriodicTriggerConfigurationPb.class);
      return PeriodicTriggerConfiguration.fromPb(pb);
    }
  }
}

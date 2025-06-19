// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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
@JsonSerialize(
    using = WrappedLogDeliveryConfiguration.WrappedLogDeliveryConfigurationSerializer.class)
@JsonDeserialize(
    using = WrappedLogDeliveryConfiguration.WrappedLogDeliveryConfigurationDeserializer.class)
public class WrappedLogDeliveryConfiguration {
  /** */
  private LogDeliveryConfiguration logDeliveryConfiguration;

  public WrappedLogDeliveryConfiguration setLogDeliveryConfiguration(
      LogDeliveryConfiguration logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  public LogDeliveryConfiguration getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfiguration that = (WrappedLogDeliveryConfiguration) o;
    return Objects.equals(logDeliveryConfiguration, that.logDeliveryConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfiguration.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }

  WrappedLogDeliveryConfigurationPb toPb() {
    WrappedLogDeliveryConfigurationPb pb = new WrappedLogDeliveryConfigurationPb();
    pb.setLogDeliveryConfiguration(logDeliveryConfiguration);

    return pb;
  }

  static WrappedLogDeliveryConfiguration fromPb(WrappedLogDeliveryConfigurationPb pb) {
    WrappedLogDeliveryConfiguration model = new WrappedLogDeliveryConfiguration();
    model.setLogDeliveryConfiguration(pb.getLogDeliveryConfiguration());

    return model;
  }

  public static class WrappedLogDeliveryConfigurationSerializer
      extends JsonSerializer<WrappedLogDeliveryConfiguration> {
    @Override
    public void serialize(
        WrappedLogDeliveryConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WrappedLogDeliveryConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WrappedLogDeliveryConfigurationDeserializer
      extends JsonDeserializer<WrappedLogDeliveryConfiguration> {
    @Override
    public WrappedLogDeliveryConfiguration deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WrappedLogDeliveryConfigurationPb pb =
          mapper.readValue(p, WrappedLogDeliveryConfigurationPb.class);
      return WrappedLogDeliveryConfiguration.fromPb(pb);
    }
  }
}

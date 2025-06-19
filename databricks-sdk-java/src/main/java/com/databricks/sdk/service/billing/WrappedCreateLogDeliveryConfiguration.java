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
    using =
        WrappedCreateLogDeliveryConfiguration.WrappedCreateLogDeliveryConfigurationSerializer.class)
@JsonDeserialize(
    using =
        WrappedCreateLogDeliveryConfiguration.WrappedCreateLogDeliveryConfigurationDeserializer
            .class)
public class WrappedCreateLogDeliveryConfiguration {
  /** */
  private CreateLogDeliveryConfigurationParams logDeliveryConfiguration;

  public WrappedCreateLogDeliveryConfiguration setLogDeliveryConfiguration(
      CreateLogDeliveryConfigurationParams logDeliveryConfiguration) {
    this.logDeliveryConfiguration = logDeliveryConfiguration;
    return this;
  }

  public CreateLogDeliveryConfigurationParams getLogDeliveryConfiguration() {
    return logDeliveryConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedCreateLogDeliveryConfiguration that = (WrappedCreateLogDeliveryConfiguration) o;
    return Objects.equals(logDeliveryConfiguration, that.logDeliveryConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfiguration);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedCreateLogDeliveryConfiguration.class)
        .add("logDeliveryConfiguration", logDeliveryConfiguration)
        .toString();
  }

  WrappedCreateLogDeliveryConfigurationPb toPb() {
    WrappedCreateLogDeliveryConfigurationPb pb = new WrappedCreateLogDeliveryConfigurationPb();
    pb.setLogDeliveryConfiguration(logDeliveryConfiguration);

    return pb;
  }

  static WrappedCreateLogDeliveryConfiguration fromPb(WrappedCreateLogDeliveryConfigurationPb pb) {
    WrappedCreateLogDeliveryConfiguration model = new WrappedCreateLogDeliveryConfiguration();
    model.setLogDeliveryConfiguration(pb.getLogDeliveryConfiguration());

    return model;
  }

  public static class WrappedCreateLogDeliveryConfigurationSerializer
      extends JsonSerializer<WrappedCreateLogDeliveryConfiguration> {
    @Override
    public void serialize(
        WrappedCreateLogDeliveryConfiguration value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WrappedCreateLogDeliveryConfigurationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WrappedCreateLogDeliveryConfigurationDeserializer
      extends JsonDeserializer<WrappedCreateLogDeliveryConfiguration> {
    @Override
    public WrappedCreateLogDeliveryConfiguration deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WrappedCreateLogDeliveryConfigurationPb pb =
          mapper.readValue(p, WrappedCreateLogDeliveryConfigurationPb.class);
      return WrappedCreateLogDeliveryConfiguration.fromPb(pb);
    }
  }
}

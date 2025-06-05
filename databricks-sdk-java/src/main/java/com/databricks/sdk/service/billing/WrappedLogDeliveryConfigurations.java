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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(
    using = WrappedLogDeliveryConfigurations.WrappedLogDeliveryConfigurationsSerializer.class)
@JsonDeserialize(
    using = WrappedLogDeliveryConfigurations.WrappedLogDeliveryConfigurationsDeserializer.class)
public class WrappedLogDeliveryConfigurations {
  /** */
  private Collection<LogDeliveryConfiguration> logDeliveryConfigurations;

  public WrappedLogDeliveryConfigurations setLogDeliveryConfigurations(
      Collection<LogDeliveryConfiguration> logDeliveryConfigurations) {
    this.logDeliveryConfigurations = logDeliveryConfigurations;
    return this;
  }

  public Collection<LogDeliveryConfiguration> getLogDeliveryConfigurations() {
    return logDeliveryConfigurations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    WrappedLogDeliveryConfigurations that = (WrappedLogDeliveryConfigurations) o;
    return Objects.equals(logDeliveryConfigurations, that.logDeliveryConfigurations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurations);
  }

  @Override
  public String toString() {
    return new ToStringer(WrappedLogDeliveryConfigurations.class)
        .add("logDeliveryConfigurations", logDeliveryConfigurations)
        .toString();
  }

  WrappedLogDeliveryConfigurationsPb toPb() {
    WrappedLogDeliveryConfigurationsPb pb = new WrappedLogDeliveryConfigurationsPb();
    pb.setLogDeliveryConfigurations(logDeliveryConfigurations);

    return pb;
  }

  static WrappedLogDeliveryConfigurations fromPb(WrappedLogDeliveryConfigurationsPb pb) {
    WrappedLogDeliveryConfigurations model = new WrappedLogDeliveryConfigurations();
    model.setLogDeliveryConfigurations(pb.getLogDeliveryConfigurations());

    return model;
  }

  public static class WrappedLogDeliveryConfigurationsSerializer
      extends JsonSerializer<WrappedLogDeliveryConfigurations> {
    @Override
    public void serialize(
        WrappedLogDeliveryConfigurations value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      WrappedLogDeliveryConfigurationsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class WrappedLogDeliveryConfigurationsDeserializer
      extends JsonDeserializer<WrappedLogDeliveryConfigurations> {
    @Override
    public WrappedLogDeliveryConfigurations deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      WrappedLogDeliveryConfigurationsPb pb =
          mapper.readValue(p, WrappedLogDeliveryConfigurationsPb.class);
      return WrappedLogDeliveryConfigurations.fromPb(pb);
    }
  }
}

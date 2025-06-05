// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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

/** SHIELD feature: ESM */
@Generated
@JsonSerialize(using = EnhancedSecurityMonitoring.EnhancedSecurityMonitoringSerializer.class)
@JsonDeserialize(using = EnhancedSecurityMonitoring.EnhancedSecurityMonitoringDeserializer.class)
public class EnhancedSecurityMonitoring {
  /** */
  private Boolean isEnabled;

  public EnhancedSecurityMonitoring setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  public Boolean getIsEnabled() {
    return isEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EnhancedSecurityMonitoring that = (EnhancedSecurityMonitoring) o;
    return Objects.equals(isEnabled, that.isEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEnabled);
  }

  @Override
  public String toString() {
    return new ToStringer(EnhancedSecurityMonitoring.class).add("isEnabled", isEnabled).toString();
  }

  EnhancedSecurityMonitoringPb toPb() {
    EnhancedSecurityMonitoringPb pb = new EnhancedSecurityMonitoringPb();
    pb.setIsEnabled(isEnabled);

    return pb;
  }

  static EnhancedSecurityMonitoring fromPb(EnhancedSecurityMonitoringPb pb) {
    EnhancedSecurityMonitoring model = new EnhancedSecurityMonitoring();
    model.setIsEnabled(pb.getIsEnabled());

    return model;
  }

  public static class EnhancedSecurityMonitoringSerializer
      extends JsonSerializer<EnhancedSecurityMonitoring> {
    @Override
    public void serialize(
        EnhancedSecurityMonitoring value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EnhancedSecurityMonitoringPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EnhancedSecurityMonitoringDeserializer
      extends JsonDeserializer<EnhancedSecurityMonitoring> {
    @Override
    public EnhancedSecurityMonitoring deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EnhancedSecurityMonitoringPb pb = mapper.readValue(p, EnhancedSecurityMonitoringPb.class);
      return EnhancedSecurityMonitoring.fromPb(pb);
    }
  }
}

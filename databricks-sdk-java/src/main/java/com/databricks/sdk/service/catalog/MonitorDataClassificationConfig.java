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
@JsonSerialize(
    using = MonitorDataClassificationConfig.MonitorDataClassificationConfigSerializer.class)
@JsonDeserialize(
    using = MonitorDataClassificationConfig.MonitorDataClassificationConfigDeserializer.class)
public class MonitorDataClassificationConfig {
  /** Whether data classification is enabled. */
  private Boolean enabled;

  public MonitorDataClassificationConfig setEnabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  public Boolean getEnabled() {
    return enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    MonitorDataClassificationConfig that = (MonitorDataClassificationConfig) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(MonitorDataClassificationConfig.class).add("enabled", enabled).toString();
  }

  MonitorDataClassificationConfigPb toPb() {
    MonitorDataClassificationConfigPb pb = new MonitorDataClassificationConfigPb();
    pb.setEnabled(enabled);

    return pb;
  }

  static MonitorDataClassificationConfig fromPb(MonitorDataClassificationConfigPb pb) {
    MonitorDataClassificationConfig model = new MonitorDataClassificationConfig();
    model.setEnabled(pb.getEnabled());

    return model;
  }

  public static class MonitorDataClassificationConfigSerializer
      extends JsonSerializer<MonitorDataClassificationConfig> {
    @Override
    public void serialize(
        MonitorDataClassificationConfig value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      MonitorDataClassificationConfigPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class MonitorDataClassificationConfigDeserializer
      extends JsonDeserializer<MonitorDataClassificationConfig> {
    @Override
    public MonitorDataClassificationConfig deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      MonitorDataClassificationConfigPb pb =
          mapper.readValue(p, MonitorDataClassificationConfigPb.class);
      return MonitorDataClassificationConfig.fromPb(pb);
    }
  }
}

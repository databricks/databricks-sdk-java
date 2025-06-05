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
@JsonSerialize(using = QueueSettings.QueueSettingsSerializer.class)
@JsonDeserialize(using = QueueSettings.QueueSettingsDeserializer.class)
public class QueueSettings {
  /** If true, enable queueing for the job. This is a required field. */
  private Boolean enabled;

  public QueueSettings setEnabled(Boolean enabled) {
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
    QueueSettings that = (QueueSettings) o;
    return Objects.equals(enabled, that.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    return new ToStringer(QueueSettings.class).add("enabled", enabled).toString();
  }

  QueueSettingsPb toPb() {
    QueueSettingsPb pb = new QueueSettingsPb();
    pb.setEnabled(enabled);

    return pb;
  }

  static QueueSettings fromPb(QueueSettingsPb pb) {
    QueueSettings model = new QueueSettings();
    model.setEnabled(pb.getEnabled());

    return model;
  }

  public static class QueueSettingsSerializer extends JsonSerializer<QueueSettings> {
    @Override
    public void serialize(QueueSettings value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      QueueSettingsPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class QueueSettingsDeserializer extends JsonDeserializer<QueueSettings> {
    @Override
    public QueueSettings deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      QueueSettingsPb pb = mapper.readValue(p, QueueSettingsPb.class);
      return QueueSettings.fromPb(pb);
    }
  }
}

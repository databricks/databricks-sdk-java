// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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
@JsonSerialize(using = AlertConditionThreshold.AlertConditionThresholdSerializer.class)
@JsonDeserialize(using = AlertConditionThreshold.AlertConditionThresholdDeserializer.class)
public class AlertConditionThreshold {
  /** */
  private AlertOperandValue value;

  public AlertConditionThreshold setValue(AlertOperandValue value) {
    this.value = value;
    return this;
  }

  public AlertOperandValue getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertConditionThreshold that = (AlertConditionThreshold) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConditionThreshold.class).add("value", value).toString();
  }

  AlertConditionThresholdPb toPb() {
    AlertConditionThresholdPb pb = new AlertConditionThresholdPb();
    pb.setValue(value);

    return pb;
  }

  static AlertConditionThreshold fromPb(AlertConditionThresholdPb pb) {
    AlertConditionThreshold model = new AlertConditionThreshold();
    model.setValue(pb.getValue());

    return model;
  }

  public static class AlertConditionThresholdSerializer
      extends JsonSerializer<AlertConditionThreshold> {
    @Override
    public void serialize(
        AlertConditionThreshold value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertConditionThresholdPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertConditionThresholdDeserializer
      extends JsonDeserializer<AlertConditionThreshold> {
    @Override
    public AlertConditionThreshold deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertConditionThresholdPb pb = mapper.readValue(p, AlertConditionThresholdPb.class);
      return AlertConditionThreshold.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = AlertOperandValue.AlertOperandValueSerializer.class)
@JsonDeserialize(using = AlertOperandValue.AlertOperandValueDeserializer.class)
public class AlertOperandValue {
  /** */
  private Boolean boolValue;

  /** */
  private Double doubleValue;

  /** */
  private String stringValue;

  public AlertOperandValue setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  public Boolean getBoolValue() {
    return boolValue;
  }

  public AlertOperandValue setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  public Double getDoubleValue() {
    return doubleValue;
  }

  public AlertOperandValue setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertOperandValue that = (AlertOperandValue) o;
    return Objects.equals(boolValue, that.boolValue)
        && Objects.equals(doubleValue, that.doubleValue)
        && Objects.equals(stringValue, that.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolValue, doubleValue, stringValue);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertOperandValue.class)
        .add("boolValue", boolValue)
        .add("doubleValue", doubleValue)
        .add("stringValue", stringValue)
        .toString();
  }

  AlertOperandValuePb toPb() {
    AlertOperandValuePb pb = new AlertOperandValuePb();
    pb.setBoolValue(boolValue);
    pb.setDoubleValue(doubleValue);
    pb.setStringValue(stringValue);

    return pb;
  }

  static AlertOperandValue fromPb(AlertOperandValuePb pb) {
    AlertOperandValue model = new AlertOperandValue();
    model.setBoolValue(pb.getBoolValue());
    model.setDoubleValue(pb.getDoubleValue());
    model.setStringValue(pb.getStringValue());

    return model;
  }

  public static class AlertOperandValueSerializer extends JsonSerializer<AlertOperandValue> {
    @Override
    public void serialize(AlertOperandValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertOperandValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertOperandValueDeserializer extends JsonDeserializer<AlertOperandValue> {
    @Override
    public AlertOperandValue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertOperandValuePb pb = mapper.readValue(p, AlertOperandValuePb.class);
      return AlertOperandValue.fromPb(pb);
    }
  }
}

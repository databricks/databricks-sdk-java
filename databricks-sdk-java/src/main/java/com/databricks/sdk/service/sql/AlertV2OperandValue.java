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
@JsonSerialize(using = AlertV2OperandValue.AlertV2OperandValueSerializer.class)
@JsonDeserialize(using = AlertV2OperandValue.AlertV2OperandValueDeserializer.class)
public class AlertV2OperandValue {
  /** */
  private Boolean boolValue;

  /** */
  private Double doubleValue;

  /** */
  private String stringValue;

  public AlertV2OperandValue setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  public Boolean getBoolValue() {
    return boolValue;
  }

  public AlertV2OperandValue setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  public Double getDoubleValue() {
    return doubleValue;
  }

  public AlertV2OperandValue setStringValue(String stringValue) {
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
    AlertV2OperandValue that = (AlertV2OperandValue) o;
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
    return new ToStringer(AlertV2OperandValue.class)
        .add("boolValue", boolValue)
        .add("doubleValue", doubleValue)
        .add("stringValue", stringValue)
        .toString();
  }

  AlertV2OperandValuePb toPb() {
    AlertV2OperandValuePb pb = new AlertV2OperandValuePb();
    pb.setBoolValue(boolValue);
    pb.setDoubleValue(doubleValue);
    pb.setStringValue(stringValue);

    return pb;
  }

  static AlertV2OperandValue fromPb(AlertV2OperandValuePb pb) {
    AlertV2OperandValue model = new AlertV2OperandValue();
    model.setBoolValue(pb.getBoolValue());
    model.setDoubleValue(pb.getDoubleValue());
    model.setStringValue(pb.getStringValue());

    return model;
  }

  public static class AlertV2OperandValueSerializer extends JsonSerializer<AlertV2OperandValue> {
    @Override
    public void serialize(AlertV2OperandValue value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2OperandValuePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2OperandValueDeserializer
      extends JsonDeserializer<AlertV2OperandValue> {
    @Override
    public AlertV2OperandValue deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2OperandValuePb pb = mapper.readValue(p, AlertV2OperandValuePb.class);
      return AlertV2OperandValue.fromPb(pb);
    }
  }
}

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
@JsonSerialize(using = AlertV2Operand.AlertV2OperandSerializer.class)
@JsonDeserialize(using = AlertV2Operand.AlertV2OperandDeserializer.class)
public class AlertV2Operand {
  /** */
  private AlertV2OperandColumn column;

  /** */
  private AlertV2OperandValue value;

  public AlertV2Operand setColumn(AlertV2OperandColumn column) {
    this.column = column;
    return this;
  }

  public AlertV2OperandColumn getColumn() {
    return column;
  }

  public AlertV2Operand setValue(AlertV2OperandValue value) {
    this.value = value;
    return this;
  }

  public AlertV2OperandValue getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Operand that = (AlertV2Operand) o;
    return Objects.equals(column, that.column) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Operand.class)
        .add("column", column)
        .add("value", value)
        .toString();
  }

  AlertV2OperandPb toPb() {
    AlertV2OperandPb pb = new AlertV2OperandPb();
    pb.setColumn(column);
    pb.setValue(value);

    return pb;
  }

  static AlertV2Operand fromPb(AlertV2OperandPb pb) {
    AlertV2Operand model = new AlertV2Operand();
    model.setColumn(pb.getColumn());
    model.setValue(pb.getValue());

    return model;
  }

  public static class AlertV2OperandSerializer extends JsonSerializer<AlertV2Operand> {
    @Override
    public void serialize(AlertV2Operand value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2OperandPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2OperandDeserializer extends JsonDeserializer<AlertV2Operand> {
    @Override
    public AlertV2Operand deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2OperandPb pb = mapper.readValue(p, AlertV2OperandPb.class);
      return AlertV2Operand.fromPb(pb);
    }
  }
}

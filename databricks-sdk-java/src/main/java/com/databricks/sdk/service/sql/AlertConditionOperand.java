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
@JsonSerialize(using = AlertConditionOperand.AlertConditionOperandSerializer.class)
@JsonDeserialize(using = AlertConditionOperand.AlertConditionOperandDeserializer.class)
public class AlertConditionOperand {
  /** */
  private AlertOperandColumn column;

  public AlertConditionOperand setColumn(AlertOperandColumn column) {
    this.column = column;
    return this;
  }

  public AlertOperandColumn getColumn() {
    return column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertConditionOperand that = (AlertConditionOperand) o;
    return Objects.equals(column, that.column);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConditionOperand.class).add("column", column).toString();
  }

  AlertConditionOperandPb toPb() {
    AlertConditionOperandPb pb = new AlertConditionOperandPb();
    pb.setColumn(column);

    return pb;
  }

  static AlertConditionOperand fromPb(AlertConditionOperandPb pb) {
    AlertConditionOperand model = new AlertConditionOperand();
    model.setColumn(pb.getColumn());

    return model;
  }

  public static class AlertConditionOperandSerializer
      extends JsonSerializer<AlertConditionOperand> {
    @Override
    public void serialize(
        AlertConditionOperand value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertConditionOperandPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertConditionOperandDeserializer
      extends JsonDeserializer<AlertConditionOperand> {
    @Override
    public AlertConditionOperand deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertConditionOperandPb pb = mapper.readValue(p, AlertConditionOperandPb.class);
      return AlertConditionOperand.fromPb(pb);
    }
  }
}

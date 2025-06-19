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
@JsonSerialize(using = AlertCondition.AlertConditionSerializer.class)
@JsonDeserialize(using = AlertCondition.AlertConditionDeserializer.class)
public class AlertCondition {
  /** Alert state if result is empty. */
  private AlertState emptyResultState;

  /** Operator used for comparison in alert evaluation. */
  private AlertOperator op;

  /** Name of the column from the query result to use for comparison in alert evaluation. */
  private AlertConditionOperand operand;

  /** Threshold value used for comparison in alert evaluation. */
  private AlertConditionThreshold threshold;

  public AlertCondition setEmptyResultState(AlertState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertState getEmptyResultState() {
    return emptyResultState;
  }

  public AlertCondition setOp(AlertOperator op) {
    this.op = op;
    return this;
  }

  public AlertOperator getOp() {
    return op;
  }

  public AlertCondition setOperand(AlertConditionOperand operand) {
    this.operand = operand;
    return this;
  }

  public AlertConditionOperand getOperand() {
    return operand;
  }

  public AlertCondition setThreshold(AlertConditionThreshold threshold) {
    this.threshold = threshold;
    return this;
  }

  public AlertConditionThreshold getThreshold() {
    return threshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertCondition that = (AlertCondition) o;
    return Objects.equals(emptyResultState, that.emptyResultState)
        && Objects.equals(op, that.op)
        && Objects.equals(operand, that.operand)
        && Objects.equals(threshold, that.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emptyResultState, op, operand, threshold);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertCondition.class)
        .add("emptyResultState", emptyResultState)
        .add("op", op)
        .add("operand", operand)
        .add("threshold", threshold)
        .toString();
  }

  AlertConditionPb toPb() {
    AlertConditionPb pb = new AlertConditionPb();
    pb.setEmptyResultState(emptyResultState);
    pb.setOp(op);
    pb.setOperand(operand);
    pb.setThreshold(threshold);

    return pb;
  }

  static AlertCondition fromPb(AlertConditionPb pb) {
    AlertCondition model = new AlertCondition();
    model.setEmptyResultState(pb.getEmptyResultState());
    model.setOp(pb.getOp());
    model.setOperand(pb.getOperand());
    model.setThreshold(pb.getThreshold());

    return model;
  }

  public static class AlertConditionSerializer extends JsonSerializer<AlertCondition> {
    @Override
    public void serialize(AlertCondition value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertConditionPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertConditionDeserializer extends JsonDeserializer<AlertCondition> {
    @Override
    public AlertCondition deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertConditionPb pb = mapper.readValue(p, AlertConditionPb.class);
      return AlertCondition.fromPb(pb);
    }
  }
}

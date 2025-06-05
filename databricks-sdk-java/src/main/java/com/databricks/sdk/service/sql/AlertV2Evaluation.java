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
@JsonSerialize(using = AlertV2Evaluation.AlertV2EvaluationSerializer.class)
@JsonDeserialize(using = AlertV2Evaluation.AlertV2EvaluationDeserializer.class)
public class AlertV2Evaluation {
  /** Operator used for comparison in alert evaluation. */
  private ComparisonOperator comparisonOperator;

  /** Alert state if result is empty. */
  private AlertEvaluationState emptyResultState;

  /** Timestamp of the last evaluation. */
  private String lastEvaluatedAt;

  /** User or Notification Destination to notify when alert is triggered. */
  private AlertV2Notification notification;

  /** Source column from result to use to evaluate alert */
  private AlertV2OperandColumn source;

  /** Latest state of alert evaluation. */
  private AlertEvaluationState state;

  /** Threshold to user for alert evaluation, can be a column or a value. */
  private AlertV2Operand threshold;

  public AlertV2Evaluation setComparisonOperator(ComparisonOperator comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  public ComparisonOperator getComparisonOperator() {
    return comparisonOperator;
  }

  public AlertV2Evaluation setEmptyResultState(AlertEvaluationState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertEvaluationState getEmptyResultState() {
    return emptyResultState;
  }

  public AlertV2Evaluation setLastEvaluatedAt(String lastEvaluatedAt) {
    this.lastEvaluatedAt = lastEvaluatedAt;
    return this;
  }

  public String getLastEvaluatedAt() {
    return lastEvaluatedAt;
  }

  public AlertV2Evaluation setNotification(AlertV2Notification notification) {
    this.notification = notification;
    return this;
  }

  public AlertV2Notification getNotification() {
    return notification;
  }

  public AlertV2Evaluation setSource(AlertV2OperandColumn source) {
    this.source = source;
    return this;
  }

  public AlertV2OperandColumn getSource() {
    return source;
  }

  public AlertV2Evaluation setState(AlertEvaluationState state) {
    this.state = state;
    return this;
  }

  public AlertEvaluationState getState() {
    return state;
  }

  public AlertV2Evaluation setThreshold(AlertV2Operand threshold) {
    this.threshold = threshold;
    return this;
  }

  public AlertV2Operand getThreshold() {
    return threshold;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Evaluation that = (AlertV2Evaluation) o;
    return Objects.equals(comparisonOperator, that.comparisonOperator)
        && Objects.equals(emptyResultState, that.emptyResultState)
        && Objects.equals(lastEvaluatedAt, that.lastEvaluatedAt)
        && Objects.equals(notification, that.notification)
        && Objects.equals(source, that.source)
        && Objects.equals(state, that.state)
        && Objects.equals(threshold, that.threshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comparisonOperator,
        emptyResultState,
        lastEvaluatedAt,
        notification,
        source,
        state,
        threshold);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Evaluation.class)
        .add("comparisonOperator", comparisonOperator)
        .add("emptyResultState", emptyResultState)
        .add("lastEvaluatedAt", lastEvaluatedAt)
        .add("notification", notification)
        .add("source", source)
        .add("state", state)
        .add("threshold", threshold)
        .toString();
  }

  AlertV2EvaluationPb toPb() {
    AlertV2EvaluationPb pb = new AlertV2EvaluationPb();
    pb.setComparisonOperator(comparisonOperator);
    pb.setEmptyResultState(emptyResultState);
    pb.setLastEvaluatedAt(lastEvaluatedAt);
    pb.setNotification(notification);
    pb.setSource(source);
    pb.setState(state);
    pb.setThreshold(threshold);

    return pb;
  }

  static AlertV2Evaluation fromPb(AlertV2EvaluationPb pb) {
    AlertV2Evaluation model = new AlertV2Evaluation();
    model.setComparisonOperator(pb.getComparisonOperator());
    model.setEmptyResultState(pb.getEmptyResultState());
    model.setLastEvaluatedAt(pb.getLastEvaluatedAt());
    model.setNotification(pb.getNotification());
    model.setSource(pb.getSource());
    model.setState(pb.getState());
    model.setThreshold(pb.getThreshold());

    return model;
  }

  public static class AlertV2EvaluationSerializer extends JsonSerializer<AlertV2Evaluation> {
    @Override
    public void serialize(AlertV2Evaluation value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AlertV2EvaluationPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AlertV2EvaluationDeserializer extends JsonDeserializer<AlertV2Evaluation> {
    @Override
    public AlertV2Evaluation deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AlertV2EvaluationPb pb = mapper.readValue(p, AlertV2EvaluationPb.class);
      return AlertV2Evaluation.fromPb(pb);
    }
  }
}

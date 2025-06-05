// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AlertV2EvaluationPb {
  @JsonProperty("comparison_operator")
  private ComparisonOperator comparisonOperator;

  @JsonProperty("empty_result_state")
  private AlertEvaluationState emptyResultState;

  @JsonProperty("last_evaluated_at")
  private String lastEvaluatedAt;

  @JsonProperty("notification")
  private AlertV2Notification notification;

  @JsonProperty("source")
  private AlertV2OperandColumn source;

  @JsonProperty("state")
  private AlertEvaluationState state;

  @JsonProperty("threshold")
  private AlertV2Operand threshold;

  public AlertV2EvaluationPb setComparisonOperator(ComparisonOperator comparisonOperator) {
    this.comparisonOperator = comparisonOperator;
    return this;
  }

  public ComparisonOperator getComparisonOperator() {
    return comparisonOperator;
  }

  public AlertV2EvaluationPb setEmptyResultState(AlertEvaluationState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertEvaluationState getEmptyResultState() {
    return emptyResultState;
  }

  public AlertV2EvaluationPb setLastEvaluatedAt(String lastEvaluatedAt) {
    this.lastEvaluatedAt = lastEvaluatedAt;
    return this;
  }

  public String getLastEvaluatedAt() {
    return lastEvaluatedAt;
  }

  public AlertV2EvaluationPb setNotification(AlertV2Notification notification) {
    this.notification = notification;
    return this;
  }

  public AlertV2Notification getNotification() {
    return notification;
  }

  public AlertV2EvaluationPb setSource(AlertV2OperandColumn source) {
    this.source = source;
    return this;
  }

  public AlertV2OperandColumn getSource() {
    return source;
  }

  public AlertV2EvaluationPb setState(AlertEvaluationState state) {
    this.state = state;
    return this;
  }

  public AlertEvaluationState getState() {
    return state;
  }

  public AlertV2EvaluationPb setThreshold(AlertV2Operand threshold) {
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
    AlertV2EvaluationPb that = (AlertV2EvaluationPb) o;
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
    return new ToStringer(AlertV2EvaluationPb.class)
        .add("comparisonOperator", comparisonOperator)
        .add("emptyResultState", emptyResultState)
        .add("lastEvaluatedAt", lastEvaluatedAt)
        .add("notification", notification)
        .add("source", source)
        .add("state", state)
        .add("threshold", threshold)
        .toString();
  }
}

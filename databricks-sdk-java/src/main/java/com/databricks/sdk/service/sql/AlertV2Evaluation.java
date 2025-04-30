// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertV2Evaluation {
  /** Operator used for comparison in alert evaluation. */
  @JsonProperty("comparison_operator")
  private ComparisonOperator comparisonOperator;

  /** Alert state if result is empty. */
  @JsonProperty("empty_result_state")
  private AlertEvaluationState emptyResultState;

  /** Timestamp of the last evaluation. */
  @JsonProperty("last_evaluated_at")
  private String lastEvaluatedAt;

  /** User or Notification Destination to notify when alert is triggered. */
  @JsonProperty("notification")
  private AlertV2Notification notification;

  /** Source column from result to use to evaluate alert */
  @JsonProperty("source")
  private AlertV2OperandColumn source;

  /** Latest state of alert evaluation. */
  @JsonProperty("state")
  private AlertEvaluationState state;

  /** Threshold to user for alert evaluation, can be a column or a value. */
  @JsonProperty("threshold")
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
}

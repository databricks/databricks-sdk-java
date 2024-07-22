// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertCondition {
  /** Alert state if result is empty. */
  @JsonProperty("empty_result_state")
  private AlertState emptyResultState;

  /** Operator used for comparison in alert evaluation. */
  @JsonProperty("op")
  private AlertOperator op;

  /** Name of the column from the query result to use for comparison in alert evaluation. */
  @JsonProperty("operand")
  private AlertConditionOperand operand;

  /** Threshold value used for comparison in alert evaluation. */
  @JsonProperty("threshold")
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
}

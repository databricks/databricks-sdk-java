// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AlertConditionPb {
  @JsonProperty("empty_result_state")
  private AlertState emptyResultState;

  @JsonProperty("op")
  private AlertOperator op;

  @JsonProperty("operand")
  private AlertConditionOperand operand;

  @JsonProperty("threshold")
  private AlertConditionThreshold threshold;

  public AlertConditionPb setEmptyResultState(AlertState emptyResultState) {
    this.emptyResultState = emptyResultState;
    return this;
  }

  public AlertState getEmptyResultState() {
    return emptyResultState;
  }

  public AlertConditionPb setOp(AlertOperator op) {
    this.op = op;
    return this;
  }

  public AlertOperator getOp() {
    return op;
  }

  public AlertConditionPb setOperand(AlertConditionOperand operand) {
    this.operand = operand;
    return this;
  }

  public AlertConditionOperand getOperand() {
    return operand;
  }

  public AlertConditionPb setThreshold(AlertConditionThreshold threshold) {
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
    AlertConditionPb that = (AlertConditionPb) o;
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
    return new ToStringer(AlertConditionPb.class)
        .add("emptyResultState", emptyResultState)
        .add("op", op)
        .add("operand", operand)
        .add("threshold", threshold)
        .toString();
  }
}

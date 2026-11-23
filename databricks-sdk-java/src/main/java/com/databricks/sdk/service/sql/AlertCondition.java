// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertCondition {
  /** State the alert takes when the query returns no rows. Defaults to `UNKNOWN` when not set. */
  @JsonProperty("empty_result_state")
  private AlertState emptyResultState;

  /**
   * Comparison operator applied between the operand column value and the threshold. The alert is
   * triggered when the comparison is true. `IS_NULL` triggers when the column value is null; a
   * threshold must still be supplied but its value is ignored.
   */
  @JsonProperty("op")
  private AlertOperator op;

  /**
   * Left-hand side of the comparison. Through this API it must be a `column` naming a column of the
   * query result; the value in the first row of that column is compared against the threshold.
   */
  @JsonProperty("operand")
  private AlertConditionOperand operand;

  /**
   * Right-hand side of the comparison. Through this API it must be a fixed `value` whose type
   * matches the operand column.
   */
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

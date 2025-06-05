// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class RunConditionTaskPb {
  @JsonProperty("left")
  private String left;

  @JsonProperty("op")
  private ConditionTaskOp op;

  @JsonProperty("outcome")
  private String outcome;

  @JsonProperty("right")
  private String right;

  public RunConditionTaskPb setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }

  public RunConditionTaskPb setOp(ConditionTaskOp op) {
    this.op = op;
    return this;
  }

  public ConditionTaskOp getOp() {
    return op;
  }

  public RunConditionTaskPb setOutcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  public String getOutcome() {
    return outcome;
  }

  public RunConditionTaskPb setRight(String right) {
    this.right = right;
    return this;
  }

  public String getRight() {
    return right;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RunConditionTaskPb that = (RunConditionTaskPb) o;
    return Objects.equals(left, that.left)
        && Objects.equals(op, that.op)
        && Objects.equals(outcome, that.outcome)
        && Objects.equals(right, that.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, op, outcome, right);
  }

  @Override
  public String toString() {
    return new ToStringer(RunConditionTaskPb.class)
        .add("left", left)
        .add("op", op)
        .add("outcome", outcome)
        .add("right", right)
        .toString();
  }
}

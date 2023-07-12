// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class RunConditionTask {
  /**
   * The left operand of the condition task.
   */
  @JsonProperty("left")
  private String left;
  
  /**
   * The condtion task operator.
   */
  @JsonProperty("op")
  private RunConditionTaskOp op;
  
  /**
   * The condition expression evaluation result. Filled in if the task was
   * successfully completed. Can be `"true"` or `"false"`
   */
  @JsonProperty("outcome")
  private String outcome;
  
  /**
   * The right operand of the condition task.
   */
  @JsonProperty("right")
  private String right;
  
  public RunConditionTask setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }
  
  public RunConditionTask setOp(RunConditionTaskOp op) {
    this.op = op;
    return this;
  }

  public RunConditionTaskOp getOp() {
    return op;
  }
  
  public RunConditionTask setOutcome(String outcome) {
    this.outcome = outcome;
    return this;
  }

  public String getOutcome() {
    return outcome;
  }
  
  public RunConditionTask setRight(String right) {
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
    RunConditionTask that = (RunConditionTask) o;
    return Objects.equals(left, that.left)
    && Objects.equals(op, that.op)
    && Objects.equals(outcome, that.outcome)
    && Objects.equals(right, that.right)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, op, outcome, right);
  }

  @Override
  public String toString() {
    return new ToStringer(RunConditionTask.class)
      .add("left", left)
      .add("op", op)
      .add("outcome", outcome)
      .add("right", right).toString();
  }
}

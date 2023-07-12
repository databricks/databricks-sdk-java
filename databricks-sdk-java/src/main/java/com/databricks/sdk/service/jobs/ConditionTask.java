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
public class ConditionTask {
  /**
   * The left operand of the condition task. Can be either a string value or a
   * job state or parameter reference.
   */
  @JsonProperty("left")
  private String left;
  
  /**
   * * `EQUAL_TO`, `NOT_EQUAL` operators perform string comparison of their
   * operands. This means that `“12.0” == “12”` will evaluate to
   * `false`. * `GREATER_THAN`, `GREATER_THAN_OR_EQUAL`, `LESS_THAN`,
   * `LESS_THAN_OR_EQUAL` operators perform numeric comparison of their
   * operands. `“12.0” >= “12”` will evaluate to `true`, `“10.0” >=
   * “12”` will evaluate to `false`.
   * 
   * The boolean comparison to task values can be implemented with operators
   * `EQUAL_TO`, `NOT_EQUAL`. If a task value was set to a boolean value, it
   * will be serialized to `“true”` or `“false”` for the comparison.
   */
  @JsonProperty("op")
  private ConditionTaskOp op;
  
  /**
   * The right operand of the condition task. Can be either a string value or a
   * job state or parameter reference.
   */
  @JsonProperty("right")
  private String right;
  
  public ConditionTask setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }
  
  public ConditionTask setOp(ConditionTaskOp op) {
    this.op = op;
    return this;
  }

  public ConditionTaskOp getOp() {
    return op;
  }
  
  public ConditionTask setRight(String right) {
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
    ConditionTask that = (ConditionTask) o;
    return Objects.equals(left, that.left)
    && Objects.equals(op, that.op)
    && Objects.equals(right, that.right)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, op, right);
  }

  @Override
  public String toString() {
    return new ToStringer(ConditionTask.class)
      .add("left", left)
      .add("op", op)
      .add("right", right).toString();
  }
}

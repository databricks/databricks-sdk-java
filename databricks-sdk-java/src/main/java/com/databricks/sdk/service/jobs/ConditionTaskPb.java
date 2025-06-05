// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ConditionTaskPb {
  @JsonProperty("left")
  private String left;

  @JsonProperty("op")
  private ConditionTaskOp op;

  @JsonProperty("right")
  private String right;

  public ConditionTaskPb setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }

  public ConditionTaskPb setOp(ConditionTaskOp op) {
    this.op = op;
    return this;
  }

  public ConditionTaskOp getOp() {
    return op;
  }

  public ConditionTaskPb setRight(String right) {
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
    ConditionTaskPb that = (ConditionTaskPb) o;
    return Objects.equals(left, that.left)
        && Objects.equals(op, that.op)
        && Objects.equals(right, that.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, op, right);
  }

  @Override
  public String toString() {
    return new ToStringer(ConditionTaskPb.class)
        .add("left", left)
        .add("op", op)
        .add("right", right)
        .toString();
  }
}

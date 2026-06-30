// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ResolvedConditionTaskValues {
  /** */
  @JsonProperty("left")
  private String left;

  /** */
  @JsonProperty("right")
  private String right;

  public ResolvedConditionTaskValues setLeft(String left) {
    this.left = left;
    return this;
  }

  public String getLeft() {
    return left;
  }

  public ResolvedConditionTaskValues setRight(String right) {
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
    ResolvedConditionTaskValues that = (ResolvedConditionTaskValues) o;
    return Objects.equals(left, that.left) && Objects.equals(right, that.right);
  }

  @Override
  public int hashCode() {
    return Objects.hash(left, right);
  }

  @Override
  public String toString() {
    return new ToStringer(ResolvedConditionTaskValues.class)
        .add("left", left)
        .add("right", right)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A positional argument passed to a row filter or column mask function. Distinguishes between
 * column references and literals.
 */
@Generated
public class PolicyFunctionArgument {
  /** A column reference. */
  @JsonProperty("column")
  private String column;

  /** A constant literal. */
  @JsonProperty("constant")
  private String constant;

  public PolicyFunctionArgument setColumn(String column) {
    this.column = column;
    return this;
  }

  public String getColumn() {
    return column;
  }

  public PolicyFunctionArgument setConstant(String constant) {
    this.constant = constant;
    return this;
  }

  public String getConstant() {
    return constant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PolicyFunctionArgument that = (PolicyFunctionArgument) o;
    return Objects.equals(column, that.column) && Objects.equals(constant, that.constant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, constant);
  }

  @Override
  public String toString() {
    return new ToStringer(PolicyFunctionArgument.class)
        .add("column", column)
        .add("constant", constant)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class FunctionArgument {
  /** The alias of a matched column. */
  @JsonProperty("alias")
  private String alias;

  /** A constant literal. */
  @JsonProperty("constant")
  private String constant;

  /**
   * An expression evaluated at query time. Wraps per-request expression variants (e.g., tag
   * introspection) so new variants can be added without extending the FunctionArgument oneof.
   */
  @JsonProperty("function_arg_expression")
  private FunctionArgExpression functionArgExpression;

  public FunctionArgument setAlias(String alias) {
    this.alias = alias;
    return this;
  }

  public String getAlias() {
    return alias;
  }

  public FunctionArgument setConstant(String constant) {
    this.constant = constant;
    return this;
  }

  public String getConstant() {
    return constant;
  }

  public FunctionArgument setFunctionArgExpression(FunctionArgExpression functionArgExpression) {
    this.functionArgExpression = functionArgExpression;
    return this;
  }

  public FunctionArgExpression getFunctionArgExpression() {
    return functionArgExpression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionArgument that = (FunctionArgument) o;
    return Objects.equals(alias, that.alias)
        && Objects.equals(constant, that.constant)
        && Objects.equals(functionArgExpression, that.functionArgExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, constant, functionArgExpression);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionArgument.class)
        .add("alias", alias)
        .add("constant", constant)
        .add("functionArgExpression", functionArgExpression)
        .toString();
  }
}

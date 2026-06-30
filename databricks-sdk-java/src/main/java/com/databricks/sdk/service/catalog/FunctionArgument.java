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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionArgument that = (FunctionArgument) o;
    return Objects.equals(alias, that.alias) && Objects.equals(constant, that.constant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, constant);
  }

  @Override
  public String toString() {
    return new ToStringer(FunctionArgument.class)
        .add("alias", alias)
        .add("constant", constant)
        .toString();
  }
}

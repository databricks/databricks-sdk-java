// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A function that is dependent on a SQL object.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class FunctionDependency {
  /**
   * Full name of the dependent function, in the form of
   * __catalog_name__.__schema_name__.__function_name__.
   */
  @JsonProperty("function_full_name")
  private String functionFullName;

  /**
   * <p>Setter for the field <code>functionFullName</code>.</p>
   *
   * @param functionFullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.FunctionDependency} object
   */
  public FunctionDependency setFunctionFullName(String functionFullName) {
    this.functionFullName = functionFullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>functionFullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFunctionFullName() {
    return functionFullName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FunctionDependency that = (FunctionDependency) o;
    return Objects.equals(functionFullName, that.functionFullName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(functionFullName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(FunctionDependency.class)
        .add("functionFullName", functionFullName)
        .toString();
  }
}

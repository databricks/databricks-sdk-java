// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>ColumnMask class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ColumnMask {
  /** The full name of the column maks SQL UDF. */
  @JsonProperty("function_name")
  private String functionName;

  /**
   * The list of additional table columns to be passed as input to the column mask function. The
   * first arg of the mask function should be of the type of the column being masked and the types
   * of the rest of the args should match the types of columns in 'using_column_names'.
   */
  @JsonProperty("using_column_names")
  private Collection<String> usingColumnNames;

  /**
   * <p>Setter for the field <code>functionName</code>.</p>
   *
   * @param functionName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnMask} object
   */
  public ColumnMask setFunctionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  /**
   * <p>Getter for the field <code>functionName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFunctionName() {
    return functionName;
  }

  /**
   * <p>Setter for the field <code>usingColumnNames</code>.</p>
   *
   * @param usingColumnNames a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.ColumnMask} object
   */
  public ColumnMask setUsingColumnNames(Collection<String> usingColumnNames) {
    this.usingColumnNames = usingColumnNames;
    return this;
  }

  /**
   * <p>Getter for the field <code>usingColumnNames</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getUsingColumnNames() {
    return usingColumnNames;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ColumnMask that = (ColumnMask) o;
    return Objects.equals(functionName, that.functionName)
        && Objects.equals(usingColumnNames, that.usingColumnNames);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(functionName, usingColumnNames);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ColumnMask.class)
        .add("functionName", functionName)
        .add("usingColumnNames", usingColumnNames)
        .toString();
  }
}

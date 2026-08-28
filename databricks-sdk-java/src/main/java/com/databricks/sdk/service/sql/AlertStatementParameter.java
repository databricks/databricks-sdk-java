// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A named parameter bound to the alert query. Only flat, named scalar parameters are supported;
 * complex types such as ARRAY, MAP, and STRUCT are not.
 */
@Generated
public class AlertStatementParameter {
  /**
   * The name of the parameter. Reference it in the query text as `:name`. Required, must be
   * non-empty, and must be unique across the alert's parameters.
   */
  @JsonProperty("name")
  private String name;

  /**
   * The SQL data type of the parameter, for example `STRING`, `INT`, or `DECIMAL(10, 2)`. If no
   * type is given the type is assumed to be `STRING`. Complex types such as `ARRAY`, `MAP`, and
   * `STRUCT` are not supported.
   */
  @JsonProperty("type")
  private String typeValue;

  /**
   * The value bound to the parameter, represented as a string. If omitted, the value is interpreted
   * as NULL.
   */
  @JsonProperty("value")
  private String value;

  public AlertStatementParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public AlertStatementParameter setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public AlertStatementParameter setValue(String value) {
    this.value = value;
    return this;
  }

  public String getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertStatementParameter that = (AlertStatementParameter) o;
    return Objects.equals(name, that.name)
        && Objects.equals(typeValue, that.typeValue)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, typeValue, value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertStatementParameter.class)
        .add("name", name)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }
}

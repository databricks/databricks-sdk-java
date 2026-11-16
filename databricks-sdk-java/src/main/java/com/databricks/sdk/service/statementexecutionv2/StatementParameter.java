// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.statementexecutionv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A named parameter to substitute for a parameter marker in the statement. */
@Generated
public class StatementParameter {
  /** The name of a parameter marker to be substituted in the statement. */
  @JsonProperty("name")
  private String name;

  /**
   * The data type, given as a string. For example: `INT`, `STRING`, `DECIMAL(10,2)`. If no type is
   * given the type is assumed to be `STRING`. Complex types, such as `ARRAY`, `MAP`, and `STRUCT`
   * are not supported. For valid types, refer to the section [Data types] of the SQL language
   * reference.
   *
   * <p>[Data types]: https://docs.databricks.com/sql/language-manual/functions/cast.html
   */
  @JsonProperty("type")
  private String typeValue;

  /**
   * The value to substitute, represented as a string. If omitted, the value is interpreted as NULL.
   */
  @JsonProperty("value")
  private String value;

  public StatementParameter setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public StatementParameter setType(String typeValue) {
    this.typeValue = typeValue;
    return this;
  }

  public String getType() {
    return typeValue;
  }

  public StatementParameter setValue(String value) {
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
    StatementParameter that = (StatementParameter) o;
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
    return new ToStringer(StatementParameter.class)
        .add("name", name)
        .add("typeValue", typeValue)
        .add("value", value)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Redash-owned copy of the internal StatementParameter for the external AlertV2 API. The internal
 * `ordinal` and `args` fields are intentionally omitted: the public API supports only flat, named
 * scalar parameters; complex types (ARRAY, MAP, STRUCT) are not supported. This mirrors SEA's
 * public StatementParameter schema, see:
 * cmdexec/sql-exec-api/proto/sql_exec_api_service.proto:763-779
 */
@Generated
public class AlertStatementParameter {
  /** The name of the parameter, referenced in the query as `:name`. */
  @JsonProperty("name")
  private String name;

  /**
   * The SQL data type of the parameter, e.g. STRING, INT, or DATE. Defaults to STRING. This is a
   * string rather than an enum because scalar subtypes such as DECIMAL(10, 4) cannot be enumerated.
   * Complex types such as ARRAY, MAP, and STRUCT are not supported.
   */
  @JsonProperty("type")
  private String typeValue;

  /**
   * The bound value for the parameter, given as a string. If omitted, the value is interpreted as
   * NULL.
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

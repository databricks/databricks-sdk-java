// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class SqlStatementQueryResultRowRowValue {
  /** The value rendered as a string. */
  @JsonProperty("string_value")
  private String stringValue;

  public SqlStatementQueryResultRowRowValue setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    SqlStatementQueryResultRowRowValue that = (SqlStatementQueryResultRowRowValue) o;
    return Objects.equals(stringValue, that.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringValue);
  }

  @Override
  public String toString() {
    return new ToStringer(SqlStatementQueryResultRowRowValue.class)
        .add("stringValue", stringValue)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertV2Operand {
  /** */
  @JsonProperty("column")
  private AlertV2OperandColumn column;

  /** */
  @JsonProperty("value")
  private AlertV2OperandValue value;

  public AlertV2Operand setColumn(AlertV2OperandColumn column) {
    this.column = column;
    return this;
  }

  public AlertV2OperandColumn getColumn() {
    return column;
  }

  public AlertV2Operand setValue(AlertV2OperandValue value) {
    this.value = value;
    return this;
  }

  public AlertV2OperandValue getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertV2Operand that = (AlertV2Operand) o;
    return Objects.equals(column, that.column) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2Operand.class)
        .add("column", column)
        .add("value", value)
        .toString();
  }
}

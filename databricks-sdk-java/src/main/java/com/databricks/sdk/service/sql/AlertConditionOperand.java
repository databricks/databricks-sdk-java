// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertConditionOperand {
  /** */
  @JsonProperty("column")
  private AlertOperandColumn column;

  public AlertConditionOperand setColumn(AlertOperandColumn column) {
    this.column = column;
    return this;
  }

  public AlertOperandColumn getColumn() {
    return column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertConditionOperand that = (AlertConditionOperand) o;
    return Objects.equals(column, that.column);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConditionOperand.class).add("column", column).toString();
  }
}

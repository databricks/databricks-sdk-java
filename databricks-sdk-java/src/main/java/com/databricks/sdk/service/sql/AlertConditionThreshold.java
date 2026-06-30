// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AlertConditionThreshold {
  /** */
  @JsonProperty("value")
  private AlertOperandValue value;

  public AlertConditionThreshold setValue(AlertOperandValue value) {
    this.value = value;
    return this;
  }

  public AlertOperandValue getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AlertConditionThreshold that = (AlertConditionThreshold) o;
    return Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertConditionThreshold.class).add("value", value).toString();
  }
}

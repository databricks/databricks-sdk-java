// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class AlertV2OperandValuePb {
  @JsonProperty("bool_value")
  private Boolean boolValue;

  @JsonProperty("double_value")
  private Double doubleValue;

  @JsonProperty("string_value")
  private String stringValue;

  public AlertV2OperandValuePb setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  public Boolean getBoolValue() {
    return boolValue;
  }

  public AlertV2OperandValuePb setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  public Double getDoubleValue() {
    return doubleValue;
  }

  public AlertV2OperandValuePb setStringValue(String stringValue) {
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
    AlertV2OperandValuePb that = (AlertV2OperandValuePb) o;
    return Objects.equals(boolValue, that.boolValue)
        && Objects.equals(doubleValue, that.doubleValue)
        && Objects.equals(stringValue, that.stringValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolValue, doubleValue, stringValue);
  }

  @Override
  public String toString() {
    return new ToStringer(AlertV2OperandValuePb.class)
        .add("boolValue", boolValue)
        .add("doubleValue", doubleValue)
        .add("stringValue", stringValue)
        .toString();
  }
}

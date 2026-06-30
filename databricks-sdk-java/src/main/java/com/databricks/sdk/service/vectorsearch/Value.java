// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Value {
  /** */
  @JsonProperty("bool_value")
  private Boolean boolValue;

  /** */
  @JsonProperty("list_value")
  private ListValue listValue;

  /** */
  @JsonProperty("number_value")
  private Double numberValue;

  /** */
  @JsonProperty("string_value")
  private String stringValue;

  /** */
  @JsonProperty("struct_value")
  private Struct structValue;

  public Value setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

  public Boolean getBoolValue() {
    return boolValue;
  }

  public Value setListValue(ListValue listValue) {
    this.listValue = listValue;
    return this;
  }

  public ListValue getListValue() {
    return listValue;
  }

  public Value setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  public Double getNumberValue() {
    return numberValue;
  }

  public Value setStringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  public String getStringValue() {
    return stringValue;
  }

  public Value setStructValue(Struct structValue) {
    this.structValue = structValue;
    return this;
  }

  public Struct getStructValue() {
    return structValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Value that = (Value) o;
    return Objects.equals(boolValue, that.boolValue)
        && Objects.equals(listValue, that.listValue)
        && Objects.equals(numberValue, that.numberValue)
        && Objects.equals(stringValue, that.stringValue)
        && Objects.equals(structValue, that.structValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boolValue, listValue, numberValue, stringValue, structValue);
  }

  @Override
  public String toString() {
    return new ToStringer(Value.class)
        .add("boolValue", boolValue)
        .add("listValue", listValue)
        .add("numberValue", numberValue)
        .add("stringValue", stringValue)
        .add("structValue", structValue)
        .toString();
  }
}

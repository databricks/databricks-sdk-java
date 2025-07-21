// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settingsv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class Setting {
  /** */
  @JsonProperty("boolean_val")
  private BooleanMessage booleanVal;

  /** */
  @JsonProperty("effective_boolean_val")
  private BooleanMessage effectiveBooleanVal;

  /** */
  @JsonProperty("effective_integer_val")
  private IntegerMessage effectiveIntegerVal;

  /** */
  @JsonProperty("effective_string_val")
  private StringMessage effectiveStringVal;

  /** */
  @JsonProperty("integer_val")
  private IntegerMessage integerVal;

  /** Name of the setting. */
  @JsonProperty("name")
  private String name;

  /** */
  @JsonProperty("string_val")
  private StringMessage stringVal;

  public Setting setBooleanVal(BooleanMessage booleanVal) {
    this.booleanVal = booleanVal;
    return this;
  }

  public BooleanMessage getBooleanVal() {
    return booleanVal;
  }

  public Setting setEffectiveBooleanVal(BooleanMessage effectiveBooleanVal) {
    this.effectiveBooleanVal = effectiveBooleanVal;
    return this;
  }

  public BooleanMessage getEffectiveBooleanVal() {
    return effectiveBooleanVal;
  }

  public Setting setEffectiveIntegerVal(IntegerMessage effectiveIntegerVal) {
    this.effectiveIntegerVal = effectiveIntegerVal;
    return this;
  }

  public IntegerMessage getEffectiveIntegerVal() {
    return effectiveIntegerVal;
  }

  public Setting setEffectiveStringVal(StringMessage effectiveStringVal) {
    this.effectiveStringVal = effectiveStringVal;
    return this;
  }

  public StringMessage getEffectiveStringVal() {
    return effectiveStringVal;
  }

  public Setting setIntegerVal(IntegerMessage integerVal) {
    this.integerVal = integerVal;
    return this;
  }

  public IntegerMessage getIntegerVal() {
    return integerVal;
  }

  public Setting setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Setting setStringVal(StringMessage stringVal) {
    this.stringVal = stringVal;
    return this;
  }

  public StringMessage getStringVal() {
    return stringVal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Setting that = (Setting) o;
    return Objects.equals(booleanVal, that.booleanVal)
        && Objects.equals(effectiveBooleanVal, that.effectiveBooleanVal)
        && Objects.equals(effectiveIntegerVal, that.effectiveIntegerVal)
        && Objects.equals(effectiveStringVal, that.effectiveStringVal)
        && Objects.equals(integerVal, that.integerVal)
        && Objects.equals(name, that.name)
        && Objects.equals(stringVal, that.stringVal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        booleanVal,
        effectiveBooleanVal,
        effectiveIntegerVal,
        effectiveStringVal,
        integerVal,
        name,
        stringVal);
  }

  @Override
  public String toString() {
    return new ToStringer(Setting.class)
        .add("booleanVal", booleanVal)
        .add("effectiveBooleanVal", effectiveBooleanVal)
        .add("effectiveIntegerVal", effectiveIntegerVal)
        .add("effectiveStringVal", effectiveStringVal)
        .add("integerVal", integerVal)
        .add("name", name)
        .add("stringVal", stringVal)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
class TestNestedMessagePb {
  @JsonProperty("map")
  private Map<String, String> mapValue;

  @JsonProperty("nested_bool")
  private Boolean nestedBool;

  @JsonProperty("nested_enum")
  private TestEnum nestedEnum;

  @JsonProperty("nested_int")
  private Long nestedInt;

  @JsonProperty("nested_repeated_enum")
  private Collection<TestEnum> nestedRepeatedEnum;

  @JsonProperty("nested_repeated_string")
  private Collection<String> nestedRepeatedString;

  @JsonProperty("nested_required_bool")
  private Boolean nestedRequiredBool;

  @JsonProperty("nested_required_int")
  private Long nestedRequiredInt;

  @JsonProperty("nested_string")
  private String nestedString;

  public TestNestedMessagePb setMap(Map<String, String> mapValue) {
    this.mapValue = mapValue;
    return this;
  }

  public Map<String, String> getMap() {
    return mapValue;
  }

  public TestNestedMessagePb setNestedBool(Boolean nestedBool) {
    this.nestedBool = nestedBool;
    return this;
  }

  public Boolean getNestedBool() {
    return nestedBool;
  }

  public TestNestedMessagePb setNestedEnum(TestEnum nestedEnum) {
    this.nestedEnum = nestedEnum;
    return this;
  }

  public TestEnum getNestedEnum() {
    return nestedEnum;
  }

  public TestNestedMessagePb setNestedInt(Long nestedInt) {
    this.nestedInt = nestedInt;
    return this;
  }

  public Long getNestedInt() {
    return nestedInt;
  }

  public TestNestedMessagePb setNestedRepeatedEnum(Collection<TestEnum> nestedRepeatedEnum) {
    this.nestedRepeatedEnum = nestedRepeatedEnum;
    return this;
  }

  public Collection<TestEnum> getNestedRepeatedEnum() {
    return nestedRepeatedEnum;
  }

  public TestNestedMessagePb setNestedRepeatedString(Collection<String> nestedRepeatedString) {
    this.nestedRepeatedString = nestedRepeatedString;
    return this;
  }

  public Collection<String> getNestedRepeatedString() {
    return nestedRepeatedString;
  }

  public TestNestedMessagePb setNestedRequiredBool(Boolean nestedRequiredBool) {
    this.nestedRequiredBool = nestedRequiredBool;
    return this;
  }

  public Boolean getNestedRequiredBool() {
    return nestedRequiredBool;
  }

  public TestNestedMessagePb setNestedRequiredInt(Long nestedRequiredInt) {
    this.nestedRequiredInt = nestedRequiredInt;
    return this;
  }

  public Long getNestedRequiredInt() {
    return nestedRequiredInt;
  }

  public TestNestedMessagePb setNestedString(String nestedString) {
    this.nestedString = nestedString;
    return this;
  }

  public String getNestedString() {
    return nestedString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestNestedMessagePb that = (TestNestedMessagePb) o;
    return Objects.equals(mapValue, that.mapValue)
        && Objects.equals(nestedBool, that.nestedBool)
        && Objects.equals(nestedEnum, that.nestedEnum)
        && Objects.equals(nestedInt, that.nestedInt)
        && Objects.equals(nestedRepeatedEnum, that.nestedRepeatedEnum)
        && Objects.equals(nestedRepeatedString, that.nestedRepeatedString)
        && Objects.equals(nestedRequiredBool, that.nestedRequiredBool)
        && Objects.equals(nestedRequiredInt, that.nestedRequiredInt)
        && Objects.equals(nestedString, that.nestedString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        mapValue,
        nestedBool,
        nestedEnum,
        nestedInt,
        nestedRepeatedEnum,
        nestedRepeatedString,
        nestedRequiredBool,
        nestedRequiredInt,
        nestedString);
  }

  @Override
  public String toString() {
    return new ToStringer(TestNestedMessagePb.class)
        .add("mapValue", mapValue)
        .add("nestedBool", nestedBool)
        .add("nestedEnum", nestedEnum)
        .add("nestedInt", nestedInt)
        .add("nestedRepeatedEnum", nestedRepeatedEnum)
        .add("nestedRepeatedString", nestedRepeatedString)
        .add("nestedRequiredBool", nestedRequiredBool)
        .add("nestedRequiredInt", nestedRequiredInt)
        .add("nestedString", nestedString)
        .toString();
  }
}

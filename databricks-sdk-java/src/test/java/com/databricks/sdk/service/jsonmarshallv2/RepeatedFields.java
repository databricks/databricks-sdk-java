// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jsonmarshallv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class RepeatedFields {
  /** */
  @JsonProperty("repeated_bool")
  @QueryParam("repeated_bool")
  private Collection<Boolean> repeatedBool;

  /** */
  @JsonProperty("repeated_duration")
  @QueryParam("repeated_duration")
  private Collection<String> repeatedDuration;

  /** */
  @JsonProperty("repeated_field_mask")
  @QueryParam("repeated_field_mask")
  private Collection<String> repeatedFieldMask;

  /** */
  @JsonProperty("repeated_int32")
  @QueryParam("repeated_int32")
  private Collection<Long> repeatedInt32;

  /** */
  @JsonProperty("repeated_int64")
  @QueryParam("repeated_int64")
  private Collection<Long> repeatedInt64;

  /** */
  @JsonProperty("repeated_list_value")
  @QueryParam("repeated_list_value")
  private Collection<Collection<Object /* MISSING TYPE */>> repeatedListValue;

  /** */
  @JsonProperty("repeated_message")
  @QueryParam("repeated_message")
  private Collection<NestedMessage> repeatedMessage;

  /** */
  @JsonProperty("repeated_string")
  @QueryParam("repeated_string")
  private Collection<String> repeatedString;

  /** */
  @JsonProperty("repeated_struct")
  @QueryParam("repeated_struct")
  private Collection<Map<String, Object /* MISSING TYPE */>> repeatedStruct;

  /** */
  @JsonProperty("repeated_timestamp")
  @QueryParam("repeated_timestamp")
  private Collection<String> repeatedTimestamp;

  /** */
  @JsonProperty("repeated_value")
  @QueryParam("repeated_value")
  private Collection<Object /* MISSING TYPE */> repeatedValue;

  /** */
  @JsonProperty("test_repeated_enum")
  @QueryParam("test_repeated_enum")
  private Collection<TestEnum> testRepeatedEnum;

  public RepeatedFields setRepeatedBool(Collection<Boolean> repeatedBool) {
    this.repeatedBool = repeatedBool;
    return this;
  }

  public Collection<Boolean> getRepeatedBool() {
    return repeatedBool;
  }

  public RepeatedFields setRepeatedDuration(Collection<String> repeatedDuration) {
    this.repeatedDuration = repeatedDuration;
    return this;
  }

  public Collection<String> getRepeatedDuration() {
    return repeatedDuration;
  }

  public RepeatedFields setRepeatedFieldMask(Collection<String> repeatedFieldMask) {
    this.repeatedFieldMask = repeatedFieldMask;
    return this;
  }

  public Collection<String> getRepeatedFieldMask() {
    return repeatedFieldMask;
  }

  public RepeatedFields setRepeatedInt32(Collection<Long> repeatedInt32) {
    this.repeatedInt32 = repeatedInt32;
    return this;
  }

  public Collection<Long> getRepeatedInt32() {
    return repeatedInt32;
  }

  public RepeatedFields setRepeatedInt64(Collection<Long> repeatedInt64) {
    this.repeatedInt64 = repeatedInt64;
    return this;
  }

  public Collection<Long> getRepeatedInt64() {
    return repeatedInt64;
  }

  public RepeatedFields setRepeatedListValue(
      Collection<Collection<Object /* MISSING TYPE */>> repeatedListValue) {
    this.repeatedListValue = repeatedListValue;
    return this;
  }

  public Collection<Collection<Object /* MISSING TYPE */>> getRepeatedListValue() {
    return repeatedListValue;
  }

  public RepeatedFields setRepeatedMessage(Collection<NestedMessage> repeatedMessage) {
    this.repeatedMessage = repeatedMessage;
    return this;
  }

  public Collection<NestedMessage> getRepeatedMessage() {
    return repeatedMessage;
  }

  public RepeatedFields setRepeatedString(Collection<String> repeatedString) {
    this.repeatedString = repeatedString;
    return this;
  }

  public Collection<String> getRepeatedString() {
    return repeatedString;
  }

  public RepeatedFields setRepeatedStruct(
      Collection<Map<String, Object /* MISSING TYPE */>> repeatedStruct) {
    this.repeatedStruct = repeatedStruct;
    return this;
  }

  public Collection<Map<String, Object /* MISSING TYPE */>> getRepeatedStruct() {
    return repeatedStruct;
  }

  public RepeatedFields setRepeatedTimestamp(Collection<String> repeatedTimestamp) {
    this.repeatedTimestamp = repeatedTimestamp;
    return this;
  }

  public Collection<String> getRepeatedTimestamp() {
    return repeatedTimestamp;
  }

  public RepeatedFields setRepeatedValue(Collection<Object /* MISSING TYPE */> repeatedValue) {
    this.repeatedValue = repeatedValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getRepeatedValue() {
    return repeatedValue;
  }

  public RepeatedFields setTestRepeatedEnum(Collection<TestEnum> testRepeatedEnum) {
    this.testRepeatedEnum = testRepeatedEnum;
    return this;
  }

  public Collection<TestEnum> getTestRepeatedEnum() {
    return testRepeatedEnum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RepeatedFields that = (RepeatedFields) o;
    return Objects.equals(repeatedBool, that.repeatedBool)
        && Objects.equals(repeatedDuration, that.repeatedDuration)
        && Objects.equals(repeatedFieldMask, that.repeatedFieldMask)
        && Objects.equals(repeatedInt32, that.repeatedInt32)
        && Objects.equals(repeatedInt64, that.repeatedInt64)
        && Objects.equals(repeatedListValue, that.repeatedListValue)
        && Objects.equals(repeatedMessage, that.repeatedMessage)
        && Objects.equals(repeatedString, that.repeatedString)
        && Objects.equals(repeatedStruct, that.repeatedStruct)
        && Objects.equals(repeatedTimestamp, that.repeatedTimestamp)
        && Objects.equals(repeatedValue, that.repeatedValue)
        && Objects.equals(testRepeatedEnum, that.testRepeatedEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        repeatedBool,
        repeatedDuration,
        repeatedFieldMask,
        repeatedInt32,
        repeatedInt64,
        repeatedListValue,
        repeatedMessage,
        repeatedString,
        repeatedStruct,
        repeatedTimestamp,
        repeatedValue,
        testRepeatedEnum);
  }

  @Override
  public String toString() {
    return new ToStringer(RepeatedFields.class)
        .add("repeatedBool", repeatedBool)
        .add("repeatedDuration", repeatedDuration)
        .add("repeatedFieldMask", repeatedFieldMask)
        .add("repeatedInt32", repeatedInt32)
        .add("repeatedInt64", repeatedInt64)
        .add("repeatedListValue", repeatedListValue)
        .add("repeatedMessage", repeatedMessage)
        .add("repeatedString", repeatedString)
        .add("repeatedStruct", repeatedStruct)
        .add("repeatedTimestamp", repeatedTimestamp)
        .add("repeatedValue", repeatedValue)
        .add("testRepeatedEnum", testRepeatedEnum)
        .toString();
  }
}

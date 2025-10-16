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
public class RequiredFields {
  /** */
  @JsonProperty("required_bool")
  @QueryParam("required_bool")
  private Boolean requiredBool;

  /** */
  @JsonProperty("required_duration")
  @QueryParam("required_duration")
  private String requiredDuration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonProperty("required_field_mask")
  @QueryParam("required_field_mask")
  private String requiredFieldMask;

  /** */
  @JsonProperty("required_int32")
  @QueryParam("required_int32")
  private Long requiredInt32;

  /** */
  @JsonProperty("required_int64")
  @QueryParam("required_int64")
  private Long requiredInt64;

  /** */
  @JsonProperty("required_list_value")
  @QueryParam("required_list_value")
  private Collection<Object /* MISSING TYPE */> requiredListValue;

  /** */
  @JsonProperty("required_message")
  @QueryParam("required_message")
  private NestedMessage requiredMessage;

  /** */
  @JsonProperty("required_string")
  @QueryParam("required_string")
  private String requiredString;

  /** */
  @JsonProperty("required_struct")
  @QueryParam("required_struct")
  private Map<String, Object /* MISSING TYPE */> requiredStruct;

  /** */
  @JsonProperty("required_timestamp")
  @QueryParam("required_timestamp")
  private String requiredTimestamp;

  /** */
  @JsonProperty("required_value")
  @QueryParam("required_value")
  private Object /* MISSING TYPE */ requiredValue;

  /** */
  @JsonProperty("test_required_enum")
  @QueryParam("test_required_enum")
  private TestEnum testRequiredEnum;

  public RequiredFields setRequiredBool(Boolean requiredBool) {
    this.requiredBool = requiredBool;
    return this;
  }

  public Boolean getRequiredBool() {
    return requiredBool;
  }

  public RequiredFields setRequiredDuration(String requiredDuration) {
    this.requiredDuration = requiredDuration;
    return this;
  }

  public String getRequiredDuration() {
    return requiredDuration;
  }

  public RequiredFields setRequiredFieldMask(String requiredFieldMask) {
    this.requiredFieldMask = requiredFieldMask;
    return this;
  }

  public String getRequiredFieldMask() {
    return requiredFieldMask;
  }

  public RequiredFields setRequiredInt32(Long requiredInt32) {
    this.requiredInt32 = requiredInt32;
    return this;
  }

  public Long getRequiredInt32() {
    return requiredInt32;
  }

  public RequiredFields setRequiredInt64(Long requiredInt64) {
    this.requiredInt64 = requiredInt64;
    return this;
  }

  public Long getRequiredInt64() {
    return requiredInt64;
  }

  public RequiredFields setRequiredListValue(
      Collection<Object /* MISSING TYPE */> requiredListValue) {
    this.requiredListValue = requiredListValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getRequiredListValue() {
    return requiredListValue;
  }

  public RequiredFields setRequiredMessage(NestedMessage requiredMessage) {
    this.requiredMessage = requiredMessage;
    return this;
  }

  public NestedMessage getRequiredMessage() {
    return requiredMessage;
  }

  public RequiredFields setRequiredString(String requiredString) {
    this.requiredString = requiredString;
    return this;
  }

  public String getRequiredString() {
    return requiredString;
  }

  public RequiredFields setRequiredStruct(Map<String, Object /* MISSING TYPE */> requiredStruct) {
    this.requiredStruct = requiredStruct;
    return this;
  }

  public Map<String, Object /* MISSING TYPE */> getRequiredStruct() {
    return requiredStruct;
  }

  public RequiredFields setRequiredTimestamp(String requiredTimestamp) {
    this.requiredTimestamp = requiredTimestamp;
    return this;
  }

  public String getRequiredTimestamp() {
    return requiredTimestamp;
  }

  public RequiredFields setRequiredValue(Object /* MISSING TYPE */ requiredValue) {
    this.requiredValue = requiredValue;
    return this;
  }

  public Object /* MISSING TYPE */ getRequiredValue() {
    return requiredValue;
  }

  public RequiredFields setTestRequiredEnum(TestEnum testRequiredEnum) {
    this.testRequiredEnum = testRequiredEnum;
    return this;
  }

  public TestEnum getTestRequiredEnum() {
    return testRequiredEnum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RequiredFields that = (RequiredFields) o;
    return Objects.equals(requiredBool, that.requiredBool)
        && Objects.equals(requiredDuration, that.requiredDuration)
        && Objects.equals(requiredFieldMask, that.requiredFieldMask)
        && Objects.equals(requiredInt32, that.requiredInt32)
        && Objects.equals(requiredInt64, that.requiredInt64)
        && Objects.equals(requiredListValue, that.requiredListValue)
        && Objects.equals(requiredMessage, that.requiredMessage)
        && Objects.equals(requiredString, that.requiredString)
        && Objects.equals(requiredStruct, that.requiredStruct)
        && Objects.equals(requiredTimestamp, that.requiredTimestamp)
        && Objects.equals(requiredValue, that.requiredValue)
        && Objects.equals(testRequiredEnum, that.testRequiredEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        requiredBool,
        requiredDuration,
        requiredFieldMask,
        requiredInt32,
        requiredInt64,
        requiredListValue,
        requiredMessage,
        requiredString,
        requiredStruct,
        requiredTimestamp,
        requiredValue,
        testRequiredEnum);
  }

  @Override
  public String toString() {
    return new ToStringer(RequiredFields.class)
        .add("requiredBool", requiredBool)
        .add("requiredDuration", requiredDuration)
        .add("requiredFieldMask", requiredFieldMask)
        .add("requiredInt32", requiredInt32)
        .add("requiredInt64", requiredInt64)
        .add("requiredListValue", requiredListValue)
        .add("requiredMessage", requiredMessage)
        .add("requiredString", requiredString)
        .add("requiredStruct", requiredStruct)
        .add("requiredTimestamp", requiredTimestamp)
        .add("requiredValue", requiredValue)
        .add("testRequiredEnum", testRequiredEnum)
        .toString();
  }
}

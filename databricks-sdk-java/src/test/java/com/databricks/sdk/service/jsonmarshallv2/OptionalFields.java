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
public class OptionalFields {
  /** */
  @JsonProperty("duration")
  @QueryParam("duration")
  private String duration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonProperty("field_mask")
  @QueryParam("field_mask")
  private String fieldMask;

  /** Legacy Well Known types */
  @JsonProperty("legacy_duration")
  @QueryParam("legacy_duration")
  private String legacyDuration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonProperty("legacy_field_mask")
  @QueryParam("legacy_field_mask")
  private String legacyFieldMask;

  /** */
  @JsonProperty("legacy_timestamp")
  @QueryParam("legacy_timestamp")
  private String legacyTimestamp;

  /** */
  @JsonProperty("list_value")
  @QueryParam("list_value")
  private Collection<Object /* MISSING TYPE */> listValue;

  /** Lint disable reason: This is a dummy field used to test SDK Generation logic. */
  @JsonProperty("map")
  @QueryParam("map")
  private Map<String, String> mapValue;

  /** */
  @JsonProperty("optional_bool")
  @QueryParam("optional_bool")
  private Boolean optionalBool;

  /** */
  @JsonProperty("optional_int32")
  @QueryParam("optional_int32")
  private Long optionalInt32;

  /** */
  @JsonProperty("optional_int64")
  @QueryParam("optional_int64")
  private Long optionalInt64;

  /** */
  @JsonProperty("optional_message")
  @QueryParam("optional_message")
  private NestedMessage optionalMessage;

  /** */
  @JsonProperty("optional_string")
  @QueryParam("optional_string")
  private String optionalString;

  /** */
  @JsonProperty("struct")
  @QueryParam("struct")
  private Map<String, Object /* MISSING TYPE */> structValue;

  /** */
  @JsonProperty("test_enum")
  @QueryParam("test_enum")
  private TestEnum testEnum;

  /** */
  @JsonProperty("timestamp")
  @QueryParam("timestamp")
  private String timestamp;

  /** */
  @JsonProperty("value")
  @QueryParam("value")
  private Object /* MISSING TYPE */ value;

  public OptionalFields setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  public String getDuration() {
    return duration;
  }

  public OptionalFields setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public OptionalFields setLegacyDuration(String legacyDuration) {
    this.legacyDuration = legacyDuration;
    return this;
  }

  public String getLegacyDuration() {
    return legacyDuration;
  }

  public OptionalFields setLegacyFieldMask(String legacyFieldMask) {
    this.legacyFieldMask = legacyFieldMask;
    return this;
  }

  public String getLegacyFieldMask() {
    return legacyFieldMask;
  }

  public OptionalFields setLegacyTimestamp(String legacyTimestamp) {
    this.legacyTimestamp = legacyTimestamp;
    return this;
  }

  public String getLegacyTimestamp() {
    return legacyTimestamp;
  }

  public OptionalFields setListValue(Collection<Object /* MISSING TYPE */> listValue) {
    this.listValue = listValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getListValue() {
    return listValue;
  }

  public OptionalFields setMap(Map<String, String> mapValue) {
    this.mapValue = mapValue;
    return this;
  }

  public Map<String, String> getMap() {
    return mapValue;
  }

  public OptionalFields setOptionalBool(Boolean optionalBool) {
    this.optionalBool = optionalBool;
    return this;
  }

  public Boolean getOptionalBool() {
    return optionalBool;
  }

  public OptionalFields setOptionalInt32(Long optionalInt32) {
    this.optionalInt32 = optionalInt32;
    return this;
  }

  public Long getOptionalInt32() {
    return optionalInt32;
  }

  public OptionalFields setOptionalInt64(Long optionalInt64) {
    this.optionalInt64 = optionalInt64;
    return this;
  }

  public Long getOptionalInt64() {
    return optionalInt64;
  }

  public OptionalFields setOptionalMessage(NestedMessage optionalMessage) {
    this.optionalMessage = optionalMessage;
    return this;
  }

  public NestedMessage getOptionalMessage() {
    return optionalMessage;
  }

  public OptionalFields setOptionalString(String optionalString) {
    this.optionalString = optionalString;
    return this;
  }

  public String getOptionalString() {
    return optionalString;
  }

  public OptionalFields setStruct(Map<String, Object /* MISSING TYPE */> structValue) {
    this.structValue = structValue;
    return this;
  }

  public Map<String, Object /* MISSING TYPE */> getStruct() {
    return structValue;
  }

  public OptionalFields setTestEnum(TestEnum testEnum) {
    this.testEnum = testEnum;
    return this;
  }

  public TestEnum getTestEnum() {
    return testEnum;
  }

  public OptionalFields setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public OptionalFields setValue(Object /* MISSING TYPE */ value) {
    this.value = value;
    return this;
  }

  public Object /* MISSING TYPE */ getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OptionalFields that = (OptionalFields) o;
    return Objects.equals(duration, that.duration)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(legacyDuration, that.legacyDuration)
        && Objects.equals(legacyFieldMask, that.legacyFieldMask)
        && Objects.equals(legacyTimestamp, that.legacyTimestamp)
        && Objects.equals(listValue, that.listValue)
        && Objects.equals(mapValue, that.mapValue)
        && Objects.equals(optionalBool, that.optionalBool)
        && Objects.equals(optionalInt32, that.optionalInt32)
        && Objects.equals(optionalInt64, that.optionalInt64)
        && Objects.equals(optionalMessage, that.optionalMessage)
        && Objects.equals(optionalString, that.optionalString)
        && Objects.equals(structValue, that.structValue)
        && Objects.equals(testEnum, that.testEnum)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration,
        fieldMask,
        legacyDuration,
        legacyFieldMask,
        legacyTimestamp,
        listValue,
        mapValue,
        optionalBool,
        optionalInt32,
        optionalInt64,
        optionalMessage,
        optionalString,
        structValue,
        testEnum,
        timestamp,
        value);
  }

  @Override
  public String toString() {
    return new ToStringer(OptionalFields.class)
        .add("duration", duration)
        .add("fieldMask", fieldMask)
        .add("legacyDuration", legacyDuration)
        .add("legacyFieldMask", legacyFieldMask)
        .add("legacyTimestamp", legacyTimestamp)
        .add("listValue", listValue)
        .add("mapValue", mapValue)
        .add("optionalBool", optionalBool)
        .add("optionalInt32", optionalInt32)
        .add("optionalInt64", optionalInt64)
        .add("optionalMessage", optionalMessage)
        .add("optionalString", optionalString)
        .add("structValue", structValue)
        .add("testEnum", testEnum)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}

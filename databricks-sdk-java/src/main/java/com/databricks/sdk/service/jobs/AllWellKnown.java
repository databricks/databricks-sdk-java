// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class AllWellKnown {
  /** */
  @JsonProperty("duration")
  private String duration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonProperty("field_mask")
  private String fieldMask;

  /** */
  @JsonProperty("list_value")
  private Collection<Object /* MISSING TYPE */> listValue;

  /** */
  @JsonProperty("repeated_duration")
  private Collection<String> repeatedDuration;

  /** */
  @JsonProperty("repeated_field_mask")
  private Collection<String> repeatedFieldMask;

  /** */
  @JsonProperty("repeated_list_value")
  private Collection<Collection<Object /* MISSING TYPE */>> repeatedListValue;

  /** */
  @JsonProperty("repeated_struct")
  private Collection<Map<String, Object /* MISSING TYPE */>> repeatedStruct;

  /** */
  @JsonProperty("repeated_timestamp")
  private Collection<String> repeatedTimestamp;

  /** */
  @JsonProperty("repeated_value")
  private Collection<Object /* MISSING TYPE */> repeatedValue;

  /** */
  @JsonProperty("required_duration")
  private String requiredDuration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  @JsonProperty("required_field_mask")
  private String requiredFieldMask;

  /** */
  @JsonProperty("required_list_value")
  private Collection<Object /* MISSING TYPE */> requiredListValue;

  /** */
  @JsonProperty("required_struct")
  private Map<String, Object /* MISSING TYPE */> requiredStruct;

  /** */
  @JsonProperty("required_timestamp")
  private String requiredTimestamp;

  /** */
  @JsonProperty("required_value")
  private Object /* MISSING TYPE */ requiredValue;

  /** */
  @JsonProperty("struct")
  private Map<String, Object /* MISSING TYPE */> structValue;

  /** */
  @JsonProperty("timestamp")
  private String timestamp;

  /** */
  @JsonProperty("value")
  private Object /* MISSING TYPE */ value;

  public AllWellKnown setDuration(String duration) {
    this.duration = duration;
    return this;
  }

  public String getDuration() {
    return duration;
  }

  public AllWellKnown setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public AllWellKnown setListValue(Collection<Object /* MISSING TYPE */> listValue) {
    this.listValue = listValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getListValue() {
    return listValue;
  }

  public AllWellKnown setRepeatedDuration(Collection<String> repeatedDuration) {
    this.repeatedDuration = repeatedDuration;
    return this;
  }

  public Collection<String> getRepeatedDuration() {
    return repeatedDuration;
  }

  public AllWellKnown setRepeatedFieldMask(Collection<String> repeatedFieldMask) {
    this.repeatedFieldMask = repeatedFieldMask;
    return this;
  }

  public Collection<String> getRepeatedFieldMask() {
    return repeatedFieldMask;
  }

  public AllWellKnown setRepeatedListValue(
      Collection<Collection<Object /* MISSING TYPE */>> repeatedListValue) {
    this.repeatedListValue = repeatedListValue;
    return this;
  }

  public Collection<Collection<Object /* MISSING TYPE */>> getRepeatedListValue() {
    return repeatedListValue;
  }

  public AllWellKnown setRepeatedStruct(
      Collection<Map<String, Object /* MISSING TYPE */>> repeatedStruct) {
    this.repeatedStruct = repeatedStruct;
    return this;
  }

  public Collection<Map<String, Object /* MISSING TYPE */>> getRepeatedStruct() {
    return repeatedStruct;
  }

  public AllWellKnown setRepeatedTimestamp(Collection<String> repeatedTimestamp) {
    this.repeatedTimestamp = repeatedTimestamp;
    return this;
  }

  public Collection<String> getRepeatedTimestamp() {
    return repeatedTimestamp;
  }

  public AllWellKnown setRepeatedValue(Collection<Object /* MISSING TYPE */> repeatedValue) {
    this.repeatedValue = repeatedValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getRepeatedValue() {
    return repeatedValue;
  }

  public AllWellKnown setRequiredDuration(String requiredDuration) {
    this.requiredDuration = requiredDuration;
    return this;
  }

  public String getRequiredDuration() {
    return requiredDuration;
  }

  public AllWellKnown setRequiredFieldMask(String requiredFieldMask) {
    this.requiredFieldMask = requiredFieldMask;
    return this;
  }

  public String getRequiredFieldMask() {
    return requiredFieldMask;
  }

  public AllWellKnown setRequiredListValue(
      Collection<Object /* MISSING TYPE */> requiredListValue) {
    this.requiredListValue = requiredListValue;
    return this;
  }

  public Collection<Object /* MISSING TYPE */> getRequiredListValue() {
    return requiredListValue;
  }

  public AllWellKnown setRequiredStruct(Map<String, Object /* MISSING TYPE */> requiredStruct) {
    this.requiredStruct = requiredStruct;
    return this;
  }

  public Map<String, Object /* MISSING TYPE */> getRequiredStruct() {
    return requiredStruct;
  }

  public AllWellKnown setRequiredTimestamp(String requiredTimestamp) {
    this.requiredTimestamp = requiredTimestamp;
    return this;
  }

  public String getRequiredTimestamp() {
    return requiredTimestamp;
  }

  public AllWellKnown setRequiredValue(Object /* MISSING TYPE */ requiredValue) {
    this.requiredValue = requiredValue;
    return this;
  }

  public Object /* MISSING TYPE */ getRequiredValue() {
    return requiredValue;
  }

  public AllWellKnown setStruct(Map<String, Object /* MISSING TYPE */> structValue) {
    this.structValue = structValue;
    return this;
  }

  public Map<String, Object /* MISSING TYPE */> getStruct() {
    return structValue;
  }

  public AllWellKnown setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public AllWellKnown setValue(Object /* MISSING TYPE */ value) {
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
    AllWellKnown that = (AllWellKnown) o;
    return Objects.equals(duration, that.duration)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(listValue, that.listValue)
        && Objects.equals(repeatedDuration, that.repeatedDuration)
        && Objects.equals(repeatedFieldMask, that.repeatedFieldMask)
        && Objects.equals(repeatedListValue, that.repeatedListValue)
        && Objects.equals(repeatedStruct, that.repeatedStruct)
        && Objects.equals(repeatedTimestamp, that.repeatedTimestamp)
        && Objects.equals(repeatedValue, that.repeatedValue)
        && Objects.equals(requiredDuration, that.requiredDuration)
        && Objects.equals(requiredFieldMask, that.requiredFieldMask)
        && Objects.equals(requiredListValue, that.requiredListValue)
        && Objects.equals(requiredStruct, that.requiredStruct)
        && Objects.equals(requiredTimestamp, that.requiredTimestamp)
        && Objects.equals(requiredValue, that.requiredValue)
        && Objects.equals(structValue, that.structValue)
        && Objects.equals(timestamp, that.timestamp)
        && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        duration,
        fieldMask,
        listValue,
        repeatedDuration,
        repeatedFieldMask,
        repeatedListValue,
        repeatedStruct,
        repeatedTimestamp,
        repeatedValue,
        requiredDuration,
        requiredFieldMask,
        requiredListValue,
        requiredStruct,
        requiredTimestamp,
        requiredValue,
        structValue,
        timestamp,
        value);
  }

  @Override
  public String toString() {
    return new ToStringer(AllWellKnown.class)
        .add("duration", duration)
        .add("fieldMask", fieldMask)
        .add("listValue", listValue)
        .add("repeatedDuration", repeatedDuration)
        .add("repeatedFieldMask", repeatedFieldMask)
        .add("repeatedListValue", repeatedListValue)
        .add("repeatedStruct", repeatedStruct)
        .add("repeatedTimestamp", repeatedTimestamp)
        .add("repeatedValue", repeatedValue)
        .add("requiredDuration", requiredDuration)
        .add("requiredFieldMask", requiredFieldMask)
        .add("requiredListValue", requiredListValue)
        .add("requiredStruct", requiredStruct)
        .add("requiredTimestamp", requiredTimestamp)
        .add("requiredValue", requiredValue)
        .add("structValue", structValue)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.serialization.DurationDeserializer;
import com.databricks.sdk.core.serialization.DurationSerializer;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.Duration;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Generated
class AllWellKnownPb {
  @JsonProperty("duration")
  @JsonSerialize(using = DurationSerializer.class)
  @JsonDeserialize(using = DurationDeserializer.class)
  private Duration duration;

  @JsonProperty("field_mask")
  private String fieldMask;

  @JsonProperty("list_value")
  private Collection<JsonNode> listValue;

  @JsonProperty("repeated_duration")
  private Collection<Duration> repeatedDuration;

  @JsonProperty("repeated_field_mask")
  private Collection<FieldMask> repeatedFieldMask;

  @JsonProperty("repeated_list_value")
  private Collection<Collection<JsonNode>> repeatedListValue;

  @JsonProperty("repeated_timestamp")
  private Collection<Timestamp> repeatedTimestamp;

  @JsonProperty("repeated_value")
  private Collection<JsonNode> repeatedValue;

  @JsonProperty("required_duration")
  @JsonSerialize(using = DurationSerializer.class)
  @JsonDeserialize(using = DurationDeserializer.class)
  private Duration requiredDuration;

  @JsonProperty("required_field_mask")
  private String requiredFieldMask;

  @JsonProperty("required_list_value")
  private Collection<JsonNode> requiredListValue;

  @JsonProperty("required_timestamp")
  private String requiredTimestamp;

  @JsonProperty("required_value")
  private JsonNode requiredValue;

  @JsonProperty("timestamp")
  private String timestamp;

  @JsonProperty("value")
  private JsonNode value;

  public AllWellKnownPb setDuration(Duration duration) {
    this.duration = duration;
    return this;
  }

  public Duration getDuration() {
    return duration;
  }

  public AllWellKnownPb setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public AllWellKnownPb setListValue(Collection<JsonNode> listValue) {
    this.listValue = listValue;
    return this;
  }

  public Collection<JsonNode> getListValue() {
    return listValue;
  }

  public AllWellKnownPb setRepeatedDuration(Collection<Duration> repeatedDuration) {
    this.repeatedDuration = repeatedDuration;
    return this;
  }

  public Collection<Duration> getRepeatedDuration() {
    return repeatedDuration;
  }

  public AllWellKnownPb setRepeatedFieldMask(Collection<FieldMask> repeatedFieldMask) {
    this.repeatedFieldMask = repeatedFieldMask;
    return this;
  }

  public Collection<FieldMask> getRepeatedFieldMask() {
    return repeatedFieldMask;
  }

  public AllWellKnownPb setRepeatedListValue(Collection<Collection<JsonNode>> repeatedListValue) {
    this.repeatedListValue = repeatedListValue;
    return this;
  }

  public Collection<Collection<JsonNode>> getRepeatedListValue() {
    return repeatedListValue;
  }

  public AllWellKnownPb setRepeatedTimestamp(Collection<Timestamp> repeatedTimestamp) {
    this.repeatedTimestamp = repeatedTimestamp;
    return this;
  }

  public Collection<Timestamp> getRepeatedTimestamp() {
    return repeatedTimestamp;
  }

  public AllWellKnownPb setRepeatedValue(Collection<JsonNode> repeatedValue) {
    this.repeatedValue = repeatedValue;
    return this;
  }

  public Collection<JsonNode> getRepeatedValue() {
    return repeatedValue;
  }

  public AllWellKnownPb setRequiredDuration(Duration requiredDuration) {
    this.requiredDuration = requiredDuration;
    return this;
  }

  public Duration getRequiredDuration() {
    return requiredDuration;
  }

  public AllWellKnownPb setRequiredFieldMask(String requiredFieldMask) {
    this.requiredFieldMask = requiredFieldMask;
    return this;
  }

  public String getRequiredFieldMask() {
    return requiredFieldMask;
  }

  public AllWellKnownPb setRequiredListValue(Collection<JsonNode> requiredListValue) {
    this.requiredListValue = requiredListValue;
    return this;
  }

  public Collection<JsonNode> getRequiredListValue() {
    return requiredListValue;
  }

  public AllWellKnownPb setRequiredTimestamp(String requiredTimestamp) {
    this.requiredTimestamp = requiredTimestamp;
    return this;
  }

  public String getRequiredTimestamp() {
    return requiredTimestamp;
  }

  public AllWellKnownPb setRequiredValue(JsonNode requiredValue) {
    this.requiredValue = requiredValue;
    return this;
  }

  public JsonNode getRequiredValue() {
    return requiredValue;
  }

  public AllWellKnownPb setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public AllWellKnownPb setValue(JsonNode value) {
    this.value = value;
    return this;
  }

  public JsonNode getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AllWellKnownPb that = (AllWellKnownPb) o;
    return Objects.equals(duration, that.duration)
        && Objects.equals(fieldMask, that.fieldMask)
        && Objects.equals(listValue, that.listValue)
        && Objects.equals(repeatedDuration, that.repeatedDuration)
        && Objects.equals(repeatedFieldMask, that.repeatedFieldMask)
        && Objects.equals(repeatedListValue, that.repeatedListValue)
        && Objects.equals(repeatedTimestamp, that.repeatedTimestamp)
        && Objects.equals(repeatedValue, that.repeatedValue)
        && Objects.equals(requiredDuration, that.requiredDuration)
        && Objects.equals(requiredFieldMask, that.requiredFieldMask)
        && Objects.equals(requiredListValue, that.requiredListValue)
        && Objects.equals(requiredTimestamp, that.requiredTimestamp)
        && Objects.equals(requiredValue, that.requiredValue)
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
        repeatedTimestamp,
        repeatedValue,
        requiredDuration,
        requiredFieldMask,
        requiredListValue,
        requiredTimestamp,
        requiredValue,
        timestamp,
        value);
  }

  @Override
  public String toString() {
    return new ToStringer(AllWellKnownPb.class)
        .add("duration", duration)
        .add("fieldMask", fieldMask)
        .add("listValue", listValue)
        .add("repeatedDuration", repeatedDuration)
        .add("repeatedFieldMask", repeatedFieldMask)
        .add("repeatedListValue", repeatedListValue)
        .add("repeatedTimestamp", repeatedTimestamp)
        .add("repeatedValue", repeatedValue)
        .add("requiredDuration", requiredDuration)
        .add("requiredFieldMask", requiredFieldMask)
        .add("requiredListValue", requiredListValue)
        .add("requiredTimestamp", requiredTimestamp)
        .add("requiredValue", requiredValue)
        .add("timestamp", timestamp)
        .add("value", value)
        .toString();
  }
}

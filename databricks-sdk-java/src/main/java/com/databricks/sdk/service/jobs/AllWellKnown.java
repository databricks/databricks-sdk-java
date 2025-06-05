// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = AllWellKnown.AllWellKnownSerializer.class)
@JsonDeserialize(using = AllWellKnown.AllWellKnownDeserializer.class)
public class AllWellKnown {
  /** */
  private Duration duration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  private String fieldMask;

  /** */
  private Collection<JsonNode> listValue;

  /** */
  private Collection<Duration> repeatedDuration;

  /** */
  private Collection<List<String>> repeatedFieldMask;

  /** */
  private Collection<Collection<JsonNode>> repeatedListValue;

  /** */
  private Collection<Map<String, JsonNode>> repeatedStruct;

  /** */
  private Collection<Instant> repeatedTimestamp;

  /** */
  private Collection<JsonNode> repeatedValue;

  /** */
  private Duration requiredDuration;

  /**
   * The field mask must be a single string, with multiple fields separated by commas (no spaces).
   * The field path is relative to the resource object, using a dot (`.`) to navigate sub-fields
   * (e.g., `author.given_name`). Specification of elements in sequence or map fields is not
   * allowed, as only the entire collection field can be specified. Field names must exactly match
   * the resource field names.
   */
  private String requiredFieldMask;

  /** */
  private Collection<JsonNode> requiredListValue;

  /** */
  private Map<String, JsonNode> requiredStruct;

  /** */
  private String requiredTimestamp;

  /** */
  private JsonNode requiredValue;

  /** */
  private Map<String, JsonNode> structValue;

  /** */
  private String timestamp;

  /** */
  private JsonNode value;

  public AllWellKnown setDuration(Duration duration) {
    this.duration = duration;
    return this;
  }

  public Duration getDuration() {
    return duration;
  }

  public AllWellKnown setFieldMask(String fieldMask) {
    this.fieldMask = fieldMask;
    return this;
  }

  public String getFieldMask() {
    return fieldMask;
  }

  public AllWellKnown setListValue(Collection<JsonNode> listValue) {
    this.listValue = listValue;
    return this;
  }

  public Collection<JsonNode> getListValue() {
    return listValue;
  }

  public AllWellKnown setRepeatedDuration(Collection<Duration> repeatedDuration) {
    this.repeatedDuration = repeatedDuration;
    return this;
  }

  public Collection<Duration> getRepeatedDuration() {
    return repeatedDuration;
  }

  public AllWellKnown setRepeatedFieldMask(Collection<List<String>> repeatedFieldMask) {
    this.repeatedFieldMask = repeatedFieldMask;
    return this;
  }

  public Collection<List<String>> getRepeatedFieldMask() {
    return repeatedFieldMask;
  }

  public AllWellKnown setRepeatedListValue(Collection<Collection<JsonNode>> repeatedListValue) {
    this.repeatedListValue = repeatedListValue;
    return this;
  }

  public Collection<Collection<JsonNode>> getRepeatedListValue() {
    return repeatedListValue;
  }

  public AllWellKnown setRepeatedStruct(Collection<Map<String, JsonNode>> repeatedStruct) {
    this.repeatedStruct = repeatedStruct;
    return this;
  }

  public Collection<Map<String, JsonNode>> getRepeatedStruct() {
    return repeatedStruct;
  }

  public AllWellKnown setRepeatedTimestamp(Collection<Instant> repeatedTimestamp) {
    this.repeatedTimestamp = repeatedTimestamp;
    return this;
  }

  public Collection<Instant> getRepeatedTimestamp() {
    return repeatedTimestamp;
  }

  public AllWellKnown setRepeatedValue(Collection<JsonNode> repeatedValue) {
    this.repeatedValue = repeatedValue;
    return this;
  }

  public Collection<JsonNode> getRepeatedValue() {
    return repeatedValue;
  }

  public AllWellKnown setRequiredDuration(Duration requiredDuration) {
    this.requiredDuration = requiredDuration;
    return this;
  }

  public Duration getRequiredDuration() {
    return requiredDuration;
  }

  public AllWellKnown setRequiredFieldMask(String requiredFieldMask) {
    this.requiredFieldMask = requiredFieldMask;
    return this;
  }

  public String getRequiredFieldMask() {
    return requiredFieldMask;
  }

  public AllWellKnown setRequiredListValue(Collection<JsonNode> requiredListValue) {
    this.requiredListValue = requiredListValue;
    return this;
  }

  public Collection<JsonNode> getRequiredListValue() {
    return requiredListValue;
  }

  public AllWellKnown setRequiredStruct(Map<String, JsonNode> requiredStruct) {
    this.requiredStruct = requiredStruct;
    return this;
  }

  public Map<String, JsonNode> getRequiredStruct() {
    return requiredStruct;
  }

  public AllWellKnown setRequiredTimestamp(String requiredTimestamp) {
    this.requiredTimestamp = requiredTimestamp;
    return this;
  }

  public String getRequiredTimestamp() {
    return requiredTimestamp;
  }

  public AllWellKnown setRequiredValue(JsonNode requiredValue) {
    this.requiredValue = requiredValue;
    return this;
  }

  public JsonNode getRequiredValue() {
    return requiredValue;
  }

  public AllWellKnown setStruct(Map<String, JsonNode> structValue) {
    this.structValue = structValue;
    return this;
  }

  public Map<String, JsonNode> getStruct() {
    return structValue;
  }

  public AllWellKnown setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  public String getTimestamp() {
    return timestamp;
  }

  public AllWellKnown setValue(JsonNode value) {
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

  AllWellKnownPb toPb() {
    AllWellKnownPb pb = new AllWellKnownPb();
    if (duration != null) {
      pb.setDuration(Converters.durationToPb(duration));
    }
    pb.setFieldMask(fieldMask);
    pb.setListValue(listValue);
    if (repeatedDuration != null) {
      List<String> repeatedDurationPb = new ArrayList<>();
      for (Duration item : repeatedDuration) {
        if (item != null) {
          repeatedDurationPb.add(Converters.durationToPb(item));
        }
      }
      pb.setRepeatedDuration(repeatedDurationPb);
    }
    if (repeatedFieldMask != null) {
      List<String> repeatedFieldMaskPb = new ArrayList<>();
      for (List<String> item : repeatedFieldMask) {
        if (item != null) {
          repeatedFieldMaskPb.add(Converters.fieldMaskToPb(item));
        }
      }
      pb.setRepeatedFieldMask(repeatedFieldMaskPb);
    }
    pb.setRepeatedListValue(repeatedListValue);
    pb.setRepeatedStruct(repeatedStruct);
    if (repeatedTimestamp != null) {
      List<String> repeatedTimestampPb = new ArrayList<>();
      for (Instant item : repeatedTimestamp) {
        if (item != null) {
          repeatedTimestampPb.add(Converters.instantToPb(item));
        }
      }
      pb.setRepeatedTimestamp(repeatedTimestampPb);
    }
    pb.setRepeatedValue(repeatedValue);
    if (requiredDuration != null) {
      pb.setRequiredDuration(Converters.durationToPb(requiredDuration));
    }
    pb.setRequiredFieldMask(requiredFieldMask);
    pb.setRequiredListValue(requiredListValue);
    pb.setRequiredStruct(requiredStruct);
    pb.setRequiredTimestamp(requiredTimestamp);
    pb.setRequiredValue(requiredValue);
    pb.setStruct(structValue);
    pb.setTimestamp(timestamp);
    pb.setValue(value);

    return pb;
  }

  static AllWellKnown fromPb(AllWellKnownPb pb) {
    AllWellKnown model = new AllWellKnown();
    if (pb.getDuration() != null) {
      model.setDuration(Converters.durationFromPb(pb.getDuration()));
    }
    model.setFieldMask(pb.getFieldMask());
    model.setListValue(pb.getListValue());
    if (pb.getRepeatedDuration() != null) {
      List<Duration> repeatedDuration = new ArrayList<>();
      for (String item : pb.getRepeatedDuration()) {
        if (item != null) {
          repeatedDuration.add(Converters.durationFromPb(item));
        }
      }
      model.setRepeatedDuration(repeatedDuration);
    }
    if (pb.getRepeatedFieldMask() != null) {
      List<List<String>> repeatedFieldMask = new ArrayList<>();
      for (String item : pb.getRepeatedFieldMask()) {
        if (item != null) {
          repeatedFieldMask.add(Converters.fieldMaskFromPb(item));
        }
      }
      model.setRepeatedFieldMask(repeatedFieldMask);
    }
    model.setRepeatedListValue(pb.getRepeatedListValue());
    model.setRepeatedStruct(pb.getRepeatedStruct());
    if (pb.getRepeatedTimestamp() != null) {
      List<Instant> repeatedTimestamp = new ArrayList<>();
      for (String item : pb.getRepeatedTimestamp()) {
        if (item != null) {
          repeatedTimestamp.add(Converters.instantFromPb(item));
        }
      }
      model.setRepeatedTimestamp(repeatedTimestamp);
    }
    model.setRepeatedValue(pb.getRepeatedValue());
    if (pb.getRequiredDuration() != null) {
      model.setRequiredDuration(Converters.durationFromPb(pb.getRequiredDuration()));
    }
    model.setRequiredFieldMask(pb.getRequiredFieldMask());
    model.setRequiredListValue(pb.getRequiredListValue());
    model.setRequiredStruct(pb.getRequiredStruct());
    model.setRequiredTimestamp(pb.getRequiredTimestamp());
    model.setRequiredValue(pb.getRequiredValue());
    model.setStruct(pb.getStruct());
    model.setTimestamp(pb.getTimestamp());
    model.setValue(pb.getValue());

    return model;
  }

  public static class AllWellKnownSerializer extends JsonSerializer<AllWellKnown> {
    @Override
    public void serialize(AllWellKnown value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AllWellKnownPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AllWellKnownDeserializer extends JsonDeserializer<AllWellKnown> {
    @Override
    public AllWellKnown deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AllWellKnownPb pb = mapper.readValue(p, AllWellKnownPb.class);
      return AllWellKnown.fromPb(pb);
    }
  }
}

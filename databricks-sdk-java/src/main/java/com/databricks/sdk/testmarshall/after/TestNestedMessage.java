// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.testmarshall.after;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = TestNestedMessage.TestNestedMessageSerializer.class)
@JsonDeserialize(using = TestNestedMessage.TestNestedMessageDeserializer.class)
public class TestNestedMessage {
  /** */
  private Map<String, String> mapValue;

  /** */
  private Boolean nestedBool;

  /** */
  private TestEnum nestedEnum;

  /** */
  private Long nestedInt;

  /** */
  private Collection<TestEnum> nestedRepeatedEnum;

  /** */
  private Collection<String> nestedRepeatedString;

  /** */
  private Boolean nestedRequiredBool;

  /** */
  private Long nestedRequiredInt;

  /** */
  private String nestedString;

  public TestNestedMessage setMap(Map<String, String> mapValue) {
    this.mapValue = mapValue;
    return this;
  }

  public Map<String, String> getMap() {
    return mapValue;
  }

  public TestNestedMessage setNestedBool(Boolean nestedBool) {
    this.nestedBool = nestedBool;
    return this;
  }

  public Boolean getNestedBool() {
    return nestedBool;
  }

  public TestNestedMessage setNestedEnum(TestEnum nestedEnum) {
    this.nestedEnum = nestedEnum;
    return this;
  }

  public TestEnum getNestedEnum() {
    return nestedEnum;
  }

  public TestNestedMessage setNestedInt(Long nestedInt) {
    this.nestedInt = nestedInt;
    return this;
  }

  public Long getNestedInt() {
    return nestedInt;
  }

  public TestNestedMessage setNestedRepeatedEnum(Collection<TestEnum> nestedRepeatedEnum) {
    this.nestedRepeatedEnum = nestedRepeatedEnum;
    return this;
  }

  public Collection<TestEnum> getNestedRepeatedEnum() {
    return nestedRepeatedEnum;
  }

  public TestNestedMessage setNestedRepeatedString(Collection<String> nestedRepeatedString) {
    this.nestedRepeatedString = nestedRepeatedString;
    return this;
  }

  public Collection<String> getNestedRepeatedString() {
    return nestedRepeatedString;
  }

  public TestNestedMessage setNestedRequiredBool(Boolean nestedRequiredBool) {
    this.nestedRequiredBool = nestedRequiredBool;
    return this;
  }

  public Boolean getNestedRequiredBool() {
    return nestedRequiredBool;
  }

  public TestNestedMessage setNestedRequiredInt(Long nestedRequiredInt) {
    this.nestedRequiredInt = nestedRequiredInt;
    return this;
  }

  public Long getNestedRequiredInt() {
    return nestedRequiredInt;
  }

  public TestNestedMessage setNestedString(String nestedString) {
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
    TestNestedMessage that = (TestNestedMessage) o;
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
    return new ToStringer(TestNestedMessage.class)
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

  TestNestedMessagePb toPb() {
    TestNestedMessagePb pb = new TestNestedMessagePb();
    pb.setMap(mapValue);
    pb.setNestedBool(nestedBool);
    pb.setNestedEnum(nestedEnum);
    pb.setNestedInt(nestedInt);
    pb.setNestedRepeatedEnum(nestedRepeatedEnum);
    pb.setNestedRepeatedString(nestedRepeatedString);
    pb.setNestedRequiredBool(nestedRequiredBool);
    pb.setNestedRequiredInt(nestedRequiredInt);
    pb.setNestedString(nestedString);

    return pb;
  }

  static TestNestedMessage fromPb(TestNestedMessagePb pb) {
    TestNestedMessage model = new TestNestedMessage();
    model.setMap(pb.getMap());
    model.setNestedBool(pb.getNestedBool());
    model.setNestedEnum(pb.getNestedEnum());
    model.setNestedInt(pb.getNestedInt());
    model.setNestedRepeatedEnum(pb.getNestedRepeatedEnum());
    model.setNestedRepeatedString(pb.getNestedRepeatedString());
    model.setNestedRequiredBool(pb.getNestedRequiredBool());
    model.setNestedRequiredInt(pb.getNestedRequiredInt());
    model.setNestedString(pb.getNestedString());

    return model;
  }

  public static class TestNestedMessageSerializer extends JsonSerializer<TestNestedMessage> {
    @Override
    public void serialize(TestNestedMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TestNestedMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TestNestedMessageDeserializer extends JsonDeserializer<TestNestedMessage> {
    @Override
    public TestNestedMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TestNestedMessagePb pb = mapper.readValue(p, TestNestedMessagePb.class);
      return TestNestedMessage.fromPb(pb);
    }
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
@JsonSerialize(using = TestMarshallMessage.TestMarshallMessageSerializer.class)
@JsonDeserialize(using = TestMarshallMessage.TestMarshallMessageDeserializer.class)
public class TestMarshallMessage {
  /** */
  private Map<String, String> mapValue;

  /** */
  private TestEnum testEnum;

  /** */
  private TestNestedMessage testNestedMessage;

  /** */
  private Boolean testOptionalBool;

  /** */
  private Long testOptionalInt;

  /** */
  private Long testOptionalInt64;

  /** */
  private String testOptionalString;

  /** */
  private Collection<Boolean> testRepeatedBool;

  /** */
  private Collection<TestEnum> testRepeatedEnum;

  /** */
  private Collection<Long> testRepeatedInt;

  /** */
  private Collection<TestNestedMessage> testRepeatedNestedMessage;

  /** */
  private Collection<String> testRepeatedString;

  /** */
  private Boolean testRequiredBool;

  /** */
  private TestEnum testRequiredEnum;

  /** */
  private Long testRequiredInt;

  /** */
  private Long testRequiredInt64;

  /** */
  private String testRequiredString;

  public TestMarshallMessage setMap(Map<String, String> mapValue) {
    this.mapValue = mapValue;
    return this;
  }

  public Map<String, String> getMap() {
    return mapValue;
  }

  public TestMarshallMessage setTestEnum(TestEnum testEnum) {
    this.testEnum = testEnum;
    return this;
  }

  public TestEnum getTestEnum() {
    return testEnum;
  }

  public TestMarshallMessage setTestNestedMessage(TestNestedMessage testNestedMessage) {
    this.testNestedMessage = testNestedMessage;
    return this;
  }

  public TestNestedMessage getTestNestedMessage() {
    return testNestedMessage;
  }

  public TestMarshallMessage setTestOptionalBool(Boolean testOptionalBool) {
    this.testOptionalBool = testOptionalBool;
    return this;
  }

  public Boolean getTestOptionalBool() {
    return testOptionalBool;
  }

  public TestMarshallMessage setTestOptionalInt(Long testOptionalInt) {
    this.testOptionalInt = testOptionalInt;
    return this;
  }

  public Long getTestOptionalInt() {
    return testOptionalInt;
  }

  public TestMarshallMessage setTestOptionalInt64(Long testOptionalInt64) {
    this.testOptionalInt64 = testOptionalInt64;
    return this;
  }

  public Long getTestOptionalInt64() {
    return testOptionalInt64;
  }

  public TestMarshallMessage setTestOptionalString(String testOptionalString) {
    this.testOptionalString = testOptionalString;
    return this;
  }

  public String getTestOptionalString() {
    return testOptionalString;
  }

  public TestMarshallMessage setTestRepeatedBool(Collection<Boolean> testRepeatedBool) {
    this.testRepeatedBool = testRepeatedBool;
    return this;
  }

  public Collection<Boolean> getTestRepeatedBool() {
    return testRepeatedBool;
  }

  public TestMarshallMessage setTestRepeatedEnum(Collection<TestEnum> testRepeatedEnum) {
    this.testRepeatedEnum = testRepeatedEnum;
    return this;
  }

  public Collection<TestEnum> getTestRepeatedEnum() {
    return testRepeatedEnum;
  }

  public TestMarshallMessage setTestRepeatedInt(Collection<Long> testRepeatedInt) {
    this.testRepeatedInt = testRepeatedInt;
    return this;
  }

  public Collection<Long> getTestRepeatedInt() {
    return testRepeatedInt;
  }

  public TestMarshallMessage setTestRepeatedNestedMessage(
      Collection<TestNestedMessage> testRepeatedNestedMessage) {
    this.testRepeatedNestedMessage = testRepeatedNestedMessage;
    return this;
  }

  public Collection<TestNestedMessage> getTestRepeatedNestedMessage() {
    return testRepeatedNestedMessage;
  }

  public TestMarshallMessage setTestRepeatedString(Collection<String> testRepeatedString) {
    this.testRepeatedString = testRepeatedString;
    return this;
  }

  public Collection<String> getTestRepeatedString() {
    return testRepeatedString;
  }

  public TestMarshallMessage setTestRequiredBool(Boolean testRequiredBool) {
    this.testRequiredBool = testRequiredBool;
    return this;
  }

  public Boolean getTestRequiredBool() {
    return testRequiredBool;
  }

  public TestMarshallMessage setTestRequiredEnum(TestEnum testRequiredEnum) {
    this.testRequiredEnum = testRequiredEnum;
    return this;
  }

  public TestEnum getTestRequiredEnum() {
    return testRequiredEnum;
  }

  public TestMarshallMessage setTestRequiredInt(Long testRequiredInt) {
    this.testRequiredInt = testRequiredInt;
    return this;
  }

  public Long getTestRequiredInt() {
    return testRequiredInt;
  }

  public TestMarshallMessage setTestRequiredInt64(Long testRequiredInt64) {
    this.testRequiredInt64 = testRequiredInt64;
    return this;
  }

  public Long getTestRequiredInt64() {
    return testRequiredInt64;
  }

  public TestMarshallMessage setTestRequiredString(String testRequiredString) {
    this.testRequiredString = testRequiredString;
    return this;
  }

  public String getTestRequiredString() {
    return testRequiredString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TestMarshallMessage that = (TestMarshallMessage) o;
    return Objects.equals(mapValue, that.mapValue)
        && Objects.equals(testEnum, that.testEnum)
        && Objects.equals(testNestedMessage, that.testNestedMessage)
        && Objects.equals(testOptionalBool, that.testOptionalBool)
        && Objects.equals(testOptionalInt, that.testOptionalInt)
        && Objects.equals(testOptionalInt64, that.testOptionalInt64)
        && Objects.equals(testOptionalString, that.testOptionalString)
        && Objects.equals(testRepeatedBool, that.testRepeatedBool)
        && Objects.equals(testRepeatedEnum, that.testRepeatedEnum)
        && Objects.equals(testRepeatedInt, that.testRepeatedInt)
        && Objects.equals(testRepeatedNestedMessage, that.testRepeatedNestedMessage)
        && Objects.equals(testRepeatedString, that.testRepeatedString)
        && Objects.equals(testRequiredBool, that.testRequiredBool)
        && Objects.equals(testRequiredEnum, that.testRequiredEnum)
        && Objects.equals(testRequiredInt, that.testRequiredInt)
        && Objects.equals(testRequiredInt64, that.testRequiredInt64)
        && Objects.equals(testRequiredString, that.testRequiredString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        mapValue,
        testEnum,
        testNestedMessage,
        testOptionalBool,
        testOptionalInt,
        testOptionalInt64,
        testOptionalString,
        testRepeatedBool,
        testRepeatedEnum,
        testRepeatedInt,
        testRepeatedNestedMessage,
        testRepeatedString,
        testRequiredBool,
        testRequiredEnum,
        testRequiredInt,
        testRequiredInt64,
        testRequiredString);
  }

  @Override
  public String toString() {
    return new ToStringer(TestMarshallMessage.class)
        .add("mapValue", mapValue)
        .add("testEnum", testEnum)
        .add("testNestedMessage", testNestedMessage)
        .add("testOptionalBool", testOptionalBool)
        .add("testOptionalInt", testOptionalInt)
        .add("testOptionalInt64", testOptionalInt64)
        .add("testOptionalString", testOptionalString)
        .add("testRepeatedBool", testRepeatedBool)
        .add("testRepeatedEnum", testRepeatedEnum)
        .add("testRepeatedInt", testRepeatedInt)
        .add("testRepeatedNestedMessage", testRepeatedNestedMessage)
        .add("testRepeatedString", testRepeatedString)
        .add("testRequiredBool", testRequiredBool)
        .add("testRequiredEnum", testRequiredEnum)
        .add("testRequiredInt", testRequiredInt)
        .add("testRequiredInt64", testRequiredInt64)
        .add("testRequiredString", testRequiredString)
        .toString();
  }

  TestMarshallMessagePb toPb() {
    TestMarshallMessagePb pb = new TestMarshallMessagePb();
    pb.setMap(mapValue);
    pb.setTestEnum(testEnum);
    pb.setTestNestedMessage(testNestedMessage);
    pb.setTestOptionalBool(testOptionalBool);
    pb.setTestOptionalInt(testOptionalInt);
    pb.setTestOptionalInt64(testOptionalInt64);
    pb.setTestOptionalString(testOptionalString);
    pb.setTestRepeatedBool(testRepeatedBool);
    pb.setTestRepeatedEnum(testRepeatedEnum);
    pb.setTestRepeatedInt(testRepeatedInt);
    pb.setTestRepeatedNestedMessage(testRepeatedNestedMessage);
    pb.setTestRepeatedString(testRepeatedString);
    pb.setTestRequiredBool(testRequiredBool);
    pb.setTestRequiredEnum(testRequiredEnum);
    pb.setTestRequiredInt(testRequiredInt);
    pb.setTestRequiredInt64(testRequiredInt64);
    pb.setTestRequiredString(testRequiredString);

    return pb;
  }

  static TestMarshallMessage fromPb(TestMarshallMessagePb pb) {
    TestMarshallMessage model = new TestMarshallMessage();
    model.setMap(pb.getMap());
    model.setTestEnum(pb.getTestEnum());
    model.setTestNestedMessage(pb.getTestNestedMessage());
    model.setTestOptionalBool(pb.getTestOptionalBool());
    model.setTestOptionalInt(pb.getTestOptionalInt());
    model.setTestOptionalInt64(pb.getTestOptionalInt64());
    model.setTestOptionalString(pb.getTestOptionalString());
    model.setTestRepeatedBool(pb.getTestRepeatedBool());
    model.setTestRepeatedEnum(pb.getTestRepeatedEnum());
    model.setTestRepeatedInt(pb.getTestRepeatedInt());
    model.setTestRepeatedNestedMessage(pb.getTestRepeatedNestedMessage());
    model.setTestRepeatedString(pb.getTestRepeatedString());
    model.setTestRequiredBool(pb.getTestRequiredBool());
    model.setTestRequiredEnum(pb.getTestRequiredEnum());
    model.setTestRequiredInt(pb.getTestRequiredInt());
    model.setTestRequiredInt64(pb.getTestRequiredInt64());
    model.setTestRequiredString(pb.getTestRequiredString());

    return model;
  }

  public static class TestMarshallMessageSerializer extends JsonSerializer<TestMarshallMessage> {
    @Override
    public void serialize(TestMarshallMessage value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TestMarshallMessagePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TestMarshallMessageDeserializer
      extends JsonDeserializer<TestMarshallMessage> {
    @Override
    public TestMarshallMessage deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TestMarshallMessagePb pb = mapper.readValue(p, TestMarshallMessagePb.class);
      return TestMarshallMessage.fromPb(pb);
    }
  }
}

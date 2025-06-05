// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.testmarshall.before;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

@Generated
public class TestMarshallMessage {
  /** */
  @JsonProperty("map")
  private Map<String, String> mapValue;

  /** */
  @JsonProperty("test_enum")
  private TestEnum testEnum;

  /** */
  @JsonProperty("test_nested_message")
  private TestNestedMessage testNestedMessage;

  /** */
  @JsonProperty("test_optional_bool")
  private Boolean testOptionalBool;

  /** */
  @JsonProperty("test_optional_int")
  private Long testOptionalInt;

  /** */
  @JsonProperty("test_optional_int64")
  private Long testOptionalInt64;

  /** */
  @JsonProperty("test_optional_string")
  private String testOptionalString;

  /** */
  @JsonProperty("test_repeated_bool")
  private Collection<Boolean> testRepeatedBool;

  /** */
  @JsonProperty("test_repeated_enum")
  private Collection<TestEnum> testRepeatedEnum;

  /** */
  @JsonProperty("test_repeated_int")
  private Collection<Long> testRepeatedInt;

  /** */
  @JsonProperty("test_repeated_nested_message")
  private Collection<TestNestedMessage> testRepeatedNestedMessage;

  /** */
  @JsonProperty("test_repeated_string")
  private Collection<String> testRepeatedString;

  /** */
  @JsonProperty("test_required_bool")
  private Boolean testRequiredBool;

  /** */
  @JsonProperty("test_required_enum")
  private TestEnum testRequiredEnum;

  /** */
  @JsonProperty("test_required_int")
  private Long testRequiredInt;

  /** */
  @JsonProperty("test_required_int64")
  private Long testRequiredInt64;

  /** */
  @JsonProperty("test_required_string")
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
}

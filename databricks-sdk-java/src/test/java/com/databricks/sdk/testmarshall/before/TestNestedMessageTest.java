package com.databricks.sdk.testmarshall.before;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.junit.jupiter.api.Test;

class TestNestedMessageTest {
  @Test
  void testMarshallMessageSerializationEquality() throws Exception {
    // Prepare nested message values
    Map<String, String> map = new HashMap<>();
    map.put("key1", "value1");
    map.put("key2", "value2");
    List<String> repeatedStrings = Arrays.asList("a", "b");
    List<com.databricks.sdk.testmarshall.before.TestEnum> repeatedEnumsBefore =
        Arrays.asList(
            com.databricks.sdk.testmarshall.before.TestEnum.TEST_ENUM_ONE,
            com.databricks.sdk.testmarshall.before.TestEnum.TEST_ENUM_TWO);
    List<com.databricks.sdk.testmarshall.after.TestEnum> repeatedEnumsAfter =
        Arrays.asList(
            com.databricks.sdk.testmarshall.after.TestEnum.TEST_ENUM_ONE,
            com.databricks.sdk.testmarshall.after.TestEnum.TEST_ENUM_TWO);

    // Create nested messages
    com.databricks.sdk.testmarshall.before.TestNestedMessage beforeNested =
        new com.databricks.sdk.testmarshall.before.TestNestedMessage()
            .setMap(map)
            .setNestedBool(true)
            .setNestedEnum(com.databricks.sdk.testmarshall.before.TestEnum.TEST_ENUM_ONE)
            .setNestedInt(123L)
            .setNestedRepeatedEnum(repeatedEnumsBefore)
            .setNestedRepeatedString(repeatedStrings)
            .setNestedRequiredBool(true)
            .setNestedRequiredInt(456L)
            .setNestedString("nested");

    com.databricks.sdk.testmarshall.after.TestNestedMessage afterNested =
        new com.databricks.sdk.testmarshall.after.TestNestedMessage()
            .setMap(map)
            .setNestedBool(true)
            .setNestedEnum(com.databricks.sdk.testmarshall.after.TestEnum.TEST_ENUM_ONE)
            .setNestedInt(123L)
            .setNestedRepeatedEnum(repeatedEnumsAfter)
            .setNestedRepeatedString(repeatedStrings)
            .setNestedRequiredBool(true)
            .setNestedRequiredInt(456L)
            .setNestedString("nested");

    // Prepare repeated fields for main message
    List<Boolean> repeatedBools = Arrays.asList(true, false);
    List<Long> repeatedInts = Arrays.asList(1L, 2L);
    List<com.databricks.sdk.testmarshall.before.TestNestedMessage> repeatedNestedBefore =
        Arrays.asList(beforeNested);
    List<com.databricks.sdk.testmarshall.after.TestNestedMessage> repeatedNestedAfter =
        Arrays.asList(afterNested);

    // Create main messages
    com.databricks.sdk.testmarshall.before.TestMarshallMessage beforeMsg =
        new com.databricks.sdk.testmarshall.before.TestMarshallMessage()
            .setMap(map)
            .setTestEnum(com.databricks.sdk.testmarshall.before.TestEnum.TEST_ENUM_ONE)
            .setTestNestedMessage(beforeNested)
            .setTestOptionalBool(false)
            .setTestOptionalInt(10L)
            .setTestOptionalInt64(20L)
            .setTestOptionalString("optional")
            .setTestRepeatedBool(repeatedBools)
            .setTestRepeatedEnum(repeatedEnumsBefore)
            .setTestRepeatedInt(repeatedInts)
            .setTestRepeatedNestedMessage(repeatedNestedBefore)
            .setTestRepeatedString(repeatedStrings)
            .setTestRequiredBool(true)
            .setTestRequiredEnum(com.databricks.sdk.testmarshall.before.TestEnum.TEST_ENUM_TWO)
            .setTestRequiredInt(100L)
            .setTestRequiredInt64(200L)
            .setTestRequiredString("required");

    com.databricks.sdk.testmarshall.after.TestMarshallMessage afterMsg =
        new com.databricks.sdk.testmarshall.after.TestMarshallMessage()
            .setMap(map)
            .setTestEnum(com.databricks.sdk.testmarshall.after.TestEnum.TEST_ENUM_ONE)
            .setTestNestedMessage(afterNested)
            .setTestOptionalBool(false)
            .setTestOptionalInt(10L)
            .setTestOptionalInt64(20L)
            .setTestOptionalString("optional")
            .setTestRepeatedBool(repeatedBools)
            .setTestRepeatedEnum(repeatedEnumsAfter)
            .setTestRepeatedInt(repeatedInts)
            .setTestRepeatedNestedMessage(repeatedNestedAfter)
            .setTestRepeatedString(repeatedStrings)
            .setTestRequiredBool(true)
            .setTestRequiredEnum(com.databricks.sdk.testmarshall.after.TestEnum.TEST_ENUM_TWO)
            .setTestRequiredInt(100L)
            .setTestRequiredInt64(200L)
            .setTestRequiredString("required");

    ObjectMapper mapper = new ObjectMapper();
    String beforeJson = mapper.writeValueAsString(beforeMsg);
    String afterJson = mapper.writeValueAsString(afterMsg);

    assertEquals(beforeJson, afterJson, "Serialized JSON should be the same for before and after");
  }
}

package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FieldMaskSerializerTest {
  private static class TestClass {
    @JsonSerialize(using = FieldMaskSerializer.class)
    private FieldMask fieldMask;

    public TestClass(FieldMask fieldMask) {
      this.fieldMask = fieldMask;
    }
  }

  @ParameterizedTest
  @MethodSource("fieldMaskSerializationTestCases")
  public void testFieldMaskSerialization(List<String> fieldPaths, String expectedJson)
      throws Exception {
    FieldMask fieldMask = null;
    if (fieldPaths != null) {
      fieldMask = FieldMaskUtil.fromStringList(fieldPaths);
    }

    TestClass testObject = new TestClass(fieldMask);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals(expectedJson, json);
  }

  static Stream<Arguments> fieldMaskSerializationTestCases() {
    return Stream.of(
        // Simple field mask
        Arguments.of(Arrays.asList("foo", "bar.baz"), "{\"fieldMask\":\"foo,bar.baz\"}"),
        // Single field
        Arguments.of(Arrays.asList("name"), "{\"fieldMask\":\"name\"}"),
        // Nested fields
        Arguments.of(
            Arrays.asList("user.profile.email", "user.profile.name"),
            "{\"fieldMask\":\"user.profile.email,user.profile.name\"}"),
        // Null field mask
        Arguments.of(null, "{\"fieldMask\":null}"));
  }
}

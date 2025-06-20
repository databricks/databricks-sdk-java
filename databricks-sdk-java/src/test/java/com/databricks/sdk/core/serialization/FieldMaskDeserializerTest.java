package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.FieldMask;
import com.google.protobuf.util.FieldMaskUtil;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class FieldMaskDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = FieldMaskDeserializer.class)
    private FieldMask fieldMask;

    public FieldMask getFieldMask() {
      return fieldMask;
    }
  }

  @ParameterizedTest
  @MethodSource("fieldMaskDeserializationTestCases")
  public void testFieldMaskDeserialization(String inputJson, List<String> expectedFieldPaths)
      throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(inputJson, TestClass.class);

    if (expectedFieldPaths == null) {
      assertNull(obj.getFieldMask());
    } else {
      FieldMask expected = FieldMaskUtil.fromStringList(expectedFieldPaths);
      assertEquals(expected, obj.getFieldMask());
    }
  }

  static Stream<Arguments> fieldMaskDeserializationTestCases() {
    return Stream.of(
        // Simple field mask
        Arguments.of("{\"fieldMask\":\"foo,bar.baz\"}", Arrays.asList("foo", "bar.baz")),
        // Single field
        Arguments.of("{\"fieldMask\":\"name\"}", Arrays.asList("name")),
        // Nested fields
        Arguments.of(
            "{\"fieldMask\":\"user.profile.email,user.profile.name\"}",
            Arrays.asList("user.profile.email", "user.profile.name")),
        // Null field mask
        Arguments.of("{\"fieldMask\":null}", null));
  }
}

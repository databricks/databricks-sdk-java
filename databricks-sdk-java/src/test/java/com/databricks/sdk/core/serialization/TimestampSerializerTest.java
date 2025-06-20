package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.Timestamp;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TimestampSerializerTest {
  private static class TestClass {
    @JsonSerialize(using = TimestampSerializer.class)
    private Timestamp timestamp;

    public TestClass(Timestamp timestamp) {
      this.timestamp = timestamp;
    }
  }

  @ParameterizedTest
  @MethodSource("timestampSerializationTestCases")
  public void testTimestampSerialization(Timestamp timestamp, String expectedJson)
      throws Exception {
    TestClass testObject = new TestClass(timestamp);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals(expectedJson, json);
  }

  static Stream<Arguments> timestampSerializationTestCases() {
    return Stream.of(
        // Basic timestamp without nanos
        Arguments.of(
            Timestamp.newBuilder().setSeconds(1718886896L).build(),
            "{\"timestamp\":\"2024-06-20T12:34:56Z\"}"),
        // Timestamp with nanos
        Arguments.of(
            Timestamp.newBuilder().setSeconds(1718886896L).setNanos(123456789).build(),
            "{\"timestamp\":\"2024-06-20T12:34:56.123456789Z\"}"),
        // Null timestamp
        Arguments.of(null, "{\"timestamp\":null}"));
  }
}

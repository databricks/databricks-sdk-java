package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.Timestamp;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TimestampDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = TimestampDeserializer.class)
    private Timestamp timestamp;

    public Timestamp getTimestamp() {
      return timestamp;
    }
  }

  @ParameterizedTest
  @MethodSource("timestampDeserializationTestCases")
  public void testTimestampDeserialization(String inputJson, Timestamp expectedTimestamp)
      throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(inputJson, TestClass.class);
    assertEquals(expectedTimestamp, obj.getTimestamp());
  }

  static Stream<Arguments> timestampDeserializationTestCases() {
    return Stream.of(
        // Timestamp without nanos
        Arguments.of(
            "{\"timestamp\":\"2024-06-20T12:34:56Z\"}",
            Timestamp.newBuilder().setSeconds(1718886896L).build()),
        // Timestamp with nanos
        Arguments.of(
            "{\"timestamp\":\"2024-06-20T12:34:56.123456789Z\"}",
            Timestamp.newBuilder().setSeconds(1718886896L).setNanos(123456789).build()),
        // Null timestamp
        Arguments.of("{\"timestamp\":null}", null));
  }
}

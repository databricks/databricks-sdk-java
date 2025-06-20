package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.protobuf.Duration;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DurationSerializerTest {

  private static class TestClass {
    @JsonSerialize(using = DurationSerializer.class)
    private Duration duration;

    public TestClass(Duration duration) {
      this.duration = duration;
    }
  }

  @ParameterizedTest
  @MethodSource("durationSerializationTestCases")
  public void testDurationSerialization(Duration duration, String expectedJson) throws Exception {
    TestClass testObject = new TestClass(duration);
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(testObject);
    assertEquals(expectedJson, json);
  }

  static Stream<Arguments> durationSerializationTestCases() {
    return Stream.of(
        // Duration of 3 seconds
        Arguments.of(Duration.newBuilder().setSeconds(3).build(), "{\"duration\":\"3s\"}"),
        // Duration of 3.5 seconds (3 seconds + 500000000 nanoseconds)
        Arguments.of(
            Duration.newBuilder().setSeconds(3).setNanos(500000000).build(),
            "{\"duration\":\"3.500s\"}"),
        // Duration of 0 seconds
        Arguments.of(Duration.newBuilder().setSeconds(0).build(), "{\"duration\":\"0s\"}"),
        // Duration with only nanos
        Arguments.of(
            Duration.newBuilder().setNanos(123456789).build(), "{\"duration\":\"0.123456789s\"}"),
        // Null duration
        Arguments.of(null, "{\"duration\":null}"));
  }
}

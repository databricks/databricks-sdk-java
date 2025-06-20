package com.databricks.sdk.core.serialization;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.protobuf.Duration;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class DurationDeserializerTest {
  private static class TestClass {
    @JsonDeserialize(using = DurationDeserializer.class)
    private Duration duration;

    public Duration getDuration() {
      return duration;
    }
  }

  @ParameterizedTest
  @MethodSource("durationDeserializationTestCases")
  public void testDurationDeserialization(String inputJson, Duration expectedDuration)
      throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    TestClass obj = mapper.readValue(inputJson, TestClass.class);
    assertEquals(expectedDuration, obj.getDuration());
  }

  static Stream<Arguments> durationDeserializationTestCases() {
    return Stream.of(
        // Duration with seconds and nanos
        Arguments.of(
            "{\"duration\":\"3.500s\"}",
            Duration.newBuilder().setSeconds(3).setNanos(500000000).build()),
        // Duration with only seconds
        Arguments.of("{\"duration\":\"5s\"}", Duration.newBuilder().setSeconds(5).build()),
        // Duration with only nanos
        Arguments.of(
            "{\"duration\":\"0.123456789s\"}", Duration.newBuilder().setNanos(123456789).build()),
        // Null duration
        Arguments.of("{\"duration\":null}", null));
  }
}

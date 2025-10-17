package com.databricks.sdk.core.utils;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.Duration;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ProtobufModuleTest {

  // Helper wrapper classes for individual protobuf types.
  public static class FieldMaskWrapper {
    @JsonProperty("mask")
    public FieldMask mask;
  }

  public static class DurationWrapper {
    @JsonProperty("duration")
    public Duration duration;
  }

  public static class TimestampWrapper {
    @JsonProperty("timestamp")
    public Timestamp timestamp;
  }

  // FieldMask Parameterized Tests.
  @ParameterizedTest
  @ValueSource(
      strings = {
        "",
        "user.name,user.email",
        "profile.snake_case,profile.avatar",
        "profile.displayName,profile.avatar,settings.theme",
        "nested.deep.field",
        "nested.deep.field.value",
        "complex.nested.deep.path.with.multiple.levels"
      })
  public void testFieldMaskSerializationAndRoundtrip(String pathsString)
      throws JsonProcessingException {
    // Create original FieldMask.
    FieldMask.Builder builder = FieldMask.newBuilder();
    if (!pathsString.isEmpty()) {
      for (String path : pathsString.split(",")) {
        builder.addPaths(path.trim());
      }
    }
    FieldMask original = builder.build();

    // Test serialization.
    FieldMaskWrapper wrapper = new FieldMaskWrapper();
    wrapper.mask = original;

    String json = new ApiClient().serialize(wrapper);
    String expectedJson = "{\"mask\":\"" + pathsString + "\"}";
    assertEquals(expectedJson, json);

    // Test roundtrip (deserialize and verify).
    ObjectMapper mapper = SerDeUtils.createMapper();
    FieldMaskWrapper deserialized = mapper.readValue(json, FieldMaskWrapper.class);
    assertEquals(original.getPathsList(), deserialized.mask.getPathsList());
  }

  // Duration Parameterized Tests.
  static Stream<Arguments> durationTestCases() {
    return Stream.of(
        Arguments.of(0L, 0, "0s"),
        Arguments.of(1L, 0, "1s"),
        Arguments.of(30L, 0, "30s"),
        Arguments.of(3661L, 0, "3661s"), // 1 hour 1 minute 1 second
        Arguments.of(0L, 500_000_000, "0.500s"), // 0.5 seconds
        Arguments.of(1L, 500_000_000, "1.500s"), // 1.5 seconds
        Arguments.of(30L, 3, "30.000000003s") // 30 seconds + 3 nanoseconds
        );
  }

  @ParameterizedTest
  @MethodSource("durationTestCases")
  public void testDurationSerializationAndRoundtrip(
      long seconds, int nanos, String expectedDurationString) throws JsonProcessingException {
    Duration original = Duration.newBuilder().setSeconds(seconds).setNanos(nanos).build();

    DurationWrapper wrapper = new DurationWrapper();
    wrapper.duration = original;

    // Test serialization.
    String json = new ApiClient().serialize(wrapper);
    String expectedJson = "{\"duration\":\"" + expectedDurationString + "\"}";
    assertEquals(expectedJson, json);

    // Test roundtrip (deserialize and verify).
    ObjectMapper mapper = SerDeUtils.createMapper();
    DurationWrapper deserialized = mapper.readValue(json, DurationWrapper.class);
    assertEquals(original.getSeconds(), deserialized.duration.getSeconds());
    assertEquals(original.getNanos(), deserialized.duration.getNanos());
  }

  // Timestamp Parameterized Tests.
  static Stream<Arguments> timestampTestCases() {
    return Stream.of(
        Arguments.of(0L, 0, "1970-01-01T00:00:00Z"), // Unix epoch
        Arguments.of(1717756800L, 0, "2024-06-07T10:40:00Z"), // Test timestamp
        Arguments.of(1609459200L, 0, "2021-01-01T00:00:00Z"), // New Year 2021
        Arguments.of(1577836800L, 0, "2020-01-01T00:00:00Z"), // New Year 2020
        Arguments.of(1640995200L, 500_000_000, "2022-01-01T00:00:00.500Z"), // With nanoseconds
        Arguments.of(253402300799L, 999_999_999, "9999-12-31T23:59:59.999999999Z") // Far future
        );
  }

  @ParameterizedTest
  @MethodSource("timestampTestCases")
  public void testTimestampSerializationAndRoundtrip(
      long seconds, int nanos, String expectedTimestampString) throws JsonProcessingException {
    Timestamp original = Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();

    TimestampWrapper wrapper = new TimestampWrapper();
    wrapper.timestamp = original;

    // Test serialization.
    String json = new ApiClient().serialize(wrapper);
    String expectedJson = "{\"timestamp\":\"" + expectedTimestampString + "\"}";
    assertEquals(expectedJson, json);

    // Test roundtrip (deserialize and verify).
    ObjectMapper mapper = SerDeUtils.createMapper();
    TimestampWrapper deserialized = mapper.readValue(json, TimestampWrapper.class);
    assertEquals(original.getSeconds(), deserialized.timestamp.getSeconds());
    assertEquals(original.getNanos(), deserialized.timestamp.getNanos());
  }
}

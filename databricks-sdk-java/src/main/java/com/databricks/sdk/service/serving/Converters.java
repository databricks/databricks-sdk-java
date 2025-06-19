package com.databricks.sdk.service.serving;

import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

class Converters {

  private static final long MAX_SECONDS = 315576000000L;
  private static final long MIN_SECONDS = -315576000000L;

  static Duration durationFromPb(com.google.protobuf.Duration duration) {
    Objects.requireNonNull(duration, "duration must not be null");
    return Duration.ofSeconds(duration.getSeconds(), duration.getNanos());
  }

  static com.google.protobuf.Duration durationToPb(Duration duration) {
    Objects.requireNonNull(duration, "duration must not be null");
    // Validate that nanoseconds fit in an int
    if (duration.getSeconds() < MIN_SECONDS || duration.getSeconds() > MAX_SECONDS) {
      throw new IllegalArgumentException("Duration seconds out of range: " + duration.getSeconds());
    }
    return com.google.protobuf.Duration.newBuilder()
        .setSeconds(duration.getSeconds())
        .setNanos(duration.getNano())
        .build();
  }

  static Timestamp instantToPb(Instant instant) {
    Objects.requireNonNull(instant, "instant must not be null");
    return Timestamp.newBuilder()
        .setSeconds(instant.getEpochSecond())
        .setNanos(instant.getNano())
        .build();
  }

  static Instant instantFromPb(Timestamp timestamp) {
    Objects.requireNonNull(timestamp, "timestamp must not be null");
    // Validate that nanoseconds fit in an int
    if (timestamp.getSeconds() < MIN_SECONDS || timestamp.getSeconds() > MAX_SECONDS) {
      throw new IllegalArgumentException(
          "Timestamp seconds out of range: " + timestamp.getSeconds());
    }
    return Instant.ofEpochSecond(timestamp.getSeconds(), timestamp.getNanos());
  }

  static FieldMask fieldMaskToPb(List<String> fieldMask) {
    Objects.requireNonNull(fieldMask, "fieldMask must not be null");
    return FieldMask.newBuilder().addAllPaths(fieldMask).build();
  }

  static List<String> fieldMaskFromPb(com.google.protobuf.FieldMask fieldMask) {
    Objects.requireNonNull(fieldMask, "fieldMask must not be null");
    return fieldMask.getPathsList();
  }
}

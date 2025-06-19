package com.databricks.sdk.service.compute;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class Converters {
  static Duration durationFromPb(String duration) {
    Objects.requireNonNull(duration, "duration must not be null");
    // Remove the 's' suffix and parse as BigDecimal
    String secondsStr = duration.substring(0, duration.length() - 1);
    BigDecimal seconds = new BigDecimal(secondsStr);
    long wholeSeconds = seconds.longValue();
    int nanos =
        seconds
            .subtract(BigDecimal.valueOf(wholeSeconds))
            .multiply(BigDecimal.valueOf(1_000_000_000))
            .intValue();
    return Duration.ofSeconds(wholeSeconds, nanos);
  }

  static String durationToPb(Duration duration) {
    Objects.requireNonNull(duration, "duration must not be null");
    long seconds = duration.getSeconds();
    int nanos = duration.getNano();
    if (nanos == 0) {
      return seconds + "s";
    }
    BigDecimal totalSeconds = BigDecimal.valueOf(seconds).add(BigDecimal.valueOf(nanos, 9));
    return totalSeconds.stripTrailingZeros().toPlainString() + "s";
  }

  static String instantToPb(Instant instant) {
    Objects.requireNonNull(instant, "instant must not be null");
    return new DateTimeFormatterBuilder()
        .appendPattern("yyyy-MM-dd'T'HH:mm:ss")
        .appendFraction(ChronoField.NANO_OF_SECOND, 0, 9, true)
        .appendOffset("+HH:MM", "Z")
        .toFormatter()
        .withZone(ZoneOffset.UTC)
        .format(instant);
  }

  static Instant instantFromPb(String instant) {
    Objects.requireNonNull(instant, "instant must not be null");
    return Instant.parse(instant);
  }

  static String fieldMaskToPb(List<String> fieldMask) {
    Objects.requireNonNull(fieldMask, "fieldMask must not be null");
    return String.join(",", fieldMask);
  }

  static List<String> fieldMaskFromPb(String fieldMask) {
    Objects.requireNonNull(fieldMask, "fieldMask must not be null");
    return Arrays.asList(fieldMask.split(","));
  }
}

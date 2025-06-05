package com.databricks.sdk.service.jobs;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

class Converters {
  static Duration durationFromPb(String duration) {
    if (duration == null || duration.isEmpty()) {
      return null;
    }
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
    if (duration == null) {
      return null;
    }
    long seconds = duration.getSeconds();
    int nanos = duration.getNano();
    if (nanos == 0) {
      return seconds + "s";
    }
    BigDecimal totalSeconds = BigDecimal.valueOf(seconds).add(BigDecimal.valueOf(nanos, 9));
    return totalSeconds.stripTrailingZeros().toPlainString() + "s";
  }

  static String instantToPb(Instant instant) {
    if (instant == null) {
      return null;
    }
    // Use ISO_OFFSET_DATE_TIME for explicit offset
    return DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneOffset.UTC).format(instant);
  }

  static Instant instantFromPb(String instant) {
    if (instant == null || instant.isEmpty()) {
      return null;
    }
    return Instant.parse(instant);
  }

  static String fieldMaskToPb(List<String> fieldMask) {
    if (fieldMask == null) {
      return null;
    }
    return String.join(",", fieldMask);
  }

  static List<String> fieldMaskFromPb(String fieldMask) {
    if (fieldMask == null) {
      return null;
    }
    return Arrays.asList(fieldMask.split(","));
  }
}

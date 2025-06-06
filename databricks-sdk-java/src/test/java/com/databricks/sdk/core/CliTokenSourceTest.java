package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Instant;
import java.time.format.DateTimeParseException;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CliTokenSourceTest {

  private static Stream<Arguments> expiryProvider() {
    return Stream.of(
        Arguments.of(
            "2023-07-17T09:02:22.330612218Z", "2023-07-17T09:02:22.330612218Z", "9-digit nanos"),
        Arguments.of(
            "2023-07-17T09:02:22.33061221Z", "2023-07-17T09:02:22.330612210Z", "8-digit nanos"),
        Arguments.of(
            "2023-07-17T09:02:22.330612Z", "2023-07-17T09:02:22.330612000Z", "6-digit nanos"),
        Arguments.of(
            "2023-07-17T10:02:22.330612218+01:00",
            "2023-07-17T09:02:22.330612218Z",
            "+01:00 offset, 9-digit nanos"),
        Arguments.of(
            "2023-07-17T04:02:22.330612218-05:00",
            "2023-07-17T09:02:22.330612218Z",
            "-05:00 offset, 9-digit nanos"),
        Arguments.of(
            "2023-07-17T10:02:22.330612+01:00",
            "2023-07-17T09:02:22.330612000Z",
            "+01:00 offset, 6-digit nanos"),
        Arguments.of("2023-07-17T09:02:22.33061221987Z", null, "Invalid: >9 nanos"),
        Arguments.of("17-07-2023 09:02:22", null, "Invalid: non-ISO8601 format"));
  }

  @ParameterizedTest(name = "{2}")
  @MethodSource("expiryProvider")
  public void testParseExpiry(String input, String expectedInstant, String description) {
    if (expectedInstant == null) {
      assertThrows(DateTimeParseException.class, () -> CliTokenSource.parseExpiry(input));
    } else {
      Instant parsedInstant = CliTokenSource.parseExpiry(input);
      assertEquals(Instant.parse(expectedInstant), parsedInstant);
    }
  }
}

package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtilities;
import com.databricks.sdk.core.utils.OSUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

public class CliTokenSourceTest {
  String getExpiryStr(String dateFormat, Duration offset) {
    ZonedDateTime futureExpiry = ZonedDateTime.now().plus(offset);
    return futureExpiry.format(DateTimeFormatter.ofPattern(dateFormat));
  }

  private static Stream<Arguments> provideTimezoneTestCases() {
    // Generate timezones from GMT-12 to GMT+12.
    List<String> timezones =
        IntStream.rangeClosed(-12, 12)
            .mapToObj(offset -> offset == 0 ? "GMT" : String.format("GMT%+d", offset))
            .collect(Collectors.toList());

    // Time to expiry of tokens (minutes, shouldBeExpired).
    List<Arguments> minutesUntilExpiry =
        Arrays.asList(
            Arguments.of(5, false), // 5 minutes remaining
            Arguments.of(30, false), // 30 minutes remaining
            Arguments.of(60, false), // 1 hour remaining
            Arguments.of(120, false), // 2 hours remaining
            Arguments.of(-5, true), // 5 minutes ago
            Arguments.of(-30, true), // 30 minutes ago
            Arguments.of(-60, true), // 1 hour ago
            Arguments.of(-120, true) // 2 hours ago
            );

    // Create cross product of timezones and minutesUntilExpiry cases.
    return timezones.stream()
        .flatMap(
            timezone -> {
              List<String> dateFormats =
                  new ArrayList<>(
                      Arrays.asList(
                          "yyyy-MM-dd HH:mm:ss",
                          "yyyy-MM-dd HH:mm:ss.SSS",
                          "yyyy-MM-dd'T'HH:mm:ss.SSSXXX"));

              if (timezone.equals("GMT")) {
                // The Databricks CLI outputs timestamps with 'Z' suffix (e.g.,
                // 2024-03-14T10:30:00.000Z) only when in UTC/GMT+0 timezone.
                // Thus, we only test with this format together with the GMT timezone.
                dateFormats.add("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
              }

              return dateFormats.stream()
                  .flatMap(
                      dateFormat ->
                          minutesUntilExpiry.stream()
                              .map(
                                  minutesUntilExpiryCase -> {
                                    Object[] args = minutesUntilExpiryCase.get();
                                    return Arguments.of(timezone, args[0], args[1], dateFormat);
                                  }));
            });
  }

  @ParameterizedTest(name = "Test in {0} with {1} minutes offset using format {3}")
  @MethodSource("provideTimezoneTestCases")
  public void testRefreshWithDifferentTimezone(
      String timezone, int minutesUntilExpiry, boolean shouldBeExpired, String dateFormat)
      throws IOException, InterruptedException {
    // Save original timezone.
    TimeZone originalTimeZone = TimeZone.getDefault();
    try {
      TimeZone.setDefault(TimeZone.getTimeZone(timezone));
      testRefreshWithExpiry("Test in " + timezone, minutesUntilExpiry, shouldBeExpired, dateFormat);
    } finally {
      // Restore original timezone.
      TimeZone.setDefault(originalTimeZone);
    }
  }

  public void testRefreshWithExpiry(
      String testName, int minutesUntilExpiry, boolean shouldBeExpired, String dateFormat)
      throws IOException, InterruptedException {
    // Mock environment.
    Environment env = mock(Environment.class);
    Map<String, String> envMap = new HashMap<>();
    when(env.getEnv()).thenReturn(envMap);

    // Create test command.
    List<String> cmd = Arrays.asList("test", "command");

    // Mock OSUtilities.
    OSUtilities osUtils = mock(OSUtilities.class);
    when(osUtils.getCliExecutableCommand(any())).thenReturn(cmd);

    try (MockedStatic<OSUtils> mockedOSUtils = mockStatic(OSUtils.class)) {
      mockedOSUtils.when(() -> OSUtils.get(any())).thenReturn(osUtils);

      CliTokenSource tokenSource =
          new CliTokenSource(cmd, "token_type", "access_token", "expiry", env);

      String expiryStr = getExpiryStr(dateFormat, Duration.ofMinutes(minutesUntilExpiry));

      // Mock process to return the specified expiry string.
      Process process = mock(Process.class);
      when(process.getInputStream())
          .thenReturn(
              new ByteArrayInputStream(
                  String.format(
                          "{\"token_type\": \"Bearer\", \"access_token\": \"test-token\", \"expiry\": \"%s\"}",
                          expiryStr)
                      .getBytes()));
      when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
      when(process.waitFor()).thenReturn(0);

      // Mock ProcessBuilder constructor.
      try (MockedConstruction<ProcessBuilder> mocked =
          mockConstruction(
              ProcessBuilder.class,
              (mock, context) -> {
                when(mock.start()).thenReturn(process);
              })) {
        // Test refresh.
        Token token = tokenSource.refresh();
        assertEquals("Bearer", token.getTokenType());
        assertEquals("test-token", token.getAccessToken());
        assertEquals(shouldBeExpired, token.getExpiry().isBefore(Instant.now()));
      }
    }
  }

  private static Stream<Arguments> expiryProvider() {
    return Stream.of(
        Arguments.of(
            "2023-07-17T09:02:22.330612218Z",
            Instant.parse("2023-07-17T09:02:22.330612218Z"),
            "9-digit nanos"),
        Arguments.of(
            "2023-07-17T09:02:22.33061221Z",
            Instant.parse("2023-07-17T09:02:22.330612210Z"),
            "8-digit nanos"),
        Arguments.of(
            "2023-07-17T09:02:22.330612Z",
            Instant.parse("2023-07-17T09:02:22.330612000Z"),
            "6-digit nanos"),
        Arguments.of(
            "2023-07-17T10:02:22.330612218+01:00",
            Instant.parse("2023-07-17T09:02:22.330612218Z"),
            "+01:00 offset, 9-digit nanos"),
        Arguments.of(
            "2023-07-17T04:02:22.330612218-05:00",
            Instant.parse("2023-07-17T09:02:22.330612218Z"),
            "-05:00 offset, 9-digit nanos"),
        Arguments.of(
            "2023-07-17T10:02:22.330612+01:00",
            Instant.parse("2023-07-17T09:02:22.330612000Z"),
            "+01:00 offset, 6-digit nanos"),
        Arguments.of("2023-07-17T09:02:22.33061221987Z", null, "Invalid: >9 nanos"),
        Arguments.of("17-07-2023 09:02:22", null, "Invalid date format"),
        Arguments.of(
            "2023-07-17 09:02:22.330612218",
            LocalDateTime.parse("2023-07-17T09:02:22.330612218")
                .atZone(ZoneId.systemDefault())
                .toInstant(),
            "Space separator, 9-digit nanos"),
        Arguments.of(
            "2023-07-17 09:02:22.330612",
            LocalDateTime.parse("2023-07-17T09:02:22.330612")
                .atZone(ZoneId.systemDefault())
                .toInstant(),
            "Space separator, 6-digit nanos"),
        Arguments.of(
            "2023-07-17 09:02:22.33061221987", null, "Space separator, Invalid: >9 nanos"));
  }

  @ParameterizedTest(name = "{2}")
  @MethodSource("expiryProvider")
  public void testParseExpiry(String input, Instant expectedInstant, String description) {
    if (expectedInstant == null) {
      assertThrows(DateTimeParseException.class, () -> CliTokenSource.parseExpiry(input));
    } else {
      Instant parsedInstant = CliTokenSource.parseExpiry(input);
      assertEquals(expectedInstant, parsedInstant);
    }
  }
}

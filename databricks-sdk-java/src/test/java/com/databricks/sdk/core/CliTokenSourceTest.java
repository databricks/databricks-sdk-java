package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.utils.Environment;
import com.databricks.sdk.core.utils.OSUtils;
import com.databricks.sdk.core.utils.OSUtilities;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.MockedConstruction;
import org.mockito.MockedStatic;

public class CliTokenSourceTest {
  private static final String[] DATE_FORMATS = {
      "yyyy-MM-dd HH:mm:ss",
      "yyyy-MM-dd HH:mm:ss.SSS",
      "yyyy-MM-dd'T'HH:mm:ss.SSSXXX",
      "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
  };

  String getExpiryStr(String dateFormat, Duration offset) {
    ZonedDateTime futureExpiry = ZonedDateTime.now().plus(offset);
    return futureExpiry.format(DateTimeFormatter.ofPattern(dateFormat));
  }

  private static Stream<Arguments> provideTestCases() {
    return Stream.of(
        Arguments.of("Valid: 30min remaining", 30, false),
        Arguments.of("Valid: 1hr remaining", 60, false),
        Arguments.of("Valid: 2hrs remaining", 120, false),
        Arguments.of("Expired: 30min ago", -30, true),
        Arguments.of("Expired: 1hr ago", -60, true),
        Arguments.of("Expired: 2hrs ago", -120, true)
    );
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTestCases")
  public void testRefreshWithExpiry(String testName, int offsetMinutes, boolean shouldBeExpired) throws IOException, InterruptedException {
    for (String dateFormat : DATE_FORMATS) {
      // Mock environment
      Environment env = mock(Environment.class);
      Map<String, String> envMap = new HashMap<>();
      when(env.getEnv()).thenReturn(envMap);

      // Create test command
      List<String> cmd = Arrays.asList("test", "command");
      
      // Mock OSUtilities
      OSUtilities osUtils = mock(OSUtilities.class);
      when(osUtils.getCliExecutableCommand(any())).thenReturn(cmd);
      
      try (MockedStatic<OSUtils> mockedOSUtils = mockStatic(OSUtils.class)) {
        mockedOSUtils.when(() -> OSUtils.get(any())).thenReturn(osUtils);
        
        // Create token source
        CliTokenSource tokenSource = new CliTokenSource(cmd, "token_type", "access_token", "expiry", env);

        String expiryStr = getExpiryStr(dateFormat, Duration.ofMinutes(offsetMinutes));

        // Mock process
        Process process = mock(Process.class);
        when(process.getInputStream()).thenReturn(new ByteArrayInputStream(
            String.format("{\"token_type\": \"Bearer\", \"access_token\": \"test-token\", \"expiry\": \"%s\"}", expiryStr).getBytes()));
        when(process.getErrorStream()).thenReturn(new ByteArrayInputStream(new byte[0]));
        when(process.waitFor()).thenReturn(0);

        // Mock ProcessBuilder constructor
        try (MockedConstruction<ProcessBuilder> mocked = mockConstruction(ProcessBuilder.class,
            (mock, context) -> {
              when(mock.start()).thenReturn(process);
            })) {
          // Test refresh
          Token token = tokenSource.refresh();
          assertEquals("Bearer", token.getTokenType());
          assertEquals("test-token", token.getAccessToken());
          assertEquals(shouldBeExpired, token.isExpired());
        }
      }
    }
  }

  @Test
  public void testParseExpiryWithoutTruncate() {
    LocalDateTime parsedDateTime = CliTokenSource.parseExpiry("2023-07-17T09:02:22.330612218Z");
    assertEquals(LocalDateTime.of(2023, 7, 17, 9, 2, 22, 330612218), parsedDateTime);
  }

  @Test
  public void testParseExpiryWithTruncate() {
    LocalDateTime parsedDateTime = CliTokenSource.parseExpiry("2023-07-17T09:02:22.33061221Z");
    assertEquals(LocalDateTime.of(2023, 7, 17, 9, 2, 22, 330612210), parsedDateTime);
  }

  @Test
  public void testParseExpiryWithTruncateAndLessNanoSecondDigits() {
    LocalDateTime parsedDateTime = CliTokenSource.parseExpiry("2023-07-17T09:02:22.330612Z");
    assertEquals(LocalDateTime.of(2023, 7, 17, 9, 2, 22, 330612000), parsedDateTime);
  }

  @Test
  public void testParseExpiryWithMoreThanNineNanoSecondDigits() {
    try {
      CliTokenSource.parseExpiry("2023-07-17T09:02:22.33061221987Z");
    } catch (DateTimeParseException e) {
      assert (e.getMessage().contains("could not be parsed"));
    }
  }
}

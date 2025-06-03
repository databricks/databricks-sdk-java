package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.format.DateTimeParseException;
import org.junit.jupiter.api.Test;

public class CliTokenSourceTest {

  @Test
  public void testParseExpiryWithoutTruncate() {
    Instant parsedInstant = CliTokenSource.parseExpiry("2023-07-17T09:02:22.330612218Z");
    assertEquals(Instant.parse("2023-07-17T09:02:22.330612218Z"), parsedInstant);
  }

  @Test
  public void testParseExpiryWithTruncate() {
    Instant parsedInstant = CliTokenSource.parseExpiry("2023-07-17T09:02:22.33061221Z");
    assertEquals(Instant.parse("2023-07-17T09:02:22.330612210Z"), parsedInstant);
  }

  @Test
  public void testParseExpiryWithTruncateAndLessNanoSecondDigits() {
    Instant parsedInstant = CliTokenSource.parseExpiry("2023-07-17T09:02:22.330612Z");
    assertEquals(Instant.parse("2023-07-17T09:02:22.330612000Z"), parsedInstant);
  }

  @Test
  public void testParseExpiryWithMoreThanNineNanoSecondDigits() {
    try {
      CliTokenSource.parseExpiry("2023-07-17T09:02:22.33061221987Z");
    } catch (DateTimeParseException e) {
      assert (e.getMessage().contains("could not be parsed"));
    }
  }

  @Test
  public void testParseExpiryWithSpaceFormat() {
    Instant parsedInstant = CliTokenSource.parseExpiry("2023-07-17 09:02:22");
    assertEquals(Instant.parse("2023-07-17T09:02:22Z"), parsedInstant);
  }

  @Test
  public void testParseExpiryWithSpaceFormatAndMillis() {
    Instant parsedInstant = CliTokenSource.parseExpiry("2023-07-17 09:02:22.123");
    assertEquals(Instant.parse("2023-07-17T09:02:22.123Z"), parsedInstant);
  }

  @Test
  public void testParseExpiryWithInvalidFormat() {
    try {
      CliTokenSource.parseExpiry("17-07-2023 09:02:22");
    } catch (DateTimeParseException e) {
      assert (e.getMessage().contains("could not be parsed"));
    }
  }
}

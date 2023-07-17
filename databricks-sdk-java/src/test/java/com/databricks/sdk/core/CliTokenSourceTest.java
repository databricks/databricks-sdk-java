package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import org.junit.jupiter.api.Test;

public class CliTokenSourceTest {

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
      LocalDateTime parsedDateTime = CliTokenSource.parseExpiry("2023-07-17T09:02:22.33061221987Z");
    } catch (DateTimeParseException e) {
      assert (e.getMessage().contains("could not be parsed"));
    }
  }
}

package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.MessageFormatter;

/**
 * Verifies that JulLogger's placeholder formatting and Throwable extraction produce the same
 * results as SLF4J's {@link MessageFormatter#arrayFormat}, so the two backends behave identically
 * for any given Logger call.
 */
public class LoggingParityTest {

  @Test
  void singleThrowableArgIsExtractedNotFormatted() {
    Exception ex = new RuntimeException("boom");
    Object[] args = {ex};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("Error: {}", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("Error: {}", args));
    assertEquals(slf4j.getThrowable(), JulLogger.extractThrowable("Error: {}", args));
  }

  @Test
  void trailingThrowableBeyondPlaceholders() {
    Exception ex = new RuntimeException("boom");
    Object[] args = {"op", ex};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("Error: {} failed", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("Error: {} failed", args));
    assertEquals(slf4j.getThrowable(), JulLogger.extractThrowable("Error: {} failed", args));
  }

  @Test
  void noPlaceholdersTrailingThrowable() {
    Exception ex = new RuntimeException("boom");
    Object[] args = {ex};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("Something broke", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("Something broke", args));
    assertEquals(slf4j.getThrowable(), JulLogger.extractThrowable("Something broke", args));
  }

  @Test
  void nonThrowableArgsNoExtraction() {
    Object[] args = {"a", "b"};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("{} {}", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("{} {}", args));
    assertEquals(slf4j.getThrowable(), JulLogger.extractThrowable("{} {}", args));
  }

  @Test
  void multipleArgsWithTrailingThrowable() {
    Exception ex = new RuntimeException("boom");
    Object[] args = {"host", 8080, ex};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("Connect to {}:{}", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("Connect to {}:{}", args));
    assertEquals(slf4j.getThrowable(), JulLogger.extractThrowable("Connect to {}:{}", args));
  }

  @Test
  void arrayArgumentRenderedLikeSlf4j() {
    Object[] args = {new String[] {"a", "b"}};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("arr {}", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("arr {}", args));
  }

  @Test
  void escapedPlaceholderRenderedLikeSlf4j() {
    Object[] args = {"x"};
    FormattingTuple slf4j = MessageFormatter.arrayFormat("escaped \\{} {}", args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage("escaped \\{} {}", args));
  }

  @Test
  void nullFormatRenderedLikeSlf4j() {
    Object[] args = {"x"};
    FormattingTuple slf4j = MessageFormatter.arrayFormat(null, args);

    assertEquals(slf4j.getMessage(), JulLogger.formatMessage(null, args));
  }
}

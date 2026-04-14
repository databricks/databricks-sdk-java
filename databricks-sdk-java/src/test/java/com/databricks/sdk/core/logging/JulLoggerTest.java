package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class JulLoggerTest {

  // ---- Formatter unit tests ----

  @Test
  void formatMessageNoPlaceholders() {
    assertEquals("hello world", JulLogger.formatMessage("hello world", new Object[] {}));
  }

  @Test
  void formatMessageNullArgs() {
    assertEquals("hello", JulLogger.formatMessage("hello", (Object[]) null));
  }

  @Test
  void formatMessageSinglePlaceholder() {
    assertEquals("hello world", JulLogger.formatMessage("hello {}", new Object[] {"world"}));
  }

  @Test
  void formatMessageMultiplePlaceholders() {
    assertEquals("a=1, b=2", JulLogger.formatMessage("a={}, b={}", new Object[] {"1", "2"}));
  }

  @Test
  void formatMessageTrailingThrowableExcluded() {
    Exception ex = new RuntimeException("boom");
    String result = JulLogger.formatMessage("Failed at {}: {}", new Object[] {"host", "msg", ex});
    assertEquals("Failed at host: msg", result);
  }

  @Test
  void formatMessageThrowableIsAlwaysExcluded() {
    Exception ex = new RuntimeException("boom");
    String result = JulLogger.formatMessage("Error: {}", new Object[] {ex});
    assertEquals("Error: {}", result);
  }

  @Test
  void extractThrowableWhenTrailing() {
    Exception ex = new RuntimeException("boom");
    Throwable result = JulLogger.extractThrowable("Failed: {}", new Object[] {"msg", ex});
    assertSame(ex, result);
  }

  @Test
  void extractThrowableNullWhenNotTrailing() {
    assertNull(JulLogger.extractThrowable("a={}, b={}", new Object[] {"1", "2"}));
  }

  @Test
  void extractThrowableAlwaysWhenLastArgIsThrowable() {
    Exception ex = new RuntimeException("boom");
    assertSame(ex, JulLogger.extractThrowable("Error: {}", new Object[] {ex}));
  }

  @Test
  void extractThrowableNullArgs() {
    assertNull(JulLogger.extractThrowable("msg", (Object[]) null));
  }

  @Test
  void extractThrowableEmptyArgs() {
    assertNull(JulLogger.extractThrowable("msg", new Object[] {}));
  }

  // ---- End-to-end capturing tests ----

  static Stream<Arguments> logCalls() {
    RuntimeException ex = new RuntimeException("boom");
    return Stream.of(
        Arguments.of("debug", "hello", null, "hello", null),
        Arguments.of("info", "hello", null, "hello", null),
        Arguments.of("warn", "hello", null, "hello", null),
        Arguments.of("error", "hello", null, "hello", null),
        Arguments.of(
            "info", "user {} logged in", new Object[] {"alice"}, "user alice logged in", null),
        Arguments.of("info", "a={}, b={}", new Object[] {1, 2}, "a=1, b=2", null),
        Arguments.of("error", "failed: {}", new Object[] {"op", ex}, "failed: op", ex),
        Arguments.of("error", "Error: {}", new Object[] {ex}, "Error: {}", ex),
        Arguments.of("error", "Something broke", new Object[] {ex}, "Something broke", ex));
  }

  @ParameterizedTest(name = "[{index}] {0}(\"{1}\")")
  @MethodSource("logCalls")
  void deliversCorrectOutput(
      String level, String format, Object[] args, String expectedMsg, Throwable expectedThrown) {
    java.util.logging.Logger julLogger =
        java.util.logging.Logger.getLogger(JulLoggerTest.class.getName());
    Level originalLevel = julLogger.getLevel();
    julLogger.setLevel(Level.ALL);
    CapturingHandler handler = new CapturingHandler();
    julLogger.addHandler(handler);
    try {
      Logger logger =
          new JulLogger(java.util.logging.Logger.getLogger(JulLoggerTest.class.getName()));
      dispatch(logger, level, format, args);

      assertEquals(1, handler.records.size(), "Expected exactly one log record");
      LogRecord record = handler.records.get(0);
      assertEquals(expectedMsg, record.getMessage());
      assertEquals(toJulLevel(level), record.getLevel());
      if (expectedThrown != null) {
        assertSame(expectedThrown, record.getThrown());
      } else {
        assertNull(record.getThrown(), "Expected no throwable");
      }
    } finally {
      julLogger.removeHandler(handler);
      julLogger.setLevel(originalLevel);
    }
  }

  @Test
  void callerInferenceSkipsLoggingPackage() {
    java.util.logging.Logger julLogger =
        java.util.logging.Logger.getLogger(JulLoggerTest.class.getName());
    Level originalLevel = julLogger.getLevel();
    julLogger.setLevel(Level.ALL);
    CapturingHandler handler = new CapturingHandler();
    julLogger.addHandler(handler);
    try {
      Logger logger =
          new JulLogger(java.util.logging.Logger.getLogger(JulLoggerTest.class.getName()));
      logger.info("test");

      assertEquals(1, handler.records.size());
      String sourceClass = handler.records.get(0).getSourceClassName();
      assertFalse(
          sourceClass.startsWith("com.databricks.sdk.core.logging."),
          "Source class should not be in the logging package, but was: " + sourceClass);
    } finally {
      julLogger.removeHandler(handler);
      julLogger.setLevel(originalLevel);
    }
  }

  // ---- Helpers ----

  private static void dispatch(Logger logger, String level, String format, Object[] args) {
    switch (level) {
      case "debug":
        if (args != null) logger.debug(format, args);
        else logger.debug(format);
        break;
      case "info":
        if (args != null) logger.info(format, args);
        else logger.info(format);
        break;
      case "warn":
        if (args != null) logger.warn(format, args);
        else logger.warn(format);
        break;
      case "error":
        if (args != null) logger.error(format, args);
        else logger.error(format);
        break;
      default:
        throw new IllegalArgumentException("Unknown level: " + level);
    }
  }

  private static Level toJulLevel(String level) {
    switch (level) {
      case "debug":
        return Level.FINE;
      case "info":
        return Level.INFO;
      case "warn":
        return Level.WARNING;
      case "error":
        return Level.SEVERE;
      default:
        throw new IllegalArgumentException("Unknown level: " + level);
    }
  }

  static class CapturingHandler extends Handler {
    final List<LogRecord> records = new ArrayList<>();

    @Override
    public void publish(LogRecord record) {
      records.add(record);
    }

    @Override
    public void flush() {}

    @Override
    public void close() {}
  }
}

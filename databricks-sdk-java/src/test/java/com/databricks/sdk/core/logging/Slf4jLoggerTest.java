package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Slf4jLoggerTest {

  @Test
  void getLoggerReturnsSlf4jLogger() {
    Logger logger = LoggerFactory.getLogger(Slf4jLoggerTest.class);
    assertNotNull(logger);
    assertTrue(logger instanceof Slf4jLogger);
  }

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
    CapturingAppender appender = new CapturingAppender();
    org.apache.log4j.Logger log4jLogger = org.apache.log4j.Logger.getLogger(Slf4jLoggerTest.class);
    log4jLogger.addAppender(appender);
    try {
      Logger logger = new Slf4jLogger(org.slf4j.LoggerFactory.getLogger(Slf4jLoggerTest.class));
      dispatch(logger, level, format, args);

      assertEquals(1, appender.events.size(), "Expected exactly one log event");
      LoggingEvent event = appender.events.get(0);
      assertEquals(expectedMsg, event.getRenderedMessage());
      assertEquals(toLog4jLevel(level), event.getLevel());
      if (expectedThrown != null) {
        assertNotNull(event.getThrowableInformation(), "Expected throwable to be attached");
        assertSame(expectedThrown, event.getThrowableInformation().getThrowable());
      } else {
        assertNull(event.getThrowableInformation(), "Expected no throwable");
      }
    } finally {
      log4jLogger.removeAppender(appender);
    }
  }

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

  private static org.apache.log4j.Level toLog4jLevel(String level) {
    switch (level) {
      case "debug":
        return org.apache.log4j.Level.DEBUG;
      case "info":
        return org.apache.log4j.Level.INFO;
      case "warn":
        return org.apache.log4j.Level.WARN;
      case "error":
        return org.apache.log4j.Level.ERROR;
      default:
        throw new IllegalArgumentException("Unknown level: " + level);
    }
  }

  static class CapturingAppender extends AppenderSkeleton {
    final List<LoggingEvent> events = new ArrayList<>();

    @Override
    protected void append(LoggingEvent event) {
      events.add(event);
    }

    @Override
    public void close() {}

    @Override
    public boolean requiresLayout() {
      return false;
    }
  }
}

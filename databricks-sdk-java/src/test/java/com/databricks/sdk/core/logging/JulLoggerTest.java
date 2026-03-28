package com.databricks.sdk.core.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class JulLoggerTest {

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

  @Test
  void julLoggerLevelMapping() {
    Logger logger = JulLogger.create(JulLoggerTest.class);
    assertNotNull(logger);
    logger.debug("debug msg");
    logger.debug("debug {} {}", "a", "b");
    logger.info("info msg");
    logger.info("info {}", "val");
    logger.warn("warn msg");
    logger.warn("warn {}", "val");
    logger.error("error msg");
    logger.error("error {}", "val");
    logger.error("error {} failed", "op", new RuntimeException("cause"));
  }
}
